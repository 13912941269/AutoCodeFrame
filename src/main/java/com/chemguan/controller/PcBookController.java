package com.chemguan.controller;
import com.chemguan.business.core.results.Result;
import com.chemguan.business.core.results.ResultGenerator;
import com.chemguan.entity.PcBook;
import com.chemguan.service.PcBookService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import io.swagger.annotations.*;
import tk.mybatis.mapper.entity.Condition;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

/**
* Created by  on Sun Sep 30 11:46:29 CST 2018.
*/
@RestController
@RequestMapping("/pc/book")
public class PcBookController {
    @Autowired
    private PcBookService PcBookService;

    @PostMapping
    @ApiOperation("添加PcBook")
    public Result add(PcBook PcBook) {
        PcBookService.save(PcBook);
        return ResultGenerator.genSuccessResult();
    }

    @DeleteMapping("/{id:\\d+}")
    @ApiOperation("删除PcBook")
    public Result delete(@ApiParam(value = "id") @PathVariable  Integer id) {
        PcBookService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PutMapping("/{id:\\d+}")
    @ApiOperation("修改PcBook")
    public Result update(PcBook PcBook) {
        PcBookService.update(PcBook);
        return ResultGenerator.genSuccessResult();
    }

    @GetMapping("/{id:\\d+}")
    @ApiOperation("PcBook根据id查询详情")
    public Result detail(@ApiParam(value = "id")@PathVariable Integer id) {
        PcBook PcBook = PcBookService.findById(id);
        return ResultGenerator.genSuccessResult(PcBook);
    }



    @GetMapping
    @ApiOperation("PcBook分页查询列表")
    public Result list(                        @ApiParam(value = "书籍名称")@RequestParam(name = "bookName",defaultValue = "") String bookName,
                        @ApiParam(value = "页数")@RequestParam(name = "page",defaultValue = "1") Integer page,
                        @ApiParam(value = "每页行数")@RequestParam(name = "size",defaultValue = "10") Integer size) {
        PageHelper.startPage(page, size);
        Condition condition=new Condition(PcBook.class);
        Example.Criteria criteria = condition.createCriteria();
        criteria.andLike("bookName","%"+bookName+"%");
        List<PcBook> list = PcBookService.findByCondition(condition);
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
