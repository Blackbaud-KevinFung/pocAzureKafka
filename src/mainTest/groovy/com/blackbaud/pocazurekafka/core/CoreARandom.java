package com.blackbaud.pocazurekafka.core;

import com.blackbaud.testsupport.RandomGenerator;
import com.blackbaud.pocazurekafka.api.RandomClientBuilderSupport;
import lombok.experimental.Delegate;

public class CoreARandom {

    public static final CoreARandom aRandom = new CoreARandom();

    @Delegate
    private RandomCoreBuilderSupport randomCoreBuilderSupport = new RandomCoreBuilderSupport();
    @Delegate
    private RandomClientBuilderSupport randomClientBuilderSupport = new RandomClientBuilderSupport();
    @Delegate
    private RandomGenerator randomGenerator = new RandomGenerator();

}
