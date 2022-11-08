// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class RemoveContactActionOuterClass$RemoveContactAction extends agzi implements ahax
{
    public static final RemoveContactActionOuterClass$RemoveContactAction a;
    private static volatile ahbe b;
    public static final agzg removeContactAction;
    
    static {
        final RemoveContactActionOuterClass$RemoveContactAction a2 = new RemoveContactActionOuterClass$RemoveContactAction();
        agzi.registerDefaultInstance((Class)RemoveContactActionOuterClass$RemoveContactAction.class, (agzi)(a = a2));
        removeContactAction = agzi.newSingularGeneratedExtension((MessageLite)aioe.a, (Object)a2, (MessageLite)a2, (agzn)null, 102580987, ahcm.k, (Class)RemoveContactActionOuterClass$RemoveContactAction.class);
    }
    
    private RemoveContactActionOuterClass$RemoveContactAction() {
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe b;
                if ((b = RemoveContactActionOuterClass$RemoveContactAction.b) == null) {
                    synchronized (RemoveContactActionOuterClass$RemoveContactAction.class) {
                        if (RemoveContactActionOuterClass$RemoveContactAction.b == null) {
                            RemoveContactActionOuterClass$RemoveContactAction.b = (ahbe)new agzb((agzi)RemoveContactActionOuterClass$RemoveContactAction.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return RemoveContactActionOuterClass$RemoveContactAction.a;
            }
            case 4: {
                return new agza((agzi)RemoveContactActionOuterClass$RemoveContactAction.a);
            }
            case 3: {
                return new RemoveContactActionOuterClass$RemoveContactAction();
            }
            case 2: {
                return newMessageInfo((MessageLite)RemoveContactActionOuterClass$RemoveContactAction.a, "\u0001\u0000", (Object[])null);
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
