package com.ninja_squad.geektic.dao;

import com.ninja_squad.dbsetup.DbSetup;
import com.ninja_squad.dbsetup.Operations;
import com.ninja_squad.dbsetup.operation.Operation;
import com.ninja_squad.geektic.dao.*;
import com.ninja_squad.geektic.model.GeekDao;
import com.ninja_squad.geektic.service.Geek;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import static com.ninja_squad.dbsetup.operation.CompositeOperation.sequenceOf;
import static org.junit.Assert.assertEquals;

/**
 * This is example code for a DAO test.
 * @author JB Nizet
 */
public class GeekDaoTest extends com.ninja_squad.geektic.dao.BaseDaoTest {

    // You can autowire the DAO to test here. For example:
    // @Autowired
    // private ExampleDao exampleDao;
    @Autowired
    private GeekDao geekDao;

    @Before
    public void populateDatabase() {
        Operation operation =
                sequenceOf(
                        CommonOperations.DELETE_ALL,
                        CommonOperations.INSERT_REFERENCE_DATA);

        DbSetup dbSetup = new DbSetup(destination, operation);
        dbSetup.launch();
    }


    @Test
    public void testFindBySexAndInterest() {
        List<Integer> expected = Arrays.asList(8, 9);

        List<Integer> response = geekDao.findBySexeAndInterest("F", 4).stream().map(Geek::getId).collect(Collectors.toList());
        Collections.sort(response);

        assertEquals(expected, response);
    }

    @Test
    public void testFindById() throws Exception {
        int expected = 1;
        int response = geekDao.findById(expected).getId();
        assertEquals(expected, response);
    }

    @Test
    public void testinterets() throws Exception {
        int response = geekDao.interets().size();
        assertEquals(6, response);
    }
}
