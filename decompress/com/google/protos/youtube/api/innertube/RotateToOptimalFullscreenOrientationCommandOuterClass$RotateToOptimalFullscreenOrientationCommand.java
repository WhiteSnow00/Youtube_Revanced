// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class RotateToOptimalFullscreenOrientationCommandOuterClass$RotateToOptimalFullscreenOrientationCommand extends ahbh implements ahcw
{
    public static final RotateToOptimalFullscreenOrientationCommandOuterClass$RotateToOptimalFullscreenOrientationCommand a;
    private static volatile ahdd b;
    public static final ahbf rotateToOptimalFullscreenOrientationCommand;
    
    static {
        final RotateToOptimalFullscreenOrientationCommandOuterClass$RotateToOptimalFullscreenOrientationCommand a2 = new RotateToOptimalFullscreenOrientationCommandOuterClass$RotateToOptimalFullscreenOrientationCommand();
        ahbh.registerDefaultInstance((Class)RotateToOptimalFullscreenOrientationCommandOuterClass$RotateToOptimalFullscreenOrientationCommand.class, (ahbh)(a = a2));
        rotateToOptimalFullscreenOrientationCommand = ahbh.newSingularGeneratedExtension((MessageLite)aiqj.a, (Object)a2, (MessageLite)a2, (ahbm)null, 282384239, ahek.k, (Class)RotateToOptimalFullscreenOrientationCommandOuterClass$RotateToOptimalFullscreenOrientationCommand.class);
    }
    
    private RotateToOptimalFullscreenOrientationCommandOuterClass$RotateToOptimalFullscreenOrientationCommand() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd b;
                if ((b = RotateToOptimalFullscreenOrientationCommandOuterClass$RotateToOptimalFullscreenOrientationCommand.b) == null) {
                    synchronized (RotateToOptimalFullscreenOrientationCommandOuterClass$RotateToOptimalFullscreenOrientationCommand.class) {
                        if (RotateToOptimalFullscreenOrientationCommandOuterClass$RotateToOptimalFullscreenOrientationCommand.b == null) {
                            RotateToOptimalFullscreenOrientationCommandOuterClass$RotateToOptimalFullscreenOrientationCommand.b = (ahdd)new ahba((ahbh)RotateToOptimalFullscreenOrientationCommandOuterClass$RotateToOptimalFullscreenOrientationCommand.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return RotateToOptimalFullscreenOrientationCommandOuterClass$RotateToOptimalFullscreenOrientationCommand.a;
            }
            case 4: {
                return new ahaz((ahbh)RotateToOptimalFullscreenOrientationCommandOuterClass$RotateToOptimalFullscreenOrientationCommand.a);
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
