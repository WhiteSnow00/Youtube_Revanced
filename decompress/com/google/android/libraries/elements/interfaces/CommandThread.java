// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.elements.interfaces;

public enum CommandThread
{
    private static final CommandThread[] $VALUES;
    
    ANY("ANY", 1), 
    BACKGROUND("BACKGROUND", 3), 
    MAIN("MAIN", 2), 
    NONE("NONE", 0);
    
    private static CommandThread[] $values() {
        return new CommandThread[] { CommandThread.NONE, CommandThread.ANY, CommandThread.MAIN, CommandThread.BACKGROUND };
    }
    
    static {
        $VALUES = $values();
    }
    
    private CommandThread(final String s, final int n) {
    }
}
