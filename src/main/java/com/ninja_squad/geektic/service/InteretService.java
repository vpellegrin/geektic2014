package com.ninja_squad.geektic.service;

import com.ninja_squad.geektic.model.GeekDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.transaction.Transactional;

import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.*;

/**
 * Fake service just to test that everything works fine
 * @author JB Nizet
 */
@RestController
@Transactional
@RequestMapping("api/interets")
public class InteretService {



    @Autowired
    private GeekDao dao;


    @RequestMapping(method = GET)
    public List<Interet> lesInterets() {

        return dao.interets();
    }

}
