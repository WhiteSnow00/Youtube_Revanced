// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class ModifyActivityCountActionOuterClass$ModifyActivityCountAction extends ahbh implements ahcw
{
    public static final ModifyActivityCountActionOuterClass$ModifyActivityCountAction a;
    private static volatile ahdd d;
    public static final ahbf modifyActivityCountAction;
    public ahbx b;
    public long c;
    private int e;
    
    static {
        final ModifyActivityCountActionOuterClass$ModifyActivityCountAction a2 = new ModifyActivityCountActionOuterClass$ModifyActivityCountAction();
        ahbh.registerDefaultInstance((Class)ModifyActivityCountActionOuterClass$ModifyActivityCountAction.class, (ahbh)(a = a2));
        modifyActivityCountAction = ahbh.newSingularGeneratedExtension((MessageLite)aiqj.a, (Object)a2, (MessageLite)a2, (ahbm)null, 143505435, ahek.k, (Class)ModifyActivityCountActionOuterClass$ModifyActivityCountAction.class);
    }
    
    private ModifyActivityCountActionOuterClass$ModifyActivityCountAction() {
        this.b = emptyProtobufList();
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd d;
                if ((d = ModifyActivityCountActionOuterClass$ModifyActivityCountAction.d) == null) {
                    synchronized (ModifyActivityCountActionOuterClass$ModifyActivityCountAction.class) {
                        if (ModifyActivityCountActionOuterClass$ModifyActivityCountAction.d == null) {
                            ModifyActivityCountActionOuterClass$ModifyActivityCountAction.d = (ahdd)new ahba((ahbh)ModifyActivityCountActionOuterClass$ModifyActivityCountAction.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return ModifyActivityCountActionOuterClass$ModifyActivityCountAction.a;
            }
            case 4: {
                return new ahaz((ahbh)ModifyActivityCountActionOuterClass$ModifyActivityCountAction.a);
            }
            case 3: {
                return new ModifyActivityCountActionOuterClass$ModifyActivityCountAction();
            }
            case 2: {
                return newMessageInfo((MessageLite)ModifyActivityCountActionOuterClass$ModifyActivityCountAction.a, "\u0001\u0002\u0000\u0001\u0001\u0004\u0002\u0000\u0001\u0000\u0001\u001b\u0004\u1002\u0000", new Object[] { "e", "b", amkt.class, "c" });
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
