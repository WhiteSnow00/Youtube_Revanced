// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class HideEnclosingActionOuterClass$HideEnclosingAction extends agzi implements ahax
{
    public static final HideEnclosingActionOuterClass$HideEnclosingAction a;
    private static volatile ahbe b;
    public static final agzg hideEnclosingAction;
    
    static {
        final HideEnclosingActionOuterClass$HideEnclosingAction a2 = new HideEnclosingActionOuterClass$HideEnclosingAction();
        agzi.registerDefaultInstance((Class)HideEnclosingActionOuterClass$HideEnclosingAction.class, (agzi)(a = a2));
        hideEnclosingAction = agzi.newSingularGeneratedExtension((MessageLite)aioe.a, (Object)a2, (MessageLite)a2, (agzn)null, 77297742, ahcm.k, (Class)HideEnclosingActionOuterClass$HideEnclosingAction.class);
    }
    
    private HideEnclosingActionOuterClass$HideEnclosingAction() {
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe b;
                if ((b = HideEnclosingActionOuterClass$HideEnclosingAction.b) == null) {
                    synchronized (HideEnclosingActionOuterClass$HideEnclosingAction.class) {
                        if (HideEnclosingActionOuterClass$HideEnclosingAction.b == null) {
                            HideEnclosingActionOuterClass$HideEnclosingAction.b = (ahbe)new agzb((agzi)HideEnclosingActionOuterClass$HideEnclosingAction.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return HideEnclosingActionOuterClass$HideEnclosingAction.a;
            }
            case 4: {
                return new agza((agzi)HideEnclosingActionOuterClass$HideEnclosingAction.a);
            }
            case 3: {
                return new HideEnclosingActionOuterClass$HideEnclosingAction();
            }
            case 2: {
                return newMessageInfo((MessageLite)HideEnclosingActionOuterClass$HideEnclosingAction.a, "\u0001\u0000", (Object[])null);
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
