// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class EnableAutoplayCommandOuterClass$EnableAutoplayCommand extends agzi implements ahax
{
    public static final EnableAutoplayCommandOuterClass$EnableAutoplayCommand a;
    private static volatile ahbe b;
    public static final agzg enableAutoplayCommand;
    
    static {
        final EnableAutoplayCommandOuterClass$EnableAutoplayCommand a2 = new EnableAutoplayCommandOuterClass$EnableAutoplayCommand();
        agzi.registerDefaultInstance((Class)EnableAutoplayCommandOuterClass$EnableAutoplayCommand.class, (agzi)(a = a2));
        enableAutoplayCommand = agzi.newSingularGeneratedExtension((MessageLite)aioe.a, (Object)a2, (MessageLite)a2, (agzn)null, 251724126, ahcm.k, (Class)EnableAutoplayCommandOuterClass$EnableAutoplayCommand.class);
    }
    
    private EnableAutoplayCommandOuterClass$EnableAutoplayCommand() {
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe b;
                if ((b = EnableAutoplayCommandOuterClass$EnableAutoplayCommand.b) == null) {
                    synchronized (EnableAutoplayCommandOuterClass$EnableAutoplayCommand.class) {
                        if (EnableAutoplayCommandOuterClass$EnableAutoplayCommand.b == null) {
                            EnableAutoplayCommandOuterClass$EnableAutoplayCommand.b = (ahbe)new agzb((agzi)EnableAutoplayCommandOuterClass$EnableAutoplayCommand.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return EnableAutoplayCommandOuterClass$EnableAutoplayCommand.a;
            }
            case 4: {
                return new agza((agzi)EnableAutoplayCommandOuterClass$EnableAutoplayCommand.a);
            }
            case 3: {
                return new EnableAutoplayCommandOuterClass$EnableAutoplayCommand();
            }
            case 2: {
                return newMessageInfo((MessageLite)EnableAutoplayCommandOuterClass$EnableAutoplayCommand.a, "\u0001\u0000", (Object[])null);
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
