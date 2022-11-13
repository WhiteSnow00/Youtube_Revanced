// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class AccountUnlinkCommandOuterClass$AccountUnlinkCommand extends ahbh implements ahcw
{
    public static final AccountUnlinkCommandOuterClass$AccountUnlinkCommand a;
    public static final ahbf accountUnlinkCommand;
    private static volatile ahdd f;
    public int b;
    public aiqj c;
    public aiqj d;
    public String e;
    private aiqj g;
    private byte h;
    
    static {
        final AccountUnlinkCommandOuterClass$AccountUnlinkCommand a2 = new AccountUnlinkCommandOuterClass$AccountUnlinkCommand();
        ahbh.registerDefaultInstance((Class)AccountUnlinkCommandOuterClass$AccountUnlinkCommand.class, (ahbh)(a = a2));
        accountUnlinkCommand = ahbh.newSingularGeneratedExtension((MessageLite)aiqj.a, (Object)a2, (MessageLite)a2, (ahbm)null, 194259476, ahek.k, (Class)AccountUnlinkCommandOuterClass$AccountUnlinkCommand.class);
    }
    
    private AccountUnlinkCommandOuterClass$AccountUnlinkCommand() {
        this.h = 2;
        this.e = "";
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte h = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd f;
                if ((f = AccountUnlinkCommandOuterClass$AccountUnlinkCommand.f) == null) {
                    synchronized (AccountUnlinkCommandOuterClass$AccountUnlinkCommand.class) {
                        if (AccountUnlinkCommandOuterClass$AccountUnlinkCommand.f == null) {
                            AccountUnlinkCommandOuterClass$AccountUnlinkCommand.f = (ahdd)new ahba((ahbh)AccountUnlinkCommandOuterClass$AccountUnlinkCommand.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return AccountUnlinkCommandOuterClass$AccountUnlinkCommand.a;
            }
            case 4: {
                return new ahaz((ahbh)AccountUnlinkCommandOuterClass$AccountUnlinkCommand.a);
            }
            case 3: {
                return new AccountUnlinkCommandOuterClass$AccountUnlinkCommand();
            }
            case 2: {
                return newMessageInfo((MessageLite)AccountUnlinkCommandOuterClass$AccountUnlinkCommand.a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0003\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1008\u0002\u0004\u1409\u0003", new Object[] { "b", "c", "d", "e", "g" });
            }
            case 1: {
                if (o == null) {
                    h = 0;
                }
                this.h = h;
                return null;
            }
            case 0: {
                return this.h;
            }
        }
    }
}
