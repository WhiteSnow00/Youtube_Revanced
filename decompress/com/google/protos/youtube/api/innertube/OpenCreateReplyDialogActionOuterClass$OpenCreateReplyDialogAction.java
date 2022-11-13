// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class OpenCreateReplyDialogActionOuterClass$OpenCreateReplyDialogAction extends ahbh implements ahcw
{
    public static final OpenCreateReplyDialogActionOuterClass$OpenCreateReplyDialogAction a;
    private static volatile ahdd e;
    public static final ahbf openCreateReplyDialogAction;
    public ajaj b;
    public aiqp c;
    public aiqp d;
    private int f;
    private byte g;
    
    static {
        final OpenCreateReplyDialogActionOuterClass$OpenCreateReplyDialogAction a2 = new OpenCreateReplyDialogActionOuterClass$OpenCreateReplyDialogAction();
        ahbh.registerDefaultInstance((Class)OpenCreateReplyDialogActionOuterClass$OpenCreateReplyDialogAction.class, (ahbh)(a = a2));
        openCreateReplyDialogAction = ahbh.newSingularGeneratedExtension((MessageLite)aiqj.a, (Object)a2, (MessageLite)a2, (ahbm)null, 145308295, ahek.k, (Class)OpenCreateReplyDialogActionOuterClass$OpenCreateReplyDialogAction.class);
    }
    
    private OpenCreateReplyDialogActionOuterClass$OpenCreateReplyDialogAction() {
        this.g = 2;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte g = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd e;
                if ((e = OpenCreateReplyDialogActionOuterClass$OpenCreateReplyDialogAction.e) == null) {
                    synchronized (OpenCreateReplyDialogActionOuterClass$OpenCreateReplyDialogAction.class) {
                        if (OpenCreateReplyDialogActionOuterClass$OpenCreateReplyDialogAction.e == null) {
                            OpenCreateReplyDialogActionOuterClass$OpenCreateReplyDialogAction.e = (ahdd)new ahba((ahbh)OpenCreateReplyDialogActionOuterClass$OpenCreateReplyDialogAction.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return OpenCreateReplyDialogActionOuterClass$OpenCreateReplyDialogAction.a;
            }
            case 4: {
                return new ahaz((ahbh)OpenCreateReplyDialogActionOuterClass$OpenCreateReplyDialogAction.a);
            }
            case 3: {
                return new OpenCreateReplyDialogActionOuterClass$OpenCreateReplyDialogAction();
            }
            case 2: {
                return newMessageInfo((MessageLite)OpenCreateReplyDialogActionOuterClass$OpenCreateReplyDialogAction.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0003\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0002", new Object[] { "f", "b", "c", "d" });
            }
            case 1: {
                if (o == null) {
                    g = 0;
                }
                this.g = g;
                return null;
            }
            case 0: {
                return this.g;
            }
        }
    }
}
