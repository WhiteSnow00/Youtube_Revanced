// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class ShowSfvElementsBottomSheetCommand$ShowSFVElementsBottomSheetCommand extends agzi implements ahax
{
    public static final ShowSfvElementsBottomSheetCommand$ShowSFVElementsBottomSheetCommand a;
    private static volatile ahbe f;
    public static final agzg showSfvElementsBottomSheetCommand;
    public anss b;
    public ajsq c;
    public float d;
    public float e;
    private int g;
    private byte h;
    
    static {
        final ShowSfvElementsBottomSheetCommand$ShowSFVElementsBottomSheetCommand a2 = new ShowSfvElementsBottomSheetCommand$ShowSFVElementsBottomSheetCommand();
        agzi.registerDefaultInstance((Class)ShowSfvElementsBottomSheetCommand$ShowSFVElementsBottomSheetCommand.class, (agzi)(a = a2));
        showSfvElementsBottomSheetCommand = agzi.newSingularGeneratedExtension((MessageLite)aioe.a, (Object)a2, (MessageLite)a2, (agzn)null, 324622913, ahcm.k, (Class)ShowSfvElementsBottomSheetCommand$ShowSFVElementsBottomSheetCommand.class);
    }
    
    private ShowSfvElementsBottomSheetCommand$ShowSFVElementsBottomSheetCommand() {
        this.h = 2;
        this.d = 1.0f;
        this.e = 1.0f;
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
                final ahbe f;
                if ((f = ShowSfvElementsBottomSheetCommand$ShowSFVElementsBottomSheetCommand.f) == null) {
                    synchronized (ShowSfvElementsBottomSheetCommand$ShowSFVElementsBottomSheetCommand.class) {
                        if (ShowSfvElementsBottomSheetCommand$ShowSFVElementsBottomSheetCommand.f == null) {
                            ShowSfvElementsBottomSheetCommand$ShowSFVElementsBottomSheetCommand.f = (ahbe)new agzb((agzi)ShowSfvElementsBottomSheetCommand$ShowSFVElementsBottomSheetCommand.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return ShowSfvElementsBottomSheetCommand$ShowSFVElementsBottomSheetCommand.a;
            }
            case 4: {
                return new agza((agzi)ShowSfvElementsBottomSheetCommand$ShowSFVElementsBottomSheetCommand.a);
            }
            case 3: {
                return new ShowSfvElementsBottomSheetCommand$ShowSFVElementsBottomSheetCommand();
            }
            case 2: {
                return newMessageInfo((MessageLite)ShowSfvElementsBottomSheetCommand$ShowSFVElementsBottomSheetCommand.a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0002\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1001\u0002\u0004\u1001\u0003", new Object[] { "g", "b", "c", "d", "e" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.h = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.h;
            }
        }
    }
}
