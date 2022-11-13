// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class LiveChatAction$ReplaceChatItemAction extends ahbh implements ahcw
{
    public static final LiveChatAction$ReplaceChatItemAction a;
    private static volatile ahdd d;
    public static final ahbf replaceChatItemAction;
    public String b;
    public alqh c;
    private int e;
    private byte f;
    
    static {
        final LiveChatAction$ReplaceChatItemAction a2 = new LiveChatAction$ReplaceChatItemAction();
        ahbh.registerDefaultInstance((Class)LiveChatAction$ReplaceChatItemAction.class, (ahbh)(a = a2));
        replaceChatItemAction = ahbh.newSingularGeneratedExtension((MessageLite)aiqj.a, (Object)a2, (MessageLite)a2, (ahbm)null, 149968475, ahek.k, (Class)LiveChatAction$ReplaceChatItemAction.class);
    }
    
    private LiveChatAction$ReplaceChatItemAction() {
        this.f = 2;
        this.b = "";
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
                final ahdd d;
                if ((d = LiveChatAction$ReplaceChatItemAction.d) == null) {
                    synchronized (LiveChatAction$ReplaceChatItemAction.class) {
                        if (LiveChatAction$ReplaceChatItemAction.d == null) {
                            LiveChatAction$ReplaceChatItemAction.d = (ahdd)new ahba((ahbh)LiveChatAction$ReplaceChatItemAction.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return LiveChatAction$ReplaceChatItemAction.a;
            }
            case 4: {
                return new ahaz((ahbh)LiveChatAction$ReplaceChatItemAction.a);
            }
            case 3: {
                return new LiveChatAction$ReplaceChatItemAction();
            }
            case 2: {
                return newMessageInfo((MessageLite)LiveChatAction$ReplaceChatItemAction.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001\u1008\u0000\u0002\u1409\u0001", new Object[] { "e", "b", "c" });
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
