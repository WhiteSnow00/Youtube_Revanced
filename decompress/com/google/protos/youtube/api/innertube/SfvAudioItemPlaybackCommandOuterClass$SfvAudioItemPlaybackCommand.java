// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class SfvAudioItemPlaybackCommandOuterClass$SfvAudioItemPlaybackCommand extends ahbh implements ahcw
{
    public static final SfvAudioItemPlaybackCommandOuterClass$SfvAudioItemPlaybackCommand a;
    private static volatile ahdd h;
    public static final ahbf sfvAudioItemPlaybackCommand;
    public int b;
    public String c;
    public String d;
    public ahbx e;
    public aiqj f;
    public String g;
    private byte i;
    
    static {
        final SfvAudioItemPlaybackCommandOuterClass$SfvAudioItemPlaybackCommand a2 = new SfvAudioItemPlaybackCommandOuterClass$SfvAudioItemPlaybackCommand();
        ahbh.registerDefaultInstance((Class)SfvAudioItemPlaybackCommandOuterClass$SfvAudioItemPlaybackCommand.class, (ahbh)(a = a2));
        sfvAudioItemPlaybackCommand = ahbh.newSingularGeneratedExtension((MessageLite)aiqj.a, (Object)a2, (MessageLite)a2, (ahbm)null, 312722532, ahek.k, (Class)SfvAudioItemPlaybackCommandOuterClass$SfvAudioItemPlaybackCommand.class);
    }
    
    private SfvAudioItemPlaybackCommandOuterClass$SfvAudioItemPlaybackCommand() {
        this.i = 2;
        this.c = "";
        this.d = "";
        this.e = emptyProtobufList();
        this.g = "";
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte i = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd h;
                if ((h = SfvAudioItemPlaybackCommandOuterClass$SfvAudioItemPlaybackCommand.h) == null) {
                    synchronized (SfvAudioItemPlaybackCommandOuterClass$SfvAudioItemPlaybackCommand.class) {
                        if (SfvAudioItemPlaybackCommandOuterClass$SfvAudioItemPlaybackCommand.h == null) {
                            SfvAudioItemPlaybackCommandOuterClass$SfvAudioItemPlaybackCommand.h = (ahdd)new ahba((ahbh)SfvAudioItemPlaybackCommandOuterClass$SfvAudioItemPlaybackCommand.a);
                        }
                    }
                }
                return h;
            }
            case 5: {
                return SfvAudioItemPlaybackCommandOuterClass$SfvAudioItemPlaybackCommand.a;
            }
            case 4: {
                return new ahaz((ahbh)SfvAudioItemPlaybackCommandOuterClass$SfvAudioItemPlaybackCommand.a);
            }
            case 3: {
                return new SfvAudioItemPlaybackCommandOuterClass$SfvAudioItemPlaybackCommand();
            }
            case 2: {
                return newMessageInfo((MessageLite)SfvAudioItemPlaybackCommandOuterClass$SfvAudioItemPlaybackCommand.a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0001\u0001\u1008\u0000\u0002\u1008\u0001\u0003\u001b\u0004\u1409\u0002\u0005\u1008\u0003", new Object[] { "b", "c", "d", "e", aobg.class, "f", "g" });
            }
            case 1: {
                if (o == null) {
                    i = 0;
                }
                this.i = i;
                return null;
            }
            case 0: {
                return this.i;
            }
        }
    }
}
