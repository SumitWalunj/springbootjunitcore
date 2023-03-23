package com.csi.controller.test;

import com.csi.controller.ArithmaticApplication;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class ArithmaticApplicationTest {

    @Autowired
    ArithmaticApplication arithmaticApplication;

    @Test
    public void addTest() {
        Assert.assertEquals(11, arithmaticApplication.add(5, 6));
    }

    @Test
    public void subTest() {

        Assert.assertEquals(2, arithmaticApplication.sub(4, 2));
    }

    @Test
    public void mulTest() {

        Assert.assertEquals(8, arithmaticApplication.mul(4, 2));
    }

    @Test
    public void divTest() {

        Assert.assertEquals(2, arithmaticApplication.div(10, 5));
    }
}
