package com.ronakmakwna.sunshine;

import android.test.suitebuilder.TestSuiteBuilder;

import junit.framework.Test;

/**
 * Created by Ronak on 12/16/2015.
 */
public class FullTestSuite {
    public static Test suite() {
        return new TestSuiteBuilder(FullTestSuite.class)
                .includeAllPackagesUnderHere().build();
    }

    public FullTestSuite() {
        super();
    }
}
