// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class DynamicFlowCommandOuterClass$DynamicFlowCommand extends agzi implements ahax
{
    public static final DynamicFlowCommandOuterClass$DynamicFlowCommand a;
    public static final agzg dynamicFlowCommand;
    private static volatile ahbe e;
    public int b;
    public String c;
    public int d;
    
    static {
        final DynamicFlowCommandOuterClass$DynamicFlowCommand a2 = new DynamicFlowCommandOuterClass$DynamicFlowCommand();
        agzi.registerDefaultInstance((Class)DynamicFlowCommandOuterClass$DynamicFlowCommand.class, (agzi)(a = a2));
        dynamicFlowCommand = agzi.newSingularGeneratedExtension((MessageLite)aioe.a, (Object)a2, (MessageLite)a2, (agzn)null, 412156452, ahcm.k, (Class)DynamicFlowCommandOuterClass$DynamicFlowCommand.class);
    }
    
    private DynamicFlowCommandOuterClass$DynamicFlowCommand() {
        this.c = "";
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe e;
                if ((e = DynamicFlowCommandOuterClass$DynamicFlowCommand.e) == null) {
                    synchronized (DynamicFlowCommandOuterClass$DynamicFlowCommand.class) {
                        if (DynamicFlowCommandOuterClass$DynamicFlowCommand.e == null) {
                            DynamicFlowCommandOuterClass$DynamicFlowCommand.e = (ahbe)new agzb((agzi)DynamicFlowCommandOuterClass$DynamicFlowCommand.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return DynamicFlowCommandOuterClass$DynamicFlowCommand.a;
            }
            case 4: {
                return new agza((agzi)DynamicFlowCommandOuterClass$DynamicFlowCommand.a);
            }
            case 3: {
                return new DynamicFlowCommandOuterClass$DynamicFlowCommand();
            }
            case 2: {
                return newMessageInfo((MessageLite)DynamicFlowCommandOuterClass$DynamicFlowCommand.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u100c\u0001", new Object[] { "b", "c", "d", ajcg.q });
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
