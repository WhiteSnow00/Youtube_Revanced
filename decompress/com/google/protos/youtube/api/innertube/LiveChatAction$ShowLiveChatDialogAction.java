// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class LiveChatAction$ShowLiveChatDialogAction extends agzi implements ahax
{
    public static final LiveChatAction$ShowLiveChatDialogAction a;
    private static volatile ahbe d;
    public static final agzg showLiveChatDialogAction;
    public int b;
    public anss c;
    private byte e;
    
    static {
        final LiveChatAction$ShowLiveChatDialogAction a2 = new LiveChatAction$ShowLiveChatDialogAction();
        agzi.registerDefaultInstance((Class)LiveChatAction$ShowLiveChatDialogAction.class, (agzi)(a = a2));
        showLiveChatDialogAction = agzi.newSingularGeneratedExtension((MessageLite)aioe.a, (Object)a2, (MessageLite)a2, (agzn)null, 171299322, ahcm.k, (Class)LiveChatAction$ShowLiveChatDialogAction.class);
    }
    
    private LiveChatAction$ShowLiveChatDialogAction() {
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
                if ((d = LiveChatAction$ShowLiveChatDialogAction.d) == null) {
                    synchronized (LiveChatAction$ShowLiveChatDialogAction.class) {
                        if (LiveChatAction$ShowLiveChatDialogAction.d == null) {
                            LiveChatAction$ShowLiveChatDialogAction.d = (ahbe)new agzb((agzi)LiveChatAction$ShowLiveChatDialogAction.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return LiveChatAction$ShowLiveChatDialogAction.a;
            }
            case 4: {
                return new agza((agzi)LiveChatAction$ShowLiveChatDialogAction.a);
            }
            case 3: {
                return new LiveChatAction$ShowLiveChatDialogAction();
            }
            case 2: {
                return newMessageInfo((MessageLite)LiveChatAction$ShowLiveChatDialogAction.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u1409\u0000", new Object[] { "b", "c" });
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
