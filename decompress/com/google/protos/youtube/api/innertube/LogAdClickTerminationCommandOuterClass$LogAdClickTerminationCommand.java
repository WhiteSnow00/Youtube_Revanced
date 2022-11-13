// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class LogAdClickTerminationCommandOuterClass$LogAdClickTerminationCommand extends ahbh implements ahcw
{
    public static final LogAdClickTerminationCommandOuterClass$LogAdClickTerminationCommand a;
    private static volatile ahdd b;
    public static final ahbf logAdClickTerminationCommand;
    
    static {
        final LogAdClickTerminationCommandOuterClass$LogAdClickTerminationCommand a2 = new LogAdClickTerminationCommandOuterClass$LogAdClickTerminationCommand();
        ahbh.registerDefaultInstance((Class)LogAdClickTerminationCommandOuterClass$LogAdClickTerminationCommand.class, (ahbh)(a = a2));
        logAdClickTerminationCommand = ahbh.newSingularGeneratedExtension((MessageLite)aiqj.a, (Object)a2, (MessageLite)a2, (ahbm)null, 358889020, ahek.k, (Class)LogAdClickTerminationCommandOuterClass$LogAdClickTerminationCommand.class);
    }
    
    private LogAdClickTerminationCommandOuterClass$LogAdClickTerminationCommand() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd b;
                if ((b = LogAdClickTerminationCommandOuterClass$LogAdClickTerminationCommand.b) == null) {
                    synchronized (LogAdClickTerminationCommandOuterClass$LogAdClickTerminationCommand.class) {
                        if (LogAdClickTerminationCommandOuterClass$LogAdClickTerminationCommand.b == null) {
                            LogAdClickTerminationCommandOuterClass$LogAdClickTerminationCommand.b = (ahdd)new ahba((ahbh)LogAdClickTerminationCommandOuterClass$LogAdClickTerminationCommand.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return LogAdClickTerminationCommandOuterClass$LogAdClickTerminationCommand.a;
            }
            case 4: {
                return new ahaz((ahbh)LogAdClickTerminationCommandOuterClass$LogAdClickTerminationCommand.a);
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
