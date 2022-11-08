// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class SfvAudioSearchCommandOuterClass$SfvAudioSearchCommand extends agzi implements ahax
{
    public static final SfvAudioSearchCommandOuterClass$SfvAudioSearchCommand a;
    private static volatile ahbe h;
    public static final agzg sfvAudioSearchCommand;
    public int b;
    public String c;
    public String d;
    public String e;
    public akwm f;
    public boolean g;
    
    static {
        final SfvAudioSearchCommandOuterClass$SfvAudioSearchCommand a2 = new SfvAudioSearchCommandOuterClass$SfvAudioSearchCommand();
        agzi.registerDefaultInstance((Class)SfvAudioSearchCommandOuterClass$SfvAudioSearchCommand.class, (agzi)(a = a2));
        sfvAudioSearchCommand = agzi.newSingularGeneratedExtension((MessageLite)aioe.a, (Object)a2, (MessageLite)a2, (agzn)null, 321865519, ahcm.k, (Class)SfvAudioSearchCommandOuterClass$SfvAudioSearchCommand.class);
    }
    
    private SfvAudioSearchCommandOuterClass$SfvAudioSearchCommand() {
        this.c = "";
        this.d = "";
        this.e = "";
        this.g = true;
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe h;
                if ((h = SfvAudioSearchCommandOuterClass$SfvAudioSearchCommand.h) == null) {
                    synchronized (SfvAudioSearchCommandOuterClass$SfvAudioSearchCommand.class) {
                        if (SfvAudioSearchCommandOuterClass$SfvAudioSearchCommand.h == null) {
                            SfvAudioSearchCommandOuterClass$SfvAudioSearchCommand.h = (ahbe)new agzb((agzi)SfvAudioSearchCommandOuterClass$SfvAudioSearchCommand.a);
                        }
                    }
                }
                return h;
            }
            case 5: {
                return SfvAudioSearchCommandOuterClass$SfvAudioSearchCommand.a;
            }
            case 4: {
                return new agza((agzi)SfvAudioSearchCommandOuterClass$SfvAudioSearchCommand.a);
            }
            case 3: {
                return new SfvAudioSearchCommandOuterClass$SfvAudioSearchCommand();
            }
            case 2: {
                return newMessageInfo((MessageLite)SfvAudioSearchCommandOuterClass$SfvAudioSearchCommand.a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1008\u0001\u0003\u1008\u0002\u0004\u1009\u0003\u0005\u1007\u0004", new Object[] { "b", "c", "d", "e", "f", "g" });
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
