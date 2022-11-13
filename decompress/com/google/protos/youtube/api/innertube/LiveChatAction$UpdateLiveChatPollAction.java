// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class LiveChatAction$UpdateLiveChatPollAction extends ahbh implements ahcw
{
    public static final LiveChatAction$UpdateLiveChatPollAction a;
    private static volatile ahdd d;
    public static final ahbf updateLiveChatPollAction;
    public int b;
    public anuv c;
    private byte e;
    
    static {
        final LiveChatAction$UpdateLiveChatPollAction a2 = new LiveChatAction$UpdateLiveChatPollAction();
        ahbh.registerDefaultInstance((Class)LiveChatAction$UpdateLiveChatPollAction.class, (ahbh)(a = a2));
        updateLiveChatPollAction = ahbh.newSingularGeneratedExtension((MessageLite)aiqj.a, (Object)a2, (MessageLite)a2, (ahbm)null, 239281785, ahek.k, (Class)LiveChatAction$UpdateLiveChatPollAction.class);
    }
    
    private LiveChatAction$UpdateLiveChatPollAction() {
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
                if ((d = LiveChatAction$UpdateLiveChatPollAction.d) == null) {
                    synchronized (LiveChatAction$UpdateLiveChatPollAction.class) {
                        if (LiveChatAction$UpdateLiveChatPollAction.d == null) {
                            LiveChatAction$UpdateLiveChatPollAction.d = (ahdd)new ahba((ahbh)LiveChatAction$UpdateLiveChatPollAction.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return LiveChatAction$UpdateLiveChatPollAction.a;
            }
            case 4: {
                return new ahaz((ahbh)LiveChatAction$UpdateLiveChatPollAction.a);
            }
            case 3: {
                return new LiveChatAction$UpdateLiveChatPollAction();
            }
            case 2: {
                return newMessageInfo((MessageLite)LiveChatAction$UpdateLiveChatPollAction.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u1409\u0000", new Object[] { "b", "c" });
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
