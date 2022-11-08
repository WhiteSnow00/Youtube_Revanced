// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class LocationCollectionCommandOuterClass$LocationCollectionCommand extends agzi implements ahax
{
    public static final LocationCollectionCommandOuterClass$LocationCollectionCommand a;
    private static volatile ahbe e;
    public static final agzg locationCollectionCommand;
    public int b;
    public aioe c;
    public aioe d;
    private aioe f;
    private byte g;
    
    static {
        final LocationCollectionCommandOuterClass$LocationCollectionCommand a2 = new LocationCollectionCommandOuterClass$LocationCollectionCommand();
        agzi.registerDefaultInstance((Class)LocationCollectionCommandOuterClass$LocationCollectionCommand.class, (agzi)(a = a2));
        locationCollectionCommand = agzi.newSingularGeneratedExtension((MessageLite)aioe.a, (Object)a2, (MessageLite)a2, (agzn)null, 395519548, ahcm.k, (Class)LocationCollectionCommandOuterClass$LocationCollectionCommand.class);
    }
    
    private LocationCollectionCommandOuterClass$LocationCollectionCommand() {
        this.g = 2;
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
                final ahbe e;
                if ((e = LocationCollectionCommandOuterClass$LocationCollectionCommand.e) == null) {
                    synchronized (LocationCollectionCommandOuterClass$LocationCollectionCommand.class) {
                        if (LocationCollectionCommandOuterClass$LocationCollectionCommand.e == null) {
                            LocationCollectionCommandOuterClass$LocationCollectionCommand.e = (ahbe)new agzb((agzi)LocationCollectionCommandOuterClass$LocationCollectionCommand.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return LocationCollectionCommandOuterClass$LocationCollectionCommand.a;
            }
            case 4: {
                return new agza((agzi)LocationCollectionCommandOuterClass$LocationCollectionCommand.a);
            }
            case 3: {
                return new LocationCollectionCommandOuterClass$LocationCollectionCommand();
            }
            case 2: {
                return newMessageInfo((MessageLite)LocationCollectionCommandOuterClass$LocationCollectionCommand.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0003\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0002", new Object[] { "b", "c", "f", "d" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.g = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.g;
            }
        }
    }
}
