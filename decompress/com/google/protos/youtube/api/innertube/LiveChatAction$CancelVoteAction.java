// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class LiveChatAction$CancelVoteAction extends agzi implements ahax
{
    public static final LiveChatAction$CancelVoteAction a;
    private static volatile ahbe b;
    public static final agzg cancelVoteAction;
    
    static {
        final LiveChatAction$CancelVoteAction a2 = new LiveChatAction$CancelVoteAction();
        agzi.registerDefaultInstance((Class)LiveChatAction$CancelVoteAction.class, (agzi)(a = a2));
        cancelVoteAction = agzi.newSingularGeneratedExtension((MessageLite)aioe.a, (Object)a2, (MessageLite)a2, (agzn)null, 238715030, ahcm.k, (Class)LiveChatAction$CancelVoteAction.class);
    }
    
    private LiveChatAction$CancelVoteAction() {
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe b;
                if ((b = LiveChatAction$CancelVoteAction.b) == null) {
                    synchronized (LiveChatAction$CancelVoteAction.class) {
                        if (LiveChatAction$CancelVoteAction.b == null) {
                            LiveChatAction$CancelVoteAction.b = (ahbe)new agzb((agzi)LiveChatAction$CancelVoteAction.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return LiveChatAction$CancelVoteAction.a;
            }
            case 4: {
                return new agza((agzi)LiveChatAction$CancelVoteAction.a);
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
