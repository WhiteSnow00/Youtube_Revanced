// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class GetSuggestedPlaylistVideosCommandOuterClass$GetSuggestedPlaylistVideosCommand extends agzi implements ahax
{
    public static final GetSuggestedPlaylistVideosCommandOuterClass$GetSuggestedPlaylistVideosCommand a;
    private static volatile ahbe b;
    public static final agzg getSuggestedPlaylistVideosCommand;
    
    static {
        final GetSuggestedPlaylistVideosCommandOuterClass$GetSuggestedPlaylistVideosCommand a2 = new GetSuggestedPlaylistVideosCommandOuterClass$GetSuggestedPlaylistVideosCommand();
        agzi.registerDefaultInstance((Class)GetSuggestedPlaylistVideosCommandOuterClass$GetSuggestedPlaylistVideosCommand.class, (agzi)(a = a2));
        getSuggestedPlaylistVideosCommand = agzi.newSingularGeneratedExtension((MessageLite)aioe.a, (Object)a2, (MessageLite)a2, (agzn)null, 229815794, ahcm.k, (Class)GetSuggestedPlaylistVideosCommandOuterClass$GetSuggestedPlaylistVideosCommand.class);
    }
    
    private GetSuggestedPlaylistVideosCommandOuterClass$GetSuggestedPlaylistVideosCommand() {
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe b;
                if ((b = GetSuggestedPlaylistVideosCommandOuterClass$GetSuggestedPlaylistVideosCommand.b) == null) {
                    synchronized (GetSuggestedPlaylistVideosCommandOuterClass$GetSuggestedPlaylistVideosCommand.class) {
                        if (GetSuggestedPlaylistVideosCommandOuterClass$GetSuggestedPlaylistVideosCommand.b == null) {
                            GetSuggestedPlaylistVideosCommandOuterClass$GetSuggestedPlaylistVideosCommand.b = (ahbe)new agzb((agzi)GetSuggestedPlaylistVideosCommandOuterClass$GetSuggestedPlaylistVideosCommand.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return GetSuggestedPlaylistVideosCommandOuterClass$GetSuggestedPlaylistVideosCommand.a;
            }
            case 4: {
                return new agza((agzi)GetSuggestedPlaylistVideosCommandOuterClass$GetSuggestedPlaylistVideosCommand.a);
            }
            case 3: {
                return new GetSuggestedPlaylistVideosCommandOuterClass$GetSuggestedPlaylistVideosCommand();
            }
            case 2: {
                return newMessageInfo((MessageLite)GetSuggestedPlaylistVideosCommandOuterClass$GetSuggestedPlaylistVideosCommand.a, "\u0001\u0000", (Object[])null);
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
