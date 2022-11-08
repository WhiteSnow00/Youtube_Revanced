// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class SetAppThemeCommandOuterClass$SetAppThemeCommand extends agzi implements ahax
{
    public static final SetAppThemeCommandOuterClass$SetAppThemeCommand a;
    private static volatile ahbe c;
    public static final agzg setAppThemeCommand;
    public int b;
    private int d;
    
    static {
        final SetAppThemeCommandOuterClass$SetAppThemeCommand a2 = new SetAppThemeCommandOuterClass$SetAppThemeCommand();
        agzi.registerDefaultInstance((Class)SetAppThemeCommandOuterClass$SetAppThemeCommand.class, (agzi)(a = a2));
        setAppThemeCommand = agzi.newSingularGeneratedExtension((MessageLite)aioe.a, (Object)a2, (MessageLite)a2, (agzn)null, 195899132, ahcm.k, (Class)SetAppThemeCommandOuterClass$SetAppThemeCommand.class);
    }
    
    private SetAppThemeCommandOuterClass$SetAppThemeCommand() {
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe c;
                if ((c = SetAppThemeCommandOuterClass$SetAppThemeCommand.c) == null) {
                    synchronized (SetAppThemeCommandOuterClass$SetAppThemeCommand.class) {
                        if (SetAppThemeCommandOuterClass$SetAppThemeCommand.c == null) {
                            SetAppThemeCommandOuterClass$SetAppThemeCommand.c = (ahbe)new agzb((agzi)SetAppThemeCommandOuterClass$SetAppThemeCommand.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return SetAppThemeCommandOuterClass$SetAppThemeCommand.a;
            }
            case 4: {
                return new agza((agzi)SetAppThemeCommandOuterClass$SetAppThemeCommand.a);
            }
            case 3: {
                return new SetAppThemeCommandOuterClass$SetAppThemeCommand();
            }
            case 2: {
                return newMessageInfo((MessageLite)SetAppThemeCommandOuterClass$SetAppThemeCommand.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u100c\u0000", new Object[] { "d", "b", anvq.h });
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
