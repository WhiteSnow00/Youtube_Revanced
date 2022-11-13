// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class RepeatChapterCommandOuterClass$RepeatChapterCommand extends ahbh implements ahcw
{
    public static final RepeatChapterCommandOuterClass$RepeatChapterCommand a;
    private static volatile ahdd g;
    public static final ahbf repeatChapterCommand;
    public int b;
    public int c;
    public long d;
    public long e;
    public String f;
    
    static {
        final RepeatChapterCommandOuterClass$RepeatChapterCommand a2 = new RepeatChapterCommandOuterClass$RepeatChapterCommand();
        ahbh.registerDefaultInstance((Class)RepeatChapterCommandOuterClass$RepeatChapterCommand.class, (ahbh)(a = a2));
        repeatChapterCommand = ahbh.newSingularGeneratedExtension((MessageLite)aiqj.a, (Object)a2, (MessageLite)a2, (ahbm)null, 412940936, ahek.k, (Class)RepeatChapterCommandOuterClass$RepeatChapterCommand.class);
    }
    
    private RepeatChapterCommandOuterClass$RepeatChapterCommand() {
        this.f = "";
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd g;
                if ((g = RepeatChapterCommandOuterClass$RepeatChapterCommand.g) == null) {
                    synchronized (RepeatChapterCommandOuterClass$RepeatChapterCommand.class) {
                        if (RepeatChapterCommandOuterClass$RepeatChapterCommand.g == null) {
                            RepeatChapterCommandOuterClass$RepeatChapterCommand.g = (ahdd)new ahba((ahbh)RepeatChapterCommandOuterClass$RepeatChapterCommand.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return RepeatChapterCommandOuterClass$RepeatChapterCommand.a;
            }
            case 4: {
                return new ahaz((ahbh)RepeatChapterCommandOuterClass$RepeatChapterCommand.a);
            }
            case 3: {
                return new RepeatChapterCommandOuterClass$RepeatChapterCommand();
            }
            case 2: {
                return newMessageInfo((MessageLite)RepeatChapterCommandOuterClass$RepeatChapterCommand.a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u100c\u0000\u0002\u1002\u0001\u0003\u1002\u0002\u0004\u1008\u0003", new Object[] { "b", "c", ansm.q, "d", "e", "f" });
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
