// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class PlayBillingCrossSellCommandOuterClass$PlayBillingCrossSellCommand extends ahbh implements ahcw
{
    public static final PlayBillingCrossSellCommandOuterClass$PlayBillingCrossSellCommand a;
    private static volatile ahdd k;
    public static final ahbf playBillingCrossSellCommand;
    public int b;
    public String c;
    public String d;
    public aiqj e;
    public aiqj f;
    public String g;
    public String h;
    public String i;
    public aiqj j;
    private byte l;
    
    static {
        final PlayBillingCrossSellCommandOuterClass$PlayBillingCrossSellCommand a2 = new PlayBillingCrossSellCommandOuterClass$PlayBillingCrossSellCommand();
        ahbh.registerDefaultInstance((Class)PlayBillingCrossSellCommandOuterClass$PlayBillingCrossSellCommand.class, (ahbh)(a = a2));
        playBillingCrossSellCommand = ahbh.newSingularGeneratedExtension((MessageLite)aiqj.a, (Object)a2, (MessageLite)a2, (ahbm)null, 432944950, ahek.k, (Class)PlayBillingCrossSellCommandOuterClass$PlayBillingCrossSellCommand.class);
    }
    
    private PlayBillingCrossSellCommandOuterClass$PlayBillingCrossSellCommand() {
        this.l = 2;
        this.c = "";
        this.d = "";
        this.g = "";
        this.h = "";
        this.i = "";
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte l = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd k;
                if ((k = PlayBillingCrossSellCommandOuterClass$PlayBillingCrossSellCommand.k) == null) {
                    synchronized (PlayBillingCrossSellCommandOuterClass$PlayBillingCrossSellCommand.class) {
                        if (PlayBillingCrossSellCommandOuterClass$PlayBillingCrossSellCommand.k == null) {
                            PlayBillingCrossSellCommandOuterClass$PlayBillingCrossSellCommand.k = (ahdd)new ahba((ahbh)PlayBillingCrossSellCommandOuterClass$PlayBillingCrossSellCommand.a);
                        }
                    }
                }
                return k;
            }
            case 5: {
                return PlayBillingCrossSellCommandOuterClass$PlayBillingCrossSellCommand.a;
            }
            case 4: {
                return new ahaz((ahbh)PlayBillingCrossSellCommandOuterClass$PlayBillingCrossSellCommand.a);
            }
            case 3: {
                return new PlayBillingCrossSellCommandOuterClass$PlayBillingCrossSellCommand();
            }
            case 2: {
                return newMessageInfo((MessageLite)PlayBillingCrossSellCommandOuterClass$PlayBillingCrossSellCommand.a, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0003\u0001\u1008\u0000\u0002\u1008\u0001\u0003\u1409\u0002\u0004\u1409\u0003\u0005\u1008\u0004\u0006\u1008\u0005\u0007\u1008\u0006\b\u1409\u0007", new Object[] { "b", "c", "d", "e", "f", "g", "h", "i", "j" });
            }
            case 1: {
                if (o == null) {
                    l = 0;
                }
                this.l = l;
                return null;
            }
            case 0: {
                return this.l;
            }
        }
    }
}
