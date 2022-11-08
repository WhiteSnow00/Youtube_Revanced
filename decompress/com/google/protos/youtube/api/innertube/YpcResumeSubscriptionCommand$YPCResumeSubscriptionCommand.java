// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class YpcResumeSubscriptionCommand$YPCResumeSubscriptionCommand extends agzi implements ahax
{
    public static final YpcResumeSubscriptionCommand$YPCResumeSubscriptionCommand a;
    private static volatile ahbe d;
    public static final agzg ypcResumeSubscriptionCommand;
    public String b;
    public agyc c;
    private int e;
    
    static {
        final YpcResumeSubscriptionCommand$YPCResumeSubscriptionCommand a2 = new YpcResumeSubscriptionCommand$YPCResumeSubscriptionCommand();
        agzi.registerDefaultInstance((Class)YpcResumeSubscriptionCommand$YPCResumeSubscriptionCommand.class, (agzi)(a = a2));
        ypcResumeSubscriptionCommand = agzi.newSingularGeneratedExtension((MessageLite)aioe.a, (Object)a2, (MessageLite)a2, (agzn)null, 191943580, ahcm.k, (Class)YpcResumeSubscriptionCommand$YPCResumeSubscriptionCommand.class);
    }
    
    private YpcResumeSubscriptionCommand$YPCResumeSubscriptionCommand() {
        this.b = "";
        this.c = agyc.b;
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe d;
                if ((d = YpcResumeSubscriptionCommand$YPCResumeSubscriptionCommand.d) == null) {
                    synchronized (YpcResumeSubscriptionCommand$YPCResumeSubscriptionCommand.class) {
                        if (YpcResumeSubscriptionCommand$YPCResumeSubscriptionCommand.d == null) {
                            YpcResumeSubscriptionCommand$YPCResumeSubscriptionCommand.d = (ahbe)new agzb((agzi)YpcResumeSubscriptionCommand$YPCResumeSubscriptionCommand.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return YpcResumeSubscriptionCommand$YPCResumeSubscriptionCommand.a;
            }
            case 4: {
                return new agza((agzi)YpcResumeSubscriptionCommand$YPCResumeSubscriptionCommand.a);
            }
            case 3: {
                return new YpcResumeSubscriptionCommand$YPCResumeSubscriptionCommand();
            }
            case 2: {
                return newMessageInfo((MessageLite)YpcResumeSubscriptionCommand$YPCResumeSubscriptionCommand.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u100a\u0001", new Object[] { "e", "b", "c" });
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
