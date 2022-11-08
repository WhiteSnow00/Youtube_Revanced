// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class WebViewActionCommandOuterClass$WebViewActionCommand extends agzi implements ahax
{
    public static final WebViewActionCommandOuterClass$WebViewActionCommand a;
    private static volatile ahbe e;
    public static final agzg webViewActionCommand;
    public int b;
    public int c;
    public String d;
    
    static {
        final WebViewActionCommandOuterClass$WebViewActionCommand a2 = new WebViewActionCommandOuterClass$WebViewActionCommand();
        agzi.registerDefaultInstance((Class)WebViewActionCommandOuterClass$WebViewActionCommand.class, (agzi)(a = a2));
        webViewActionCommand = agzi.newSingularGeneratedExtension((MessageLite)aioe.a, (Object)a2, (MessageLite)a2, (agzn)null, 463626877, ahcm.k, (Class)WebViewActionCommandOuterClass$WebViewActionCommand.class);
    }
    
    private WebViewActionCommandOuterClass$WebViewActionCommand() {
        this.d = "";
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe e;
                if ((e = WebViewActionCommandOuterClass$WebViewActionCommand.e) == null) {
                    synchronized (WebViewActionCommandOuterClass$WebViewActionCommand.class) {
                        if (WebViewActionCommandOuterClass$WebViewActionCommand.e == null) {
                            WebViewActionCommandOuterClass$WebViewActionCommand.e = (ahbe)new agzb((agzi)WebViewActionCommandOuterClass$WebViewActionCommand.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return WebViewActionCommandOuterClass$WebViewActionCommand.a;
            }
            case 4: {
                return new agza((agzi)WebViewActionCommandOuterClass$WebViewActionCommand.a);
            }
            case 3: {
                return new WebViewActionCommandOuterClass$WebViewActionCommand();
            }
            case 2: {
                return newMessageInfo((MessageLite)WebViewActionCommandOuterClass$WebViewActionCommand.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u100c\u0000\u0002\u1008\u0001", new Object[] { "b", "c", apsc.c, "d" });
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
