package com.chat.onlinechating.random;

import java.time.Instant;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class MedievalNameGenerator {

    private static final Random random = new Random(Instant.now().getEpochSecond());

    static String[] add = new String[] {"잠자는", "상냥한", "까부는", "재밌는", "배고픈"};


    public static String returnAdd() {
        int index = random.nextInt(5);
        return add[index];
    }

    public static String surname() {
        List<String> names = Arrays.asList(
            "고양이", "강아지", "소", "호랑이", "오리",
                "사바나캣",
                "너구리",
                "붉은여우",
                "사막여우",
                "북극여우",
                "햄스터",
                "염소", 
                "사슴",
                "거위"
        );

        return returnAdd() + names.get(random.nextInt(names.size() - 1));
    }
}
