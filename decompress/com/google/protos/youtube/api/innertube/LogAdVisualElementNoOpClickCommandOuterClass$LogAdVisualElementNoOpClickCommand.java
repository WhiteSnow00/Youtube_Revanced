// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class LogAdVisualElementNoOpClickCommandOuterClass$LogAdVisualElementNoOpClickCommand extends ahbh implements ahcw
{
    public static final LogAdVisualElementNoOpClickCommandOuterClass$LogAdVisualElementNoOpClickCommand a;
    private static volatile ahdd b;
    public static final ahbf logAdVisualElementNoOpClickCommand;
    
    static {
        final LogAdVisualElementNoOpClickCommandOuterClass$LogAdVisualElementNoOpClickCommand a2 = new LogAdVisualElementNoOpClickCommandOuterClass$LogAdVisualElementNoOpClickCommand();
        ahbh.registerDefaultInstance((Class)LogAdVisualElementNoOpClickCommandOuterClass$LogAdVisualElementNoOpClickCommand.class, (ahbh)(a = a2));
        logAdVisualElementNoOpClickCommand = ahbh.newSingularGeneratedExtension((MessageLite)aiqj.a, (Object)a2, (MessageLite)a2, (ahbm)null, 392023517, ahek.k, (Class)LogAdVisualElementNoOpClickCommandOuterClass$LogAdVisualElementNoOpClickCommand.class);
    }
    
    private LogAdVisualElementNoOpClickCommandOuterClass$LogAdVisualElementNoOpClickCommand() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd b;
                if ((b = LogAdVisualElementNoOpClickCommandOuterClass$LogAdVisualElementNoOpClickCommand.b) == null) {
                    synchronized (LogAdVisualElementNoOpClickCommandOuterClass$LogAdVisualElementNoOpClickCommand.class) {
                        if (LogAdVisualElementNoOpClickCommandOuterClass$LogAdVisualElementNoOpClickCommand.b == null) {
                            LogAdVisualElementNoOpClickCommandOuterClass$LogAdVisualElementNoOpClickCommand.b = (ahdd)new ahba((ahbh)LogAdVisualElementNoOpClickCommandOuterClass$LogAdVisualElementNoOpClickCommand.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return LogAdVisualElementNoOpClickCommandOuterClass$LogAdVisualElementNoOpClickCommand.a;
            }
            case 4: {
                return new ahaz((ahbh)LogAdVisualElementNoOpClickCommandOuterClass$LogAdVisualElementNoOpClickCommand.a);
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
