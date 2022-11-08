// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class LoopCommandOuterClass$LoopCommand extends agzi implements ahax
{
    public static final LoopCommandOuterClass$LoopCommand a;
    private static volatile ahbe h;
    public static final agzg loopCommand;
    public int b;
    public boolean c;
    public long d;
    public long e;
    public String f;
    public boolean g;
    
    static {
        final LoopCommandOuterClass$LoopCommand a2 = new LoopCommandOuterClass$LoopCommand();
        agzi.registerDefaultInstance((Class)LoopCommandOuterClass$LoopCommand.class, (agzi)(a = a2));
        loopCommand = agzi.newSingularGeneratedExtension((MessageLite)aioe.a, (Object)a2, (MessageLite)a2, (agzn)null, 250570650, ahcm.k, (Class)LoopCommandOuterClass$LoopCommand.class);
    }
    
    private LoopCommandOuterClass$LoopCommand() {
        this.f = "";
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe h;
                if ((h = LoopCommandOuterClass$LoopCommand.h) == null) {
                    synchronized (LoopCommandOuterClass$LoopCommand.class) {
                        if (LoopCommandOuterClass$LoopCommand.h == null) {
                            LoopCommandOuterClass$LoopCommand.h = (ahbe)new agzb((agzi)LoopCommandOuterClass$LoopCommand.a);
                        }
                    }
                }
                return h;
            }
            case 5: {
                return LoopCommandOuterClass$LoopCommand.a;
            }
            case 4: {
                return new agza((agzi)LoopCommandOuterClass$LoopCommand.a);
            }
            case 3: {
                return new LoopCommandOuterClass$LoopCommand();
            }
            case 2: {
                return newMessageInfo((MessageLite)LoopCommandOuterClass$LoopCommand.a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001\u1007\u0000\u0002\u1002\u0001\u0003\u1002\u0002\u0004\u1008\u0003\u0005\u1007\u0004", new Object[] { "b", "c", "d", "e", "f", "g" });
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
