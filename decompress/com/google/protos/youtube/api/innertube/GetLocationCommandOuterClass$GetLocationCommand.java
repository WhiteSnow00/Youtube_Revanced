// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class GetLocationCommandOuterClass$GetLocationCommand extends agzi implements ahax
{
    public static final GetLocationCommandOuterClass$GetLocationCommand a;
    private static volatile ahbe g;
    public static final agzg getLocationCommand;
    public int b;
    public aioe c;
    public aioe d;
    public aioe e;
    public aioe f;
    private aioe h;
    private byte i;
    
    static {
        final GetLocationCommandOuterClass$GetLocationCommand a2 = new GetLocationCommandOuterClass$GetLocationCommand();
        agzi.registerDefaultInstance((Class)GetLocationCommandOuterClass$GetLocationCommand.class, (agzi)(a = a2));
        getLocationCommand = agzi.newSingularGeneratedExtension((MessageLite)aioe.a, (Object)a2, (MessageLite)a2, (agzn)null, 324237090, ahcm.k, (Class)GetLocationCommandOuterClass$GetLocationCommand.class);
    }
    
    private GetLocationCommandOuterClass$GetLocationCommand() {
        this.i = 2;
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
                final ahbe g;
                if ((g = GetLocationCommandOuterClass$GetLocationCommand.g) == null) {
                    synchronized (GetLocationCommandOuterClass$GetLocationCommand.class) {
                        if (GetLocationCommandOuterClass$GetLocationCommand.g == null) {
                            GetLocationCommandOuterClass$GetLocationCommand.g = (ahbe)new agzb((agzi)GetLocationCommandOuterClass$GetLocationCommand.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return GetLocationCommandOuterClass$GetLocationCommand.a;
            }
            case 4: {
                return new agza((agzi)GetLocationCommandOuterClass$GetLocationCommand.a);
            }
            case 3: {
                return new GetLocationCommandOuterClass$GetLocationCommand();
            }
            case 2: {
                return newMessageInfo((MessageLite)GetLocationCommandOuterClass$GetLocationCommand.a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0005\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0002\u0004\u1409\u0003\u0005\u1409\u0004", new Object[] { "b", "c", "d", "e", "h", "f" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.i = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.i;
            }
        }
    }
}
