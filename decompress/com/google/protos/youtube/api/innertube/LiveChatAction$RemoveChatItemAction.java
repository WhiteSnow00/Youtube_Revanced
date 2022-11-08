// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class LiveChatAction$RemoveChatItemAction extends agzi implements ahax
{
    public static final LiveChatAction$RemoveChatItemAction a;
    private static volatile ahbe c;
    public static final agzg removeChatItemAction;
    public String b;
    private int d;
    
    static {
        final LiveChatAction$RemoveChatItemAction a2 = new LiveChatAction$RemoveChatItemAction();
        agzi.registerDefaultInstance((Class)LiveChatAction$RemoveChatItemAction.class, (agzi)(a = a2));
        removeChatItemAction = agzi.newSingularGeneratedExtension((MessageLite)aioe.a, (Object)a2, (MessageLite)a2, (agzn)null, 130295727, ahcm.k, (Class)LiveChatAction$RemoveChatItemAction.class);
    }
    
    private LiveChatAction$RemoveChatItemAction() {
        this.b = "";
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe c;
                if ((c = LiveChatAction$RemoveChatItemAction.c) == null) {
                    synchronized (LiveChatAction$RemoveChatItemAction.class) {
                        if (LiveChatAction$RemoveChatItemAction.c == null) {
                            LiveChatAction$RemoveChatItemAction.c = (ahbe)new agzb((agzi)LiveChatAction$RemoveChatItemAction.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return LiveChatAction$RemoveChatItemAction.a;
            }
            case 4: {
                return new agza((agzi)LiveChatAction$RemoveChatItemAction.a);
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
