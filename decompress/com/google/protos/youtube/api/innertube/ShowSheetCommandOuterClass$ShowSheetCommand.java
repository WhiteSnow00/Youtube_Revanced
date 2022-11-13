// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class ShowSheetCommandOuterClass$ShowSheetCommand extends ahbh implements ahcw
{
    public static final ShowSheetCommandOuterClass$ShowSheetCommand a;
    private static volatile ahdd e;
    public static final ahbf showSheetCommand;
    public int b;
    public amym c;
    public anwn d;
    private byte f;
    
    static {
        final ShowSheetCommandOuterClass$ShowSheetCommand a2 = new ShowSheetCommandOuterClass$ShowSheetCommand();
        ahbh.registerDefaultInstance((Class)ShowSheetCommandOuterClass$ShowSheetCommand.class, (ahbh)(a = a2));
        showSheetCommand = ahbh.newSingularGeneratedExtension((MessageLite)aiqj.a, (Object)a2, (MessageLite)a2, (ahbm)null, 443434441, ahek.k, (Class)ShowSheetCommandOuterClass$ShowSheetCommand.class);
    }
    
    private ShowSheetCommandOuterClass$ShowSheetCommand() {
        this.f = 2;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte f = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd e;
                if ((e = ShowSheetCommandOuterClass$ShowSheetCommand.e) == null) {
                    synchronized (ShowSheetCommandOuterClass$ShowSheetCommand.class) {
                        if (ShowSheetCommandOuterClass$ShowSheetCommand.e == null) {
                            ShowSheetCommandOuterClass$ShowSheetCommand.e = (ahdd)new ahba((ahbh)ShowSheetCommandOuterClass$ShowSheetCommand.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return ShowSheetCommandOuterClass$ShowSheetCommand.a;
            }
            case 4: {
                return new ahaz((ahbh)ShowSheetCommandOuterClass$ShowSheetCommand.a);
            }
            case 3: {
                return new ShowSheetCommandOuterClass$ShowSheetCommand();
            }
            case 2: {
                return newMessageInfo((MessageLite)ShowSheetCommandOuterClass$ShowSheetCommand.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001\u1409\u0000\u0002\u1009\u0001", new Object[] { "b", "c", "d" });
            }
            case 1: {
                if (o == null) {
                    f = 0;
                }
                this.f = f;
                return null;
            }
            case 0: {
                return this.f;
            }
        }
    }
}
