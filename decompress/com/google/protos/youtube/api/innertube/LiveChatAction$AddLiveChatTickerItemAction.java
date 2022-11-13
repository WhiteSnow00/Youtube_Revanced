// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class LiveChatAction$AddLiveChatTickerItemAction extends ahbh implements ahcw
{
    public static final LiveChatAction$AddLiveChatTickerItemAction a;
    public static final ahbf addLiveChatTickerItemAction;
    private static volatile ahdd e;
    public int b;
    public alsp c;
    public long d;
    private byte f;
    
    static {
        final LiveChatAction$AddLiveChatTickerItemAction a2 = new LiveChatAction$AddLiveChatTickerItemAction();
        ahbh.registerDefaultInstance((Class)LiveChatAction$AddLiveChatTickerItemAction.class, (ahbh)(a = a2));
        addLiveChatTickerItemAction = ahbh.newSingularGeneratedExtension((MessageLite)aiqj.a, (Object)a2, (MessageLite)a2, (ahbm)null, 132845915, ahek.k, (Class)LiveChatAction$AddLiveChatTickerItemAction.class);
    }
    
    private LiveChatAction$AddLiveChatTickerItemAction() {
        this.f = 2;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte f = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd e;
                if ((e = LiveChatAction$AddLiveChatTickerItemAction.e) == null) {
                    synchronized (LiveChatAction$AddLiveChatTickerItemAction.class) {
                        if (LiveChatAction$AddLiveChatTickerItemAction.e == null) {
                            LiveChatAction$AddLiveChatTickerItemAction.e = (ahdd)new ahba((ahbh)LiveChatAction$AddLiveChatTickerItemAction.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return LiveChatAction$AddLiveChatTickerItemAction.a;
            }
            case 4: {
                return new ahaz((ahbh)LiveChatAction$AddLiveChatTickerItemAction.a);
            }
            case 3: {
                return new LiveChatAction$AddLiveChatTickerItemAction();
            }
            case 2: {
                return newMessageInfo((MessageLite)LiveChatAction$AddLiveChatTickerItemAction.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001\u1409\u0000\u0002\u1002\u0001", new Object[] { "b", "c", "d" });
            }
            case 1: {
                if (o == null) {
                    f = 0;
                }
                this.f = f;
                return null;
            }
            case 0: {
                return this.f;
            }
        }
    }
}
