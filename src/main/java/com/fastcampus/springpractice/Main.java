package com.fastcampus.springpractice;

import com.fastcampus.springpractice.config.Config;
import com.fastcampus.springpractice.logic.JavaSort;
import com.fastcampus.springpractice.logic.Sort;
import com.fastcampus.springpractice.service.SortService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);

        SortService sortService = context.getBean(SortService.class);

        System.out.println("[result]" + sortService.dosort(Arrays.asList(args)));

//        Sort<String> sort = new JavaSort<>();
//        System.out.println("[result] "+sort.sort(Arrays.asList(args)));
    }
}
