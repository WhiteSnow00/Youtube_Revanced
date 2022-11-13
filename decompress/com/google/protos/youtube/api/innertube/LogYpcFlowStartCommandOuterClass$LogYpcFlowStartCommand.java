// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class LogYpcFlowStartCommandOuterClass$LogYpcFlowStartCommand extends ahbh implements ahcw
{
    public static final LogYpcFlowStartCommandOuterClass$LogYpcFlowStartCommand a;
    private static volatile ahdd d;
    public static final ahbf logYpcFlowStartCommand;
    public int b;
    public Object c;
    
    static {
        final LogYpcFlowStartCommandOuterClass$LogYpcFlowStartCommand a2 = new LogYpcFlowStartCommandOuterClass$LogYpcFlowStartCommand();
        ahbh.registerDefaultInstance((Class)LogYpcFlowStartCommandOuterClass$LogYpcFlowStartCommand.class, (ahbh)(a = a2));
        logYpcFlowStartCommand = ahbh.newSingularGeneratedExtension((MessageLite)aiqj.a, (Object)a2, (MessageLite)a2, (ahbm)null, 191342865, ahek.k, (Class)LogYpcFlowStartCommandOuterClass$LogYpcFlowStartCommand.class);
    }
    
    private LogYpcFlowStartCommandOuterClass$LogYpcFlowStartCommand() {
        this.b = 0;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd d;
                if ((d = LogYpcFlowStartCommandOuterClass$LogYpcFlowStartCommand.d) == null) {
                    synchronized (LogYpcFlowStartCommandOuterClass$LogYpcFlowStartCommand.class) {
                        if (LogYpcFlowStartCommandOuterClass$LogYpcFlowStartCommand.d == null) {
                            LogYpcFlowStartCommandOuterClass$LogYpcFlowStartCommand.d = (ahdd)new ahba((ahbh)LogYpcFlowStartCommandOuterClass$LogYpcFlowStartCommand.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return LogYpcFlowStartCommandOuterClass$LogYpcFlowStartCommand.a;
            }
            case 4: {
                return new ahaz((ahbh)LogYpcFlowStartCommandOuterClass$LogYpcFlowStartCommand.a);
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
