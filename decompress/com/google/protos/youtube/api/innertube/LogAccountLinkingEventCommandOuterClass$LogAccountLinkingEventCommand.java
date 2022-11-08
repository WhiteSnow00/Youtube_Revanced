// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class LogAccountLinkingEventCommandOuterClass$LogAccountLinkingEventCommand extends agzi implements ahax
{
    public static final LogAccountLinkingEventCommandOuterClass$LogAccountLinkingEventCommand a;
    private static volatile ahbe d;
    public static final agzg logAccountLinkingEventCommand;
    public int b;
    public ajug c;
    
    static {
        final LogAccountLinkingEventCommandOuterClass$LogAccountLinkingEventCommand a2 = new LogAccountLinkingEventCommandOuterClass$LogAccountLinkingEventCommand();
        agzi.registerDefaultInstance((Class)LogAccountLinkingEventCommandOuterClass$LogAccountLinkingEventCommand.class, (agzi)(a = a2));
        logAccountLinkingEventCommand = agzi.newSingularGeneratedExtension((MessageLite)aioe.a, (Object)a2, (MessageLite)a2, (agzn)null, 316544609, ahcm.k, (Class)LogAccountLinkingEventCommandOuterClass$LogAccountLinkingEventCommand.class);
    }
    
    private LogAccountLinkingEventCommandOuterClass$LogAccountLinkingEventCommand() {
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe d;
                if ((d = LogAccountLinkingEventCommandOuterClass$LogAccountLinkingEventCommand.d) == null) {
                    synchronized (LogAccountLinkingEventCommandOuterClass$LogAccountLinkingEventCommand.class) {
                        if (LogAccountLinkingEventCommandOuterClass$LogAccountLinkingEventCommand.d == null) {
                            LogAccountLinkingEventCommandOuterClass$LogAccountLinkingEventCommand.d = (ahbe)new agzb((agzi)LogAccountLinkingEventCommandOuterClass$LogAccountLinkingEventCommand.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return LogAccountLinkingEventCommandOuterClass$LogAccountLinkingEventCommand.a;
            }
            case 4: {
                return new agza((agzi)LogAccountLinkingEventCommandOuterClass$LogAccountLinkingEventCommand.a);
            }
            case 3: {
                return new LogAccountLinkingEventCommandOuterClass$LogAccountLinkingEventCommand();
            }
            case 2: {
                return newMessageInfo((MessageLite)LogAccountLinkingEventCommandOuterClass$LogAccountLinkingEventCommand.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1009\u0000", new Object[] { "b", "c" });
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
