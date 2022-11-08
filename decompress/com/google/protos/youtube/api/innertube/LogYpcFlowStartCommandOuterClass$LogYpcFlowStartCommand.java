// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class LogYpcFlowStartCommandOuterClass$LogYpcFlowStartCommand extends agzi implements ahax
{
    public static final LogYpcFlowStartCommandOuterClass$LogYpcFlowStartCommand a;
    private static volatile ahbe d;
    public static final agzg logYpcFlowStartCommand;
    public int b;
    public Object c;
    
    static {
        final LogYpcFlowStartCommandOuterClass$LogYpcFlowStartCommand a2 = new LogYpcFlowStartCommandOuterClass$LogYpcFlowStartCommand();
        agzi.registerDefaultInstance((Class)LogYpcFlowStartCommandOuterClass$LogYpcFlowStartCommand.class, (agzi)(a = a2));
        logYpcFlowStartCommand = agzi.newSingularGeneratedExtension((MessageLite)aioe.a, (Object)a2, (MessageLite)a2, (agzn)null, 191342865, ahcm.k, (Class)LogYpcFlowStartCommandOuterClass$LogYpcFlowStartCommand.class);
    }
    
    private LogYpcFlowStartCommandOuterClass$LogYpcFlowStartCommand() {
        this.b = 0;
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe d;
                if ((d = LogYpcFlowStartCommandOuterClass$LogYpcFlowStartCommand.d) == null) {
                    synchronized (LogYpcFlowStartCommandOuterClass$LogYpcFlowStartCommand.class) {
                        if (LogYpcFlowStartCommandOuterClass$LogYpcFlowStartCommand.d == null) {
                            LogYpcFlowStartCommandOuterClass$LogYpcFlowStartCommand.d = (ahbe)new agzb((agzi)LogYpcFlowStartCommandOuterClass$LogYpcFlowStartCommand.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return LogYpcFlowStartCommandOuterClass$LogYpcFlowStartCommand.a;
            }
            case 4: {
                return new agza((agzi)LogYpcFlowStartCommandOuterClass$LogYpcFlowStartCommand.a);
            }
            case 3: {
                return new LogYpcFlowStartCommandOuterClass$LogYpcFlowStartCommand();
            }
            case 2: {
                return newMessageInfo((MessageLite)LogYpcFlowStartCommandOuterClass$LogYpcFlowStartCommand.a, "\u0001\u0007\u0001\u0000\u0001\b\u0007\u0000\u0000\u0000\u0001\u103d\u0000\u0002\u103d\u0000\u0003\u103d\u0000\u0004\u103d\u0000\u0005\u103d\u0000\u0006\u103d\u0000\b\u103d\u0000", new Object[] { "c", "b" });
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
