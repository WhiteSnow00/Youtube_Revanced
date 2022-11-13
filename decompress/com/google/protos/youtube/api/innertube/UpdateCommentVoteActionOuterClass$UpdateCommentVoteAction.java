// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class UpdateCommentVoteActionOuterClass$UpdateCommentVoteAction extends ahbh implements ahcw
{
    public static final UpdateCommentVoteActionOuterClass$UpdateCommentVoteAction a;
    private static volatile ahdd d;
    public static final ahbf updateCommentVoteAction;
    public int b;
    public ajut c;
    private byte e;
    
    static {
        final UpdateCommentVoteActionOuterClass$UpdateCommentVoteAction a2 = new UpdateCommentVoteActionOuterClass$UpdateCommentVoteAction();
        ahbh.registerDefaultInstance((Class)UpdateCommentVoteActionOuterClass$UpdateCommentVoteAction.class, (ahbh)(a = a2));
        updateCommentVoteAction = ahbh.newSingularGeneratedExtension((MessageLite)aiqj.a, (Object)a2, (MessageLite)a2, (ahbm)null, 119065485, ahek.k, (Class)UpdateCommentVoteActionOuterClass$UpdateCommentVoteAction.class);
    }
    
    private UpdateCommentVoteActionOuterClass$UpdateCommentVoteAction() {
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
                final ahdd d;
                if ((d = UpdateCommentVoteActionOuterClass$UpdateCommentVoteAction.d) == null) {
                    synchronized (UpdateCommentVoteActionOuterClass$UpdateCommentVoteAction.class) {
                        if (UpdateCommentVoteActionOuterClass$UpdateCommentVoteAction.d == null) {
                            UpdateCommentVoteActionOuterClass$UpdateCommentVoteAction.d = (ahdd)new ahba((ahbh)UpdateCommentVoteActionOuterClass$UpdateCommentVoteAction.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return UpdateCommentVoteActionOuterClass$UpdateCommentVoteAction.a;
            }
            case 4: {
                return new ahaz((ahbh)UpdateCommentVoteActionOuterClass$UpdateCommentVoteAction.a);
            }
            case 3: {
                return new UpdateCommentVoteActionOuterClass$UpdateCommentVoteAction();
            }
            case 2: {
                return newMessageInfo((MessageLite)UpdateCommentVoteActionOuterClass$UpdateCommentVoteAction.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u1409\u0000", new Object[] { "b", "c" });
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
