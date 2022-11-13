// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class ShowPromoCommandOuterClass$ShowPromoCommand extends ahbh implements ahcw
{
    public static final ShowPromoCommandOuterClass$ShowPromoCommand a;
    private static volatile ahdd d;
    public static final ahbf showPromoCommand;
    public int b;
    public Object c;
    private int e;
    private aiqj f;
    private byte g;
    
    static {
        final ShowPromoCommandOuterClass$ShowPromoCommand a2 = new ShowPromoCommandOuterClass$ShowPromoCommand();
        ahbh.registerDefaultInstance((Class)ShowPromoCommandOuterClass$ShowPromoCommand.class, (ahbh)(a = a2));
        showPromoCommand = ahbh.newSingularGeneratedExtension((MessageLite)aiqj.a, (Object)a2, (MessageLite)a2, (ahbm)null, 332330970, ahek.k, (Class)ShowPromoCommandOuterClass$ShowPromoCommand.class);
    }
    
    private ShowPromoCommandOuterClass$ShowPromoCommand() {
        this.b = 0;
        this.g = 2;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte g = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd d;
                if ((d = ShowPromoCommandOuterClass$ShowPromoCommand.d) == null) {
                    synchronized (ShowPromoCommandOuterClass$ShowPromoCommand.class) {
                        if (ShowPromoCommandOuterClass$ShowPromoCommand.d == null) {
                            ShowPromoCommandOuterClass$ShowPromoCommand.d = (ahdd)new ahba((ahbh)ShowPromoCommandOuterClass$ShowPromoCommand.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return ShowPromoCommandOuterClass$ShowPromoCommand.a;
            }
            case 4: {
                return new ahaz((ahbh)ShowPromoCommandOuterClass$ShowPromoCommand.a);
            }
            case 3: {
                return new ShowPromoCommandOuterClass$ShowPromoCommand();
            }
            case 2: {
                return newMessageInfo((MessageLite)ShowPromoCommandOuterClass$ShowPromoCommand.a, "\u0001\u0003\u0001\u0001\u0001\u0003\u0003\u0000\u0000\u0003\u0001\u143c\u0000\u0002\u143c\u0000\u0003\u1409\u0002", new Object[] { "c", "b", "e", aiqj.class, anuv.class, "f" });
            }
            case 1: {
                if (o == null) {
                    g = 0;
                }
                this.g = g;
                return null;
            }
            case 0: {
                return this.g;
            }
        }
    }
}
