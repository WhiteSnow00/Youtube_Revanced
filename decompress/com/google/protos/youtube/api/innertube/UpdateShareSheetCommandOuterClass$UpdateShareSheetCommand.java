// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class UpdateShareSheetCommandOuterClass$UpdateShareSheetCommand extends ahbh implements ahcw
{
    public static final UpdateShareSheetCommandOuterClass$UpdateShareSheetCommand a;
    private static volatile ahdd g;
    public static final ahbf updateShareSheetCommand;
    public int b;
    public String c;
    public int d;
    public String e;
    public aiqj f;
    private byte h;
    
    static {
        final UpdateShareSheetCommandOuterClass$UpdateShareSheetCommand a2 = new UpdateShareSheetCommandOuterClass$UpdateShareSheetCommand();
        ahbh.registerDefaultInstance((Class)UpdateShareSheetCommandOuterClass$UpdateShareSheetCommand.class, (ahbh)(a = a2));
        updateShareSheetCommand = ahbh.newSingularGeneratedExtension((MessageLite)aiqj.a, (Object)a2, (MessageLite)a2, (ahbm)null, 387863284, ahek.k, (Class)UpdateShareSheetCommandOuterClass$UpdateShareSheetCommand.class);
    }
    
    private UpdateShareSheetCommandOuterClass$UpdateShareSheetCommand() {
        this.h = 2;
        this.c = "";
        this.d = 1;
        this.e = "";
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
                final ahdd g;
                if ((g = UpdateShareSheetCommandOuterClass$UpdateShareSheetCommand.g) == null) {
                    synchronized (UpdateShareSheetCommandOuterClass$UpdateShareSheetCommand.class) {
                        if (UpdateShareSheetCommandOuterClass$UpdateShareSheetCommand.g == null) {
                            UpdateShareSheetCommandOuterClass$UpdateShareSheetCommand.g = (ahdd)new ahba((ahbh)UpdateShareSheetCommandOuterClass$UpdateShareSheetCommand.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return UpdateShareSheetCommandOuterClass$UpdateShareSheetCommand.a;
            }
            case 4: {
                return new ahaz((ahbh)UpdateShareSheetCommandOuterClass$UpdateShareSheetCommand.a);
            }
            case 3: {
                return new UpdateShareSheetCommandOuterClass$UpdateShareSheetCommand();
            }
            case 2: {
                return newMessageInfo((MessageLite)UpdateShareSheetCommandOuterClass$UpdateShareSheetCommand.a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0001\u0001\u1008\u0000\u0002\u100c\u0001\u0003\u1008\u0002\u0004\u1409\u0003", new Object[] { "b", "c", "d", anxd.r, "e", "f" });
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
