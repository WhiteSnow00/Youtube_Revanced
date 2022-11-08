// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class LogYpcFlowDismissCommandOuterClass$LogYpcFlowDismissCommand extends agzi implements ahax
{
    public static final LogYpcFlowDismissCommandOuterClass$LogYpcFlowDismissCommand a;
    private static volatile ahbe d;
    public static final agzg logYpcFlowDismissCommand;
    public int b;
    public Object c;
    
    static {
        final LogYpcFlowDismissCommandOuterClass$LogYpcFlowDismissCommand a2 = new LogYpcFlowDismissCommandOuterClass$LogYpcFlowDismissCommand();
        agzi.registerDefaultInstance((Class)LogYpcFlowDismissCommandOuterClass$LogYpcFlowDismissCommand.class, (agzi)(a = a2));
        logYpcFlowDismissCommand = agzi.newSingularGeneratedExtension((MessageLite)aioe.a, (Object)a2, (MessageLite)a2, (agzn)null, 192838928, ahcm.k, (Class)LogYpcFlowDismissCommandOuterClass$LogYpcFlowDismissCommand.class);
    }
    
    private LogYpcFlowDismissCommandOuterClass$LogYpcFlowDismissCommand() {
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
                if ((d = LogYpcFlowDismissCommandOuterClass$LogYpcFlowDismissCommand.d) == null) {
                    synchronized (LogYpcFlowDismissCommandOuterClass$LogYpcFlowDismissCommand.class) {
                        if (LogYpcFlowDismissCommandOuterClass$LogYpcFlowDismissCommand.d == null) {
                            LogYpcFlowDismissCommandOuterClass$LogYpcFlowDismissCommand.d = (ahbe)new agzb((agzi)LogYpcFlowDismissCommandOuterClass$LogYpcFlowDismissCommand.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return LogYpcFlowDismissCommandOuterClass$LogYpcFlowDismissCommand.a;
            }
            case 4: {
                return new agza((agzi)LogYpcFlowDismissCommandOuterClass$LogYpcFlowDismissCommand.a);
            }
            case 3: {
                return new LogYpcFlowDismissCommandOuterClass$LogYpcFlowDismissCommand();
            }
            case 2: {
                return newMessageInfo((MessageLite)LogYpcFlowDismissCommandOuterClass$LogYpcFlowDismissCommand.a, "\u0001\u0005\u0001\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001\u103d\u0000\u0002\u103d\u0000\u0003\u103d\u0000\u0004\u103d\u0000\u0005\u103d\u0000", new Object[] { "c", "b" });
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
