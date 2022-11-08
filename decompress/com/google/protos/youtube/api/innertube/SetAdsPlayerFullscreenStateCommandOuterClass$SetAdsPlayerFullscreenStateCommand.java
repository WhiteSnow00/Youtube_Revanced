// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class SetAdsPlayerFullscreenStateCommandOuterClass$SetAdsPlayerFullscreenStateCommand extends agzi implements ahax
{
    public static final SetAdsPlayerFullscreenStateCommandOuterClass$SetAdsPlayerFullscreenStateCommand a;
    private static volatile ahbe f;
    public static final agzg setAdsPlayerFullscreenStateCommand;
    public String b;
    public boolean c;
    public boolean d;
    public boolean e;
    private int g;
    
    static {
        final SetAdsPlayerFullscreenStateCommandOuterClass$SetAdsPlayerFullscreenStateCommand a2 = new SetAdsPlayerFullscreenStateCommandOuterClass$SetAdsPlayerFullscreenStateCommand();
        agzi.registerDefaultInstance((Class)SetAdsPlayerFullscreenStateCommandOuterClass$SetAdsPlayerFullscreenStateCommand.class, (agzi)(a = a2));
        setAdsPlayerFullscreenStateCommand = agzi.newSingularGeneratedExtension((MessageLite)aioe.a, (Object)a2, (MessageLite)a2, (agzn)null, 362581600, ahcm.k, (Class)SetAdsPlayerFullscreenStateCommandOuterClass$SetAdsPlayerFullscreenStateCommand.class);
    }
    
    private SetAdsPlayerFullscreenStateCommandOuterClass$SetAdsPlayerFullscreenStateCommand() {
        this.b = "";
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe f;
                if ((f = SetAdsPlayerFullscreenStateCommandOuterClass$SetAdsPlayerFullscreenStateCommand.f) == null) {
                    synchronized (SetAdsPlayerFullscreenStateCommandOuterClass$SetAdsPlayerFullscreenStateCommand.class) {
                        if (SetAdsPlayerFullscreenStateCommandOuterClass$SetAdsPlayerFullscreenStateCommand.f == null) {
                            SetAdsPlayerFullscreenStateCommandOuterClass$SetAdsPlayerFullscreenStateCommand.f = (ahbe)new agzb((agzi)SetAdsPlayerFullscreenStateCommandOuterClass$SetAdsPlayerFullscreenStateCommand.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return SetAdsPlayerFullscreenStateCommandOuterClass$SetAdsPlayerFullscreenStateCommand.a;
            }
            case 4: {
                return new agza((agzi)SetAdsPlayerFullscreenStateCommandOuterClass$SetAdsPlayerFullscreenStateCommand.a);
            }
            case 3: {
                return new SetAdsPlayerFullscreenStateCommandOuterClass$SetAdsPlayerFullscreenStateCommand();
            }
            case 2: {
                return newMessageInfo((MessageLite)SetAdsPlayerFullscreenStateCommandOuterClass$SetAdsPlayerFullscreenStateCommand.a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1007\u0001\u0003\u1007\u0002\u0004\u1007\u0003", new Object[] { "g", "b", "c", "d", "e" });
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
