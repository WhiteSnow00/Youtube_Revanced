// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class RotateToOptimalFullscreenOrientationCommandOuterClass$RotateToOptimalFullscreenOrientationCommand extends agzi implements ahax
{
    public static final RotateToOptimalFullscreenOrientationCommandOuterClass$RotateToOptimalFullscreenOrientationCommand a;
    private static volatile ahbe b;
    public static final agzg rotateToOptimalFullscreenOrientationCommand;
    
    static {
        final RotateToOptimalFullscreenOrientationCommandOuterClass$RotateToOptimalFullscreenOrientationCommand a2 = new RotateToOptimalFullscreenOrientationCommandOuterClass$RotateToOptimalFullscreenOrientationCommand();
        agzi.registerDefaultInstance((Class)RotateToOptimalFullscreenOrientationCommandOuterClass$RotateToOptimalFullscreenOrientationCommand.class, (agzi)(a = a2));
        rotateToOptimalFullscreenOrientationCommand = agzi.newSingularGeneratedExtension((MessageLite)aioe.a, (Object)a2, (MessageLite)a2, (agzn)null, 282384239, ahcm.k, (Class)RotateToOptimalFullscreenOrientationCommandOuterClass$RotateToOptimalFullscreenOrientationCommand.class);
    }
    
    private RotateToOptimalFullscreenOrientationCommandOuterClass$RotateToOptimalFullscreenOrientationCommand() {
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe b;
                if ((b = RotateToOptimalFullscreenOrientationCommandOuterClass$RotateToOptimalFullscreenOrientationCommand.b) == null) {
                    synchronized (RotateToOptimalFullscreenOrientationCommandOuterClass$RotateToOptimalFullscreenOrientationCommand.class) {
                        if (RotateToOptimalFullscreenOrientationCommandOuterClass$RotateToOptimalFullscreenOrientationCommand.b == null) {
                            RotateToOptimalFullscreenOrientationCommandOuterClass$RotateToOptimalFullscreenOrientationCommand.b = (ahbe)new agzb((agzi)RotateToOptimalFullscreenOrientationCommandOuterClass$RotateToOptimalFullscreenOrientationCommand.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return RotateToOptimalFullscreenOrientationCommandOuterClass$RotateToOptimalFullscreenOrientationCommand.a;
            }
            case 4: {
                return new agza((agzi)RotateToOptimalFullscreenOrientationCommandOuterClass$RotateToOptimalFullscreenOrientationCommand.a);
            }
            case 3: {
                return new RotateToOptimalFullscreenOrientationCommandOuterClass$RotateToOptimalFullscreenOrientationCommand();
            }
            case 2: {
                return newMessageInfo((MessageLite)RotateToOptimalFullscreenOrientationCommandOuterClass$RotateToOptimalFullscreenOrientationCommand.a, "\u0001\u0000", (Object[])null);
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
