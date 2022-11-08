// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class RefreshCommandOuterClass$RefreshCommand extends agzi implements ahax
{
    public static final RefreshCommandOuterClass$RefreshCommand a;
    private static volatile ahbe d;
    public static final agzg refreshCommand;
    public int b;
    public int c;
    
    static {
        final RefreshCommandOuterClass$RefreshCommand a2 = new RefreshCommandOuterClass$RefreshCommand();
        agzi.registerDefaultInstance((Class)RefreshCommandOuterClass$RefreshCommand.class, (agzi)(a = a2));
        refreshCommand = agzi.newSingularGeneratedExtension((MessageLite)aioe.a, (Object)a2, (MessageLite)a2, (agzn)null, 177327295, ahcm.k, (Class)RefreshCommandOuterClass$RefreshCommand.class);
    }
    
    private RefreshCommandOuterClass$RefreshCommand() {
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe d;
                if ((d = RefreshCommandOuterClass$RefreshCommand.d) == null) {
                    synchronized (RefreshCommandOuterClass$RefreshCommand.class) {
                        if (RefreshCommandOuterClass$RefreshCommand.d == null) {
                            RefreshCommandOuterClass$RefreshCommand.d = (ahbe)new agzb((agzi)RefreshCommandOuterClass$RefreshCommand.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return RefreshCommandOuterClass$RefreshCommand.a;
            }
            case 4: {
                return new agza((agzi)RefreshCommandOuterClass$RefreshCommand.a);
            }
            case 3: {
                return new RefreshCommandOuterClass$RefreshCommand();
            }
            case 2: {
                return newMessageInfo((MessageLite)RefreshCommandOuterClass$RefreshCommand.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u100c\u0000", new Object[] { "b", "c", anqs.l });
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
