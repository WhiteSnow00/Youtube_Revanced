// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class LogAdClickTerminationCommandOuterClass$LogAdClickTerminationCommand extends agzi implements ahax
{
    public static final LogAdClickTerminationCommandOuterClass$LogAdClickTerminationCommand a;
    private static volatile ahbe b;
    public static final agzg logAdClickTerminationCommand;
    
    static {
        final LogAdClickTerminationCommandOuterClass$LogAdClickTerminationCommand a2 = new LogAdClickTerminationCommandOuterClass$LogAdClickTerminationCommand();
        agzi.registerDefaultInstance((Class)LogAdClickTerminationCommandOuterClass$LogAdClickTerminationCommand.class, (agzi)(a = a2));
        logAdClickTerminationCommand = agzi.newSingularGeneratedExtension((MessageLite)aioe.a, (Object)a2, (MessageLite)a2, (agzn)null, 358889020, ahcm.k, (Class)LogAdClickTerminationCommandOuterClass$LogAdClickTerminationCommand.class);
    }
    
    private LogAdClickTerminationCommandOuterClass$LogAdClickTerminationCommand() {
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe b;
                if ((b = LogAdClickTerminationCommandOuterClass$LogAdClickTerminationCommand.b) == null) {
                    synchronized (LogAdClickTerminationCommandOuterClass$LogAdClickTerminationCommand.class) {
                        if (LogAdClickTerminationCommandOuterClass$LogAdClickTerminationCommand.b == null) {
                            LogAdClickTerminationCommandOuterClass$LogAdClickTerminationCommand.b = (ahbe)new agzb((agzi)LogAdClickTerminationCommandOuterClass$LogAdClickTerminationCommand.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return LogAdClickTerminationCommandOuterClass$LogAdClickTerminationCommand.a;
            }
            case 4: {
                return new agza((agzi)LogAdClickTerminationCommandOuterClass$LogAdClickTerminationCommand.a);
            }
            case 3: {
                return new LogAdClickTerminationCommandOuterClass$LogAdClickTerminationCommand();
            }
            case 2: {
                return newMessageInfo((MessageLite)LogAdClickTerminationCommandOuterClass$LogAdClickTerminationCommand.a, "\u0001\u0000", (Object[])null);
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
