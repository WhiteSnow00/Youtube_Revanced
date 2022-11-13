// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class LiveChatAction$ReplayChatItemAction extends ahbh implements ahcw
{
    public static final LiveChatAction$ReplayChatItemAction a;
    private static volatile ahdd d;
    public static final ahbf replayChatItemAction;
    public ahbx b;
    public long c;
    private int e;
    private byte f;
    
    static {
        final LiveChatAction$ReplayChatItemAction a2 = new LiveChatAction$ReplayChatItemAction();
        ahbh.registerDefaultInstance((Class)LiveChatAction$ReplayChatItemAction.class, (ahbh)(a = a2));
        replayChatItemAction = ahbh.newSingularGeneratedExtension((MessageLite)aiqj.a, (Object)a2, (MessageLite)a2, (ahbm)null, 145132565, ahek.k, (Class)LiveChatAction$ReplayChatItemAction.class);
    }
    
    private LiveChatAction$ReplayChatItemAction() {
        this.f = 2;
        this.b = emptyProtobufList();
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte f = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd d;
                if ((d = LiveChatAction$ReplayChatItemAction.d) == null) {
                    synchronized (LiveChatAction$ReplayChatItemAction.class) {
                        if (LiveChatAction$ReplayChatItemAction.d == null) {
                            LiveChatAction$ReplayChatItemAction.d = (ahdd)new ahba((ahbh)LiveChatAction$ReplayChatItemAction.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return LiveChatAction$ReplayChatItemAction.a;
            }
            case 4: {
                return new ahaz((ahbh)LiveChatAction$ReplayChatItemAction.a);
            }
            case 3: {
                return new LiveChatAction$ReplayChatItemAction();
            }
            case 2: {
                return newMessageInfo((MessageLite)LiveChatAction$ReplayChatItemAction.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0001\u0001\u041b\u0002\u1002\u0000", new Object[] { "e", "b", aiqj.class, "c" });
            }
            case 1: {
                if (o == null) {
                    f = 0;
                }
                this.f = f;
                return null;
            }
            case 0: {
                return this.f;
            }
        }
    }
}
