// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.elements.interfaces;

public enum LoggingLevel
{
    private static final LoggingLevel[] $VALUES;
    
    LOG_LEVEL_ERROR("LOG_LEVEL_ERROR", 0), 
    LOG_LEVEL_INFO("LOG_LEVEL_INFO", 2), 
    LOG_LEVEL_WARNING("LOG_LEVEL_WARNING", 1);
    
    private static LoggingLevel[] $values() {
        return new LoggingLevel[] { LoggingLevel.LOG_LEVEL_ERROR, LoggingLevel.LOG_LEVEL_WARNING, LoggingLevel.LOG_LEVEL_INFO };
    }
    
    static {
        $VALUES = $values();
    }
    
    private LoggingLevel(final String s, final int n) {
    }
}
