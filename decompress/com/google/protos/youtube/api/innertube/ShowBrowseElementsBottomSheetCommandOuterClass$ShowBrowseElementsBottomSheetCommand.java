// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class ShowBrowseElementsBottomSheetCommandOuterClass$ShowBrowseElementsBottomSheetCommand extends agzi implements ahax
{
    public static final ShowBrowseElementsBottomSheetCommandOuterClass$ShowBrowseElementsBottomSheetCommand a;
    private static volatile ahbe f;
    public static final agzg showBrowseElementsBottomSheetCommand;
    public aioe b;
    public ajsq c;
    public float d;
    public float e;
    private int g;
    private ajsq h;
    private byte i;
    
    static {
        final ShowBrowseElementsBottomSheetCommandOuterClass$ShowBrowseElementsBottomSheetCommand a2 = new ShowBrowseElementsBottomSheetCommandOuterClass$ShowBrowseElementsBottomSheetCommand();
        agzi.registerDefaultInstance((Class)ShowBrowseElementsBottomSheetCommandOuterClass$ShowBrowseElementsBottomSheetCommand.class, (agzi)(a = a2));
        showBrowseElementsBottomSheetCommand = agzi.newSingularGeneratedExtension((MessageLite)aioe.a, (Object)a2, (MessageLite)a2, (agzn)null, 372633595, ahcm.k, (Class)ShowBrowseElementsBottomSheetCommandOuterClass$ShowBrowseElementsBottomSheetCommand.class);
    }
    
    private ShowBrowseElementsBottomSheetCommandOuterClass$ShowBrowseElementsBottomSheetCommand() {
        this.i = 2;
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
                if ((f = ShowBrowseElementsBottomSheetCommandOuterClass$ShowBrowseElementsBottomSheetCommand.f) == null) {
                    synchronized (ShowBrowseElementsBottomSheetCommandOuterClass$ShowBrowseElementsBottomSheetCommand.class) {
                        if (ShowBrowseElementsBottomSheetCommandOuterClass$ShowBrowseElementsBottomSheetCommand.f == null) {
                            ShowBrowseElementsBottomSheetCommandOuterClass$ShowBrowseElementsBottomSheetCommand.f = (ahbe)new agzb((agzi)ShowBrowseElementsBottomSheetCommandOuterClass$ShowBrowseElementsBottomSheetCommand.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return ShowBrowseElementsBottomSheetCommandOuterClass$ShowBrowseElementsBottomSheetCommand.a;
            }
            case 4: {
                return new agza((agzi)ShowBrowseElementsBottomSheetCommandOuterClass$ShowBrowseElementsBottomSheetCommand.a);
            }
            case 3: {
                return new ShowBrowseElementsBottomSheetCommandOuterClass$ShowBrowseElementsBottomSheetCommand();
            }
            case 2: {
                return newMessageInfo((MessageLite)ShowBrowseElementsBottomSheetCommandOuterClass$ShowBrowseElementsBottomSheetCommand.a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0003\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0002\u0004\u1001\u0003\u0005\u1001\u0004", new Object[] { "g", "b", "c", "h", "d", "e" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.i = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.i;
            }
        }
    }
}
