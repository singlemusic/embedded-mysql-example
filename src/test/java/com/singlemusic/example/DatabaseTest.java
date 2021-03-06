package com.singlemusic.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import javax.persistence.EntityManager;
import javax.persistence.Query;

import java.math.BigInteger;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
@ActiveProfiles("test")
public class DatabaseTest {

    @Resource
    private EntityManager entityManager;

    @Test
    public void testDatabase() {
        Query query = entityManager.createNativeQuery("SELECT 1");
        assertEquals(BigInteger.valueOf(1L), query.getSingleResult());
    }
}
