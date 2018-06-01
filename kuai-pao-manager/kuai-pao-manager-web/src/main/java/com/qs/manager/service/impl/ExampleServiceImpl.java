package com.qs.manager.service.impl;

import com.qs.manager.domain.Example;
import com.qs.manager.service.ExampleService;
import org.springframework.stereotype.Service;

/**
 * Date:   2018/6/1 16:34
 * Author: huangxincheng
 * 请用一句话描述这个类:
 *
 * <author>              <time>            <version>          <desc>
 * huangxincheng     2018/6/1 16:34         1.0.0
 * <p>
 * 春风十里不如你
 **/
@Service
public class ExampleServiceImpl implements ExampleService {
    @Override
    public Example call() {
        Example example = new Example();
        example.setClassName(this.getClass().getSimpleName());
        example.setPackageName(this.getClass().getPackage().getName());
        return  example;
    }
}
