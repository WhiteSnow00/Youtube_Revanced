// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class LiveChatAction$AddLiveChatTextMessageFromTemplateAction extends ahbh implements ahcw
{
    public static final LiveChatAction$AddLiveChatTextMessageFromTemplateAction a;
    public static final ahbf addLiveChatTextMessageFromTemplateAction;
    private static volatile ahdd e;
    public int b;
    public alpe c;
    public alpf d;
    private byte f;
    
    static {
        final LiveChatAction$AddLiveChatTextMessageFromTemplateAction a2 = new LiveChatAction$AddLiveChatTextMessageFromTemplateAction();
        ahbh.registerDefaultInstance((Class)LiveChatAction$AddLiveChatTextMessageFromTemplateAction.class, (ahbh)(a = a2));
        addLiveChatTextMessageFromTemplateAction = ahbh.newSingularGeneratedExtension((MessageLite)aiqj.a, (Object)a2, (MessageLite)a2, (ahbm)null, 126084307, ahek.k, (Class)LiveChatAction$AddLiveChatTextMessageFromTemplateAction.class);
    }
    
    private LiveChatAction$AddLiveChatTextMessageFromTemplateAction() {
        this.f = 2;
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
                final ahdd e;
                if ((e = LiveChatAction$AddLiveChatTextMessageFromTemplateAction.e) == null) {
                    synchronized (LiveChatAction$AddLiveChatTextMessageFromTemplateAction.class) {
                        if (LiveChatAction$AddLiveChatTextMessageFromTemplateAction.e == null) {
                            LiveChatAction$AddLiveChatTextMessageFromTemplateAction.e = (ahdd)new ahba((ahbh)LiveChatAction$AddLiveChatTextMessageFromTemplateAction.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return LiveChatAction$AddLiveChatTextMessageFromTemplateAction.a;
            }
            case 4: {
                return new ahaz((ahbh)LiveChatAction$AddLiveChatTextMessageFromTemplateAction.a);
            }
            case 3: {
                return new LiveChatAction$AddLiveChatTextMessageFromTemplateAction();
            }
            case 2: {
                return newMessageInfo((MessageLite)LiveChatAction$AddLiveChatTextMessageFromTemplateAction.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001\u1409\u0000\u0002\u1009\u0001", new Object[] { "b", "c", "d" });
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
