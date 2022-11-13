// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class LiveChatAction$MarkChatItemAsDeletedAction extends ahbh implements ahcw
{
    public static final LiveChatAction$MarkChatItemAsDeletedAction a;
    private static volatile ahdd g;
    public static final ahbf markChatItemAsDeletedAction;
    public int b;
    public ajut c;
    public ajut d;
    public ajut e;
    public String f;
    private byte h;
    
    static {
        final LiveChatAction$MarkChatItemAsDeletedAction a2 = new LiveChatAction$MarkChatItemAsDeletedAction();
        ahbh.registerDefaultInstance((Class)LiveChatAction$MarkChatItemAsDeletedAction.class, (ahbh)(a = a2));
        markChatItemAsDeletedAction = ahbh.newSingularGeneratedExtension((MessageLite)aiqj.a, (Object)a2, (MessageLite)a2, (ahbm)null, 135377179, ahek.k, (Class)LiveChatAction$MarkChatItemAsDeletedAction.class);
    }
    
    private LiveChatAction$MarkChatItemAsDeletedAction() {
        this.h = 2;
        this.f = "";
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte h = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd g;
                if ((g = LiveChatAction$MarkChatItemAsDeletedAction.g) == null) {
                    synchronized (LiveChatAction$MarkChatItemAsDeletedAction.class) {
                        if (LiveChatAction$MarkChatItemAsDeletedAction.g == null) {
                            LiveChatAction$MarkChatItemAsDeletedAction.g = (ahdd)new ahba((ahbh)LiveChatAction$MarkChatItemAsDeletedAction.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return LiveChatAction$MarkChatItemAsDeletedAction.a;
            }
            case 4: {
                return new ahaz((ahbh)LiveChatAction$MarkChatItemAsDeletedAction.a);
            }
            case 3: {
                return new LiveChatAction$MarkChatItemAsDeletedAction();
            }
            case 2: {
                return newMessageInfo((MessageLite)LiveChatAction$MarkChatItemAsDeletedAction.a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0003\u0001\u1409\u0000\u0002\u1008\u0003\u0003\u1409\u0001\u0004\u1409\u0002", new Object[] { "b", "c", "f", "d", "e" });
            }
            case 1: {
                if (o == null) {
                    h = 0;
                }
                this.h = h;
                return null;
            }
            case 0: {
                return this.h;
            }
        }
    }
}
