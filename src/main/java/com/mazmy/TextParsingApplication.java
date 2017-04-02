package com.mazmy;

import com.mazmy.service.IEmployeeService;
import com.mazmy.util.ReadFileUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import java.io.File;
import java.util.List;

/**
 * Created by azmym on 4/2/2017.
 */
@SpringBootApplication
@ComponentScan
public class TextParsingApplication {

    @Autowired
    private IEmployeeService employeeService;
    private static Logger log= LoggerFactory.getLogger(TextParsingApplication.class);

    public static void main(String[] args) {
        ConfigurableApplicationContext ctx =SpringApplication.run(TextParsingApplication.class, args);
        ctx.getBean(TextParsingApplication.class).print();
    }

    private void print() {
        ClassLoader classLoader = getClass().getClassLoader();
        File file = new File(classLoader.getResource("data/textFile.txt").getFile());
        List<String> lines = ReadFileUtil.readFile(file.getAbsolutePath());
        lines.stream().forEach(line -> log.info(employeeService.load(line).toString()));
    }
}
