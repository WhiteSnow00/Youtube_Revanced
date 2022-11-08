// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class OpenCreateReplyDialogActionOuterClass$OpenCreateReplyDialogAction extends agzi implements ahax
{
    public static final OpenCreateReplyDialogActionOuterClass$OpenCreateReplyDialogAction a;
    private static volatile ahbe e;
    public static final agzg openCreateReplyDialogAction;
    public aiye b;
    public aiok c;
    public aiok d;
    private int f;
    private byte g;
    
    static {
        final OpenCreateReplyDialogActionOuterClass$OpenCreateReplyDialogAction a2 = new OpenCreateReplyDialogActionOuterClass$OpenCreateReplyDialogAction();
        agzi.registerDefaultInstance((Class)OpenCreateReplyDialogActionOuterClass$OpenCreateReplyDialogAction.class, (agzi)(a = a2));
        openCreateReplyDialogAction = agzi.newSingularGeneratedExtension((MessageLite)aioe.a, (Object)a2, (MessageLite)a2, (agzn)null, 145308295, ahcm.k, (Class)OpenCreateReplyDialogActionOuterClass$OpenCreateReplyDialogAction.class);
    }
    
    private OpenCreateReplyDialogActionOuterClass$OpenCreateReplyDialogAction() {
        this.g = 2;
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
                final ahbe e;
                if ((e = OpenCreateReplyDialogActionOuterClass$OpenCreateReplyDialogAction.e) == null) {
                    synchronized (OpenCreateReplyDialogActionOuterClass$OpenCreateReplyDialogAction.class) {
                        if (OpenCreateReplyDialogActionOuterClass$OpenCreateReplyDialogAction.e == null) {
                            OpenCreateReplyDialogActionOuterClass$OpenCreateReplyDialogAction.e = (ahbe)new agzb((agzi)OpenCreateReplyDialogActionOuterClass$OpenCreateReplyDialogAction.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return OpenCreateReplyDialogActionOuterClass$OpenCreateReplyDialogAction.a;
            }
            case 4: {
                return new agza((agzi)OpenCreateReplyDialogActionOuterClass$OpenCreateReplyDialogAction.a);
            }
            case 3: {
                return new OpenCreateReplyDialogActionOuterClass$OpenCreateReplyDialogAction();
            }
            case 2: {
                return newMessageInfo((MessageLite)OpenCreateReplyDialogActionOuterClass$OpenCreateReplyDialogAction.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0003\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0002", new Object[] { "f", "b", "c", "d" });
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
