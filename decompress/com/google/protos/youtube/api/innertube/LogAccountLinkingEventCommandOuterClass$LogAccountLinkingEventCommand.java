// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class LogAccountLinkingEventCommandOuterClass$LogAccountLinkingEventCommand extends ahbh implements ahcw
{
    public static final LogAccountLinkingEventCommandOuterClass$LogAccountLinkingEventCommand a;
    private static volatile ahdd d;
    public static final ahbf logAccountLinkingEventCommand;
    public int b;
    public ajwj c;
    
    static {
        final LogAccountLinkingEventCommandOuterClass$LogAccountLinkingEventCommand a2 = new LogAccountLinkingEventCommandOuterClass$LogAccountLinkingEventCommand();
        ahbh.registerDefaultInstance((Class)LogAccountLinkingEventCommandOuterClass$LogAccountLinkingEventCommand.class, (ahbh)(a = a2));
        logAccountLinkingEventCommand = ahbh.newSingularGeneratedExtension((MessageLite)aiqj.a, (Object)a2, (MessageLite)a2, (ahbm)null, 316544609, ahek.k, (Class)LogAccountLinkingEventCommandOuterClass$LogAccountLinkingEventCommand.class);
    }
    
    private LogAccountLinkingEventCommandOuterClass$LogAccountLinkingEventCommand() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd d;
                if ((d = LogAccountLinkingEventCommandOuterClass$LogAccountLinkingEventCommand.d) == null) {
                    synchronized (LogAccountLinkingEventCommandOuterClass$LogAccountLinkingEventCommand.class) {
                        if (LogAccountLinkingEventCommandOuterClass$LogAccountLinkingEventCommand.d == null) {
                            LogAccountLinkingEventCommandOuterClass$LogAccountLinkingEventCommand.d = (ahdd)new ahba((ahbh)LogAccountLinkingEventCommandOuterClass$LogAccountLinkingEventCommand.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return LogAccountLinkingEventCommandOuterClass$LogAccountLinkingEventCommand.a;
            }
            case 4: {
                return new ahaz((ahbh)LogAccountLinkingEventCommandOuterClass$LogAccountLinkingEventCommand.a);
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
