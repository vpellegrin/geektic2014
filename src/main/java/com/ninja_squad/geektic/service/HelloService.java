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
@RequestMapping("/api/hello")
public class HelloService {

    public HelloMessage sayHello() {
        HelloMessage hello = new HelloMessage("hello world");
        return hello;
    }
    /*@RequestMapping(method = GET)
    public List<Geek> lesGeek() {
        Geek g12 = new Geek();

        return g12.lesGeeks();
    }

    @RequestMapping(method = GET, params = "id")
    public Geek lesGeek(@RequestParam("id") int id) {
        Geek g12 = new Geek();

        return g12.lesGeekss(id);
    }*/
}
