package com.ninja_squad.geektic.service;

import com.ninja_squad.geektic.model.GeekDao;
import org.springframework.beans.factory.annotation.Autowired;
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
@RequestMapping("/users")
public class GeekService {

    @Autowired
    private GeekDao dao;



    @RequestMapping(method = GET, params = {"sexe", "interet"})
    public List<Geek> lesGeek(@RequestParam("sexe") String sexe, @RequestParam("interet") String interet) {

        Geek g12 = new Geek();

        return dao.findBySexeAndInterest(sexe, interet);
    }

}
