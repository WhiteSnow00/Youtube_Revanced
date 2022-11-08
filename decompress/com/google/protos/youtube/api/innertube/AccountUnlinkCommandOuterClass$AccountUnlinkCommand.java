// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class AccountUnlinkCommandOuterClass$AccountUnlinkCommand extends agzi implements ahax
{
    public static final AccountUnlinkCommandOuterClass$AccountUnlinkCommand a;
    public static final agzg accountUnlinkCommand;
    private static volatile ahbe f;
    public int b;
    public aioe c;
    public aioe d;
    public String e;
    private aioe g;
    private byte h;
    
    static {
        final AccountUnlinkCommandOuterClass$AccountUnlinkCommand a2 = new AccountUnlinkCommandOuterClass$AccountUnlinkCommand();
        agzi.registerDefaultInstance((Class)AccountUnlinkCommandOuterClass$AccountUnlinkCommand.class, (agzi)(a = a2));
        accountUnlinkCommand = agzi.newSingularGeneratedExtension((MessageLite)aioe.a, (Object)a2, (MessageLite)a2, (agzn)null, 194259476, ahcm.k, (Class)AccountUnlinkCommandOuterClass$AccountUnlinkCommand.class);
    }
    
    private AccountUnlinkCommandOuterClass$AccountUnlinkCommand() {
        this.h = 2;
        this.e = "";
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
                final ahbe f;
                if ((f = AccountUnlinkCommandOuterClass$AccountUnlinkCommand.f) == null) {
                    synchronized (AccountUnlinkCommandOuterClass$AccountUnlinkCommand.class) {
                        if (AccountUnlinkCommandOuterClass$AccountUnlinkCommand.f == null) {
                            AccountUnlinkCommandOuterClass$AccountUnlinkCommand.f = (ahbe)new agzb((agzi)AccountUnlinkCommandOuterClass$AccountUnlinkCommand.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return AccountUnlinkCommandOuterClass$AccountUnlinkCommand.a;
            }
            case 4: {
                return new agza((agzi)AccountUnlinkCommandOuterClass$AccountUnlinkCommand.a);
            }
            case 3: {
                return new AccountUnlinkCommandOuterClass$AccountUnlinkCommand();
            }
            case 2: {
                return newMessageInfo((MessageLite)AccountUnlinkCommandOuterClass$AccountUnlinkCommand.a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0003\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1008\u0002\u0004\u1409\u0003", new Object[] { "b", "c", "d", "e", "g" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.h = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.h;
            }
        }
    }
}
