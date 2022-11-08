// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class LiveChatAction$AddLiveChatTextMessageFromTemplateAction extends agzi implements ahax
{
    public static final LiveChatAction$AddLiveChatTextMessageFromTemplateAction a;
    public static final agzg addLiveChatTextMessageFromTemplateAction;
    private static volatile ahbe e;
    public int b;
    public alnb c;
    public alnc d;
    private byte f;
    
    static {
        final LiveChatAction$AddLiveChatTextMessageFromTemplateAction a2 = new LiveChatAction$AddLiveChatTextMessageFromTemplateAction();
        agzi.registerDefaultInstance((Class)LiveChatAction$AddLiveChatTextMessageFromTemplateAction.class, (agzi)(a = a2));
        addLiveChatTextMessageFromTemplateAction = agzi.newSingularGeneratedExtension((MessageLite)aioe.a, (Object)a2, (MessageLite)a2, (agzn)null, 126084307, ahcm.k, (Class)LiveChatAction$AddLiveChatTextMessageFromTemplateAction.class);
    }
    
    private LiveChatAction$AddLiveChatTextMessageFromTemplateAction() {
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
                if ((e = LiveChatAction$AddLiveChatTextMessageFromTemplateAction.e) == null) {
                    synchronized (LiveChatAction$AddLiveChatTextMessageFromTemplateAction.class) {
                        if (LiveChatAction$AddLiveChatTextMessageFromTemplateAction.e == null) {
                            LiveChatAction$AddLiveChatTextMessageFromTemplateAction.e = (ahbe)new agzb((agzi)LiveChatAction$AddLiveChatTextMessageFromTemplateAction.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return LiveChatAction$AddLiveChatTextMessageFromTemplateAction.a;
            }
            case 4: {
                return new agza((agzi)LiveChatAction$AddLiveChatTextMessageFromTemplateAction.a);
            }
            case 3: {
                return new LiveChatAction$AddLiveChatTextMessageFromTemplateAction();
            }
            case 2: {
                return newMessageInfo((MessageLite)LiveChatAction$AddLiveChatTextMessageFromTemplateAction.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001\u1409\u0000\u0002\u1009\u0001", new Object[] { "b", "c", "d" });
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
