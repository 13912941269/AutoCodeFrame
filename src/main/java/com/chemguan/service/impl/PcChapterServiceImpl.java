package com.chemguan.service.impl;

import com.chemguan.dao.PcChapterRepository;
import com.chemguan.entity.PcChapter;
import com.chemguan.service.PcChapterService;
import org.springframework.beans.factory.annotation.Autowired;
import com.chemguan.business.core.service.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;



/**
 * Created by  on Sun Sep 30 11:46:29 CST 2018.
 */
@Service
@Transactional
public class PcChapterServiceImpl extends AbstractService<PcChapter> implements PcChapterService {
    @Autowired
    private PcChapterRepository PcChapterRepository;

}
