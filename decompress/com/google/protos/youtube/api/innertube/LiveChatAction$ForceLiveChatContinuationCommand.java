// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class LiveChatAction$ForceLiveChatContinuationCommand extends agzi implements ahax
{
    public static final LiveChatAction$ForceLiveChatContinuationCommand a;
    private static volatile ahbe d;
    public static final agzg forceLiveChatContinuationCommand;
    public boolean b;
    public boolean c;
    private int e;
    private alnd f;
    private byte g;
    
    static {
        final LiveChatAction$ForceLiveChatContinuationCommand a2 = new LiveChatAction$ForceLiveChatContinuationCommand();
        agzi.registerDefaultInstance((Class)LiveChatAction$ForceLiveChatContinuationCommand.class, (agzi)(a = a2));
        forceLiveChatContinuationCommand = agzi.newSingularGeneratedExtension((MessageLite)aioe.a, (Object)a2, (MessageLite)a2, (agzn)null, 220358198, ahcm.k, (Class)LiveChatAction$ForceLiveChatContinuationCommand.class);
    }
    
    private LiveChatAction$ForceLiveChatContinuationCommand() {
        this.g = 2;
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
                if ((d = LiveChatAction$ForceLiveChatContinuationCommand.d) == null) {
                    synchronized (LiveChatAction$ForceLiveChatContinuationCommand.class) {
                        if (LiveChatAction$ForceLiveChatContinuationCommand.d == null) {
                            LiveChatAction$ForceLiveChatContinuationCommand.d = (ahbe)new agzb((agzi)LiveChatAction$ForceLiveChatContinuationCommand.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return LiveChatAction$ForceLiveChatContinuationCommand.a;
            }
            case 4: {
                return new agza((agzi)LiveChatAction$ForceLiveChatContinuationCommand.a);
            }
            case 3: {
                return new LiveChatAction$ForceLiveChatContinuationCommand();
            }
            case 2: {
                return newMessageInfo((MessageLite)LiveChatAction$ForceLiveChatContinuationCommand.a, "\u0001\u0003\u0000\u0001\u0002\u0004\u0003\u0000\u0000\u0001\u0002\u1007\u0000\u0003\u1007\u0001\u0004\u1409\u0002", new Object[] { "e", "b", "c", "f" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.g = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.g;
            }
        }
    }
}
