// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class ShowCommentSimpleboxCommandOuterClass$ShowCommentSimpleboxCommand extends agzi implements ahax
{
    public static final ShowCommentSimpleboxCommandOuterClass$ShowCommentSimpleboxCommand a;
    private static volatile ahbe c;
    public static final agzg showCommentSimpleboxCommand;
    public anss b;
    private int d;
    private byte e;
    
    static {
        final ShowCommentSimpleboxCommandOuterClass$ShowCommentSimpleboxCommand a2 = new ShowCommentSimpleboxCommandOuterClass$ShowCommentSimpleboxCommand();
        agzi.registerDefaultInstance((Class)ShowCommentSimpleboxCommandOuterClass$ShowCommentSimpleboxCommand.class, (agzi)(a = a2));
        showCommentSimpleboxCommand = agzi.newSingularGeneratedExtension((MessageLite)aioe.a, (Object)a2, (MessageLite)a2, (agzn)null, 206638672, ahcm.k, (Class)ShowCommentSimpleboxCommandOuterClass$ShowCommentSimpleboxCommand.class);
    }
    
    private ShowCommentSimpleboxCommandOuterClass$ShowCommentSimpleboxCommand() {
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
                final ahbe c;
                if ((c = ShowCommentSimpleboxCommandOuterClass$ShowCommentSimpleboxCommand.c) == null) {
                    synchronized (ShowCommentSimpleboxCommandOuterClass$ShowCommentSimpleboxCommand.class) {
                        if (ShowCommentSimpleboxCommandOuterClass$ShowCommentSimpleboxCommand.c == null) {
                            ShowCommentSimpleboxCommandOuterClass$ShowCommentSimpleboxCommand.c = (ahbe)new agzb((agzi)ShowCommentSimpleboxCommandOuterClass$ShowCommentSimpleboxCommand.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return ShowCommentSimpleboxCommandOuterClass$ShowCommentSimpleboxCommand.a;
            }
            case 4: {
                return new agza((agzi)ShowCommentSimpleboxCommandOuterClass$ShowCommentSimpleboxCommand.a);
            }
            case 3: {
                return new ShowCommentSimpleboxCommandOuterClass$ShowCommentSimpleboxCommand();
            }
            case 2: {
                return newMessageInfo((MessageLite)ShowCommentSimpleboxCommandOuterClass$ShowCommentSimpleboxCommand.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u1409\u0000", new Object[] { "d", "b" });
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
