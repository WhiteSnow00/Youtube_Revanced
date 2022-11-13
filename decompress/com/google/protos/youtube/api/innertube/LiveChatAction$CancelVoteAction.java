// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class LiveChatAction$CancelVoteAction extends ahbh implements ahcw
{
    public static final LiveChatAction$CancelVoteAction a;
    private static volatile ahdd b;
    public static final ahbf cancelVoteAction;
    
    static {
        final LiveChatAction$CancelVoteAction a2 = new LiveChatAction$CancelVoteAction();
        ahbh.registerDefaultInstance((Class)LiveChatAction$CancelVoteAction.class, (ahbh)(a = a2));
        cancelVoteAction = ahbh.newSingularGeneratedExtension((MessageLite)aiqj.a, (Object)a2, (MessageLite)a2, (ahbm)null, 238715030, ahek.k, (Class)LiveChatAction$CancelVoteAction.class);
    }
    
    private LiveChatAction$CancelVoteAction() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd b;
                if ((b = LiveChatAction$CancelVoteAction.b) == null) {
                    synchronized (LiveChatAction$CancelVoteAction.class) {
                        if (LiveChatAction$CancelVoteAction.b == null) {
                            LiveChatAction$CancelVoteAction.b = (ahdd)new ahba((ahbh)LiveChatAction$CancelVoteAction.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return LiveChatAction$CancelVoteAction.a;
            }
            case 4: {
                return new ahaz((ahbh)LiveChatAction$CancelVoteAction.a);
            }
            case 3: {
                return new LiveChatAction$CancelVoteAction();
            }
            case 2: {
                return newMessageInfo((MessageLite)LiveChatAction$CancelVoteAction.a, "\u0001\u0000", (Object[])null);
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
