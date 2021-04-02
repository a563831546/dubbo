package com.alibaba.dubbo.demo.provider.spi;

/**
 * <p>
 *
 * </p>
 *
 * @author : zuomin.yu
 * @date : 2021-04-02
 */
public class FileSearchService implements SearchService {

    @Override
    public String search(String searchKey) {
        System.out.println("Call FileSearchService: " + searchKey);
        return "文件搜索[" + searchKey + "]结果：无结果";
    }
}
