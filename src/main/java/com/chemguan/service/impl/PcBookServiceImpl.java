package com.chemguan.service.impl;

import com.chemguan.dao.PcBookRepository;
import com.chemguan.entity.PcBook;
import com.chemguan.service.PcBookService;
import org.springframework.beans.factory.annotation.Autowired;
import com.chemguan.business.core.service.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;



/**
 * Created by  on Sun Sep 30 11:46:29 CST 2018.
 */
@Service
@Transactional
public class PcBookServiceImpl extends AbstractService<PcBook> implements PcBookService {
    @Autowired
    private PcBookRepository PcBookRepository;

}
