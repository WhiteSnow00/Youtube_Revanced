// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class LiveChatAction$AddChatItemAction extends ahbh implements ahcw
{
    public static final LiveChatAction$AddChatItemAction a;
    public static final ahbf addChatItemAction;
    private static volatile ahdd f;
    public int b;
    public alqh c;
    public String d;
    public alpf e;
    private byte g;
    
    static {
        final LiveChatAction$AddChatItemAction a2 = new LiveChatAction$AddChatItemAction();
        ahbh.registerDefaultInstance((Class)LiveChatAction$AddChatItemAction.class, (ahbh)(a = a2));
        addChatItemAction = ahbh.newSingularGeneratedExtension((MessageLite)aiqj.a, (Object)a2, (MessageLite)a2, (ahbm)null, 117298952, ahek.k, (Class)LiveChatAction$AddChatItemAction.class);
    }
    
    private LiveChatAction$AddChatItemAction() {
        this.g = 2;
        this.d = "";
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
                final ahdd f;
                if ((f = LiveChatAction$AddChatItemAction.f) == null) {
                    synchronized (LiveChatAction$AddChatItemAction.class) {
                        if (LiveChatAction$AddChatItemAction.f == null) {
                            LiveChatAction$AddChatItemAction.f = (ahdd)new ahba((ahbh)LiveChatAction$AddChatItemAction.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return LiveChatAction$AddChatItemAction.a;
            }
            case 4: {
                return new ahaz((ahbh)LiveChatAction$AddChatItemAction.a);
            }
            case 3: {
                return new LiveChatAction$AddChatItemAction();
            }
            case 2: {
                return newMessageInfo((MessageLite)LiveChatAction$AddChatItemAction.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001\u1409\u0000\u0002\u1008\u0001\u0003\u1009\u0002", new Object[] { "b", "c", "d", "e" });
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
