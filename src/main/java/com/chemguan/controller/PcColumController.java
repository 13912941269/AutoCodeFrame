package com.chemguan.controller;
import com.chemguan.business.core.results.Result;
import com.chemguan.business.core.results.ResultGenerator;
import com.chemguan.entity.PcColum;
import com.chemguan.service.PcColumService;
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
@RequestMapping("/pc/colum")
public class PcColumController {
    @Autowired
    private PcColumService PcColumService;

    @PostMapping
    @ApiOperation("添加PcColum")
    public Result add(PcColum PcColum) {
        PcColumService.save(PcColum);
        return ResultGenerator.genSuccessResult();
    }

    @DeleteMapping("/{id:\\d+}")
    @ApiOperation("删除PcColum")
    public Result delete(@ApiParam(value = "id") @PathVariable  Integer id) {
        PcColumService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PutMapping("/{id:\\d+}")
    @ApiOperation("修改PcColum")
    public Result update(PcColum PcColum) {
        PcColumService.update(PcColum);
        return ResultGenerator.genSuccessResult();
    }

    @GetMapping("/{id:\\d+}")
    @ApiOperation("PcColum根据id查询详情")
    public Result detail(@ApiParam(value = "id")@PathVariable Integer id) {
        PcColum PcColum = PcColumService.findById(id);
        return ResultGenerator.genSuccessResult(PcColum);
    }



    @GetMapping
    @ApiOperation("PcColum分页查询列表")
    public Result list(                        @ApiParam(value = "页数")@RequestParam(name = "page",defaultValue = "1") Integer page,
                        @ApiParam(value = "每页行数")@RequestParam(name = "size",defaultValue = "10") Integer size) {
        PageHelper.startPage(page, size);
        Condition condition=new Condition(PcColum.class);
        Example.Criteria criteria = condition.createCriteria();
        List<PcColum> list = PcColumService.findByCondition(condition);
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
