package com.chat.onlinechating.random;

import org.junit.jupiter.api.Test;
import java.util.Random;

import static org.assertj.core.api.Assertions.assertThat;


class MedievalNameGeneratorTest {

    @Test
    void testnick() {
        String s = returnAdd();

        assertThat(s).isNotNull();
    }

    String[] add = new String[] {"잠자는", "상냥한", "까부는", "재밌는", "배고픈"};


    public String returnAdd() {
        Random rd = new Random();
        int index = rd.nextInt(5);
        return add[index];
    }

}