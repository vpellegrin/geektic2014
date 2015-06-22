package com.ninja_squad.geektic.service;

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
@RequestMapping("/interets")
public class InteretService {

    @RequestMapping(method = GET)
    public List<Interet> lesInterets() {
        Interet g12 = new Interet();

        return g12.lesInterets();
    }

}
