// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class RemoveUnblockedContactActionOuterClass$RemoveUnblockedContactAction extends agzi implements ahax
{
    public static final RemoveUnblockedContactActionOuterClass$RemoveUnblockedContactAction a;
    private static volatile ahbe b;
    public static final agzg removeUnblockedContactAction;
    
    static {
        final RemoveUnblockedContactActionOuterClass$RemoveUnblockedContactAction a2 = new RemoveUnblockedContactActionOuterClass$RemoveUnblockedContactAction();
        agzi.registerDefaultInstance((Class)RemoveUnblockedContactActionOuterClass$RemoveUnblockedContactAction.class, (agzi)(a = a2));
        removeUnblockedContactAction = agzi.newSingularGeneratedExtension((MessageLite)aioe.a, (Object)a2, (MessageLite)a2, (agzn)null, 125707981, ahcm.k, (Class)RemoveUnblockedContactActionOuterClass$RemoveUnblockedContactAction.class);
    }
    
    private RemoveUnblockedContactActionOuterClass$RemoveUnblockedContactAction() {
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe b;
                if ((b = RemoveUnblockedContactActionOuterClass$RemoveUnblockedContactAction.b) == null) {
                    synchronized (RemoveUnblockedContactActionOuterClass$RemoveUnblockedContactAction.class) {
                        if (RemoveUnblockedContactActionOuterClass$RemoveUnblockedContactAction.b == null) {
                            RemoveUnblockedContactActionOuterClass$RemoveUnblockedContactAction.b = (ahbe)new agzb((agzi)RemoveUnblockedContactActionOuterClass$RemoveUnblockedContactAction.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return RemoveUnblockedContactActionOuterClass$RemoveUnblockedContactAction.a;
            }
            case 4: {
                return new agza((agzi)RemoveUnblockedContactActionOuterClass$RemoveUnblockedContactAction.a);
            }
            case 3: {
                return new RemoveUnblockedContactActionOuterClass$RemoveUnblockedContactAction();
            }
            case 2: {
                return newMessageInfo((MessageLite)RemoveUnblockedContactActionOuterClass$RemoveUnblockedContactAction.a, "\u0001\u0000", (Object[])null);
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
