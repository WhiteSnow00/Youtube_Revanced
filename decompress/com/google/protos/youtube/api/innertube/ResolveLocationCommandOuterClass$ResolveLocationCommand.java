// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class ResolveLocationCommandOuterClass$ResolveLocationCommand extends ahbh implements ahcw
{
    public static final ResolveLocationCommandOuterClass$ResolveLocationCommand a;
    private static volatile ahdd e;
    public static final ahbf resolveLocationCommand;
    public int b;
    public boolean c;
    public int d;
    
    static {
        final ResolveLocationCommandOuterClass$ResolveLocationCommand a2 = new ResolveLocationCommandOuterClass$ResolveLocationCommand();
        ahbh.registerDefaultInstance((Class)ResolveLocationCommandOuterClass$ResolveLocationCommand.class, (ahbh)(a = a2));
        resolveLocationCommand = ahbh.newSingularGeneratedExtension((MessageLite)aiqj.a, (Object)a2, (MessageLite)a2, (ahbm)null, 394311467, ahek.k, (Class)ResolveLocationCommandOuterClass$ResolveLocationCommand.class);
    }
    
    private ResolveLocationCommandOuterClass$ResolveLocationCommand() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd e;
                if ((e = ResolveLocationCommandOuterClass$ResolveLocationCommand.e) == null) {
                    synchronized (ResolveLocationCommandOuterClass$ResolveLocationCommand.class) {
                        if (ResolveLocationCommandOuterClass$ResolveLocationCommand.e == null) {
                            ResolveLocationCommandOuterClass$ResolveLocationCommand.e = (ahdd)new ahba((ahbh)ResolveLocationCommandOuterClass$ResolveLocationCommand.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return ResolveLocationCommandOuterClass$ResolveLocationCommand.a;
            }
            case 4: {
                return new ahaz((ahbh)ResolveLocationCommandOuterClass$ResolveLocationCommand.a);
            }
            case 3: {
                return new ResolveLocationCommandOuterClass$ResolveLocationCommand();
            }
            case 2: {
                return newMessageInfo((MessageLite)ResolveLocationCommandOuterClass$ResolveLocationCommand.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1007\u0000\u0002\u100c\u0001", new Object[] { "b", "c", "d", alua.h });
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
