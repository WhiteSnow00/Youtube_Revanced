// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class SetPlayerControlsOverlayVisibilityCommandOuterClass$SetPlayerControlsOverlayVisibilityCommand extends agzi implements ahax
{
    public static final SetPlayerControlsOverlayVisibilityCommandOuterClass$SetPlayerControlsOverlayVisibilityCommand a;
    private static volatile ahbe d;
    public static final agzg setPlayerControlsOverlayVisibilityCommand;
    public int b;
    public boolean c;
    
    static {
        final SetPlayerControlsOverlayVisibilityCommandOuterClass$SetPlayerControlsOverlayVisibilityCommand a2 = new SetPlayerControlsOverlayVisibilityCommandOuterClass$SetPlayerControlsOverlayVisibilityCommand();
        agzi.registerDefaultInstance((Class)SetPlayerControlsOverlayVisibilityCommandOuterClass$SetPlayerControlsOverlayVisibilityCommand.class, (agzi)(a = a2));
        setPlayerControlsOverlayVisibilityCommand = agzi.newSingularGeneratedExtension((MessageLite)aioe.a, (Object)a2, (MessageLite)a2, (agzn)null, 344144775, ahcm.k, (Class)SetPlayerControlsOverlayVisibilityCommandOuterClass$SetPlayerControlsOverlayVisibilityCommand.class);
    }
    
    private SetPlayerControlsOverlayVisibilityCommandOuterClass$SetPlayerControlsOverlayVisibilityCommand() {
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe d;
                if ((d = SetPlayerControlsOverlayVisibilityCommandOuterClass$SetPlayerControlsOverlayVisibilityCommand.d) == null) {
                    synchronized (SetPlayerControlsOverlayVisibilityCommandOuterClass$SetPlayerControlsOverlayVisibilityCommand.class) {
                        if (SetPlayerControlsOverlayVisibilityCommandOuterClass$SetPlayerControlsOverlayVisibilityCommand.d == null) {
                            SetPlayerControlsOverlayVisibilityCommandOuterClass$SetPlayerControlsOverlayVisibilityCommand.d = (ahbe)new agzb((agzi)SetPlayerControlsOverlayVisibilityCommandOuterClass$SetPlayerControlsOverlayVisibilityCommand.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return SetPlayerControlsOverlayVisibilityCommandOuterClass$SetPlayerControlsOverlayVisibilityCommand.a;
            }
            case 4: {
                return new agza((agzi)SetPlayerControlsOverlayVisibilityCommandOuterClass$SetPlayerControlsOverlayVisibilityCommand.a);
            }
            case 3: {
                return new SetPlayerControlsOverlayVisibilityCommandOuterClass$SetPlayerControlsOverlayVisibilityCommand();
            }
            case 2: {
                return newMessageInfo((MessageLite)SetPlayerControlsOverlayVisibilityCommandOuterClass$SetPlayerControlsOverlayVisibilityCommand.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1007\u0000", new Object[] { "b", "c" });
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
