// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class ShowCommentSimpleboxCommandOuterClass$ShowCommentSimpleboxCommand extends ahbh implements ahcw
{
    public static final ShowCommentSimpleboxCommandOuterClass$ShowCommentSimpleboxCommand a;
    private static volatile ahdd c;
    public static final ahbf showCommentSimpleboxCommand;
    public anuv b;
    private int d;
    private byte e;
    
    static {
        final ShowCommentSimpleboxCommandOuterClass$ShowCommentSimpleboxCommand a2 = new ShowCommentSimpleboxCommandOuterClass$ShowCommentSimpleboxCommand();
        ahbh.registerDefaultInstance((Class)ShowCommentSimpleboxCommandOuterClass$ShowCommentSimpleboxCommand.class, (ahbh)(a = a2));
        showCommentSimpleboxCommand = ahbh.newSingularGeneratedExtension((MessageLite)aiqj.a, (Object)a2, (MessageLite)a2, (ahbm)null, 206638672, ahek.k, (Class)ShowCommentSimpleboxCommandOuterClass$ShowCommentSimpleboxCommand.class);
    }
    
    private ShowCommentSimpleboxCommandOuterClass$ShowCommentSimpleboxCommand() {
        this.e = 2;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte e = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd c;
                if ((c = ShowCommentSimpleboxCommandOuterClass$ShowCommentSimpleboxCommand.c) == null) {
                    synchronized (ShowCommentSimpleboxCommandOuterClass$ShowCommentSimpleboxCommand.class) {
                        if (ShowCommentSimpleboxCommandOuterClass$ShowCommentSimpleboxCommand.c == null) {
                            ShowCommentSimpleboxCommandOuterClass$ShowCommentSimpleboxCommand.c = (ahdd)new ahba((ahbh)ShowCommentSimpleboxCommandOuterClass$ShowCommentSimpleboxCommand.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return ShowCommentSimpleboxCommandOuterClass$ShowCommentSimpleboxCommand.a;
            }
            case 4: {
                return new ahaz((ahbh)ShowCommentSimpleboxCommandOuterClass$ShowCommentSimpleboxCommand.a);
            }
            case 3: {
                return new ShowCommentSimpleboxCommandOuterClass$ShowCommentSimpleboxCommand();
            }
            case 2: {
                return newMessageInfo((MessageLite)ShowCommentSimpleboxCommandOuterClass$ShowCommentSimpleboxCommand.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u1409\u0000", new Object[] { "d", "b" });
            }
            case 1: {
                if (o == null) {
                    e = 0;
                }
                this.e = e;
                return null;
            }
            case 0: {
                return this.e;
            }
        }
    }
}
