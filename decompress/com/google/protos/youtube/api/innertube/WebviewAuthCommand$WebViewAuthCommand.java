// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

@Deprecated
public final class WebviewAuthCommand$WebViewAuthCommand extends agzi implements ahax
{
    public static final WebviewAuthCommand$WebViewAuthCommand a;
    private static volatile ahbe e;
    public static final agzg webViewAuthCommand;
    public int b;
    public int c;
    public String d;
    
    static {
        final WebviewAuthCommand$WebViewAuthCommand a2 = new WebviewAuthCommand$WebViewAuthCommand();
        agzi.registerDefaultInstance((Class)WebviewAuthCommand$WebViewAuthCommand.class, (agzi)(a = a2));
        webViewAuthCommand = agzi.newSingularGeneratedExtension((MessageLite)aioe.a, (Object)a2, (MessageLite)a2, (agzn)null, 386457349, ahcm.k, (Class)WebviewAuthCommand$WebViewAuthCommand.class);
    }
    
    private WebviewAuthCommand$WebViewAuthCommand() {
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
                if ((e = WebviewAuthCommand$WebViewAuthCommand.e) == null) {
                    synchronized (WebviewAuthCommand$WebViewAuthCommand.class) {
                        if (WebviewAuthCommand$WebViewAuthCommand.e == null) {
                            WebviewAuthCommand$WebViewAuthCommand.e = (ahbe)new agzb((agzi)WebviewAuthCommand$WebViewAuthCommand.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return WebviewAuthCommand$WebViewAuthCommand.a;
            }
            case 4: {
                return new agza((agzi)WebviewAuthCommand$WebViewAuthCommand.a);
            }
            case 3: {
                return new WebviewAuthCommand$WebViewAuthCommand();
            }
            case 2: {
                return newMessageInfo((MessageLite)WebviewAuthCommand$WebViewAuthCommand.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u100c\u0000\u0002\u1008\u0001", new Object[] { "b", "c", apsc.e, "d" });
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
