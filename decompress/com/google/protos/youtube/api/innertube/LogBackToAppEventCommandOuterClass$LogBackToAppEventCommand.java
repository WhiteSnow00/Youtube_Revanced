// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class LogBackToAppEventCommandOuterClass$LogBackToAppEventCommand extends agzi implements ahax
{
    public static final LogBackToAppEventCommandOuterClass$LogBackToAppEventCommand a;
    private static volatile ahbe c;
    public static final agzg logBackToAppEventCommand;
    public int b;
    private int d;
    
    static {
        final LogBackToAppEventCommandOuterClass$LogBackToAppEventCommand a2 = new LogBackToAppEventCommandOuterClass$LogBackToAppEventCommand();
        agzi.registerDefaultInstance((Class)LogBackToAppEventCommandOuterClass$LogBackToAppEventCommand.class, (agzi)(a = a2));
        logBackToAppEventCommand = agzi.newSingularGeneratedExtension((MessageLite)aioe.a, (Object)a2, (MessageLite)a2, (agzn)null, 300210387, ahcm.k, (Class)LogBackToAppEventCommandOuterClass$LogBackToAppEventCommand.class);
    }
    
    private LogBackToAppEventCommandOuterClass$LogBackToAppEventCommand() {
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe c;
                if ((c = LogBackToAppEventCommandOuterClass$LogBackToAppEventCommand.c) == null) {
                    synchronized (LogBackToAppEventCommandOuterClass$LogBackToAppEventCommand.class) {
                        if (LogBackToAppEventCommandOuterClass$LogBackToAppEventCommand.c == null) {
                            LogBackToAppEventCommandOuterClass$LogBackToAppEventCommand.c = (ahbe)new agzb((agzi)LogBackToAppEventCommandOuterClass$LogBackToAppEventCommand.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return LogBackToAppEventCommandOuterClass$LogBackToAppEventCommand.a;
            }
            case 4: {
                return new agza((agzi)LogBackToAppEventCommandOuterClass$LogBackToAppEventCommand.a);
            }
            case 3: {
                return new LogBackToAppEventCommandOuterClass$LogBackToAppEventCommand();
            }
            case 2: {
                return newMessageInfo((MessageLite)LogBackToAppEventCommandOuterClass$LogBackToAppEventCommand.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u100c\u0000", new Object[] { "d", "b", alsb.i });
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
