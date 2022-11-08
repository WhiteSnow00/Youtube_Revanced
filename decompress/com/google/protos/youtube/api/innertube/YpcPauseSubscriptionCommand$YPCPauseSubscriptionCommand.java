// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class YpcPauseSubscriptionCommand$YPCPauseSubscriptionCommand extends agzi implements ahax
{
    public static final YpcPauseSubscriptionCommand$YPCPauseSubscriptionCommand a;
    private static volatile ahbe f;
    public static final agzg ypcPauseSubscriptionCommand;
    public int b;
    public String c;
    public agyc d;
    public long e;
    
    static {
        final YpcPauseSubscriptionCommand$YPCPauseSubscriptionCommand a2 = new YpcPauseSubscriptionCommand$YPCPauseSubscriptionCommand();
        agzi.registerDefaultInstance((Class)YpcPauseSubscriptionCommand$YPCPauseSubscriptionCommand.class, (agzi)(a = a2));
        ypcPauseSubscriptionCommand = agzi.newSingularGeneratedExtension((MessageLite)aioe.a, (Object)a2, (MessageLite)a2, (agzn)null, 191762785, ahcm.k, (Class)YpcPauseSubscriptionCommand$YPCPauseSubscriptionCommand.class);
    }
    
    private YpcPauseSubscriptionCommand$YPCPauseSubscriptionCommand() {
        this.c = "";
        this.d = agyc.b;
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe f;
                if ((f = YpcPauseSubscriptionCommand$YPCPauseSubscriptionCommand.f) == null) {
                    synchronized (YpcPauseSubscriptionCommand$YPCPauseSubscriptionCommand.class) {
                        if (YpcPauseSubscriptionCommand$YPCPauseSubscriptionCommand.f == null) {
                            YpcPauseSubscriptionCommand$YPCPauseSubscriptionCommand.f = (ahbe)new agzb((agzi)YpcPauseSubscriptionCommand$YPCPauseSubscriptionCommand.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return YpcPauseSubscriptionCommand$YPCPauseSubscriptionCommand.a;
            }
            case 4: {
                return new agza((agzi)YpcPauseSubscriptionCommand$YPCPauseSubscriptionCommand.a);
            }
            case 3: {
                return new YpcPauseSubscriptionCommand$YPCPauseSubscriptionCommand();
            }
            case 2: {
                return newMessageInfo((MessageLite)YpcPauseSubscriptionCommand$YPCPauseSubscriptionCommand.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u100a\u0001\u0003\u1002\u0002", new Object[] { "b", "c", "d", "e" });
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
