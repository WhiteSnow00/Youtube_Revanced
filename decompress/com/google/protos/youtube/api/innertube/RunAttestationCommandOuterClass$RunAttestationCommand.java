// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class RunAttestationCommandOuterClass$RunAttestationCommand extends agzi implements ahax
{
    public static final RunAttestationCommandOuterClass$RunAttestationCommand a;
    private static volatile ahbe d;
    public static final agzg runAttestationCommand;
    public agzy b;
    public int c;
    private int e;
    
    static {
        final RunAttestationCommandOuterClass$RunAttestationCommand a2 = new RunAttestationCommandOuterClass$RunAttestationCommand();
        agzi.registerDefaultInstance((Class)RunAttestationCommandOuterClass$RunAttestationCommand.class, (agzi)(a = a2));
        runAttestationCommand = agzi.newSingularGeneratedExtension((MessageLite)aioe.a, (Object)a2, (MessageLite)a2, (agzn)null, 272487492, ahcm.k, (Class)RunAttestationCommandOuterClass$RunAttestationCommand.class);
    }
    
    private RunAttestationCommandOuterClass$RunAttestationCommand() {
        this.b = emptyProtobufList();
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe d;
                if ((d = RunAttestationCommandOuterClass$RunAttestationCommand.d) == null) {
                    synchronized (RunAttestationCommandOuterClass$RunAttestationCommand.class) {
                        if (RunAttestationCommandOuterClass$RunAttestationCommand.d == null) {
                            RunAttestationCommandOuterClass$RunAttestationCommand.d = (ahbe)new agzb((agzi)RunAttestationCommandOuterClass$RunAttestationCommand.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return RunAttestationCommandOuterClass$RunAttestationCommand.a;
            }
            case 4: {
                return new agza((agzi)RunAttestationCommandOuterClass$RunAttestationCommand.a);
            }
            case 3: {
                return new RunAttestationCommandOuterClass$RunAttestationCommand();
            }
            case 2: {
                return newMessageInfo((MessageLite)RunAttestationCommandOuterClass$RunAttestationCommand.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002\u100c\u0000", new Object[] { "e", "b", ahuc.class, "c", ahse.g });
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
