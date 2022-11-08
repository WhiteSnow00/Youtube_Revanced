// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class DismissSfvElementsBottomSheetCommand$DismissSFVElementsBottomSheetCommand extends agzi implements ahax
{
    public static final DismissSfvElementsBottomSheetCommand$DismissSFVElementsBottomSheetCommand a;
    private static volatile ahbe d;
    public static final agzg dismissSfvElementsBottomSheetCommand;
    public int b;
    public aioe c;
    private byte e;
    
    static {
        final DismissSfvElementsBottomSheetCommand$DismissSFVElementsBottomSheetCommand a2 = new DismissSfvElementsBottomSheetCommand$DismissSFVElementsBottomSheetCommand();
        agzi.registerDefaultInstance((Class)DismissSfvElementsBottomSheetCommand$DismissSFVElementsBottomSheetCommand.class, (agzi)(a = a2));
        dismissSfvElementsBottomSheetCommand = agzi.newSingularGeneratedExtension((MessageLite)aioe.a, (Object)a2, (MessageLite)a2, (agzn)null, 323826788, ahcm.k, (Class)DismissSfvElementsBottomSheetCommand$DismissSFVElementsBottomSheetCommand.class);
    }
    
    private DismissSfvElementsBottomSheetCommand$DismissSFVElementsBottomSheetCommand() {
        this.e = 2;
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
                final ahbe d;
                if ((d = DismissSfvElementsBottomSheetCommand$DismissSFVElementsBottomSheetCommand.d) == null) {
                    synchronized (DismissSfvElementsBottomSheetCommand$DismissSFVElementsBottomSheetCommand.class) {
                        if (DismissSfvElementsBottomSheetCommand$DismissSFVElementsBottomSheetCommand.d == null) {
                            DismissSfvElementsBottomSheetCommand$DismissSFVElementsBottomSheetCommand.d = (ahbe)new agzb((agzi)DismissSfvElementsBottomSheetCommand$DismissSFVElementsBottomSheetCommand.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return DismissSfvElementsBottomSheetCommand$DismissSFVElementsBottomSheetCommand.a;
            }
            case 4: {
                return new agza((agzi)DismissSfvElementsBottomSheetCommand$DismissSFVElementsBottomSheetCommand.a);
            }
            case 3: {
                return new DismissSfvElementsBottomSheetCommand$DismissSFVElementsBottomSheetCommand();
            }
            case 2: {
                return newMessageInfo((MessageLite)DismissSfvElementsBottomSheetCommand$DismissSFVElementsBottomSheetCommand.a, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0001\u0002\u1409\u0001", new Object[] { "b", "c" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.e = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.e;
            }
        }
    }
}
