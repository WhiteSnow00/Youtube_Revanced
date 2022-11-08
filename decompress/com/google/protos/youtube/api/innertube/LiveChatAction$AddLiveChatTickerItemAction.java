// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class LiveChatAction$AddLiveChatTickerItemAction extends agzi implements ahax
{
    public static final LiveChatAction$AddLiveChatTickerItemAction a;
    public static final agzg addLiveChatTickerItemAction;
    private static volatile ahbe e;
    public int b;
    public alqm c;
    public long d;
    private byte f;
    
    static {
        final LiveChatAction$AddLiveChatTickerItemAction a2 = new LiveChatAction$AddLiveChatTickerItemAction();
        agzi.registerDefaultInstance((Class)LiveChatAction$AddLiveChatTickerItemAction.class, (agzi)(a = a2));
        addLiveChatTickerItemAction = agzi.newSingularGeneratedExtension((MessageLite)aioe.a, (Object)a2, (MessageLite)a2, (agzn)null, 132845915, ahcm.k, (Class)LiveChatAction$AddLiveChatTickerItemAction.class);
    }
    
    private LiveChatAction$AddLiveChatTickerItemAction() {
        this.f = 2;
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
                final ahbe e;
                if ((e = LiveChatAction$AddLiveChatTickerItemAction.e) == null) {
                    synchronized (LiveChatAction$AddLiveChatTickerItemAction.class) {
                        if (LiveChatAction$AddLiveChatTickerItemAction.e == null) {
                            LiveChatAction$AddLiveChatTickerItemAction.e = (ahbe)new agzb((agzi)LiveChatAction$AddLiveChatTickerItemAction.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return LiveChatAction$AddLiveChatTickerItemAction.a;
            }
            case 4: {
                return new agza((agzi)LiveChatAction$AddLiveChatTickerItemAction.a);
            }
            case 3: {
                return new LiveChatAction$AddLiveChatTickerItemAction();
            }
            case 2: {
                return newMessageInfo((MessageLite)LiveChatAction$AddLiveChatTickerItemAction.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001\u1409\u0000\u0002\u1002\u0001", new Object[] { "b", "c", "d" });
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
