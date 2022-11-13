// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class RefreshCommandOuterClass$RefreshCommand extends ahbh implements ahcw
{
    public static final RefreshCommandOuterClass$RefreshCommand a;
    private static volatile ahdd d;
    public static final ahbf refreshCommand;
    public int b;
    public int c;
    
    static {
        final RefreshCommandOuterClass$RefreshCommand a2 = new RefreshCommandOuterClass$RefreshCommand();
        ahbh.registerDefaultInstance((Class)RefreshCommandOuterClass$RefreshCommand.class, (ahbh)(a = a2));
        refreshCommand = ahbh.newSingularGeneratedExtension((MessageLite)aiqj.a, (Object)a2, (MessageLite)a2, (ahbm)null, 177327295, ahek.k, (Class)RefreshCommandOuterClass$RefreshCommand.class);
    }
    
    private RefreshCommandOuterClass$RefreshCommand() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd d;
                if ((d = RefreshCommandOuterClass$RefreshCommand.d) == null) {
                    synchronized (RefreshCommandOuterClass$RefreshCommand.class) {
                        if (RefreshCommandOuterClass$RefreshCommand.d == null) {
                            RefreshCommandOuterClass$RefreshCommand.d = (ahdd)new ahba((ahbh)RefreshCommandOuterClass$RefreshCommand.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return RefreshCommandOuterClass$RefreshCommand.a;
            }
            case 4: {
                return new ahaz((ahbh)RefreshCommandOuterClass$RefreshCommand.a);
            }
            case 3: {
                return new RefreshCommandOuterClass$RefreshCommand();
            }
            case 2: {
                return newMessageInfo((MessageLite)RefreshCommandOuterClass$RefreshCommand.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u100c\u0000", new Object[] { "b", "c", ansm.m });
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
