// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class SetAppThemeCommandOuterClass$SetAppThemeCommand extends ahbh implements ahcw
{
    public static final SetAppThemeCommandOuterClass$SetAppThemeCommand a;
    private static volatile ahdd c;
    public static final ahbf setAppThemeCommand;
    public int b;
    private int d;
    
    static {
        final SetAppThemeCommandOuterClass$SetAppThemeCommand a2 = new SetAppThemeCommandOuterClass$SetAppThemeCommand();
        ahbh.registerDefaultInstance((Class)SetAppThemeCommandOuterClass$SetAppThemeCommand.class, (ahbh)(a = a2));
        setAppThemeCommand = ahbh.newSingularGeneratedExtension((MessageLite)aiqj.a, (Object)a2, (MessageLite)a2, (ahbm)null, 195899132, ahek.k, (Class)SetAppThemeCommandOuterClass$SetAppThemeCommand.class);
    }
    
    private SetAppThemeCommandOuterClass$SetAppThemeCommand() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd c;
                if ((c = SetAppThemeCommandOuterClass$SetAppThemeCommand.c) == null) {
                    synchronized (SetAppThemeCommandOuterClass$SetAppThemeCommand.class) {
                        if (SetAppThemeCommandOuterClass$SetAppThemeCommand.c == null) {
                            SetAppThemeCommandOuterClass$SetAppThemeCommand.c = (ahdd)new ahba((ahbh)SetAppThemeCommandOuterClass$SetAppThemeCommand.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return SetAppThemeCommandOuterClass$SetAppThemeCommand.a;
            }
            case 4: {
                return new ahaz((ahbh)SetAppThemeCommandOuterClass$SetAppThemeCommand.a);
            }
            case 3: {
                return new SetAppThemeCommandOuterClass$SetAppThemeCommand();
            }
            case 2: {
                return newMessageInfo((MessageLite)SetAppThemeCommandOuterClass$SetAppThemeCommand.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u100c\u0000", new Object[] { "d", "b", anxd.i });
            }
            case 1: {
                return null;
            }
            case 0: {
                return 1;
            }
        }
    }
}
