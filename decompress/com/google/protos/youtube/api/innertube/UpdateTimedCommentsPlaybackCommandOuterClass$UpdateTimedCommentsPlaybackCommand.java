// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class UpdateTimedCommentsPlaybackCommandOuterClass$UpdateTimedCommentsPlaybackCommand extends ahbh implements ahcw
{
    public static final UpdateTimedCommentsPlaybackCommandOuterClass$UpdateTimedCommentsPlaybackCommand a;
    private static volatile ahdd f;
    public static final ahbf updateTimedCommentsPlaybackCommand;
    public int b;
    public boolean c;
    public String d;
    public String e;
    
    static {
        final UpdateTimedCommentsPlaybackCommandOuterClass$UpdateTimedCommentsPlaybackCommand a2 = new UpdateTimedCommentsPlaybackCommandOuterClass$UpdateTimedCommentsPlaybackCommand();
        ahbh.registerDefaultInstance((Class)UpdateTimedCommentsPlaybackCommandOuterClass$UpdateTimedCommentsPlaybackCommand.class, (ahbh)(a = a2));
        updateTimedCommentsPlaybackCommand = ahbh.newSingularGeneratedExtension((MessageLite)aiqj.a, (Object)a2, (MessageLite)a2, (ahbm)null, 470342095, ahek.k, (Class)UpdateTimedCommentsPlaybackCommandOuterClass$UpdateTimedCommentsPlaybackCommand.class);
    }
    
    private UpdateTimedCommentsPlaybackCommandOuterClass$UpdateTimedCommentsPlaybackCommand() {
        this.d = "";
        this.e = "";
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd f;
                if ((f = UpdateTimedCommentsPlaybackCommandOuterClass$UpdateTimedCommentsPlaybackCommand.f) == null) {
                    synchronized (UpdateTimedCommentsPlaybackCommandOuterClass$UpdateTimedCommentsPlaybackCommand.class) {
                        if (UpdateTimedCommentsPlaybackCommandOuterClass$UpdateTimedCommentsPlaybackCommand.f == null) {
                            UpdateTimedCommentsPlaybackCommandOuterClass$UpdateTimedCommentsPlaybackCommand.f = (ahdd)new ahba((ahbh)UpdateTimedCommentsPlaybackCommandOuterClass$UpdateTimedCommentsPlaybackCommand.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return UpdateTimedCommentsPlaybackCommandOuterClass$UpdateTimedCommentsPlaybackCommand.a;
            }
            case 4: {
                return new ahaz((ahbh)UpdateTimedCommentsPlaybackCommandOuterClass$UpdateTimedCommentsPlaybackCommand.a);
            }
            case 3: {
                return new UpdateTimedCommentsPlaybackCommandOuterClass$UpdateTimedCommentsPlaybackCommand();
            }
            case 2: {
                return newMessageInfo((MessageLite)UpdateTimedCommentsPlaybackCommandOuterClass$UpdateTimedCommentsPlaybackCommand.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u1007\u0000\u0002\u1008\u0001\u0003\u1008\u0002", new Object[] { "b", "c", "d", "e" });
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
