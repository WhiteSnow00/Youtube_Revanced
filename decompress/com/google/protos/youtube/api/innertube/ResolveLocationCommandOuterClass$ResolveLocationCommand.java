// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class ResolveLocationCommandOuterClass$ResolveLocationCommand extends agzi implements ahax
{
    public static final ResolveLocationCommandOuterClass$ResolveLocationCommand a;
    private static volatile ahbe e;
    public static final agzg resolveLocationCommand;
    public int b;
    public boolean c;
    public int d;
    
    static {
        final ResolveLocationCommandOuterClass$ResolveLocationCommand a2 = new ResolveLocationCommandOuterClass$ResolveLocationCommand();
        agzi.registerDefaultInstance((Class)ResolveLocationCommandOuterClass$ResolveLocationCommand.class, (agzi)(a = a2));
        resolveLocationCommand = agzi.newSingularGeneratedExtension((MessageLite)aioe.a, (Object)a2, (MessageLite)a2, (agzn)null, 394311467, ahcm.k, (Class)ResolveLocationCommandOuterClass$ResolveLocationCommand.class);
    }
    
    private ResolveLocationCommandOuterClass$ResolveLocationCommand() {
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe e;
                if ((e = ResolveLocationCommandOuterClass$ResolveLocationCommand.e) == null) {
                    synchronized (ResolveLocationCommandOuterClass$ResolveLocationCommand.class) {
                        if (ResolveLocationCommandOuterClass$ResolveLocationCommand.e == null) {
                            ResolveLocationCommandOuterClass$ResolveLocationCommand.e = (ahbe)new agzb((agzi)ResolveLocationCommandOuterClass$ResolveLocationCommand.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return ResolveLocationCommandOuterClass$ResolveLocationCommand.a;
            }
            case 4: {
                return new agza((agzi)ResolveLocationCommandOuterClass$ResolveLocationCommand.a);
            }
            case 3: {
                return new ResolveLocationCommandOuterClass$ResolveLocationCommand();
            }
            case 2: {
                return newMessageInfo((MessageLite)ResolveLocationCommandOuterClass$ResolveLocationCommand.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1007\u0000\u0002\u100c\u0001", new Object[] { "b", "c", "d", alsb.g });
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
