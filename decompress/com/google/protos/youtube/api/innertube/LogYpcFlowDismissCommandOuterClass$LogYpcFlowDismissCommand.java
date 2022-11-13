// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class LogYpcFlowDismissCommandOuterClass$LogYpcFlowDismissCommand extends ahbh implements ahcw
{
    public static final LogYpcFlowDismissCommandOuterClass$LogYpcFlowDismissCommand a;
    private static volatile ahdd d;
    public static final ahbf logYpcFlowDismissCommand;
    public int b;
    public Object c;
    
    static {
        final LogYpcFlowDismissCommandOuterClass$LogYpcFlowDismissCommand a2 = new LogYpcFlowDismissCommandOuterClass$LogYpcFlowDismissCommand();
        ahbh.registerDefaultInstance((Class)LogYpcFlowDismissCommandOuterClass$LogYpcFlowDismissCommand.class, (ahbh)(a = a2));
        logYpcFlowDismissCommand = ahbh.newSingularGeneratedExtension((MessageLite)aiqj.a, (Object)a2, (MessageLite)a2, (ahbm)null, 192838928, ahek.k, (Class)LogYpcFlowDismissCommandOuterClass$LogYpcFlowDismissCommand.class);
    }
    
    private LogYpcFlowDismissCommandOuterClass$LogYpcFlowDismissCommand() {
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
                if ((d = LogYpcFlowDismissCommandOuterClass$LogYpcFlowDismissCommand.d) == null) {
                    synchronized (LogYpcFlowDismissCommandOuterClass$LogYpcFlowDismissCommand.class) {
                        if (LogYpcFlowDismissCommandOuterClass$LogYpcFlowDismissCommand.d == null) {
                            LogYpcFlowDismissCommandOuterClass$LogYpcFlowDismissCommand.d = (ahdd)new ahba((ahbh)LogYpcFlowDismissCommandOuterClass$LogYpcFlowDismissCommand.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return LogYpcFlowDismissCommandOuterClass$LogYpcFlowDismissCommand.a;
            }
            case 4: {
                return new ahaz((ahbh)LogYpcFlowDismissCommandOuterClass$LogYpcFlowDismissCommand.a);
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
