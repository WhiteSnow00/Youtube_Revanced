// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class LiveChatAction$ReplaceChatItemAction extends agzi implements ahax
{
    public static final LiveChatAction$ReplaceChatItemAction a;
    private static volatile ahbe d;
    public static final agzg replaceChatItemAction;
    public String b;
    public aloe c;
    private int e;
    private byte f;
    
    static {
        final LiveChatAction$ReplaceChatItemAction a2 = new LiveChatAction$ReplaceChatItemAction();
        agzi.registerDefaultInstance((Class)LiveChatAction$ReplaceChatItemAction.class, (agzi)(a = a2));
        replaceChatItemAction = agzi.newSingularGeneratedExtension((MessageLite)aioe.a, (Object)a2, (MessageLite)a2, (agzn)null, 149968475, ahcm.k, (Class)LiveChatAction$ReplaceChatItemAction.class);
    }
    
    private LiveChatAction$ReplaceChatItemAction() {
        this.f = 2;
        this.b = "";
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        final int ordinal = agzh.ordinal();
        boolean b = true;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe d;
                if ((d = LiveChatAction$ReplaceChatItemAction.d) == null) {
                    synchronized (LiveChatAction$ReplaceChatItemAction.class) {
                        if (LiveChatAction$ReplaceChatItemAction.d == null) {
                            LiveChatAction$ReplaceChatItemAction.d = (ahbe)new agzb((agzi)LiveChatAction$ReplaceChatItemAction.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return LiveChatAction$ReplaceChatItemAction.a;
            }
            case 4: {
                return new agza((agzi)LiveChatAction$ReplaceChatItemAction.a);
            }
            case 3: {
                return new LiveChatAction$ReplaceChatItemAction();
            }
            case 2: {
                return newMessageInfo((MessageLite)LiveChatAction$ReplaceChatItemAction.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001\u1008\u0000\u0002\u1409\u0001", new Object[] { "e", "b", "c" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.f = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.f;
            }
        }
    }
}
