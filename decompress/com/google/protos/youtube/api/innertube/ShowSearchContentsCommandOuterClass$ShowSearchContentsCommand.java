// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class ShowSearchContentsCommandOuterClass$ShowSearchContentsCommand extends agzi implements ahax
{
    public static final ShowSearchContentsCommandOuterClass$ShowSearchContentsCommand a;
    private static volatile ahbe b;
    public static final agzg showSearchContentsCommand;
    
    static {
        final ShowSearchContentsCommandOuterClass$ShowSearchContentsCommand a2 = new ShowSearchContentsCommandOuterClass$ShowSearchContentsCommand();
        agzi.registerDefaultInstance((Class)ShowSearchContentsCommandOuterClass$ShowSearchContentsCommand.class, (agzi)(a = a2));
        showSearchContentsCommand = agzi.newSingularGeneratedExtension((MessageLite)aioe.a, (Object)a2, (MessageLite)a2, (agzn)null, 242013526, ahcm.k, (Class)ShowSearchContentsCommandOuterClass$ShowSearchContentsCommand.class);
    }
    
    private ShowSearchContentsCommandOuterClass$ShowSearchContentsCommand() {
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe b;
                if ((b = ShowSearchContentsCommandOuterClass$ShowSearchContentsCommand.b) == null) {
                    synchronized (ShowSearchContentsCommandOuterClass$ShowSearchContentsCommand.class) {
                        if (ShowSearchContentsCommandOuterClass$ShowSearchContentsCommand.b == null) {
                            ShowSearchContentsCommandOuterClass$ShowSearchContentsCommand.b = (ahbe)new agzb((agzi)ShowSearchContentsCommandOuterClass$ShowSearchContentsCommand.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return ShowSearchContentsCommandOuterClass$ShowSearchContentsCommand.a;
            }
            case 4: {
                return new agza((agzi)ShowSearchContentsCommandOuterClass$ShowSearchContentsCommand.a);
            }
            case 3: {
                return new ShowSearchContentsCommandOuterClass$ShowSearchContentsCommand();
            }
            case 2: {
                return newMessageInfo((MessageLite)ShowSearchContentsCommandOuterClass$ShowSearchContentsCommand.a, "\u0001\u0000", (Object[])null);
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
