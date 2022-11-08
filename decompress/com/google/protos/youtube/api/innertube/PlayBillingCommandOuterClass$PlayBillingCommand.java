// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class PlayBillingCommandOuterClass$PlayBillingCommand extends agzi implements ahax
{
    public static final PlayBillingCommandOuterClass$PlayBillingCommand a;
    private static volatile ahbe j;
    public static final agzg playBillingCommand;
    public int b;
    public amzz c;
    public agyc d;
    public aioe e;
    public aioe f;
    public aioe g;
    public aioe h;
    public String i;
    private byte k;
    
    static {
        final PlayBillingCommandOuterClass$PlayBillingCommand a2 = new PlayBillingCommandOuterClass$PlayBillingCommand();
        agzi.registerDefaultInstance((Class)PlayBillingCommandOuterClass$PlayBillingCommand.class, (agzi)(a = a2));
        playBillingCommand = agzi.newSingularGeneratedExtension((MessageLite)aioe.a, (Object)a2, (MessageLite)a2, (agzn)null, 381321562, ahcm.k, (Class)PlayBillingCommandOuterClass$PlayBillingCommand.class);
    }
    
    private PlayBillingCommandOuterClass$PlayBillingCommand() {
        this.k = 2;
        this.d = agyc.b;
        this.i = "";
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
                final ahbe j;
                if ((j = PlayBillingCommandOuterClass$PlayBillingCommand.j) == null) {
                    synchronized (PlayBillingCommandOuterClass$PlayBillingCommand.class) {
                        if (PlayBillingCommandOuterClass$PlayBillingCommand.j == null) {
                            PlayBillingCommandOuterClass$PlayBillingCommand.j = (ahbe)new agzb((agzi)PlayBillingCommandOuterClass$PlayBillingCommand.a);
                        }
                    }
                }
                return j;
            }
            case 5: {
                return PlayBillingCommandOuterClass$PlayBillingCommand.a;
            }
            case 4: {
                return new agza((agzi)PlayBillingCommandOuterClass$PlayBillingCommand.a);
            }
            case 3: {
                return new PlayBillingCommandOuterClass$PlayBillingCommand();
            }
            case 2: {
                return newMessageInfo((MessageLite)PlayBillingCommandOuterClass$PlayBillingCommand.a, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0004\u0001\u1009\u0000\u0002\u100a\u0001\u0003\u1409\u0002\u0004\u1409\u0003\u0005\u1409\u0004\u0006\u1409\u0005\u0007\u1008\u0006", new Object[] { "b", "c", "d", "e", "f", "g", "h", "i" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.k = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.k;
            }
        }
    }
}
