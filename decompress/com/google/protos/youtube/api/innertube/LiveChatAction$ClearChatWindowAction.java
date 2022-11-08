// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class LiveChatAction$ClearChatWindowAction extends agzi implements ahax
{
    public static final LiveChatAction$ClearChatWindowAction a;
    private static volatile ahbe b;
    public static final agzg clearChatWindowAction;
    
    static {
        final LiveChatAction$ClearChatWindowAction a2 = new LiveChatAction$ClearChatWindowAction();
        agzi.registerDefaultInstance((Class)LiveChatAction$ClearChatWindowAction.class, (agzi)(a = a2));
        clearChatWindowAction = agzi.newSingularGeneratedExtension((MessageLite)aioe.a, (Object)a2, (MessageLite)a2, (agzn)null, 430167970, ahcm.k, (Class)LiveChatAction$ClearChatWindowAction.class);
    }
    
    private LiveChatAction$ClearChatWindowAction() {
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe b;
                if ((b = LiveChatAction$ClearChatWindowAction.b) == null) {
                    synchronized (LiveChatAction$ClearChatWindowAction.class) {
                        if (LiveChatAction$ClearChatWindowAction.b == null) {
                            LiveChatAction$ClearChatWindowAction.b = (ahbe)new agzb((agzi)LiveChatAction$ClearChatWindowAction.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return LiveChatAction$ClearChatWindowAction.a;
            }
            case 4: {
                return new agza((agzi)LiveChatAction$ClearChatWindowAction.a);
            }
            case 3: {
                return new LiveChatAction$ClearChatWindowAction();
            }
            case 2: {
                return newMessageInfo((MessageLite)LiveChatAction$ClearChatWindowAction.a, "\u0001\u0000", (Object[])null);
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
