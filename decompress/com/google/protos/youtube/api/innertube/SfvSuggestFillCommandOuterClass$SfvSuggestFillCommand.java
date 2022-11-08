// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class SfvSuggestFillCommandOuterClass$SfvSuggestFillCommand extends agzi implements ahax
{
    public static final SfvSuggestFillCommandOuterClass$SfvSuggestFillCommand a;
    private static volatile ahbe c;
    public static final agzg sfvSuggestFillCommand;
    public String b;
    private int d;
    
    static {
        final SfvSuggestFillCommandOuterClass$SfvSuggestFillCommand a2 = new SfvSuggestFillCommandOuterClass$SfvSuggestFillCommand();
        agzi.registerDefaultInstance((Class)SfvSuggestFillCommandOuterClass$SfvSuggestFillCommand.class, (agzi)(a = a2));
        sfvSuggestFillCommand = agzi.newSingularGeneratedExtension((MessageLite)aioe.a, (Object)a2, (MessageLite)a2, (agzn)null, 353172822, ahcm.k, (Class)SfvSuggestFillCommandOuterClass$SfvSuggestFillCommand.class);
    }
    
    private SfvSuggestFillCommandOuterClass$SfvSuggestFillCommand() {
        this.b = "";
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe c;
                if ((c = SfvSuggestFillCommandOuterClass$SfvSuggestFillCommand.c) == null) {
                    synchronized (SfvSuggestFillCommandOuterClass$SfvSuggestFillCommand.class) {
                        if (SfvSuggestFillCommandOuterClass$SfvSuggestFillCommand.c == null) {
                            SfvSuggestFillCommandOuterClass$SfvSuggestFillCommand.c = (ahbe)new agzb((agzi)SfvSuggestFillCommandOuterClass$SfvSuggestFillCommand.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return SfvSuggestFillCommandOuterClass$SfvSuggestFillCommand.a;
            }
            case 4: {
                return new agza((agzi)SfvSuggestFillCommandOuterClass$SfvSuggestFillCommand.a);
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
