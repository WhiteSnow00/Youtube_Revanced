// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class SfvSuggestFillCommandOuterClass$SfvSuggestFillCommand extends ahbh implements ahcw
{
    public static final SfvSuggestFillCommandOuterClass$SfvSuggestFillCommand a;
    private static volatile ahdd c;
    public static final ahbf sfvSuggestFillCommand;
    public String b;
    private int d;
    
    static {
        final SfvSuggestFillCommandOuterClass$SfvSuggestFillCommand a2 = new SfvSuggestFillCommandOuterClass$SfvSuggestFillCommand();
        ahbh.registerDefaultInstance((Class)SfvSuggestFillCommandOuterClass$SfvSuggestFillCommand.class, (ahbh)(a = a2));
        sfvSuggestFillCommand = ahbh.newSingularGeneratedExtension((MessageLite)aiqj.a, (Object)a2, (MessageLite)a2, (ahbm)null, 353172822, ahek.k, (Class)SfvSuggestFillCommandOuterClass$SfvSuggestFillCommand.class);
    }
    
    private SfvSuggestFillCommandOuterClass$SfvSuggestFillCommand() {
        this.b = "";
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd c;
                if ((c = SfvSuggestFillCommandOuterClass$SfvSuggestFillCommand.c) == null) {
                    synchronized (SfvSuggestFillCommandOuterClass$SfvSuggestFillCommand.class) {
                        if (SfvSuggestFillCommandOuterClass$SfvSuggestFillCommand.c == null) {
                            SfvSuggestFillCommandOuterClass$SfvSuggestFillCommand.c = (ahdd)new ahba((ahbh)SfvSuggestFillCommandOuterClass$SfvSuggestFillCommand.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return SfvSuggestFillCommandOuterClass$SfvSuggestFillCommand.a;
            }
            case 4: {
                return new ahaz((ahbh)SfvSuggestFillCommandOuterClass$SfvSuggestFillCommand.a);
            }
            case 3: {
                return new SfvSuggestFillCommandOuterClass$SfvSuggestFillCommand();
            }
            case 2: {
                return newMessageInfo((MessageLite)SfvSuggestFillCommandOuterClass$SfvSuggestFillCommand.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1008\u0000", new Object[] { "d", "b" });
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
