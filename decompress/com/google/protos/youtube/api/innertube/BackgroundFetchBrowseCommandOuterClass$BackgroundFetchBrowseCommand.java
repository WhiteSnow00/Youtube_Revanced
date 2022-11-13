// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class BackgroundFetchBrowseCommandOuterClass$BackgroundFetchBrowseCommand extends ahbh implements ahcw
{
    public static final BackgroundFetchBrowseCommandOuterClass$BackgroundFetchBrowseCommand a;
    public static final ahbf backgroundFetchBrowseCommand;
    private static volatile ahdd d;
    public String b;
    public anwk c;
    private int e;
    
    static {
        final BackgroundFetchBrowseCommandOuterClass$BackgroundFetchBrowseCommand a2 = new BackgroundFetchBrowseCommandOuterClass$BackgroundFetchBrowseCommand();
        ahbh.registerDefaultInstance((Class)BackgroundFetchBrowseCommandOuterClass$BackgroundFetchBrowseCommand.class, (ahbh)(a = a2));
        backgroundFetchBrowseCommand = ahbh.newSingularGeneratedExtension((MessageLite)aiqj.a, (Object)a2, (MessageLite)a2, (ahbm)null, 182223933, ahek.k, (Class)BackgroundFetchBrowseCommandOuterClass$BackgroundFetchBrowseCommand.class);
    }
    
    private BackgroundFetchBrowseCommandOuterClass$BackgroundFetchBrowseCommand() {
        this.b = "";
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd d;
                if ((d = BackgroundFetchBrowseCommandOuterClass$BackgroundFetchBrowseCommand.d) == null) {
                    synchronized (BackgroundFetchBrowseCommandOuterClass$BackgroundFetchBrowseCommand.class) {
                        if (BackgroundFetchBrowseCommandOuterClass$BackgroundFetchBrowseCommand.d == null) {
                            BackgroundFetchBrowseCommandOuterClass$BackgroundFetchBrowseCommand.d = (ahdd)new ahba((ahbh)BackgroundFetchBrowseCommandOuterClass$BackgroundFetchBrowseCommand.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return BackgroundFetchBrowseCommandOuterClass$BackgroundFetchBrowseCommand.a;
            }
            case 4: {
                return new ahaz((ahbh)BackgroundFetchBrowseCommandOuterClass$BackgroundFetchBrowseCommand.a);
            }
            case 3: {
                return new BackgroundFetchBrowseCommandOuterClass$BackgroundFetchBrowseCommand();
            }
            case 2: {
                return newMessageInfo((MessageLite)BackgroundFetchBrowseCommandOuterClass$BackgroundFetchBrowseCommand.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1009\u0001", new Object[] { "e", "b", "c" });
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
