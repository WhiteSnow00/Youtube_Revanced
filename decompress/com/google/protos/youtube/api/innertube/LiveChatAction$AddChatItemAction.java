// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class LiveChatAction$AddChatItemAction extends agzi implements ahax
{
    public static final LiveChatAction$AddChatItemAction a;
    public static final agzg addChatItemAction;
    private static volatile ahbe f;
    public int b;
    public aloe c;
    public String d;
    public alnc e;
    private byte g;
    
    static {
        final LiveChatAction$AddChatItemAction a2 = new LiveChatAction$AddChatItemAction();
        agzi.registerDefaultInstance((Class)LiveChatAction$AddChatItemAction.class, (agzi)(a = a2));
        addChatItemAction = agzi.newSingularGeneratedExtension((MessageLite)aioe.a, (Object)a2, (MessageLite)a2, (agzn)null, 117298952, ahcm.k, (Class)LiveChatAction$AddChatItemAction.class);
    }
    
    private LiveChatAction$AddChatItemAction() {
        this.g = 2;
        this.d = "";
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
                final ahbe f;
                if ((f = LiveChatAction$AddChatItemAction.f) == null) {
                    synchronized (LiveChatAction$AddChatItemAction.class) {
                        if (LiveChatAction$AddChatItemAction.f == null) {
                            LiveChatAction$AddChatItemAction.f = (ahbe)new agzb((agzi)LiveChatAction$AddChatItemAction.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return LiveChatAction$AddChatItemAction.a;
            }
            case 4: {
                return new agza((agzi)LiveChatAction$AddChatItemAction.a);
            }
            case 3: {
                return new LiveChatAction$AddChatItemAction();
            }
            case 2: {
                return newMessageInfo((MessageLite)LiveChatAction$AddChatItemAction.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001\u1409\u0000\u0002\u1008\u0001\u0003\u1009\u0002", new Object[] { "b", "c", "d", "e" });
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
