// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class RefreshConfigCommandOuterClass$RefreshConfigCommand extends agzi implements ahax
{
    public static final RefreshConfigCommandOuterClass$RefreshConfigCommand a;
    private static volatile ahbe b;
    public static final agzg refreshConfigCommand;
    
    static {
        final RefreshConfigCommandOuterClass$RefreshConfigCommand a2 = new RefreshConfigCommandOuterClass$RefreshConfigCommand();
        agzi.registerDefaultInstance((Class)RefreshConfigCommandOuterClass$RefreshConfigCommand.class, (agzi)(a = a2));
        refreshConfigCommand = agzi.newSingularGeneratedExtension((MessageLite)aioe.a, (Object)a2, (MessageLite)a2, (agzn)null, 191373512, ahcm.k, (Class)RefreshConfigCommandOuterClass$RefreshConfigCommand.class);
    }
    
    private RefreshConfigCommandOuterClass$RefreshConfigCommand() {
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe b;
                if ((b = RefreshConfigCommandOuterClass$RefreshConfigCommand.b) == null) {
                    synchronized (RefreshConfigCommandOuterClass$RefreshConfigCommand.class) {
                        if (RefreshConfigCommandOuterClass$RefreshConfigCommand.b == null) {
                            RefreshConfigCommandOuterClass$RefreshConfigCommand.b = (ahbe)new agzb((agzi)RefreshConfigCommandOuterClass$RefreshConfigCommand.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return RefreshConfigCommandOuterClass$RefreshConfigCommand.a;
            }
            case 4: {
                return new agza((agzi)RefreshConfigCommandOuterClass$RefreshConfigCommand.a);
            }
            case 3: {
                return new RefreshConfigCommandOuterClass$RefreshConfigCommand();
            }
            case 2: {
                return newMessageInfo((MessageLite)RefreshConfigCommandOuterClass$RefreshConfigCommand.a, "\u0001\u0000", (Object[])null);
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
