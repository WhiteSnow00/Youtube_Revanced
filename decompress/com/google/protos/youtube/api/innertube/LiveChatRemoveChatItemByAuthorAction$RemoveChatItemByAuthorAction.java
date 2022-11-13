// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class LiveChatRemoveChatItemByAuthorAction$RemoveChatItemByAuthorAction extends ahbh implements ahcw
{
    public static final LiveChatRemoveChatItemByAuthorAction$RemoveChatItemByAuthorAction a;
    private static volatile ahdd d;
    public static final ahbf removeChatItemByAuthorAction;
    public int b;
    public String c;
    
    static {
        final LiveChatRemoveChatItemByAuthorAction$RemoveChatItemByAuthorAction a2 = new LiveChatRemoveChatItemByAuthorAction$RemoveChatItemByAuthorAction();
        ahbh.registerDefaultInstance((Class)LiveChatRemoveChatItemByAuthorAction$RemoveChatItemByAuthorAction.class, (ahbh)(a = a2));
        removeChatItemByAuthorAction = ahbh.newSingularGeneratedExtension((MessageLite)aiqj.a, (Object)a2, (MessageLite)a2, (ahbm)null, 463152755, ahek.k, (Class)LiveChatRemoveChatItemByAuthorAction$RemoveChatItemByAuthorAction.class);
    }
    
    private LiveChatRemoveChatItemByAuthorAction$RemoveChatItemByAuthorAction() {
        this.c = "";
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd d;
                if ((d = LiveChatRemoveChatItemByAuthorAction$RemoveChatItemByAuthorAction.d) == null) {
                    synchronized (LiveChatRemoveChatItemByAuthorAction$RemoveChatItemByAuthorAction.class) {
                        if (LiveChatRemoveChatItemByAuthorAction$RemoveChatItemByAuthorAction.d == null) {
                            LiveChatRemoveChatItemByAuthorAction$RemoveChatItemByAuthorAction.d = (ahdd)new ahba((ahbh)LiveChatRemoveChatItemByAuthorAction$RemoveChatItemByAuthorAction.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return LiveChatRemoveChatItemByAuthorAction$RemoveChatItemByAuthorAction.a;
            }
            case 4: {
                return new ahaz((ahbh)LiveChatRemoveChatItemByAuthorAction$RemoveChatItemByAuthorAction.a);
            }
            case 3: {
                return new LiveChatRemoveChatItemByAuthorAction$RemoveChatItemByAuthorAction();
            }
            case 2: {
                return newMessageInfo((MessageLite)LiveChatRemoveChatItemByAuthorAction$RemoveChatItemByAuthorAction.a, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002\u1008\u0000", new Object[] { "b", "c" });
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
