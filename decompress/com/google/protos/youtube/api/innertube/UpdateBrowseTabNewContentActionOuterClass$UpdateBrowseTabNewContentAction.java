// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class UpdateBrowseTabNewContentActionOuterClass$UpdateBrowseTabNewContentAction extends ahbh implements ahcw
{
    public static final UpdateBrowseTabNewContentActionOuterClass$UpdateBrowseTabNewContentAction a;
    private static volatile ahdd h;
    public static final ahbf updateBrowseTabNewContentAction;
    public int b;
    public String c;
    public aork d;
    public anbo e;
    public long f;
    public int g;
    private byte i;
    
    static {
        final UpdateBrowseTabNewContentActionOuterClass$UpdateBrowseTabNewContentAction a2 = new UpdateBrowseTabNewContentActionOuterClass$UpdateBrowseTabNewContentAction();
        ahbh.registerDefaultInstance((Class)UpdateBrowseTabNewContentActionOuterClass$UpdateBrowseTabNewContentAction.class, (ahbh)(a = a2));
        updateBrowseTabNewContentAction = ahbh.newSingularGeneratedExtension((MessageLite)aiqj.a, (Object)a2, (MessageLite)a2, (ahbm)null, 102200546, ahek.k, (Class)UpdateBrowseTabNewContentActionOuterClass$UpdateBrowseTabNewContentAction.class);
    }
    
    private UpdateBrowseTabNewContentActionOuterClass$UpdateBrowseTabNewContentAction() {
        this.i = 2;
        this.c = "";
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte i = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd h;
                if ((h = UpdateBrowseTabNewContentActionOuterClass$UpdateBrowseTabNewContentAction.h) == null) {
                    synchronized (UpdateBrowseTabNewContentActionOuterClass$UpdateBrowseTabNewContentAction.class) {
                        if (UpdateBrowseTabNewContentActionOuterClass$UpdateBrowseTabNewContentAction.h == null) {
                            UpdateBrowseTabNewContentActionOuterClass$UpdateBrowseTabNewContentAction.h = (ahdd)new ahba((ahbh)UpdateBrowseTabNewContentActionOuterClass$UpdateBrowseTabNewContentAction.a);
                        }
                    }
                }
                return h;
            }
            case 5: {
                return UpdateBrowseTabNewContentActionOuterClass$UpdateBrowseTabNewContentAction.a;
            }
            case 4: {
                return new ahaz((ahbh)UpdateBrowseTabNewContentActionOuterClass$UpdateBrowseTabNewContentAction.a);
            }
            case 3: {
                return new UpdateBrowseTabNewContentActionOuterClass$UpdateBrowseTabNewContentAction();
            }
            case 2: {
                return newMessageInfo((MessageLite)UpdateBrowseTabNewContentActionOuterClass$UpdateBrowseTabNewContentAction.a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1009\u0001\u0003\u1009\u0002\u0004\u1002\u0003\u0005\u1004\u0004", new Object[] { "b", "c", "d", "e", "f", "g" });
            }
            case 1: {
                if (o == null) {
                    i = 0;
                }
                this.i = i;
                return null;
            }
            case 0: {
                return this.i;
            }
        }
    }
}
