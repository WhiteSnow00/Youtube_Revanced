// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class AddGoogleAccountCommandOuterClass$AddGoogleAccountCommand extends agzi implements ahax
{
    public static final AddGoogleAccountCommandOuterClass$AddGoogleAccountCommand a;
    public static final agzg addGoogleAccountCommand;
    private static volatile ahbe b;
    
    static {
        final AddGoogleAccountCommandOuterClass$AddGoogleAccountCommand a2 = new AddGoogleAccountCommandOuterClass$AddGoogleAccountCommand();
        agzi.registerDefaultInstance((Class)AddGoogleAccountCommandOuterClass$AddGoogleAccountCommand.class, (agzi)(a = a2));
        addGoogleAccountCommand = agzi.newSingularGeneratedExtension((MessageLite)aioe.a, (Object)a2, (MessageLite)a2, (agzn)null, 393898374, ahcm.k, (Class)AddGoogleAccountCommandOuterClass$AddGoogleAccountCommand.class);
    }
    
    private AddGoogleAccountCommandOuterClass$AddGoogleAccountCommand() {
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe b;
                if ((b = AddGoogleAccountCommandOuterClass$AddGoogleAccountCommand.b) == null) {
                    synchronized (AddGoogleAccountCommandOuterClass$AddGoogleAccountCommand.class) {
                        if (AddGoogleAccountCommandOuterClass$AddGoogleAccountCommand.b == null) {
                            AddGoogleAccountCommandOuterClass$AddGoogleAccountCommand.b = (ahbe)new agzb((agzi)AddGoogleAccountCommandOuterClass$AddGoogleAccountCommand.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return AddGoogleAccountCommandOuterClass$AddGoogleAccountCommand.a;
            }
            case 4: {
                return new agza((agzi)AddGoogleAccountCommandOuterClass$AddGoogleAccountCommand.a);
            }
            case 3: {
                return new AddGoogleAccountCommandOuterClass$AddGoogleAccountCommand();
            }
            case 2: {
                return newMessageInfo((MessageLite)AddGoogleAccountCommandOuterClass$AddGoogleAccountCommand.a, "\u0001\u0000", (Object[])null);
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
