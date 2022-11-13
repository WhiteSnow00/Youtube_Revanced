// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class LogYpcFlowFailureCommandOuterClass$LogYpcFlowFailureCommand extends ahbh implements ahcw
{
    public static final LogYpcFlowFailureCommandOuterClass$LogYpcFlowFailureCommand a;
    private static volatile ahdd f;
    public static final ahbf logYpcFlowFailureCommand;
    public int b;
    public Object c;
    public int d;
    public String e;
    private int g;
    
    static {
        final LogYpcFlowFailureCommandOuterClass$LogYpcFlowFailureCommand a2 = new LogYpcFlowFailureCommandOuterClass$LogYpcFlowFailureCommand();
        ahbh.registerDefaultInstance((Class)LogYpcFlowFailureCommandOuterClass$LogYpcFlowFailureCommand.class, (ahbh)(a = a2));
        logYpcFlowFailureCommand = ahbh.newSingularGeneratedExtension((MessageLite)aiqj.a, (Object)a2, (MessageLite)a2, (ahbm)null, 427587276, ahek.k, (Class)LogYpcFlowFailureCommandOuterClass$LogYpcFlowFailureCommand.class);
    }
    
    private LogYpcFlowFailureCommandOuterClass$LogYpcFlowFailureCommand() {
        this.b = 0;
        this.e = "";
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd f;
                if ((f = LogYpcFlowFailureCommandOuterClass$LogYpcFlowFailureCommand.f) == null) {
                    synchronized (LogYpcFlowFailureCommandOuterClass$LogYpcFlowFailureCommand.class) {
                        if (LogYpcFlowFailureCommandOuterClass$LogYpcFlowFailureCommand.f == null) {
                            LogYpcFlowFailureCommandOuterClass$LogYpcFlowFailureCommand.f = (ahdd)new ahba((ahbh)LogYpcFlowFailureCommandOuterClass$LogYpcFlowFailureCommand.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return LogYpcFlowFailureCommandOuterClass$LogYpcFlowFailureCommand.a;
            }
            case 4: {
                return new ahaz((ahbh)LogYpcFlowFailureCommandOuterClass$LogYpcFlowFailureCommand.a);
            }
            case 3: {
                return new LogYpcFlowFailureCommandOuterClass$LogYpcFlowFailureCommand();
            }
            case 2: {
                return newMessageInfo((MessageLite)LogYpcFlowFailureCommandOuterClass$LogYpcFlowFailureCommand.a, "\u0001\u0003\u0001\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u103d\u0000\u0002\u100c\u0001\u0003\u1008\u0002", new Object[] { "c", "b", "g", "d", apuh.j, "e" });
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
