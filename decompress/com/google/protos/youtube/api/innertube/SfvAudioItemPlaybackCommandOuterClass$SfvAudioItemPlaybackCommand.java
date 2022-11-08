// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class SfvAudioItemPlaybackCommandOuterClass$SfvAudioItemPlaybackCommand extends agzi implements ahax
{
    public static final SfvAudioItemPlaybackCommandOuterClass$SfvAudioItemPlaybackCommand a;
    private static volatile ahbe h;
    public static final agzg sfvAudioItemPlaybackCommand;
    public int b;
    public String c;
    public String d;
    public agzy e;
    public aioe f;
    public String g;
    private byte i;
    
    static {
        final SfvAudioItemPlaybackCommandOuterClass$SfvAudioItemPlaybackCommand a2 = new SfvAudioItemPlaybackCommandOuterClass$SfvAudioItemPlaybackCommand();
        agzi.registerDefaultInstance((Class)SfvAudioItemPlaybackCommandOuterClass$SfvAudioItemPlaybackCommand.class, (agzi)(a = a2));
        sfvAudioItemPlaybackCommand = agzi.newSingularGeneratedExtension((MessageLite)aioe.a, (Object)a2, (MessageLite)a2, (agzn)null, 312722532, ahcm.k, (Class)SfvAudioItemPlaybackCommandOuterClass$SfvAudioItemPlaybackCommand.class);
    }
    
    private SfvAudioItemPlaybackCommandOuterClass$SfvAudioItemPlaybackCommand() {
        this.i = 2;
        this.c = "";
        this.d = "";
        this.e = emptyProtobufList();
        this.g = "";
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        final int ordinal = agzh.ordinal();
        boolean b = true;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe h;
                if ((h = SfvAudioItemPlaybackCommandOuterClass$SfvAudioItemPlaybackCommand.h) == null) {
                    synchronized (SfvAudioItemPlaybackCommandOuterClass$SfvAudioItemPlaybackCommand.class) {
                        if (SfvAudioItemPlaybackCommandOuterClass$SfvAudioItemPlaybackCommand.h == null) {
                            SfvAudioItemPlaybackCommandOuterClass$SfvAudioItemPlaybackCommand.h = (ahbe)new agzb((agzi)SfvAudioItemPlaybackCommandOuterClass$SfvAudioItemPlaybackCommand.a);
                        }
                    }
                }
                return h;
            }
            case 5: {
                return SfvAudioItemPlaybackCommandOuterClass$SfvAudioItemPlaybackCommand.a;
            }
            case 4: {
                return new agza((agzi)SfvAudioItemPlaybackCommandOuterClass$SfvAudioItemPlaybackCommand.a);
            }
            case 3: {
                return new SfvAudioItemPlaybackCommandOuterClass$SfvAudioItemPlaybackCommand();
            }
            case 2: {
                return newMessageInfo((MessageLite)SfvAudioItemPlaybackCommandOuterClass$SfvAudioItemPlaybackCommand.a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0001\u0001\u1008\u0000\u0002\u1008\u0001\u0003\u001b\u0004\u1409\u0002\u0005\u1008\u0003", new Object[] { "b", "c", "d", "e", anzd.class, "f", "g" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.i = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.i;
            }
        }
    }
}
