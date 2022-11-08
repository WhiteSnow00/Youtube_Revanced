// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class ShowCommentRepliesEngagementPanelCommandOuterClass$ShowCommentRepliesEngagementPanelCommand extends agzi implements ahax
{
    public static final ShowCommentRepliesEngagementPanelCommandOuterClass$ShowCommentRepliesEngagementPanelCommand a;
    private static volatile ahbe k;
    public static final agzg showCommentRepliesEngagementPanelCommand;
    public int b;
    public String c;
    public ajsq d;
    public String e;
    public boolean f;
    public ajsq g;
    public int h;
    public String i;
    public aioe j;
    private byte l;
    
    static {
        final ShowCommentRepliesEngagementPanelCommandOuterClass$ShowCommentRepliesEngagementPanelCommand a2 = new ShowCommentRepliesEngagementPanelCommandOuterClass$ShowCommentRepliesEngagementPanelCommand();
        agzi.registerDefaultInstance((Class)ShowCommentRepliesEngagementPanelCommandOuterClass$ShowCommentRepliesEngagementPanelCommand.class, (agzi)(a = a2));
        showCommentRepliesEngagementPanelCommand = agzi.newSingularGeneratedExtension((MessageLite)aioe.a, (Object)a2, (MessageLite)a2, (agzn)null, 141942083, ahcm.k, (Class)ShowCommentRepliesEngagementPanelCommandOuterClass$ShowCommentRepliesEngagementPanelCommand.class);
    }
    
    private ShowCommentRepliesEngagementPanelCommandOuterClass$ShowCommentRepliesEngagementPanelCommand() {
        this.l = 2;
        this.c = "";
        this.e = "";
        this.i = "";
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
                final ahbe k;
                if ((k = ShowCommentRepliesEngagementPanelCommandOuterClass$ShowCommentRepliesEngagementPanelCommand.k) == null) {
                    synchronized (ShowCommentRepliesEngagementPanelCommandOuterClass$ShowCommentRepliesEngagementPanelCommand.class) {
                        if (ShowCommentRepliesEngagementPanelCommandOuterClass$ShowCommentRepliesEngagementPanelCommand.k == null) {
                            ShowCommentRepliesEngagementPanelCommandOuterClass$ShowCommentRepliesEngagementPanelCommand.k = (ahbe)new agzb((agzi)ShowCommentRepliesEngagementPanelCommandOuterClass$ShowCommentRepliesEngagementPanelCommand.a);
                        }
                    }
                }
                return k;
            }
            case 5: {
                return ShowCommentRepliesEngagementPanelCommandOuterClass$ShowCommentRepliesEngagementPanelCommand.a;
            }
            case 4: {
                return new agza((agzi)ShowCommentRepliesEngagementPanelCommandOuterClass$ShowCommentRepliesEngagementPanelCommand.a);
            }
            case 3: {
                return new ShowCommentRepliesEngagementPanelCommandOuterClass$ShowCommentRepliesEngagementPanelCommand();
            }
            case 2: {
                return newMessageInfo((MessageLite)ShowCommentRepliesEngagementPanelCommandOuterClass$ShowCommentRepliesEngagementPanelCommand.a, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0003\u0001\u1008\u0000\u0002\u1008\u0002\u0003\u1409\u0001\u0004\u1007\u0003\u0005\u1409\u0004\u0006\u1004\u0005\u0007\u1008\u0006\b\u1409\u0007", new Object[] { "b", "c", "e", "d", "f", "g", "h", "i", "j" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.l = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.l;
            }
        }
    }
}
