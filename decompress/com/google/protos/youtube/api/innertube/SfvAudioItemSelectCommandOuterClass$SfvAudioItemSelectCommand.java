// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class SfvAudioItemSelectCommandOuterClass$SfvAudioItemSelectCommand extends agzi implements ahax
{
    public static final SfvAudioItemSelectCommandOuterClass$SfvAudioItemSelectCommand a;
    private static volatile ahbe h;
    public static final agzg sfvAudioItemSelectCommand;
    public int b;
    public String c;
    public String d;
    public anzf e;
    public agzy f;
    public aioe g;
    private byte i;
    
    static {
        final SfvAudioItemSelectCommandOuterClass$SfvAudioItemSelectCommand a2 = new SfvAudioItemSelectCommandOuterClass$SfvAudioItemSelectCommand();
        agzi.registerDefaultInstance((Class)SfvAudioItemSelectCommandOuterClass$SfvAudioItemSelectCommand.class, (agzi)(a = a2));
        sfvAudioItemSelectCommand = agzi.newSingularGeneratedExtension((MessageLite)aioe.a, (Object)a2, (MessageLite)a2, (agzn)null, 313660028, ahcm.k, (Class)SfvAudioItemSelectCommandOuterClass$SfvAudioItemSelectCommand.class);
    }
    
    private SfvAudioItemSelectCommandOuterClass$SfvAudioItemSelectCommand() {
        this.i = 2;
        this.c = "";
        this.d = "";
        this.f = emptyProtobufList();
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
                if ((h = SfvAudioItemSelectCommandOuterClass$SfvAudioItemSelectCommand.h) == null) {
                    synchronized (SfvAudioItemSelectCommandOuterClass$SfvAudioItemSelectCommand.class) {
                        if (SfvAudioItemSelectCommandOuterClass$SfvAudioItemSelectCommand.h == null) {
                            SfvAudioItemSelectCommandOuterClass$SfvAudioItemSelectCommand.h = (ahbe)new agzb((agzi)SfvAudioItemSelectCommandOuterClass$SfvAudioItemSelectCommand.a);
                        }
                    }
                }
                return h;
            }
            case 5: {
                return SfvAudioItemSelectCommandOuterClass$SfvAudioItemSelectCommand.a;
            }
            case 4: {
                return new agza((agzi)SfvAudioItemSelectCommandOuterClass$SfvAudioItemSelectCommand.a);
            }
            case 3: {
                return new SfvAudioItemSelectCommandOuterClass$SfvAudioItemSelectCommand();
            }
            case 2: {
                return newMessageInfo((MessageLite)SfvAudioItemSelectCommandOuterClass$SfvAudioItemSelectCommand.a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0002\u0001\u1008\u0000\u0002\u1008\u0001\u0003\u1409\u0002\u0004\u001b\u0005\u1409\u0003", new Object[] { "b", "c", "d", "e", "f", anzg.class, "g" });
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
