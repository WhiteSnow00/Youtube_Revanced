// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class LogBackToAppEventCommandOuterClass$LogBackToAppEventCommand extends ahbh implements ahcw
{
    public static final LogBackToAppEventCommandOuterClass$LogBackToAppEventCommand a;
    private static volatile ahdd c;
    public static final ahbf logBackToAppEventCommand;
    public int b;
    private int d;
    
    static {
        final LogBackToAppEventCommandOuterClass$LogBackToAppEventCommand a2 = new LogBackToAppEventCommandOuterClass$LogBackToAppEventCommand();
        ahbh.registerDefaultInstance((Class)LogBackToAppEventCommandOuterClass$LogBackToAppEventCommand.class, (ahbh)(a = a2));
        logBackToAppEventCommand = ahbh.newSingularGeneratedExtension((MessageLite)aiqj.a, (Object)a2, (MessageLite)a2, (ahbm)null, 300210387, ahek.k, (Class)LogBackToAppEventCommandOuterClass$LogBackToAppEventCommand.class);
    }
    
    private LogBackToAppEventCommandOuterClass$LogBackToAppEventCommand() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd c;
                if ((c = LogBackToAppEventCommandOuterClass$LogBackToAppEventCommand.c) == null) {
                    synchronized (LogBackToAppEventCommandOuterClass$LogBackToAppEventCommand.class) {
                        if (LogBackToAppEventCommandOuterClass$LogBackToAppEventCommand.c == null) {
                            LogBackToAppEventCommandOuterClass$LogBackToAppEventCommand.c = (ahdd)new ahba((ahbh)LogBackToAppEventCommandOuterClass$LogBackToAppEventCommand.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return LogBackToAppEventCommandOuterClass$LogBackToAppEventCommand.a;
            }
            case 4: {
                return new ahaz((ahbh)LogBackToAppEventCommandOuterClass$LogBackToAppEventCommand.a);
            }
            case 3: {
                return new LogBackToAppEventCommandOuterClass$LogBackToAppEventCommand();
            }
            case 2: {
                return newMessageInfo((MessageLite)LogBackToAppEventCommandOuterClass$LogBackToAppEventCommand.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u100c\u0000", new Object[] { "d", "b", alua.j });
            }
            case 1: {
                return null;
            }
            case 0: {
                return 1;
            }
        }
    }
}
