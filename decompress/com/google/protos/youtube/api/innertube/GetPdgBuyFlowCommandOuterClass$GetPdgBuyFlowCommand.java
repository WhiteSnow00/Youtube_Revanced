// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class GetPdgBuyFlowCommandOuterClass$GetPdgBuyFlowCommand extends agzi implements ahax
{
    public static final GetPdgBuyFlowCommandOuterClass$GetPdgBuyFlowCommand a;
    private static volatile ahbe c;
    public static final agzg getPdgBuyFlowCommand;
    public agyc b;
    private int d;
    
    static {
        final GetPdgBuyFlowCommandOuterClass$GetPdgBuyFlowCommand a2 = new GetPdgBuyFlowCommandOuterClass$GetPdgBuyFlowCommand();
        agzi.registerDefaultInstance((Class)GetPdgBuyFlowCommandOuterClass$GetPdgBuyFlowCommand.class, (agzi)(a = a2));
        getPdgBuyFlowCommand = agzi.newSingularGeneratedExtension((MessageLite)aioe.a, (Object)a2, (MessageLite)a2, (agzn)null, 257016449, ahcm.k, (Class)GetPdgBuyFlowCommandOuterClass$GetPdgBuyFlowCommand.class);
    }
    
    private GetPdgBuyFlowCommandOuterClass$GetPdgBuyFlowCommand() {
        this.b = agyc.b;
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe c;
                if ((c = GetPdgBuyFlowCommandOuterClass$GetPdgBuyFlowCommand.c) == null) {
                    synchronized (GetPdgBuyFlowCommandOuterClass$GetPdgBuyFlowCommand.class) {
                        if (GetPdgBuyFlowCommandOuterClass$GetPdgBuyFlowCommand.c == null) {
                            GetPdgBuyFlowCommandOuterClass$GetPdgBuyFlowCommand.c = (ahbe)new agzb((agzi)GetPdgBuyFlowCommandOuterClass$GetPdgBuyFlowCommand.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return GetPdgBuyFlowCommandOuterClass$GetPdgBuyFlowCommand.a;
            }
            case 4: {
                return new agza((agzi)GetPdgBuyFlowCommandOuterClass$GetPdgBuyFlowCommand.a);
            }
            case 3: {
                return new GetPdgBuyFlowCommandOuterClass$GetPdgBuyFlowCommand();
            }
            case 2: {
                return newMessageInfo((MessageLite)GetPdgBuyFlowCommandOuterClass$GetPdgBuyFlowCommand.a, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002\u100a\u0001", new Object[] { "d", "b" });
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
