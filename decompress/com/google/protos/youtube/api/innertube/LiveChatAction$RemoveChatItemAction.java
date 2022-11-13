// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class LiveChatAction$RemoveChatItemAction extends ahbh implements ahcw
{
    public static final LiveChatAction$RemoveChatItemAction a;
    private static volatile ahdd c;
    public static final ahbf removeChatItemAction;
    public String b;
    private int d;
    
    static {
        final LiveChatAction$RemoveChatItemAction a2 = new LiveChatAction$RemoveChatItemAction();
        ahbh.registerDefaultInstance((Class)LiveChatAction$RemoveChatItemAction.class, (ahbh)(a = a2));
        removeChatItemAction = ahbh.newSingularGeneratedExtension((MessageLite)aiqj.a, (Object)a2, (MessageLite)a2, (ahbm)null, 130295727, ahek.k, (Class)LiveChatAction$RemoveChatItemAction.class);
    }
    
    private LiveChatAction$RemoveChatItemAction() {
        this.b = "";
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd c;
                if ((c = LiveChatAction$RemoveChatItemAction.c) == null) {
                    synchronized (LiveChatAction$RemoveChatItemAction.class) {
                        if (LiveChatAction$RemoveChatItemAction.c == null) {
                            LiveChatAction$RemoveChatItemAction.c = (ahdd)new ahba((ahbh)LiveChatAction$RemoveChatItemAction.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return LiveChatAction$RemoveChatItemAction.a;
            }
            case 4: {
                return new ahaz((ahbh)LiveChatAction$RemoveChatItemAction.a);
            }
            case 3: {
                return new LiveChatAction$RemoveChatItemAction();
            }
            case 2: {
                return newMessageInfo((MessageLite)LiveChatAction$RemoveChatItemAction.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1008\u0000", new Object[] { "d", "b" });
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
