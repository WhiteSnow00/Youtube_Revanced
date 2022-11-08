// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class LiveChatRemoveChatItemByAuthorAction$RemoveChatItemByAuthorAction extends agzi implements ahax
{
    public static final LiveChatRemoveChatItemByAuthorAction$RemoveChatItemByAuthorAction a;
    private static volatile ahbe d;
    public static final agzg removeChatItemByAuthorAction;
    public int b;
    public String c;
    
    static {
        final LiveChatRemoveChatItemByAuthorAction$RemoveChatItemByAuthorAction a2 = new LiveChatRemoveChatItemByAuthorAction$RemoveChatItemByAuthorAction();
        agzi.registerDefaultInstance((Class)LiveChatRemoveChatItemByAuthorAction$RemoveChatItemByAuthorAction.class, (agzi)(a = a2));
        removeChatItemByAuthorAction = agzi.newSingularGeneratedExtension((MessageLite)aioe.a, (Object)a2, (MessageLite)a2, (agzn)null, 463152755, ahcm.k, (Class)LiveChatRemoveChatItemByAuthorAction$RemoveChatItemByAuthorAction.class);
    }
    
    private LiveChatRemoveChatItemByAuthorAction$RemoveChatItemByAuthorAction() {
        this.c = "";
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe d;
                if ((d = LiveChatRemoveChatItemByAuthorAction$RemoveChatItemByAuthorAction.d) == null) {
                    synchronized (LiveChatRemoveChatItemByAuthorAction$RemoveChatItemByAuthorAction.class) {
                        if (LiveChatRemoveChatItemByAuthorAction$RemoveChatItemByAuthorAction.d == null) {
                            LiveChatRemoveChatItemByAuthorAction$RemoveChatItemByAuthorAction.d = (ahbe)new agzb((agzi)LiveChatRemoveChatItemByAuthorAction$RemoveChatItemByAuthorAction.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return LiveChatRemoveChatItemByAuthorAction$RemoveChatItemByAuthorAction.a;
            }
            case 4: {
                return new agza((agzi)LiveChatRemoveChatItemByAuthorAction$RemoveChatItemByAuthorAction.a);
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
