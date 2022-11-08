// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class LiveChatAction$MarkChatItemAsDeletedAction extends agzi implements ahax
{
    public static final LiveChatAction$MarkChatItemAsDeletedAction a;
    private static volatile ahbe g;
    public static final agzg markChatItemAsDeletedAction;
    public int b;
    public ajsq c;
    public ajsq d;
    public ajsq e;
    public String f;
    private byte h;
    
    static {
        final LiveChatAction$MarkChatItemAsDeletedAction a2 = new LiveChatAction$MarkChatItemAsDeletedAction();
        agzi.registerDefaultInstance((Class)LiveChatAction$MarkChatItemAsDeletedAction.class, (agzi)(a = a2));
        markChatItemAsDeletedAction = agzi.newSingularGeneratedExtension((MessageLite)aioe.a, (Object)a2, (MessageLite)a2, (agzn)null, 135377179, ahcm.k, (Class)LiveChatAction$MarkChatItemAsDeletedAction.class);
    }
    
    private LiveChatAction$MarkChatItemAsDeletedAction() {
        this.h = 2;
        this.f = "";
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
                final ahbe g;
                if ((g = LiveChatAction$MarkChatItemAsDeletedAction.g) == null) {
                    synchronized (LiveChatAction$MarkChatItemAsDeletedAction.class) {
                        if (LiveChatAction$MarkChatItemAsDeletedAction.g == null) {
                            LiveChatAction$MarkChatItemAsDeletedAction.g = (ahbe)new agzb((agzi)LiveChatAction$MarkChatItemAsDeletedAction.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return LiveChatAction$MarkChatItemAsDeletedAction.a;
            }
            case 4: {
                return new agza((agzi)LiveChatAction$MarkChatItemAsDeletedAction.a);
            }
            case 3: {
                return new LiveChatAction$MarkChatItemAsDeletedAction();
            }
            case 2: {
                return newMessageInfo((MessageLite)LiveChatAction$MarkChatItemAsDeletedAction.a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0003\u0001\u1409\u0000\u0002\u1008\u0003\u0003\u1409\u0001\u0004\u1409\u0002", new Object[] { "b", "c", "f", "d", "e" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.h = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.h;
            }
        }
    }
}
