// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class GetFlowCommandOuterClass$GetFlowCommand extends agzi implements ahax
{
    public static final GetFlowCommandOuterClass$GetFlowCommand a;
    public static final agzg getFlowCommand;
    private static volatile ahbe h;
    public int b;
    public String c;
    public String d;
    public String e;
    public int f;
    public aioe g;
    private byte i;
    
    static {
        final GetFlowCommandOuterClass$GetFlowCommand a2 = new GetFlowCommandOuterClass$GetFlowCommand();
        agzi.registerDefaultInstance((Class)GetFlowCommandOuterClass$GetFlowCommand.class, (agzi)(a = a2));
        getFlowCommand = agzi.newSingularGeneratedExtension((MessageLite)aioe.a, (Object)a2, (MessageLite)a2, (agzn)null, 371825303, ahcm.k, (Class)GetFlowCommandOuterClass$GetFlowCommand.class);
    }
    
    private GetFlowCommandOuterClass$GetFlowCommand() {
        this.i = 2;
        this.c = "";
        this.d = "";
        this.e = "";
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        final int ordinal = agzh.ordinal();
        boolean b = true;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe h;
                if ((h = GetFlowCommandOuterClass$GetFlowCommand.h) == null) {
                    synchronized (GetFlowCommandOuterClass$GetFlowCommand.class) {
                        if (GetFlowCommandOuterClass$GetFlowCommand.h == null) {
                            GetFlowCommandOuterClass$GetFlowCommand.h = (ahbe)new agzb((agzi)GetFlowCommandOuterClass$GetFlowCommand.a);
                        }
                    }
                }
                return h;
            }
            case 5: {
                return GetFlowCommandOuterClass$GetFlowCommand.a;
            }
            case 4: {
                return new agza((agzi)GetFlowCommandOuterClass$GetFlowCommand.a);
            }
            case 3: {
                return new GetFlowCommandOuterClass$GetFlowCommand();
            }
            case 2: {
                return newMessageInfo((MessageLite)GetFlowCommandOuterClass$GetFlowCommand.a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0001\u0001\u1008\u0000\u0002\u1008\u0001\u0003\u1008\u0002\u0004\u100c\u0003\u0005\u1409\u0004", new Object[] { "b", "c", "d", "e", "f", ajrs.a(), "g" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.i = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.i;
            }
        }
    }
}
