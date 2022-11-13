// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class RunAttestationCommandOuterClass$RunAttestationCommand extends ahbh implements ahcw
{
    public static final RunAttestationCommandOuterClass$RunAttestationCommand a;
    private static volatile ahdd d;
    public static final ahbf runAttestationCommand;
    public ahbx b;
    public int c;
    private int e;
    
    static {
        final RunAttestationCommandOuterClass$RunAttestationCommand a2 = new RunAttestationCommandOuterClass$RunAttestationCommand();
        ahbh.registerDefaultInstance((Class)RunAttestationCommandOuterClass$RunAttestationCommand.class, (ahbh)(a = a2));
        runAttestationCommand = ahbh.newSingularGeneratedExtension((MessageLite)aiqj.a, (Object)a2, (MessageLite)a2, (ahbm)null, 272487492, ahek.k, (Class)RunAttestationCommandOuterClass$RunAttestationCommand.class);
    }
    
    private RunAttestationCommandOuterClass$RunAttestationCommand() {
        this.b = emptyProtobufList();
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd d;
                if ((d = RunAttestationCommandOuterClass$RunAttestationCommand.d) == null) {
                    synchronized (RunAttestationCommandOuterClass$RunAttestationCommand.class) {
                        if (RunAttestationCommandOuterClass$RunAttestationCommand.d == null) {
                            RunAttestationCommandOuterClass$RunAttestationCommand.d = (ahdd)new ahba((ahbh)RunAttestationCommandOuterClass$RunAttestationCommand.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return RunAttestationCommandOuterClass$RunAttestationCommand.a;
            }
            case 4: {
                return new ahaz((ahbh)RunAttestationCommandOuterClass$RunAttestationCommand.a);
            }
            case 3: {
                return new RunAttestationCommandOuterClass$RunAttestationCommand();
            }
            case 2: {
                return newMessageInfo((MessageLite)RunAttestationCommandOuterClass$RunAttestationCommand.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002\u100c\u0000", new Object[] { "e", "b", ahwa.class, "c", ahuc.g });
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
