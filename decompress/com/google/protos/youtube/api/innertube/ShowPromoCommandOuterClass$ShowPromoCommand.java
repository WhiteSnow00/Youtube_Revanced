// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class ShowPromoCommandOuterClass$ShowPromoCommand extends agzi implements ahax
{
    public static final ShowPromoCommandOuterClass$ShowPromoCommand a;
    private static volatile ahbe d;
    public static final agzg showPromoCommand;
    public int b;
    public Object c;
    private int e;
    private aioe f;
    private byte g;
    
    static {
        final ShowPromoCommandOuterClass$ShowPromoCommand a2 = new ShowPromoCommandOuterClass$ShowPromoCommand();
        agzi.registerDefaultInstance((Class)ShowPromoCommandOuterClass$ShowPromoCommand.class, (agzi)(a = a2));
        showPromoCommand = agzi.newSingularGeneratedExtension((MessageLite)aioe.a, (Object)a2, (MessageLite)a2, (agzn)null, 332330970, ahcm.k, (Class)ShowPromoCommandOuterClass$ShowPromoCommand.class);
    }
    
    private ShowPromoCommandOuterClass$ShowPromoCommand() {
        this.b = 0;
        this.g = 2;
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
                final ahbe d;
                if ((d = ShowPromoCommandOuterClass$ShowPromoCommand.d) == null) {
                    synchronized (ShowPromoCommandOuterClass$ShowPromoCommand.class) {
                        if (ShowPromoCommandOuterClass$ShowPromoCommand.d == null) {
                            ShowPromoCommandOuterClass$ShowPromoCommand.d = (ahbe)new agzb((agzi)ShowPromoCommandOuterClass$ShowPromoCommand.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return ShowPromoCommandOuterClass$ShowPromoCommand.a;
            }
            case 4: {
                return new agza((agzi)ShowPromoCommandOuterClass$ShowPromoCommand.a);
            }
            case 3: {
                return new ShowPromoCommandOuterClass$ShowPromoCommand();
            }
            case 2: {
                return newMessageInfo((MessageLite)ShowPromoCommandOuterClass$ShowPromoCommand.a, "\u0001\u0003\u0001\u0001\u0001\u0003\u0003\u0000\u0000\u0003\u0001\u143c\u0000\u0002\u143c\u0000\u0003\u1409\u0002", new Object[] { "c", "b", "e", aioe.class, anss.class, "f" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.g = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.g;
            }
        }
    }
}
