// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class LiveChatAction$CloseLiveChatActionPanelAction extends agzi implements ahax
{
    public static final LiveChatAction$CloseLiveChatActionPanelAction a;
    public static final agzg closeLiveChatActionPanelAction;
    private static volatile ahbe f;
    public int b;
    public String c;
    public int d;
    public boolean e;
    
    static {
        final LiveChatAction$CloseLiveChatActionPanelAction a2 = new LiveChatAction$CloseLiveChatActionPanelAction();
        agzi.registerDefaultInstance((Class)LiveChatAction$CloseLiveChatActionPanelAction.class, (agzi)(a = a2));
        closeLiveChatActionPanelAction = agzi.newSingularGeneratedExtension((MessageLite)aioe.a, (Object)a2, (MessageLite)a2, (agzn)null, 240912718, ahcm.k, (Class)LiveChatAction$CloseLiveChatActionPanelAction.class);
    }
    
    private LiveChatAction$CloseLiveChatActionPanelAction() {
        this.c = "";
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe f;
                if ((f = LiveChatAction$CloseLiveChatActionPanelAction.f) == null) {
                    synchronized (LiveChatAction$CloseLiveChatActionPanelAction.class) {
                        if (LiveChatAction$CloseLiveChatActionPanelAction.f == null) {
                            LiveChatAction$CloseLiveChatActionPanelAction.f = (ahbe)new agzb((agzi)LiveChatAction$CloseLiveChatActionPanelAction.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return LiveChatAction$CloseLiveChatActionPanelAction.a;
            }
            case 4: {
                return new agza((agzi)LiveChatAction$CloseLiveChatActionPanelAction.a);
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
