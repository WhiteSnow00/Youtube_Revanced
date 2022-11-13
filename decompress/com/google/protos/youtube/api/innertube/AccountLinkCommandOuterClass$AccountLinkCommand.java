// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class AccountLinkCommandOuterClass$AccountLinkCommand extends ahbh implements ahcw
{
    public static final AccountLinkCommandOuterClass$AccountLinkCommand a;
    public static final ahbf accountLinkCommand;
    private static volatile ahdd h;
    public int b;
    public aiqj c;
    public aiqj d;
    public String e;
    public ahbx f;
    public String g;
    private aiqj i;
    private byte j;
    
    static {
        final AccountLinkCommandOuterClass$AccountLinkCommand a2 = new AccountLinkCommandOuterClass$AccountLinkCommand();
        ahbh.registerDefaultInstance((Class)AccountLinkCommandOuterClass$AccountLinkCommand.class, (ahbh)(a = a2));
        accountLinkCommand = ahbh.newSingularGeneratedExtension((MessageLite)aiqj.a, (Object)a2, (MessageLite)a2, (ahbm)null, 194259413, ahek.k, (Class)AccountLinkCommandOuterClass$AccountLinkCommand.class);
    }
    
    private AccountLinkCommandOuterClass$AccountLinkCommand() {
        this.j = 2;
        this.e = "";
        this.f = ahbh.emptyProtobufList();
        this.g = "";
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte j = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd h;
                if ((h = AccountLinkCommandOuterClass$AccountLinkCommand.h) == null) {
                    synchronized (AccountLinkCommandOuterClass$AccountLinkCommand.class) {
                        if (AccountLinkCommandOuterClass$AccountLinkCommand.h == null) {
                            AccountLinkCommandOuterClass$AccountLinkCommand.h = (ahdd)new ahba((ahbh)AccountLinkCommandOuterClass$AccountLinkCommand.a);
                        }
                    }
                }
                return h;
            }
            case 5: {
                return AccountLinkCommandOuterClass$AccountLinkCommand.a;
            }
            case 4: {
                return new ahaz((ahbh)AccountLinkCommandOuterClass$AccountLinkCommand.a);
            }
            case 3: {
                return new AccountLinkCommandOuterClass$AccountLinkCommand();
            }
            case 2: {
                return newMessageInfo((MessageLite)AccountLinkCommandOuterClass$AccountLinkCommand.a, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0001\u0003\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1008\u0002\u0004\u1409\u0003\u0006\u001a\u0007\u1008\u0005", new Object[] { "b", "c", "d", "e", "i", "f", "g" });
            }
            case 1: {
                if (o == null) {
                    j = 0;
                }
                this.j = j;
                return null;
            }
            case 0: {
                return this.j;
            }
        }
    }
}
