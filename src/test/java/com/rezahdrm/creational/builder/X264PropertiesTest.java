package com.rezahdrm.creational.builder;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class X264PropertiesTest {

    @Test
    public void X264PropertiesBuilderTest() {
        X264Properties x264Properties;
        X264Properties.Builder builder = new X264Properties.Builder();
        x264Properties = builder.bAdapt(1).bFrameBias(false).bFrames(5).bitrate(7).keyInt(8).minKeyInt(8).qp(8).
                qpStep(9).chromaOffset(9).direct(5).crf(6).meRange(1).sceneCut(7).rateTol(4).weightB(true).pbRatio(7).
                stats(false).pass("d".getBytes()[0]).noFastPSkip(true).build();

        Assert.assertEquals(x264Properties.getbAdapt(),1);
    }

}