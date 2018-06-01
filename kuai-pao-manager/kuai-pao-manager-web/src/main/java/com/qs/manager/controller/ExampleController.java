package com.qs.manager.controller;

import com.qs.manager.domain.Example;
import com.qs.manager.service.ExampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Date:   2018/6/1 16:33
 * Author: huangxincheng
 * 请用一句话描述这个类:
 *
 * <author>              <time>            <version>          <desc>
 * huangxincheng     2018/6/1 16:33         1.0.0
 * <p>
 * 春风十里不如你
 **/
@RestController
@RequestMapping("/example")
public class ExampleController {


    @Autowired
    private ExampleService exampleService;

    @GetMapping
    public Example example() {
        return exampleService.call();
    }

}
