// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class GamingAccountLinkSettingCommandOuterClass$GamingAccountLinkSettingCommand extends agzi implements ahax
{
    public static final GamingAccountLinkSettingCommandOuterClass$GamingAccountLinkSettingCommand a;
    private static volatile ahbe d;
    public static final agzg gamingAccountLinkSettingCommand;
    public int b;
    public anss c;
    private byte e;
    
    static {
        final GamingAccountLinkSettingCommandOuterClass$GamingAccountLinkSettingCommand a2 = new GamingAccountLinkSettingCommandOuterClass$GamingAccountLinkSettingCommand();
        agzi.registerDefaultInstance((Class)GamingAccountLinkSettingCommandOuterClass$GamingAccountLinkSettingCommand.class, (agzi)(a = a2));
        gamingAccountLinkSettingCommand = agzi.newSingularGeneratedExtension((MessageLite)aioe.a, (Object)a2, (MessageLite)a2, (agzn)null, 194162732, ahcm.k, (Class)GamingAccountLinkSettingCommandOuterClass$GamingAccountLinkSettingCommand.class);
    }
    
    private GamingAccountLinkSettingCommandOuterClass$GamingAccountLinkSettingCommand() {
        this.e = 2;
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
                final ahbe d;
                if ((d = GamingAccountLinkSettingCommandOuterClass$GamingAccountLinkSettingCommand.d) == null) {
                    synchronized (GamingAccountLinkSettingCommandOuterClass$GamingAccountLinkSettingCommand.class) {
                        if (GamingAccountLinkSettingCommandOuterClass$GamingAccountLinkSettingCommand.d == null) {
                            GamingAccountLinkSettingCommandOuterClass$GamingAccountLinkSettingCommand.d = (ahbe)new agzb((agzi)GamingAccountLinkSettingCommandOuterClass$GamingAccountLinkSettingCommand.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return GamingAccountLinkSettingCommandOuterClass$GamingAccountLinkSettingCommand.a;
            }
            case 4: {
                return new agza((agzi)GamingAccountLinkSettingCommandOuterClass$GamingAccountLinkSettingCommand.a);
            }
            case 3: {
                return new GamingAccountLinkSettingCommandOuterClass$GamingAccountLinkSettingCommand();
            }
            case 2: {
                return newMessageInfo((MessageLite)GamingAccountLinkSettingCommandOuterClass$GamingAccountLinkSettingCommand.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u1409\u0000", new Object[] { "b", "c" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.e = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.e;
            }
        }
    }
}
