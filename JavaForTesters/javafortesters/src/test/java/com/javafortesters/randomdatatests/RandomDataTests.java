package com.javafortesters.randomdatatests;

import org.junit.Test;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class RandomDataTests {

    @Test
    public void canGenerateRandomNumberBetween0And1() {
        double round = Math.random();

        System.out.println(String.format("the random number is %f", round));
    }

    @Test
    public void canGenerateARandomObject() {
        Random number = new Random();

        for(int i=0; i < 10; i++) {
            int randomInteger = number.nextInt();

            System.out.println(randomInteger);

            assertThat(randomInteger < Integer.MAX_VALUE, is(true));
            assertThat(randomInteger >= Integer.MIN_VALUE, is(true));
        }

        boolean randomBoolean = number.nextBoolean();

        System.out.println(randomBoolean);

        long randomLong = number.nextLong();

        System.out.println(randomLong);

        float randomFloat = number.nextFloat();

        System.out.println(randomFloat);

        double randomDouble = number.nextDouble();

        System.out.println(randomDouble);

        double randomGaussian = number.nextGaussian();

        System.out.println(randomGaussian);

        byte[] bytes = new byte[number.nextInt(100)];
        number.nextBytes(bytes);

        int min = 15;
        int max = 25;
        int randomIntRange = number.nextInt(max-min + 1) + min;

        System.out.print(randomIntRange);

    }

    @Test
    public void canGenerateNumbersInclusivelyInARange() {
        Random random = new Random();

        int i;
        int min = 15;
        int max = 20;

        Set<Integer> numbers = new HashSet<>();

        for(i=0; i < 1000; i++) {
            int randomRange = random.nextInt(max-min +1) + min;
            System.out.println(randomRange);

            numbers.add(randomRange);

        }

        assertThat(numbers.contains(15), is(true));
    }

    @Test
    public void canGenerateDoubleValuesUsingNextGaussian() {
        //generate 1000 double values using nextGaussian
        Random random = new Random();

        int i;

        for(i=0; i<1000; i++) {
            double randomRange = random.nextGaussian();

            double bell[] = new double[1000];

/*            double o = -1;
            for(i=0; i<1000; i++) {
                if (randomRange > o) {
                    bell[i]++;
                    break;
                }

            }
            System.out.print(bell.length);*/

            double t = -2;
            for(i=0; i<1000; i++) {
                if(randomRange > t) {
                    bell[i]++;
                    break;
                }
            }
            System.out.print(bell.length);
        }

        //count 1, 2, 3 deviations


        //calculate percentages in each standard deviation
        //compare
    }
}
