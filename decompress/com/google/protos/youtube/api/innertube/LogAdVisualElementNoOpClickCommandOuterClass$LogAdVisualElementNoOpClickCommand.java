// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class LogAdVisualElementNoOpClickCommandOuterClass$LogAdVisualElementNoOpClickCommand extends agzi implements ahax
{
    public static final LogAdVisualElementNoOpClickCommandOuterClass$LogAdVisualElementNoOpClickCommand a;
    private static volatile ahbe b;
    public static final agzg logAdVisualElementNoOpClickCommand;
    
    static {
        final LogAdVisualElementNoOpClickCommandOuterClass$LogAdVisualElementNoOpClickCommand a2 = new LogAdVisualElementNoOpClickCommandOuterClass$LogAdVisualElementNoOpClickCommand();
        agzi.registerDefaultInstance((Class)LogAdVisualElementNoOpClickCommandOuterClass$LogAdVisualElementNoOpClickCommand.class, (agzi)(a = a2));
        logAdVisualElementNoOpClickCommand = agzi.newSingularGeneratedExtension((MessageLite)aioe.a, (Object)a2, (MessageLite)a2, (agzn)null, 392023517, ahcm.k, (Class)LogAdVisualElementNoOpClickCommandOuterClass$LogAdVisualElementNoOpClickCommand.class);
    }
    
    private LogAdVisualElementNoOpClickCommandOuterClass$LogAdVisualElementNoOpClickCommand() {
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe b;
                if ((b = LogAdVisualElementNoOpClickCommandOuterClass$LogAdVisualElementNoOpClickCommand.b) == null) {
                    synchronized (LogAdVisualElementNoOpClickCommandOuterClass$LogAdVisualElementNoOpClickCommand.class) {
                        if (LogAdVisualElementNoOpClickCommandOuterClass$LogAdVisualElementNoOpClickCommand.b == null) {
                            LogAdVisualElementNoOpClickCommandOuterClass$LogAdVisualElementNoOpClickCommand.b = (ahbe)new agzb((agzi)LogAdVisualElementNoOpClickCommandOuterClass$LogAdVisualElementNoOpClickCommand.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return LogAdVisualElementNoOpClickCommandOuterClass$LogAdVisualElementNoOpClickCommand.a;
            }
            case 4: {
                return new agza((agzi)LogAdVisualElementNoOpClickCommandOuterClass$LogAdVisualElementNoOpClickCommand.a);
            }
            case 3: {
                return new LogAdVisualElementNoOpClickCommandOuterClass$LogAdVisualElementNoOpClickCommand();
            }
            case 2: {
                return newMessageInfo((MessageLite)LogAdVisualElementNoOpClickCommandOuterClass$LogAdVisualElementNoOpClickCommand.a, "\u0001\u0000", (Object[])null);
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
