// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class YpcGetCancellationFlowCommand$YPCGetCancellationFlowCommand extends agzi implements ahax
{
    public static final YpcGetCancellationFlowCommand$YPCGetCancellationFlowCommand a;
    private static volatile ahbe c;
    public static final agzg ypcGetCancellationFlowCommand;
    public String b;
    private int d;
    
    static {
        final YpcGetCancellationFlowCommand$YPCGetCancellationFlowCommand a2 = new YpcGetCancellationFlowCommand$YPCGetCancellationFlowCommand();
        agzi.registerDefaultInstance((Class)YpcGetCancellationFlowCommand$YPCGetCancellationFlowCommand.class, (agzi)(a = a2));
        ypcGetCancellationFlowCommand = agzi.newSingularGeneratedExtension((MessageLite)aioe.a, (Object)a2, (MessageLite)a2, (agzn)null, 291188164, ahcm.k, (Class)YpcGetCancellationFlowCommand$YPCGetCancellationFlowCommand.class);
    }
    
    private YpcGetCancellationFlowCommand$YPCGetCancellationFlowCommand() {
        this.b = "";
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe c;
                if ((c = YpcGetCancellationFlowCommand$YPCGetCancellationFlowCommand.c) == null) {
                    synchronized (YpcGetCancellationFlowCommand$YPCGetCancellationFlowCommand.class) {
                        if (YpcGetCancellationFlowCommand$YPCGetCancellationFlowCommand.c == null) {
                            YpcGetCancellationFlowCommand$YPCGetCancellationFlowCommand.c = (ahbe)new agzb((agzi)YpcGetCancellationFlowCommand$YPCGetCancellationFlowCommand.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return YpcGetCancellationFlowCommand$YPCGetCancellationFlowCommand.a;
            }
            case 4: {
                return new agza((agzi)YpcGetCancellationFlowCommand$YPCGetCancellationFlowCommand.a);
            }
            case 3: {
                return new YpcGetCancellationFlowCommand$YPCGetCancellationFlowCommand();
            }
            case 2: {
                return newMessageInfo((MessageLite)YpcGetCancellationFlowCommand$YPCGetCancellationFlowCommand.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1008\u0000", new Object[] { "d", "b" });
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
