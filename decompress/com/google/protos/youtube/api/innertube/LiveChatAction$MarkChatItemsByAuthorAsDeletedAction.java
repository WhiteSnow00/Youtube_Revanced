// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class LiveChatAction$MarkChatItemsByAuthorAsDeletedAction extends ahbh implements ahcw
{
    public static final LiveChatAction$MarkChatItemsByAuthorAsDeletedAction a;
    private static volatile ahdd g;
    public static final ahbf markChatItemsByAuthorAsDeletedAction;
    public int b;
    public ajut c;
    public ajut d;
    public ajut e;
    public String f;
    private byte h;
    
    static {
        final LiveChatAction$MarkChatItemsByAuthorAsDeletedAction a2 = new LiveChatAction$MarkChatItemsByAuthorAsDeletedAction();
        ahbh.registerDefaultInstance((Class)LiveChatAction$MarkChatItemsByAuthorAsDeletedAction.class, (ahbh)(a = a2));
        markChatItemsByAuthorAsDeletedAction = ahbh.newSingularGeneratedExtension((MessageLite)aiqj.a, (Object)a2, (MessageLite)a2, (ahbm)null, 133968669, ahek.k, (Class)LiveChatAction$MarkChatItemsByAuthorAsDeletedAction.class);
    }
    
    private LiveChatAction$MarkChatItemsByAuthorAsDeletedAction() {
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
                if ((g = LiveChatAction$MarkChatItemsByAuthorAsDeletedAction.g) == null) {
                    synchronized (LiveChatAction$MarkChatItemsByAuthorAsDeletedAction.class) {
                        if (LiveChatAction$MarkChatItemsByAuthorAsDeletedAction.g == null) {
                            LiveChatAction$MarkChatItemsByAuthorAsDeletedAction.g = (ahdd)new ahba((ahbh)LiveChatAction$MarkChatItemsByAuthorAsDeletedAction.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return LiveChatAction$MarkChatItemsByAuthorAsDeletedAction.a;
            }
            case 4: {
                return new ahaz((ahbh)LiveChatAction$MarkChatItemsByAuthorAsDeletedAction.a);
            }
            case 3: {
                return new LiveChatAction$MarkChatItemsByAuthorAsDeletedAction();
            }
            case 2: {
                return newMessageInfo((MessageLite)LiveChatAction$MarkChatItemsByAuthorAsDeletedAction.a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0003\u0001\u1409\u0000\u0002\u1008\u0003\u0003\u1409\u0001\u0004\u1409\u0002", new Object[] { "b", "c", "f", "d", "e" });
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
