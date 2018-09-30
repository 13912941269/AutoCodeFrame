package com.chemguan.controller;
import com.chemguan.business.core.results.Result;
import com.chemguan.business.core.results.ResultGenerator;
import com.chemguan.entity.PcChapter;
import com.chemguan.service.PcChapterService;
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
@RequestMapping("/pc/chapter")
public class PcChapterController {
    @Autowired
    private PcChapterService PcChapterService;

    @PostMapping
    @ApiOperation("添加PcChapter")
    public Result add(PcChapter PcChapter) {
        PcChapterService.save(PcChapter);
        return ResultGenerator.genSuccessResult();
    }

    @DeleteMapping("/{id:\\d+}")
    @ApiOperation("删除PcChapter")
    public Result delete(@ApiParam(value = "id") @PathVariable  Integer id) {
        PcChapterService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PutMapping("/{id:\\d+}")
    @ApiOperation("修改PcChapter")
    public Result update(PcChapter PcChapter) {
        PcChapterService.update(PcChapter);
        return ResultGenerator.genSuccessResult();
    }

    @GetMapping("/{id:\\d+}")
    @ApiOperation("PcChapter根据id查询详情")
    public Result detail(@ApiParam(value = "id")@PathVariable Integer id) {
        PcChapter PcChapter = PcChapterService.findById(id);
        return ResultGenerator.genSuccessResult(PcChapter);
    }



    @GetMapping
    @ApiOperation("PcChapter分页查询列表")
    public Result list(                        @ApiParam(value = "页数")@RequestParam(name = "page",defaultValue = "1") Integer page,
                        @ApiParam(value = "每页行数")@RequestParam(name = "size",defaultValue = "10") Integer size) {
        PageHelper.startPage(page, size);
        Condition condition=new Condition(PcChapter.class);
        Example.Criteria criteria = condition.createCriteria();
        List<PcChapter> list = PcChapterService.findByCondition(condition);
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
