package com.chemguan.service.impl;

import com.chemguan.dao.PcColumRepository;
import com.chemguan.entity.PcColum;
import com.chemguan.service.PcColumService;
import org.springframework.beans.factory.annotation.Autowired;
import com.chemguan.business.core.service.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;



/**
 * Created by  on Sun Sep 30 11:46:29 CST 2018.
 */
@Service
@Transactional
public class PcColumServiceImpl extends AbstractService<PcColum> implements PcColumService {
    @Autowired
    private PcColumRepository PcColumRepository;

}
