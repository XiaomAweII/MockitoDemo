package org.xiaoweii.demo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author xiaoweii
 * @create 2025-03-22 15:37
 */
@ExtendWith(MockitoExtension.class)
public class MockitoDemoTest {

    //@Mock
    @Spy
    MockitoDemo mockitoDemo;

//    @BeforeEach
//    public void setUp() {
//        MockitoAnnotations.initMocks(this);
//    }

    @Test
    public void add() {
        // 创建mock对象
        // MockitoDemo mockitoDemo = Mockito.mock(MockitoDemo.class);
        // assertEquals(3, mockitoDemo.add(1, 2));

        // mockitoDemo.add(1, 2);
        // mockitoDemo.add(1, 2);
        // Mockito.verify(mockitoDemo, Mockito.times(2)).add(1, 2);

        // Mockito.when(mockitoDemo.add(1,2)).thenReturn(10,20);
         assertEquals(10, mockitoDemo.add(1, 2));
         assertEquals(20, mockitoDemo.add(1, 2));
         assertEquals(20, mockitoDemo.add(1, 2));



    }
}