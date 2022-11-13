// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class LiveChatAction$ForceLiveChatContinuationCommand extends ahbh implements ahcw
{
    public static final LiveChatAction$ForceLiveChatContinuationCommand a;
    private static volatile ahdd d;
    public static final ahbf forceLiveChatContinuationCommand;
    public boolean b;
    public boolean c;
    private int e;
    private alpg f;
    private byte g;
    
    static {
        final LiveChatAction$ForceLiveChatContinuationCommand a2 = new LiveChatAction$ForceLiveChatContinuationCommand();
        ahbh.registerDefaultInstance((Class)LiveChatAction$ForceLiveChatContinuationCommand.class, (ahbh)(a = a2));
        forceLiveChatContinuationCommand = ahbh.newSingularGeneratedExtension((MessageLite)aiqj.a, (Object)a2, (MessageLite)a2, (ahbm)null, 220358198, ahek.k, (Class)LiveChatAction$ForceLiveChatContinuationCommand.class);
    }
    
    private LiveChatAction$ForceLiveChatContinuationCommand() {
        this.g = 2;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte g = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd d;
                if ((d = LiveChatAction$ForceLiveChatContinuationCommand.d) == null) {
                    synchronized (LiveChatAction$ForceLiveChatContinuationCommand.class) {
                        if (LiveChatAction$ForceLiveChatContinuationCommand.d == null) {
                            LiveChatAction$ForceLiveChatContinuationCommand.d = (ahdd)new ahba((ahbh)LiveChatAction$ForceLiveChatContinuationCommand.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return LiveChatAction$ForceLiveChatContinuationCommand.a;
            }
            case 4: {
                return new ahaz((ahbh)LiveChatAction$ForceLiveChatContinuationCommand.a);
            }
            case 3: {
                return new LiveChatAction$ForceLiveChatContinuationCommand();
            }
            case 2: {
                return newMessageInfo((MessageLite)LiveChatAction$ForceLiveChatContinuationCommand.a, "\u0001\u0003\u0000\u0001\u0002\u0004\u0003\u0000\u0000\u0001\u0002\u1007\u0000\u0003\u1007\u0001\u0004\u1409\u0002", new Object[] { "e", "b", "c", "f" });
            }
            case 1: {
                if (o == null) {
                    g = 0;
                }
                this.g = g;
                return null;
            }
            case 0: {
                return this.g;
            }
        }
    }
}
