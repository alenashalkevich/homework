package com.exadel.homework2;

import jdk.jfr.StackTrace;
import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.util.List;
import java.util.Map;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Getter
@Setter
@RequiredArgsConstructor
public class StreamFull {

    @NonNull
    private Integer id;
    @NonNull
    private String name;

    public static void main(String[] args) {
        Supplier<StreamFull> streamFullFactory = ()->{
            int id = (int) (Math.random()*10000);
            return new StreamFull(id, "name" + id);
        };

        List<StreamFull> list = Stream.generate(streamFullFactory).limit(5).collect(Collectors.toList());

        Map<Integer, String> map = list.stream().collect(Collectors.toMap(StreamFull::getId, StreamFull::getName));

        System.out.println(map);
    }
}
