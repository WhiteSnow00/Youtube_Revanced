// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class LiveChatAction$ReplayChatItemAction extends agzi implements ahax
{
    public static final LiveChatAction$ReplayChatItemAction a;
    private static volatile ahbe d;
    public static final agzg replayChatItemAction;
    public agzy b;
    public long c;
    private int e;
    private byte f;
    
    static {
        final LiveChatAction$ReplayChatItemAction a2 = new LiveChatAction$ReplayChatItemAction();
        agzi.registerDefaultInstance((Class)LiveChatAction$ReplayChatItemAction.class, (agzi)(a = a2));
        replayChatItemAction = agzi.newSingularGeneratedExtension((MessageLite)aioe.a, (Object)a2, (MessageLite)a2, (agzn)null, 145132565, ahcm.k, (Class)LiveChatAction$ReplayChatItemAction.class);
    }
    
    private LiveChatAction$ReplayChatItemAction() {
        this.f = 2;
        this.b = emptyProtobufList();
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
                if ((d = LiveChatAction$ReplayChatItemAction.d) == null) {
                    synchronized (LiveChatAction$ReplayChatItemAction.class) {
                        if (LiveChatAction$ReplayChatItemAction.d == null) {
                            LiveChatAction$ReplayChatItemAction.d = (ahbe)new agzb((agzi)LiveChatAction$ReplayChatItemAction.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return LiveChatAction$ReplayChatItemAction.a;
            }
            case 4: {
                return new agza((agzi)LiveChatAction$ReplayChatItemAction.a);
            }
            case 3: {
                return new LiveChatAction$ReplayChatItemAction();
            }
            case 2: {
                return newMessageInfo((MessageLite)LiveChatAction$ReplayChatItemAction.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0001\u0001\u041b\u0002\u1002\u0000", new Object[] { "e", "b", aioe.class, "c" });
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
