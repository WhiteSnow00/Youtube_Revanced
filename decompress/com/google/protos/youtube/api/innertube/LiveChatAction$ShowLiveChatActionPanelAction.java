// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class LiveChatAction$ShowLiveChatActionPanelAction extends ahbh implements ahcw
{
    public static final LiveChatAction$ShowLiveChatActionPanelAction a;
    private static volatile ahdd d;
    public static final ahbf showLiveChatActionPanelAction;
    public int b;
    public anuv c;
    private byte e;
    
    static {
        final LiveChatAction$ShowLiveChatActionPanelAction a2 = new LiveChatAction$ShowLiveChatActionPanelAction();
        ahbh.registerDefaultInstance((Class)LiveChatAction$ShowLiveChatActionPanelAction.class, (ahbh)(a = a2));
        showLiveChatActionPanelAction = ahbh.newSingularGeneratedExtension((MessageLite)aiqj.a, (Object)a2, (MessageLite)a2, (ahbm)null, 238110852, ahek.k, (Class)LiveChatAction$ShowLiveChatActionPanelAction.class);
    }
    
    private LiveChatAction$ShowLiveChatActionPanelAction() {
        this.e = 2;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte e = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd d;
                if ((d = LiveChatAction$ShowLiveChatActionPanelAction.d) == null) {
                    synchronized (LiveChatAction$ShowLiveChatActionPanelAction.class) {
                        if (LiveChatAction$ShowLiveChatActionPanelAction.d == null) {
                            LiveChatAction$ShowLiveChatActionPanelAction.d = (ahdd)new ahba((ahbh)LiveChatAction$ShowLiveChatActionPanelAction.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return LiveChatAction$ShowLiveChatActionPanelAction.a;
            }
            case 4: {
                return new ahaz((ahbh)LiveChatAction$ShowLiveChatActionPanelAction.a);
            }
            case 3: {
                return new LiveChatAction$ShowLiveChatActionPanelAction();
            }
            case 2: {
                return newMessageInfo((MessageLite)LiveChatAction$ShowLiveChatActionPanelAction.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u1409\u0000", new Object[] { "b", "c" });
            }
            case 1: {
                if (o == null) {
                    e = 0;
                }
                this.e = e;
                return null;
            }
            case 0: {
                return this.e;
            }
        }
    }
}
