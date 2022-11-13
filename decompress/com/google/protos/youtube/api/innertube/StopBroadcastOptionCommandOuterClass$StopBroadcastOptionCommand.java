// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class StopBroadcastOptionCommandOuterClass$StopBroadcastOptionCommand extends ahbh implements ahcw
{
    public static final StopBroadcastOptionCommandOuterClass$StopBroadcastOptionCommand a;
    private static volatile ahdd c;
    public static final ahbf stopBroadcastOptionCommand;
    public String b;
    private int d;
    
    static {
        final StopBroadcastOptionCommandOuterClass$StopBroadcastOptionCommand a2 = new StopBroadcastOptionCommandOuterClass$StopBroadcastOptionCommand();
        ahbh.registerDefaultInstance((Class)StopBroadcastOptionCommandOuterClass$StopBroadcastOptionCommand.class, (ahbh)(a = a2));
        stopBroadcastOptionCommand = ahbh.newSingularGeneratedExtension((MessageLite)aiqj.a, (Object)a2, (MessageLite)a2, (ahbm)null, 220410683, ahek.k, (Class)StopBroadcastOptionCommandOuterClass$StopBroadcastOptionCommand.class);
    }
    
    private StopBroadcastOptionCommandOuterClass$StopBroadcastOptionCommand() {
        this.b = "";
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd c;
                if ((c = StopBroadcastOptionCommandOuterClass$StopBroadcastOptionCommand.c) == null) {
                    synchronized (StopBroadcastOptionCommandOuterClass$StopBroadcastOptionCommand.class) {
                        if (StopBroadcastOptionCommandOuterClass$StopBroadcastOptionCommand.c == null) {
                            StopBroadcastOptionCommandOuterClass$StopBroadcastOptionCommand.c = (ahdd)new ahba((ahbh)StopBroadcastOptionCommandOuterClass$StopBroadcastOptionCommand.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return StopBroadcastOptionCommandOuterClass$StopBroadcastOptionCommand.a;
            }
            case 4: {
                return new ahaz((ahbh)StopBroadcastOptionCommandOuterClass$StopBroadcastOptionCommand.a);
            }
            case 3: {
                return new StopBroadcastOptionCommandOuterClass$StopBroadcastOptionCommand();
            }
            case 2: {
                return newMessageInfo((MessageLite)StopBroadcastOptionCommandOuterClass$StopBroadcastOptionCommand.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1008\u0000", new Object[] { "d", "b" });
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
