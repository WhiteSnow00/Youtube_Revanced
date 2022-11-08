// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class ModifyActivityCountActionOuterClass$ModifyActivityCountAction extends agzi implements ahax
{
    public static final ModifyActivityCountActionOuterClass$ModifyActivityCountAction a;
    private static volatile ahbe d;
    public static final agzg modifyActivityCountAction;
    public agzy b;
    public long c;
    private int e;
    
    static {
        final ModifyActivityCountActionOuterClass$ModifyActivityCountAction a2 = new ModifyActivityCountActionOuterClass$ModifyActivityCountAction();
        agzi.registerDefaultInstance((Class)ModifyActivityCountActionOuterClass$ModifyActivityCountAction.class, (agzi)(a = a2));
        modifyActivityCountAction = agzi.newSingularGeneratedExtension((MessageLite)aioe.a, (Object)a2, (MessageLite)a2, (agzn)null, 143505435, ahcm.k, (Class)ModifyActivityCountActionOuterClass$ModifyActivityCountAction.class);
    }
    
    private ModifyActivityCountActionOuterClass$ModifyActivityCountAction() {
        this.b = emptyProtobufList();
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe d;
                if ((d = ModifyActivityCountActionOuterClass$ModifyActivityCountAction.d) == null) {
                    synchronized (ModifyActivityCountActionOuterClass$ModifyActivityCountAction.class) {
                        if (ModifyActivityCountActionOuterClass$ModifyActivityCountAction.d == null) {
                            ModifyActivityCountActionOuterClass$ModifyActivityCountAction.d = (ahbe)new agzb((agzi)ModifyActivityCountActionOuterClass$ModifyActivityCountAction.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return ModifyActivityCountActionOuterClass$ModifyActivityCountAction.a;
            }
            case 4: {
                return new agza((agzi)ModifyActivityCountActionOuterClass$ModifyActivityCountAction.a);
            }
            case 3: {
                return new ModifyActivityCountActionOuterClass$ModifyActivityCountAction();
            }
            case 2: {
                return newMessageInfo((MessageLite)ModifyActivityCountActionOuterClass$ModifyActivityCountAction.a, "\u0001\u0002\u0000\u0001\u0001\u0004\u0002\u0000\u0001\u0000\u0001\u001b\u0004\u1002\u0000", new Object[] { "e", "b", amip.class, "c" });
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
