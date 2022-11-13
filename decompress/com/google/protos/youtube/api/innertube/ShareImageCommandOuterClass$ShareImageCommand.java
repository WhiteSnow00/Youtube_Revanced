// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class ShareImageCommandOuterClass$ShareImageCommand extends ahbh implements ahcw
{
    public static final ShareImageCommandOuterClass$ShareImageCommand a;
    private static volatile ahdd f;
    public static final ahbf shareImageCommand;
    public int b;
    public ahab c;
    public String d;
    public int e;
    
    static {
        final ShareImageCommandOuterClass$ShareImageCommand a2 = new ShareImageCommandOuterClass$ShareImageCommand();
        ahbh.registerDefaultInstance((Class)ShareImageCommandOuterClass$ShareImageCommand.class, (ahbh)(a = a2));
        shareImageCommand = ahbh.newSingularGeneratedExtension((MessageLite)aiqj.a, (Object)a2, (MessageLite)a2, (ahbm)null, 401875543, ahek.k, (Class)ShareImageCommandOuterClass$ShareImageCommand.class);
    }
    
    private ShareImageCommandOuterClass$ShareImageCommand() {
        this.c = ahab.b;
        this.d = "";
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd f;
                if ((f = ShareImageCommandOuterClass$ShareImageCommand.f) == null) {
                    synchronized (ShareImageCommandOuterClass$ShareImageCommand.class) {
                        if (ShareImageCommandOuterClass$ShareImageCommand.f == null) {
                            ShareImageCommandOuterClass$ShareImageCommand.f = (ahdd)new ahba((ahbh)ShareImageCommandOuterClass$ShareImageCommand.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return ShareImageCommandOuterClass$ShareImageCommand.a;
            }
            case 4: {
                return new ahaz((ahbh)ShareImageCommandOuterClass$ShareImageCommand.a);
            }
            case 3: {
                return new ShareImageCommandOuterClass$ShareImageCommand();
            }
            case 2: {
                return newMessageInfo((MessageLite)ShareImageCommandOuterClass$ShareImageCommand.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u100a\u0000\u0002\u1008\u0001\u0003\u100c\u0002", new Object[] { "b", "c", "d", "e", akeh.b });
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
