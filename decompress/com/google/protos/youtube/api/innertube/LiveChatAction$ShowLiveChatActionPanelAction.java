// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class LiveChatAction$ShowLiveChatActionPanelAction extends agzi implements ahax
{
    public static final LiveChatAction$ShowLiveChatActionPanelAction a;
    private static volatile ahbe d;
    public static final agzg showLiveChatActionPanelAction;
    public int b;
    public anss c;
    private byte e;
    
    static {
        final LiveChatAction$ShowLiveChatActionPanelAction a2 = new LiveChatAction$ShowLiveChatActionPanelAction();
        agzi.registerDefaultInstance((Class)LiveChatAction$ShowLiveChatActionPanelAction.class, (agzi)(a = a2));
        showLiveChatActionPanelAction = agzi.newSingularGeneratedExtension((MessageLite)aioe.a, (Object)a2, (MessageLite)a2, (agzn)null, 238110852, ahcm.k, (Class)LiveChatAction$ShowLiveChatActionPanelAction.class);
    }
    
    private LiveChatAction$ShowLiveChatActionPanelAction() {
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
                if ((d = LiveChatAction$ShowLiveChatActionPanelAction.d) == null) {
                    synchronized (LiveChatAction$ShowLiveChatActionPanelAction.class) {
                        if (LiveChatAction$ShowLiveChatActionPanelAction.d == null) {
                            LiveChatAction$ShowLiveChatActionPanelAction.d = (ahbe)new agzb((agzi)LiveChatAction$ShowLiveChatActionPanelAction.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return LiveChatAction$ShowLiveChatActionPanelAction.a;
            }
            case 4: {
                return new agza((agzi)LiveChatAction$ShowLiveChatActionPanelAction.a);
            }
            case 3: {
                return new LiveChatAction$ShowLiveChatActionPanelAction();
            }
            case 2: {
                return newMessageInfo((MessageLite)LiveChatAction$ShowLiveChatActionPanelAction.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u1409\u0000", new Object[] { "b", "c" });
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