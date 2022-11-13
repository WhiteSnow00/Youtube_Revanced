// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class LoopCommandOuterClass$LoopCommand extends ahbh implements ahcw
{
    public static final LoopCommandOuterClass$LoopCommand a;
    private static volatile ahdd h;
    public static final ahbf loopCommand;
    public int b;
    public boolean c;
    public long d;
    public long e;
    public String f;
    public boolean g;
    
    static {
        final LoopCommandOuterClass$LoopCommand a2 = new LoopCommandOuterClass$LoopCommand();
        ahbh.registerDefaultInstance((Class)LoopCommandOuterClass$LoopCommand.class, (ahbh)(a = a2));
        loopCommand = ahbh.newSingularGeneratedExtension((MessageLite)aiqj.a, (Object)a2, (MessageLite)a2, (ahbm)null, 250570650, ahek.k, (Class)LoopCommandOuterClass$LoopCommand.class);
    }
    
    private LoopCommandOuterClass$LoopCommand() {
        this.f = "";
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd h;
                if ((h = LoopCommandOuterClass$LoopCommand.h) == null) {
                    synchronized (LoopCommandOuterClass$LoopCommand.class) {
                        if (LoopCommandOuterClass$LoopCommand.h == null) {
                            LoopCommandOuterClass$LoopCommand.h = (ahdd)new ahba((ahbh)LoopCommandOuterClass$LoopCommand.a);
                        }
                    }
                }
                return h;
            }
            case 5: {
                return LoopCommandOuterClass$LoopCommand.a;
            }
            case 4: {
                return new ahaz((ahbh)LoopCommandOuterClass$LoopCommand.a);
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
