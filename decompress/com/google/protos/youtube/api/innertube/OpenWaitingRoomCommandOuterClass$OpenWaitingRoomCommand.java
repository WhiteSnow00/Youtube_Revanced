// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class OpenWaitingRoomCommandOuterClass$OpenWaitingRoomCommand extends ahbh implements ahcw
{
    public static final OpenWaitingRoomCommandOuterClass$OpenWaitingRoomCommand a;
    private static volatile ahdd d;
    public static final ahbf openWaitingRoomCommand;
    public int b;
    public aiqj c;
    private byte e;
    
    static {
        final OpenWaitingRoomCommandOuterClass$OpenWaitingRoomCommand a2 = new OpenWaitingRoomCommandOuterClass$OpenWaitingRoomCommand();
        ahbh.registerDefaultInstance((Class)OpenWaitingRoomCommandOuterClass$OpenWaitingRoomCommand.class, (ahbh)(a = a2));
        openWaitingRoomCommand = ahbh.newSingularGeneratedExtension((MessageLite)aiqj.a, (Object)a2, (MessageLite)a2, (ahbm)null, 439964451, ahek.k, (Class)OpenWaitingRoomCommandOuterClass$OpenWaitingRoomCommand.class);
    }
    
    private OpenWaitingRoomCommandOuterClass$OpenWaitingRoomCommand() {
        this.e = 2;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte e = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd d;
                if ((d = OpenWaitingRoomCommandOuterClass$OpenWaitingRoomCommand.d) == null) {
                    synchronized (OpenWaitingRoomCommandOuterClass$OpenWaitingRoomCommand.class) {
                        if (OpenWaitingRoomCommandOuterClass$OpenWaitingRoomCommand.d == null) {
                            OpenWaitingRoomCommandOuterClass$OpenWaitingRoomCommand.d = (ahdd)new ahba((ahbh)OpenWaitingRoomCommandOuterClass$OpenWaitingRoomCommand.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return OpenWaitingRoomCommandOuterClass$OpenWaitingRoomCommand.a;
            }
            case 4: {
                return new ahaz((ahbh)OpenWaitingRoomCommandOuterClass$OpenWaitingRoomCommand.a);
            }
            case 3: {
                return new OpenWaitingRoomCommandOuterClass$OpenWaitingRoomCommand();
            }
            case 2: {
                return newMessageInfo((MessageLite)OpenWaitingRoomCommandOuterClass$OpenWaitingRoomCommand.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u1409\u0000", new Object[] { "b", "c" });
            }
            case 1: {
                if (o == null) {
                    e = 0;
                }
                this.e = e;
                return null;
            }
            case 0: {
                return this.e;
            }
        }
    }
}
