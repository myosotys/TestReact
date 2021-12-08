package com.mailinblack.testRecr;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class MigrationServiceTest {

    @Test
    public void migrateFromFileTest(){
        MigrationService migrationService = new MigrationService();

        long startTime = System.currentTimeMillis();
        List<Stat> list = migrationService.migrateFromFile();
        long endTime = System.currentTimeMillis();
        long duration = (endTime - startTime);
        for (Stat stat : list) {
            System.out.println(stat);
        }
        System.out.println("function duration in ms: " + duration);
        Assert.assertEquals(5,list.size());
        Assert.assertTrue(list.stream().anyMatch(item -> item.equals(new Stat("thuesday", 11052800L, 6079040L, 11605440L, 18237120L))));
        Assert.assertTrue(list.stream().anyMatch(item -> item.equals(new Stat("wednesday", 28184640L, 3315840L, 18789760L, 6631680L))));
        Assert.assertTrue(list.stream().anyMatch(item -> item.equals(new Stat("thursday", 12158080L, 10500160L, 6631680L, 45316480L))));
        Assert.assertTrue(list.stream().anyMatch(item -> item.equals(new Stat("friday", 46974400L, 24868800L, 4421120L, 6079040L))));
        Assert.assertTrue(list.stream().anyMatch(item -> item.equals(new Stat("monday", 552640L, 6079040L, 22658240L, 6631680L))));


    }
}
