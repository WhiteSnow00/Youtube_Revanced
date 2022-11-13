// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class PlayBillingCommandOuterClass$PlayBillingCommand extends ahbh implements ahcw
{
    public static final PlayBillingCommandOuterClass$PlayBillingCommand a;
    private static volatile ahdd j;
    public static final ahbf playBillingCommand;
    public int b;
    public ancd c;
    public ahab d;
    public aiqj e;
    public aiqj f;
    public aiqj g;
    public aiqj h;
    public String i;
    private byte k;
    
    static {
        final PlayBillingCommandOuterClass$PlayBillingCommand a2 = new PlayBillingCommandOuterClass$PlayBillingCommand();
        ahbh.registerDefaultInstance((Class)PlayBillingCommandOuterClass$PlayBillingCommand.class, (ahbh)(a = a2));
        playBillingCommand = ahbh.newSingularGeneratedExtension((MessageLite)aiqj.a, (Object)a2, (MessageLite)a2, (ahbm)null, 381321562, ahek.k, (Class)PlayBillingCommandOuterClass$PlayBillingCommand.class);
    }
    
    private PlayBillingCommandOuterClass$PlayBillingCommand() {
        this.k = 2;
        this.d = ahab.b;
        this.i = "";
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte k = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd j;
                if ((j = PlayBillingCommandOuterClass$PlayBillingCommand.j) == null) {
                    synchronized (PlayBillingCommandOuterClass$PlayBillingCommand.class) {
                        if (PlayBillingCommandOuterClass$PlayBillingCommand.j == null) {
                            PlayBillingCommandOuterClass$PlayBillingCommand.j = (ahdd)new ahba((ahbh)PlayBillingCommandOuterClass$PlayBillingCommand.a);
                        }
                    }
                }
                return j;
            }
            case 5: {
                return PlayBillingCommandOuterClass$PlayBillingCommand.a;
            }
            case 4: {
                return new ahaz((ahbh)PlayBillingCommandOuterClass$PlayBillingCommand.a);
            }
            case 3: {
                return new PlayBillingCommandOuterClass$PlayBillingCommand();
            }
            case 2: {
                return newMessageInfo((MessageLite)PlayBillingCommandOuterClass$PlayBillingCommand.a, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0004\u0001\u1009\u0000\u0002\u100a\u0001\u0003\u1409\u0002\u0004\u1409\u0003\u0005\u1409\u0004\u0006\u1409\u0005\u0007\u1008\u0006", new Object[] { "b", "c", "d", "e", "f", "g", "h", "i" });
            }
            case 1: {
                if (o == null) {
                    k = 0;
                }
                this.k = k;
                return null;
            }
            case 0: {
                return this.k;
            }
        }
    }
}
