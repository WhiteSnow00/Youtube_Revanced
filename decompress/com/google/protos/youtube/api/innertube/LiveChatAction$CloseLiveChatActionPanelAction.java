// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class LiveChatAction$CloseLiveChatActionPanelAction extends ahbh implements ahcw
{
    public static final LiveChatAction$CloseLiveChatActionPanelAction a;
    public static final ahbf closeLiveChatActionPanelAction;
    private static volatile ahdd f;
    public int b;
    public String c;
    public int d;
    public boolean e;
    
    static {
        final LiveChatAction$CloseLiveChatActionPanelAction a2 = new LiveChatAction$CloseLiveChatActionPanelAction();
        ahbh.registerDefaultInstance((Class)LiveChatAction$CloseLiveChatActionPanelAction.class, (ahbh)(a = a2));
        closeLiveChatActionPanelAction = ahbh.newSingularGeneratedExtension((MessageLite)aiqj.a, (Object)a2, (MessageLite)a2, (ahbm)null, 240912718, ahek.k, (Class)LiveChatAction$CloseLiveChatActionPanelAction.class);
    }
    
    private LiveChatAction$CloseLiveChatActionPanelAction() {
        this.c = "";
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd f;
                if ((f = LiveChatAction$CloseLiveChatActionPanelAction.f) == null) {
                    synchronized (LiveChatAction$CloseLiveChatActionPanelAction.class) {
                        if (LiveChatAction$CloseLiveChatActionPanelAction.f == null) {
                            LiveChatAction$CloseLiveChatActionPanelAction.f = (ahdd)new ahba((ahbh)LiveChatAction$CloseLiveChatActionPanelAction.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return LiveChatAction$CloseLiveChatActionPanelAction.a;
            }
            case 4: {
                return new ahaz((ahbh)LiveChatAction$CloseLiveChatActionPanelAction.a);
            }
            case 3: {
                return new LiveChatAction$CloseLiveChatActionPanelAction();
            }
            case 2: {
                return newMessageInfo((MessageLite)LiveChatAction$CloseLiveChatActionPanelAction.a, "\u0001\u0003\u0000\u0001\u0002\u0004\u0003\u0000\u0000\u0000\u0002\u1008\u0000\u0003\u1004\u0001\u0004\u1007\u0002", new Object[] { "b", "c", "d", "e" });
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
