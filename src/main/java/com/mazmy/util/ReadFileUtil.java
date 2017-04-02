package com.mazmy.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by azmym on 4/2/2017.
 */
public class ReadFileUtil {

    private static Logger log= LoggerFactory.getLogger(ReadFileUtil.class);

    private ReadFileUtil(){
    }

    public static List<String> readFile(String filePath){
        List<String> collect = null;
        try (Stream<String> stream = Files.lines(Paths.get(filePath))) {
             collect = stream.collect(Collectors.toList());
        }catch (Exception e){
            log.error(e.getMessage());
        }
        return collect;
    }
}
