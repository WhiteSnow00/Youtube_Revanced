// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class LogFlowLoggingEventCommandOuterClass$LogFlowLoggingEventCommand extends agzi implements ahax
{
    public static final LogFlowLoggingEventCommandOuterClass$LogFlowLoggingEventCommand a;
    private static volatile ahbe i;
    public static final agzg logFlowLoggingEventCommand;
    public int b;
    public int c;
    public int d;
    public int e;
    public ajrb f;
    public String g;
    public long h;
    
    static {
        final LogFlowLoggingEventCommandOuterClass$LogFlowLoggingEventCommand a2 = new LogFlowLoggingEventCommandOuterClass$LogFlowLoggingEventCommand();
        agzi.registerDefaultInstance((Class)LogFlowLoggingEventCommandOuterClass$LogFlowLoggingEventCommand.class, (agzi)(a = a2));
        logFlowLoggingEventCommand = agzi.newSingularGeneratedExtension((MessageLite)aioe.a, (Object)a2, (MessageLite)a2, (agzn)null, 346644970, ahcm.k, (Class)LogFlowLoggingEventCommandOuterClass$LogFlowLoggingEventCommand.class);
    }
    
    private LogFlowLoggingEventCommandOuterClass$LogFlowLoggingEventCommand() {
        this.g = "";
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe i;
                if ((i = LogFlowLoggingEventCommandOuterClass$LogFlowLoggingEventCommand.i) == null) {
                    synchronized (LogFlowLoggingEventCommandOuterClass$LogFlowLoggingEventCommand.class) {
                        if (LogFlowLoggingEventCommandOuterClass$LogFlowLoggingEventCommand.i == null) {
                            LogFlowLoggingEventCommandOuterClass$LogFlowLoggingEventCommand.i = (ahbe)new agzb((agzi)LogFlowLoggingEventCommandOuterClass$LogFlowLoggingEventCommand.a);
                        }
                    }
                }
                return i;
            }
            case 5: {
                return LogFlowLoggingEventCommandOuterClass$LogFlowLoggingEventCommand.a;
            }
            case 4: {
                return new agza((agzi)LogFlowLoggingEventCommandOuterClass$LogFlowLoggingEventCommand.a);
            }
            case 3: {
                return new LogFlowLoggingEventCommandOuterClass$LogFlowLoggingEventCommand();
            }
            case 2: {
                return newMessageInfo((MessageLite)LogFlowLoggingEventCommandOuterClass$LogFlowLoggingEventCommand.a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001\u1004\u0000\u0002\u100c\u0001\u0003\u100c\u0002\u0004\u1009\u0003\u0005\u1008\u0004\u0006\u1002\u0005", new Object[] { "b", "c", "d", ajrv.a, "e", ajrw.a(), "f", "g", "h" });
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
