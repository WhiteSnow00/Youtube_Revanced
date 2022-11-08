// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class NavigateBackCommandOuterClass$NavigateBackCommand extends agzi implements ahax
{
    public static final NavigateBackCommandOuterClass$NavigateBackCommand a;
    private static volatile ahbe b;
    public static final agzg navigateBackCommand;
    
    static {
        final NavigateBackCommandOuterClass$NavigateBackCommand a2 = new NavigateBackCommandOuterClass$NavigateBackCommand();
        agzi.registerDefaultInstance((Class)NavigateBackCommandOuterClass$NavigateBackCommand.class, (agzi)(a = a2));
        navigateBackCommand = agzi.newSingularGeneratedExtension((MessageLite)aioe.a, (Object)a2, (MessageLite)a2, (agzn)null, 368868921, ahcm.k, (Class)NavigateBackCommandOuterClass$NavigateBackCommand.class);
    }
    
    private NavigateBackCommandOuterClass$NavigateBackCommand() {
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe b;
                if ((b = NavigateBackCommandOuterClass$NavigateBackCommand.b) == null) {
                    synchronized (NavigateBackCommandOuterClass$NavigateBackCommand.class) {
                        if (NavigateBackCommandOuterClass$NavigateBackCommand.b == null) {
                            NavigateBackCommandOuterClass$NavigateBackCommand.b = (ahbe)new agzb((agzi)NavigateBackCommandOuterClass$NavigateBackCommand.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return NavigateBackCommandOuterClass$NavigateBackCommand.a;
            }
            case 4: {
                return new agza((agzi)NavigateBackCommandOuterClass$NavigateBackCommand.a);
            }
            case 3: {
                return new NavigateBackCommandOuterClass$NavigateBackCommand();
            }
            case 2: {
                return newMessageInfo((MessageLite)NavigateBackCommandOuterClass$NavigateBackCommand.a, "\u0001\u0000", (Object[])null);
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
