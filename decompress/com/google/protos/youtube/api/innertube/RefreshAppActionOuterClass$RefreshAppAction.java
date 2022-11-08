// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class RefreshAppActionOuterClass$RefreshAppAction extends agzi implements ahax
{
    public static final RefreshAppActionOuterClass$RefreshAppAction a;
    private static volatile ahbe b;
    public static final agzg refreshAppAction;
    
    static {
        final RefreshAppActionOuterClass$RefreshAppAction a2 = new RefreshAppActionOuterClass$RefreshAppAction();
        agzi.registerDefaultInstance((Class)RefreshAppActionOuterClass$RefreshAppAction.class, (agzi)(a = a2));
        refreshAppAction = agzi.newSingularGeneratedExtension((MessageLite)aioe.a, (Object)a2, (MessageLite)a2, (agzn)null, 131467272, ahcm.k, (Class)RefreshAppActionOuterClass$RefreshAppAction.class);
    }
    
    private RefreshAppActionOuterClass$RefreshAppAction() {
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe b;
                if ((b = RefreshAppActionOuterClass$RefreshAppAction.b) == null) {
                    synchronized (RefreshAppActionOuterClass$RefreshAppAction.class) {
                        if (RefreshAppActionOuterClass$RefreshAppAction.b == null) {
                            RefreshAppActionOuterClass$RefreshAppAction.b = (ahbe)new agzb((agzi)RefreshAppActionOuterClass$RefreshAppAction.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return RefreshAppActionOuterClass$RefreshAppAction.a;
            }
            case 4: {
                return new agza((agzi)RefreshAppActionOuterClass$RefreshAppAction.a);
            }
            case 3: {
                return new RefreshAppActionOuterClass$RefreshAppAction();
            }
            case 2: {
                return newMessageInfo((MessageLite)RefreshAppActionOuterClass$RefreshAppAction.a, "\u0001\u0000", (Object[])null);
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
