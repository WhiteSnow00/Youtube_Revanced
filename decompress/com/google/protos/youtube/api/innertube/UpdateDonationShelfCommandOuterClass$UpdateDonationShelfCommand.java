// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class UpdateDonationShelfCommandOuterClass$UpdateDonationShelfCommand extends ahbh implements ahcw
{
    public static final UpdateDonationShelfCommandOuterClass$UpdateDonationShelfCommand a;
    private static volatile ahdd c;
    public static final ahbf updateDonationShelfCommand;
    public anuv b;
    private int d;
    private anuv e;
    private byte f;
    
    static {
        final UpdateDonationShelfCommandOuterClass$UpdateDonationShelfCommand a2 = new UpdateDonationShelfCommandOuterClass$UpdateDonationShelfCommand();
        ahbh.registerDefaultInstance((Class)UpdateDonationShelfCommandOuterClass$UpdateDonationShelfCommand.class, (ahbh)(a = a2));
        updateDonationShelfCommand = ahbh.newSingularGeneratedExtension((MessageLite)aiqj.a, (Object)a2, (MessageLite)a2, (ahbm)null, 219123099, ahek.k, (Class)UpdateDonationShelfCommandOuterClass$UpdateDonationShelfCommand.class);
    }
    
    private UpdateDonationShelfCommandOuterClass$UpdateDonationShelfCommand() {
        this.f = 2;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte f = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd c;
                if ((c = UpdateDonationShelfCommandOuterClass$UpdateDonationShelfCommand.c) == null) {
                    synchronized (UpdateDonationShelfCommandOuterClass$UpdateDonationShelfCommand.class) {
                        if (UpdateDonationShelfCommandOuterClass$UpdateDonationShelfCommand.c == null) {
                            UpdateDonationShelfCommandOuterClass$UpdateDonationShelfCommand.c = (ahdd)new ahba((ahbh)UpdateDonationShelfCommandOuterClass$UpdateDonationShelfCommand.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return UpdateDonationShelfCommandOuterClass$UpdateDonationShelfCommand.a;
            }
            case 4: {
                return new ahaz((ahbh)UpdateDonationShelfCommandOuterClass$UpdateDonationShelfCommand.a);
            }
            case 3: {
                return new UpdateDonationShelfCommandOuterClass$UpdateDonationShelfCommand();
            }
            case 2: {
                return newMessageInfo((MessageLite)UpdateDonationShelfCommandOuterClass$UpdateDonationShelfCommand.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001\u1409\u0000\u0002\u1409\u0001", new Object[] { "d", "b", "e" });
            }
            case 1: {
                if (o == null) {
                    f = 0;
                }
                this.f = f;
                return null;
            }
            case 0: {
                return this.f;
            }
        }
    }
}
