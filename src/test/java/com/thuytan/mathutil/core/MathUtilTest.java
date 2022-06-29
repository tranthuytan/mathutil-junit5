/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.thuytan.mathutil.core;

import static com.thuytan.mathutil.core.MathUtil.*;
//import static la danh rieng cho nhung ham static
//goi ham ma bo qua ten class
//doi MathUtil.getFactorial thanh MathUtil.* de dung tat ca cac ham tu MathUtil
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.function.Executable;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

/**
 *
 * @author Admin
 */
public class MathUtilTest {
    //choi DDT, tach data ra khoi cau lenh kiem thu, tham so hoa data nay
    //vao trong cau lenh kiem thu
    
    //chuan bi bo data
    public static Object[][] initData() {
        return new Integer[][] {
                                    {0,1},
                                    {2,2},
                                    {3,6},
                                    {5,120},
                                    {6,120}
                                };
    }
    
    @ParameterizedTest
    @MethodSource(value = "initData") //ten ham cung cap data, ngam dinh thu tu
    //cua cac phan tu mang, map vao tham so ham
    public void testGetFactorialGiveRightArgReturnsWell(int input,long expected) {
        assertEquals(expected, getFactorial(input));
    }
    
//    @Test
//    public void tesGetFactorialGiveRightArgReturnsWell() {
//        assertEquals(120, getFactorial(5));
//        assertEquals(6, getFactorial(3));
//    }
    
    //bat ngoai le khi dua sai data!!!
//    @Test(expected = ten ngoai le.class) JUnit4 thoi, JUnit 5 doi cach khac!!!
    @Test
    public void testGetFactorialGivenWrongArgThrowException() {
        //xai bieu thuc lambda
        //ham nhan tham so thu 2 la 1 cai object/co code implement cai
        //functional interface ten la Excecutable - co 1 ham duy nhat ko code
        //ten la execute()
        //dung` cham
//        Executable exObject = new Executable() {
//            @Override
//            public void execute() throws Throwable {
//                getFactorial(-5); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//            }
//        };


//        Executable exObject = () -> getFactorial(-5);
//        assertThrows(IllegalArgumentException.class, exObject);
        assertThrows(IllegalArgumentException.class,() -> getFactorial(-5));
        
    }
    
}
