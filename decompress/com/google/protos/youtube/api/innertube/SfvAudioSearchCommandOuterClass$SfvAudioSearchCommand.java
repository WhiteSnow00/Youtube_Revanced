// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class SfvAudioSearchCommandOuterClass$SfvAudioSearchCommand extends ahbh implements ahcw
{
    public static final SfvAudioSearchCommandOuterClass$SfvAudioSearchCommand a;
    private static volatile ahdd h;
    public static final ahbf sfvAudioSearchCommand;
    public int b;
    public String c;
    public String d;
    public String e;
    public akyp f;
    public boolean g;
    
    static {
        final SfvAudioSearchCommandOuterClass$SfvAudioSearchCommand a2 = new SfvAudioSearchCommandOuterClass$SfvAudioSearchCommand();
        ahbh.registerDefaultInstance((Class)SfvAudioSearchCommandOuterClass$SfvAudioSearchCommand.class, (ahbh)(a = a2));
        sfvAudioSearchCommand = ahbh.newSingularGeneratedExtension((MessageLite)aiqj.a, (Object)a2, (MessageLite)a2, (ahbm)null, 321865519, ahek.k, (Class)SfvAudioSearchCommandOuterClass$SfvAudioSearchCommand.class);
    }
    
    private SfvAudioSearchCommandOuterClass$SfvAudioSearchCommand() {
        this.c = "";
        this.d = "";
        this.e = "";
        this.g = true;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd h;
                if ((h = SfvAudioSearchCommandOuterClass$SfvAudioSearchCommand.h) == null) {
                    synchronized (SfvAudioSearchCommandOuterClass$SfvAudioSearchCommand.class) {
                        if (SfvAudioSearchCommandOuterClass$SfvAudioSearchCommand.h == null) {
                            SfvAudioSearchCommandOuterClass$SfvAudioSearchCommand.h = (ahdd)new ahba((ahbh)SfvAudioSearchCommandOuterClass$SfvAudioSearchCommand.a);
                        }
                    }
                }
                return h;
            }
            case 5: {
                return SfvAudioSearchCommandOuterClass$SfvAudioSearchCommand.a;
            }
            case 4: {
                return new ahaz((ahbh)SfvAudioSearchCommandOuterClass$SfvAudioSearchCommand.a);
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
