// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class BackgroundFetchBrowseCommandOuterClass$BackgroundFetchBrowseCommand extends agzi implements ahax
{
    public static final BackgroundFetchBrowseCommandOuterClass$BackgroundFetchBrowseCommand a;
    public static final agzg backgroundFetchBrowseCommand;
    private static volatile ahbe d;
    public String b;
    public anuh c;
    private int e;
    
    static {
        final BackgroundFetchBrowseCommandOuterClass$BackgroundFetchBrowseCommand a2 = new BackgroundFetchBrowseCommandOuterClass$BackgroundFetchBrowseCommand();
        agzi.registerDefaultInstance((Class)BackgroundFetchBrowseCommandOuterClass$BackgroundFetchBrowseCommand.class, (agzi)(a = a2));
        backgroundFetchBrowseCommand = agzi.newSingularGeneratedExtension((MessageLite)aioe.a, (Object)a2, (MessageLite)a2, (agzn)null, 182223933, ahcm.k, (Class)BackgroundFetchBrowseCommandOuterClass$BackgroundFetchBrowseCommand.class);
    }
    
    private BackgroundFetchBrowseCommandOuterClass$BackgroundFetchBrowseCommand() {
        this.b = "";
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe d;
                if ((d = BackgroundFetchBrowseCommandOuterClass$BackgroundFetchBrowseCommand.d) == null) {
                    synchronized (BackgroundFetchBrowseCommandOuterClass$BackgroundFetchBrowseCommand.class) {
                        if (BackgroundFetchBrowseCommandOuterClass$BackgroundFetchBrowseCommand.d == null) {
                            BackgroundFetchBrowseCommandOuterClass$BackgroundFetchBrowseCommand.d = (ahbe)new agzb((agzi)BackgroundFetchBrowseCommandOuterClass$BackgroundFetchBrowseCommand.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return BackgroundFetchBrowseCommandOuterClass$BackgroundFetchBrowseCommand.a;
            }
            case 4: {
                return new agza((agzi)BackgroundFetchBrowseCommandOuterClass$BackgroundFetchBrowseCommand.a);
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
