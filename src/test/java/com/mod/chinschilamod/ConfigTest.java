package com.mod.chinschilamod;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Method;

import static org.junit.jupiter.api.Assertions.*;

public class ConfigTest {

    private static boolean invokeValidateItemName(String name) throws Exception {
        Method m = Config.class.getDeclaredMethod("validateItemName", Object.class);
        m.setAccessible(true);
        return (Boolean) m.invoke(null, name);
    }

    @Test
    public void testValidItem() throws Exception {
        assertTrue(invokeValidateItemName("minecraft:iron_ingot"));
    }

    @Test
    public void testInvalidItem() throws Exception {
        assertFalse(invokeValidateItemName("minecraft:nonexistent_item"));
    }
}
