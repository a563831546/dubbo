package com.alibaba.dubbo.demo.provider.spi;

import java.util.ServiceLoader;

/**
 * <p>
 *
 * </p>
 *
 * @author : zuomin.yu
 * @date : 2021-04-02
 */
public class SPITest {
    public static void main(String[] args) {
        Class<Integer> integerClass = int.class;
        System.out.println();
        ServiceLoader<SearchService> serviceServices = ServiceLoader.load(SearchService.class);
        for (SearchService serviceService : serviceServices) {
            serviceService.search("黑暗时代");
        }
    }
}
