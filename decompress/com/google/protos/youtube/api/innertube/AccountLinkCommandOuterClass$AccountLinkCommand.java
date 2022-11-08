// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class AccountLinkCommandOuterClass$AccountLinkCommand extends agzi implements ahax
{
    public static final AccountLinkCommandOuterClass$AccountLinkCommand a;
    public static final agzg accountLinkCommand;
    private static volatile ahbe h;
    public int b;
    public aioe c;
    public aioe d;
    public String e;
    public agzy f;
    public String g;
    private aioe i;
    private byte j;
    
    static {
        final AccountLinkCommandOuterClass$AccountLinkCommand a2 = new AccountLinkCommandOuterClass$AccountLinkCommand();
        agzi.registerDefaultInstance((Class)AccountLinkCommandOuterClass$AccountLinkCommand.class, (agzi)(a = a2));
        accountLinkCommand = agzi.newSingularGeneratedExtension((MessageLite)aioe.a, (Object)a2, (MessageLite)a2, (agzn)null, 194259413, ahcm.k, (Class)AccountLinkCommandOuterClass$AccountLinkCommand.class);
    }
    
    private AccountLinkCommandOuterClass$AccountLinkCommand() {
        this.j = 2;
        this.e = "";
        this.f = agzi.emptyProtobufList();
        this.g = "";
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
                if ((h = AccountLinkCommandOuterClass$AccountLinkCommand.h) == null) {
                    synchronized (AccountLinkCommandOuterClass$AccountLinkCommand.class) {
                        if (AccountLinkCommandOuterClass$AccountLinkCommand.h == null) {
                            AccountLinkCommandOuterClass$AccountLinkCommand.h = (ahbe)new agzb((agzi)AccountLinkCommandOuterClass$AccountLinkCommand.a);
                        }
                    }
                }
                return h;
            }
            case 5: {
                return AccountLinkCommandOuterClass$AccountLinkCommand.a;
            }
            case 4: {
                return new agza((agzi)AccountLinkCommandOuterClass$AccountLinkCommand.a);
            }
            case 3: {
                return new AccountLinkCommandOuterClass$AccountLinkCommand();
            }
            case 2: {
                return newMessageInfo((MessageLite)AccountLinkCommandOuterClass$AccountLinkCommand.a, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0001\u0003\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1008\u0002\u0004\u1409\u0003\u0006\u001a\u0007\u1008\u0005", new Object[] { "b", "c", "d", "e", "i", "f", "g" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.j = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.j;
            }
        }
    }
}
