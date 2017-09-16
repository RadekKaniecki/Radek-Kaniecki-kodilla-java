package com.kodilla.patterns.singleton;

import com.kodilla.patterns.SettingsFileEngine;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class SettingsFileEngineTestSuite {
    private static SettingsFileEngine settingsFileEngine;

    @BeforeClass
    public static void openSettingsFile() {
        settingsFileEngine.getInstance().open("myapp.settings");
    }

    @AfterClass
    public static void closeSettingsFile() {
        settingsFileEngine.getInstance().close();
    }

    @Test
    public void testGetFileName() {
        //Given
        //When
        String name = settingsFileEngine.getInstance().getFileName();
        System.out.println("Opened " + name);
        //Then
        Assert.assertEquals("myapp.settings", name);
    }

    @Test
    public void testLoadSettings() {
        //Given
        //When
        boolean result = settingsFileEngine.getInstance().loadSettings();
        //Then
        Assert.assertTrue(result);
    }

    @Test
    public void testSaveSettings() {
        //Given
        //When
        boolean result = settingsFileEngine.getInstance().saveSettings();
        //Then
        Assert.assertTrue(result);
    }
}
