// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class OpenWaitingRoomCommandOuterClass$OpenWaitingRoomCommand extends agzi implements ahax
{
    public static final OpenWaitingRoomCommandOuterClass$OpenWaitingRoomCommand a;
    private static volatile ahbe d;
    public static final agzg openWaitingRoomCommand;
    public int b;
    public aioe c;
    private byte e;
    
    static {
        final OpenWaitingRoomCommandOuterClass$OpenWaitingRoomCommand a2 = new OpenWaitingRoomCommandOuterClass$OpenWaitingRoomCommand();
        agzi.registerDefaultInstance((Class)OpenWaitingRoomCommandOuterClass$OpenWaitingRoomCommand.class, (agzi)(a = a2));
        openWaitingRoomCommand = agzi.newSingularGeneratedExtension((MessageLite)aioe.a, (Object)a2, (MessageLite)a2, (agzn)null, 439964451, ahcm.k, (Class)OpenWaitingRoomCommandOuterClass$OpenWaitingRoomCommand.class);
    }
    
    private OpenWaitingRoomCommandOuterClass$OpenWaitingRoomCommand() {
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
                if ((d = OpenWaitingRoomCommandOuterClass$OpenWaitingRoomCommand.d) == null) {
                    synchronized (OpenWaitingRoomCommandOuterClass$OpenWaitingRoomCommand.class) {
                        if (OpenWaitingRoomCommandOuterClass$OpenWaitingRoomCommand.d == null) {
                            OpenWaitingRoomCommandOuterClass$OpenWaitingRoomCommand.d = (ahbe)new agzb((agzi)OpenWaitingRoomCommandOuterClass$OpenWaitingRoomCommand.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return OpenWaitingRoomCommandOuterClass$OpenWaitingRoomCommand.a;
            }
            case 4: {
                return new agza((agzi)OpenWaitingRoomCommandOuterClass$OpenWaitingRoomCommand.a);
            }
            case 3: {
                return new OpenWaitingRoomCommandOuterClass$OpenWaitingRoomCommand();
            }
            case 2: {
                return newMessageInfo((MessageLite)OpenWaitingRoomCommandOuterClass$OpenWaitingRoomCommand.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u1409\u0000", new Object[] { "b", "c" });
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
