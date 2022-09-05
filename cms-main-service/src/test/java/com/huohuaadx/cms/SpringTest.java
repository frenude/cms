package com.huohuaadx.cms;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.ResourceUtils;

import java.io.FileNotFoundException;

/**
 * @author: Frenude
 * @mail: frenude@gmail.com
 * @date: created in 08 02,2021
 * @desc: //todo
 */
@SpringBootTest
public class SpringTest {
    @Test
    public void test() throws FileNotFoundException {
        System.out.println(ResourceUtils.getURL("."));
    }
}
