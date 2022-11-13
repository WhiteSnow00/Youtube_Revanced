// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class ShowSfvElementsBottomSheetCommand$ShowSFVElementsBottomSheetCommand extends ahbh implements ahcw
{
    public static final ShowSfvElementsBottomSheetCommand$ShowSFVElementsBottomSheetCommand a;
    private static volatile ahdd f;
    public static final ahbf showSfvElementsBottomSheetCommand;
    public anuv b;
    public ajut c;
    public float d;
    public float e;
    private int g;
    private byte h;
    
    static {
        final ShowSfvElementsBottomSheetCommand$ShowSFVElementsBottomSheetCommand a2 = new ShowSfvElementsBottomSheetCommand$ShowSFVElementsBottomSheetCommand();
        ahbh.registerDefaultInstance((Class)ShowSfvElementsBottomSheetCommand$ShowSFVElementsBottomSheetCommand.class, (ahbh)(a = a2));
        showSfvElementsBottomSheetCommand = ahbh.newSingularGeneratedExtension((MessageLite)aiqj.a, (Object)a2, (MessageLite)a2, (ahbm)null, 324622913, ahek.k, (Class)ShowSfvElementsBottomSheetCommand$ShowSFVElementsBottomSheetCommand.class);
    }
    
    private ShowSfvElementsBottomSheetCommand$ShowSFVElementsBottomSheetCommand() {
        this.h = 2;
        this.d = 1.0f;
        this.e = 1.0f;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte h = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd f;
                if ((f = ShowSfvElementsBottomSheetCommand$ShowSFVElementsBottomSheetCommand.f) == null) {
                    synchronized (ShowSfvElementsBottomSheetCommand$ShowSFVElementsBottomSheetCommand.class) {
                        if (ShowSfvElementsBottomSheetCommand$ShowSFVElementsBottomSheetCommand.f == null) {
                            ShowSfvElementsBottomSheetCommand$ShowSFVElementsBottomSheetCommand.f = (ahdd)new ahba((ahbh)ShowSfvElementsBottomSheetCommand$ShowSFVElementsBottomSheetCommand.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return ShowSfvElementsBottomSheetCommand$ShowSFVElementsBottomSheetCommand.a;
            }
            case 4: {
                return new ahaz((ahbh)ShowSfvElementsBottomSheetCommand$ShowSFVElementsBottomSheetCommand.a);
            }
            case 3: {
                return new ShowSfvElementsBottomSheetCommand$ShowSFVElementsBottomSheetCommand();
            }
            case 2: {
                return newMessageInfo((MessageLite)ShowSfvElementsBottomSheetCommand$ShowSFVElementsBottomSheetCommand.a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0002\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1001\u0002\u0004\u1001\u0003", new Object[] { "g", "b", "c", "d", "e" });
            }
            case 1: {
                if (o == null) {
                    h = 0;
                }
                this.h = h;
                return null;
            }
            case 0: {
                return this.h;
            }
        }
    }
}
