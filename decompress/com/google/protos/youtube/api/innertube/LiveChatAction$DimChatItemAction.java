// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class LiveChatAction$DimChatItemAction extends ahbh implements ahcw
{
    public static final LiveChatAction$DimChatItemAction a;
    private static volatile ahdd c;
    public static final ahbf dimChatItemAction;
    public String b;
    private int d;
    
    static {
        final LiveChatAction$DimChatItemAction a2 = new LiveChatAction$DimChatItemAction();
        ahbh.registerDefaultInstance((Class)LiveChatAction$DimChatItemAction.class, (ahbh)(a = a2));
        dimChatItemAction = ahbh.newSingularGeneratedExtension((MessageLite)aiqj.a, (Object)a2, (MessageLite)a2, (ahbm)null, 136048375, ahek.k, (Class)LiveChatAction$DimChatItemAction.class);
    }
    
    private LiveChatAction$DimChatItemAction() {
        this.b = "";
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd c;
                if ((c = LiveChatAction$DimChatItemAction.c) == null) {
                    synchronized (LiveChatAction$DimChatItemAction.class) {
                        if (LiveChatAction$DimChatItemAction.c == null) {
                            LiveChatAction$DimChatItemAction.c = (ahdd)new ahba((ahbh)LiveChatAction$DimChatItemAction.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return LiveChatAction$DimChatItemAction.a;
            }
            case 4: {
                return new ahaz((ahbh)LiveChatAction$DimChatItemAction.a);
            }
            case 3: {
                return new LiveChatAction$DimChatItemAction();
            }
            case 2: {
                return newMessageInfo((MessageLite)LiveChatAction$DimChatItemAction.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1008\u0000", new Object[] { "d", "b" });
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
