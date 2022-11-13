// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class UpdateViewershipActionOuterClass$UpdateViewershipAction extends ahbh implements ahcw
{
    public static final UpdateViewershipActionOuterClass$UpdateViewershipAction a;
    private static volatile ahdd d;
    public static final ahbf updateViewershipAction;
    public apna b;
    public boolean c;
    private int e;
    private apnv f;
    private byte g;
    
    static {
        final UpdateViewershipActionOuterClass$UpdateViewershipAction a2 = new UpdateViewershipActionOuterClass$UpdateViewershipAction();
        ahbh.registerDefaultInstance((Class)UpdateViewershipActionOuterClass$UpdateViewershipAction.class, (ahbh)(a = a2));
        updateViewershipAction = ahbh.newSingularGeneratedExtension((MessageLite)aiqj.a, (Object)a2, (MessageLite)a2, (ahbm)null, 104886333, ahek.k, (Class)UpdateViewershipActionOuterClass$UpdateViewershipAction.class);
    }
    
    private UpdateViewershipActionOuterClass$UpdateViewershipAction() {
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
                final ahdd d;
                if ((d = UpdateViewershipActionOuterClass$UpdateViewershipAction.d) == null) {
                    synchronized (UpdateViewershipActionOuterClass$UpdateViewershipAction.class) {
                        if (UpdateViewershipActionOuterClass$UpdateViewershipAction.d == null) {
                            UpdateViewershipActionOuterClass$UpdateViewershipAction.d = (ahdd)new ahba((ahbh)UpdateViewershipActionOuterClass$UpdateViewershipAction.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return UpdateViewershipActionOuterClass$UpdateViewershipAction.a;
            }
            case 4: {
                return new ahaz((ahbh)UpdateViewershipActionOuterClass$UpdateViewershipAction.a);
            }
            case 3: {
                return new UpdateViewershipActionOuterClass$UpdateViewershipAction();
            }
            case 2: {
                return newMessageInfo((MessageLite)UpdateViewershipActionOuterClass$UpdateViewershipAction.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0002\u0001\u1409\u0000\u0002\u1007\u0002\u0003\u1409\u0001", new Object[] { "e", "b", "c", "f" });
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
