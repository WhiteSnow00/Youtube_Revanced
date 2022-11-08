// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class LiveChatAction$UpdateLiveChatPollAction extends agzi implements ahax
{
    public static final LiveChatAction$UpdateLiveChatPollAction a;
    private static volatile ahbe d;
    public static final agzg updateLiveChatPollAction;
    public int b;
    public anss c;
    private byte e;
    
    static {
        final LiveChatAction$UpdateLiveChatPollAction a2 = new LiveChatAction$UpdateLiveChatPollAction();
        agzi.registerDefaultInstance((Class)LiveChatAction$UpdateLiveChatPollAction.class, (agzi)(a = a2));
        updateLiveChatPollAction = agzi.newSingularGeneratedExtension((MessageLite)aioe.a, (Object)a2, (MessageLite)a2, (agzn)null, 239281785, ahcm.k, (Class)LiveChatAction$UpdateLiveChatPollAction.class);
    }
    
    private LiveChatAction$UpdateLiveChatPollAction() {
        this.e = 2;
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
                final ahbe d;
                if ((d = LiveChatAction$UpdateLiveChatPollAction.d) == null) {
                    synchronized (LiveChatAction$UpdateLiveChatPollAction.class) {
                        if (LiveChatAction$UpdateLiveChatPollAction.d == null) {
                            LiveChatAction$UpdateLiveChatPollAction.d = (ahbe)new agzb((agzi)LiveChatAction$UpdateLiveChatPollAction.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return LiveChatAction$UpdateLiveChatPollAction.a;
            }
            case 4: {
                return new agza((agzi)LiveChatAction$UpdateLiveChatPollAction.a);
            }
            case 3: {
                return new LiveChatAction$UpdateLiveChatPollAction();
            }
            case 2: {
                return newMessageInfo((MessageLite)LiveChatAction$UpdateLiveChatPollAction.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u1409\u0000", new Object[] { "b", "c" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.e = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.e;
            }
        }
    }
}
