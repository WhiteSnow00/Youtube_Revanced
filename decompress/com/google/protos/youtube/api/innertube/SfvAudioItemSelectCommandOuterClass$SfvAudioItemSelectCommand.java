// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class SfvAudioItemSelectCommandOuterClass$SfvAudioItemSelectCommand extends ahbh implements ahcw
{
    public static final SfvAudioItemSelectCommandOuterClass$SfvAudioItemSelectCommand a;
    private static volatile ahdd h;
    public static final ahbf sfvAudioItemSelectCommand;
    public int b;
    public String c;
    public String d;
    public aobi e;
    public ahbx f;
    public aiqj g;
    private byte i;
    
    static {
        final SfvAudioItemSelectCommandOuterClass$SfvAudioItemSelectCommand a2 = new SfvAudioItemSelectCommandOuterClass$SfvAudioItemSelectCommand();
        ahbh.registerDefaultInstance((Class)SfvAudioItemSelectCommandOuterClass$SfvAudioItemSelectCommand.class, (ahbh)(a = a2));
        sfvAudioItemSelectCommand = ahbh.newSingularGeneratedExtension((MessageLite)aiqj.a, (Object)a2, (MessageLite)a2, (ahbm)null, 313660028, ahek.k, (Class)SfvAudioItemSelectCommandOuterClass$SfvAudioItemSelectCommand.class);
    }
    
    private SfvAudioItemSelectCommandOuterClass$SfvAudioItemSelectCommand() {
        this.i = 2;
        this.c = "";
        this.d = "";
        this.f = emptyProtobufList();
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
                if ((h = SfvAudioItemSelectCommandOuterClass$SfvAudioItemSelectCommand.h) == null) {
                    synchronized (SfvAudioItemSelectCommandOuterClass$SfvAudioItemSelectCommand.class) {
                        if (SfvAudioItemSelectCommandOuterClass$SfvAudioItemSelectCommand.h == null) {
                            SfvAudioItemSelectCommandOuterClass$SfvAudioItemSelectCommand.h = (ahdd)new ahba((ahbh)SfvAudioItemSelectCommandOuterClass$SfvAudioItemSelectCommand.a);
                        }
                    }
                }
                return h;
            }
            case 5: {
                return SfvAudioItemSelectCommandOuterClass$SfvAudioItemSelectCommand.a;
            }
            case 4: {
                return new ahaz((ahbh)SfvAudioItemSelectCommandOuterClass$SfvAudioItemSelectCommand.a);
            }
            case 3: {
                return new SfvAudioItemSelectCommandOuterClass$SfvAudioItemSelectCommand();
            }
            case 2: {
                return newMessageInfo((MessageLite)SfvAudioItemSelectCommandOuterClass$SfvAudioItemSelectCommand.a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0002\u0001\u1008\u0000\u0002\u1008\u0001\u0003\u1409\u0002\u0004\u001b\u0005\u1409\u0003", new Object[] { "b", "c", "d", "e", "f", aobj.class, "g" });
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
