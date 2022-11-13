// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class ShowBrowseElementsBottomSheetCommandOuterClass$ShowBrowseElementsBottomSheetCommand extends ahbh implements ahcw
{
    public static final ShowBrowseElementsBottomSheetCommandOuterClass$ShowBrowseElementsBottomSheetCommand a;
    private static volatile ahdd f;
    public static final ahbf showBrowseElementsBottomSheetCommand;
    public aiqj b;
    public ajut c;
    public float d;
    public float e;
    private int g;
    private ajut h;
    private byte i;
    
    static {
        final ShowBrowseElementsBottomSheetCommandOuterClass$ShowBrowseElementsBottomSheetCommand a2 = new ShowBrowseElementsBottomSheetCommandOuterClass$ShowBrowseElementsBottomSheetCommand();
        ahbh.registerDefaultInstance((Class)ShowBrowseElementsBottomSheetCommandOuterClass$ShowBrowseElementsBottomSheetCommand.class, (ahbh)(a = a2));
        showBrowseElementsBottomSheetCommand = ahbh.newSingularGeneratedExtension((MessageLite)aiqj.a, (Object)a2, (MessageLite)a2, (ahbm)null, 372633595, ahek.k, (Class)ShowBrowseElementsBottomSheetCommandOuterClass$ShowBrowseElementsBottomSheetCommand.class);
    }
    
    private ShowBrowseElementsBottomSheetCommandOuterClass$ShowBrowseElementsBottomSheetCommand() {
        this.i = 2;
        this.d = 1.0f;
        this.e = 1.0f;
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
                final ahdd f;
                if ((f = ShowBrowseElementsBottomSheetCommandOuterClass$ShowBrowseElementsBottomSheetCommand.f) == null) {
                    synchronized (ShowBrowseElementsBottomSheetCommandOuterClass$ShowBrowseElementsBottomSheetCommand.class) {
                        if (ShowBrowseElementsBottomSheetCommandOuterClass$ShowBrowseElementsBottomSheetCommand.f == null) {
                            ShowBrowseElementsBottomSheetCommandOuterClass$ShowBrowseElementsBottomSheetCommand.f = (ahdd)new ahba((ahbh)ShowBrowseElementsBottomSheetCommandOuterClass$ShowBrowseElementsBottomSheetCommand.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return ShowBrowseElementsBottomSheetCommandOuterClass$ShowBrowseElementsBottomSheetCommand.a;
            }
            case 4: {
                return new ahaz((ahbh)ShowBrowseElementsBottomSheetCommandOuterClass$ShowBrowseElementsBottomSheetCommand.a);
            }
            case 3: {
                return new ShowBrowseElementsBottomSheetCommandOuterClass$ShowBrowseElementsBottomSheetCommand();
            }
            case 2: {
                return newMessageInfo((MessageLite)ShowBrowseElementsBottomSheetCommandOuterClass$ShowBrowseElementsBottomSheetCommand.a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0003\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0002\u0004\u1001\u0003\u0005\u1001\u0004", new Object[] { "g", "b", "c", "h", "d", "e" });
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
