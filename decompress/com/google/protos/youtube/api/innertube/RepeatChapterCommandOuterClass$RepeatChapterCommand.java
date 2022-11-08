// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class RepeatChapterCommandOuterClass$RepeatChapterCommand extends agzi implements ahax
{
    public static final RepeatChapterCommandOuterClass$RepeatChapterCommand a;
    private static volatile ahbe g;
    public static final agzg repeatChapterCommand;
    public int b;
    public int c;
    public long d;
    public long e;
    public String f;
    
    static {
        final RepeatChapterCommandOuterClass$RepeatChapterCommand a2 = new RepeatChapterCommandOuterClass$RepeatChapterCommand();
        agzi.registerDefaultInstance((Class)RepeatChapterCommandOuterClass$RepeatChapterCommand.class, (agzi)(a = a2));
        repeatChapterCommand = agzi.newSingularGeneratedExtension((MessageLite)aioe.a, (Object)a2, (MessageLite)a2, (agzn)null, 412940936, ahcm.k, (Class)RepeatChapterCommandOuterClass$RepeatChapterCommand.class);
    }
    
    private RepeatChapterCommandOuterClass$RepeatChapterCommand() {
        this.f = "";
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe g;
                if ((g = RepeatChapterCommandOuterClass$RepeatChapterCommand.g) == null) {
                    synchronized (RepeatChapterCommandOuterClass$RepeatChapterCommand.class) {
                        if (RepeatChapterCommandOuterClass$RepeatChapterCommand.g == null) {
                            RepeatChapterCommandOuterClass$RepeatChapterCommand.g = (ahbe)new agzb((agzi)RepeatChapterCommandOuterClass$RepeatChapterCommand.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return RepeatChapterCommandOuterClass$RepeatChapterCommand.a;
            }
            case 4: {
                return new agza((agzi)RepeatChapterCommandOuterClass$RepeatChapterCommand.a);
            }
            case 3: {
                return new RepeatChapterCommandOuterClass$RepeatChapterCommand();
            }
            case 2: {
                return newMessageInfo((MessageLite)RepeatChapterCommandOuterClass$RepeatChapterCommand.a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u100c\u0000\u0002\u1002\u0001\u0003\u1002\u0002\u0004\u1008\u0003", new Object[] { "b", "c", anqs.p, "d", "e", "f" });
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
