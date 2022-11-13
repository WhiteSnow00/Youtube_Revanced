// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class LiveChatAction$ShowLiveChatDialogAction extends ahbh implements ahcw
{
    public static final LiveChatAction$ShowLiveChatDialogAction a;
    private static volatile ahdd d;
    public static final ahbf showLiveChatDialogAction;
    public int b;
    public anuv c;
    private byte e;
    
    static {
        final LiveChatAction$ShowLiveChatDialogAction a2 = new LiveChatAction$ShowLiveChatDialogAction();
        ahbh.registerDefaultInstance((Class)LiveChatAction$ShowLiveChatDialogAction.class, (ahbh)(a = a2));
        showLiveChatDialogAction = ahbh.newSingularGeneratedExtension((MessageLite)aiqj.a, (Object)a2, (MessageLite)a2, (ahbm)null, 171299322, ahek.k, (Class)LiveChatAction$ShowLiveChatDialogAction.class);
    }
    
    private LiveChatAction$ShowLiveChatDialogAction() {
        this.e = 2;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte e = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd d;
                if ((d = LiveChatAction$ShowLiveChatDialogAction.d) == null) {
                    synchronized (LiveChatAction$ShowLiveChatDialogAction.class) {
                        if (LiveChatAction$ShowLiveChatDialogAction.d == null) {
                            LiveChatAction$ShowLiveChatDialogAction.d = (ahdd)new ahba((ahbh)LiveChatAction$ShowLiveChatDialogAction.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return LiveChatAction$ShowLiveChatDialogAction.a;
            }
            case 4: {
                return new ahaz((ahbh)LiveChatAction$ShowLiveChatDialogAction.a);
            }
            case 3: {
                return new LiveChatAction$ShowLiveChatDialogAction();
            }
            case 2: {
                return newMessageInfo((MessageLite)LiveChatAction$ShowLiveChatDialogAction.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u1409\u0000", new Object[] { "b", "c" });
            }
            case 1: {
                if (o == null) {
                    e = 0;
                }
                this.e = e;
                return null;
            }
            case 0: {
                return this.e;
            }
        }
    }
}
