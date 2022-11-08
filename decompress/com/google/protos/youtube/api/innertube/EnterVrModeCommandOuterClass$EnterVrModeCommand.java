// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class EnterVrModeCommandOuterClass$EnterVrModeCommand extends agzi implements ahax
{
    public static final EnterVrModeCommandOuterClass$EnterVrModeCommand a;
    private static volatile ahbe b;
    public static final agzg enterVrModeCommand;
    
    static {
        final EnterVrModeCommandOuterClass$EnterVrModeCommand a2 = new EnterVrModeCommandOuterClass$EnterVrModeCommand();
        agzi.registerDefaultInstance((Class)EnterVrModeCommandOuterClass$EnterVrModeCommand.class, (agzi)(a = a2));
        enterVrModeCommand = agzi.newSingularGeneratedExtension((MessageLite)aioe.a, (Object)a2, (MessageLite)a2, (agzn)null, 245319097, ahcm.k, (Class)EnterVrModeCommandOuterClass$EnterVrModeCommand.class);
    }
    
    private EnterVrModeCommandOuterClass$EnterVrModeCommand() {
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe b;
                if ((b = EnterVrModeCommandOuterClass$EnterVrModeCommand.b) == null) {
                    synchronized (EnterVrModeCommandOuterClass$EnterVrModeCommand.class) {
                        if (EnterVrModeCommandOuterClass$EnterVrModeCommand.b == null) {
                            EnterVrModeCommandOuterClass$EnterVrModeCommand.b = (ahbe)new agzb((agzi)EnterVrModeCommandOuterClass$EnterVrModeCommand.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return EnterVrModeCommandOuterClass$EnterVrModeCommand.a;
            }
            case 4: {
                return new agza((agzi)EnterVrModeCommandOuterClass$EnterVrModeCommand.a);
            }
            case 3: {
                return new EnterVrModeCommandOuterClass$EnterVrModeCommand();
            }
            case 2: {
                return newMessageInfo((MessageLite)EnterVrModeCommandOuterClass$EnterVrModeCommand.a, "\u0001\u0000", (Object[])null);
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
