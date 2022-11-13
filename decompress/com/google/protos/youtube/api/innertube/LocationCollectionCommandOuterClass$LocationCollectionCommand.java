// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class LocationCollectionCommandOuterClass$LocationCollectionCommand extends ahbh implements ahcw
{
    public static final LocationCollectionCommandOuterClass$LocationCollectionCommand a;
    private static volatile ahdd e;
    public static final ahbf locationCollectionCommand;
    public int b;
    public aiqj c;
    public aiqj d;
    private aiqj f;
    private byte g;
    
    static {
        final LocationCollectionCommandOuterClass$LocationCollectionCommand a2 = new LocationCollectionCommandOuterClass$LocationCollectionCommand();
        ahbh.registerDefaultInstance((Class)LocationCollectionCommandOuterClass$LocationCollectionCommand.class, (ahbh)(a = a2));
        locationCollectionCommand = ahbh.newSingularGeneratedExtension((MessageLite)aiqj.a, (Object)a2, (MessageLite)a2, (ahbm)null, 395519548, ahek.k, (Class)LocationCollectionCommandOuterClass$LocationCollectionCommand.class);
    }
    
    private LocationCollectionCommandOuterClass$LocationCollectionCommand() {
        this.g = 2;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte g = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd e;
                if ((e = LocationCollectionCommandOuterClass$LocationCollectionCommand.e) == null) {
                    synchronized (LocationCollectionCommandOuterClass$LocationCollectionCommand.class) {
                        if (LocationCollectionCommandOuterClass$LocationCollectionCommand.e == null) {
                            LocationCollectionCommandOuterClass$LocationCollectionCommand.e = (ahdd)new ahba((ahbh)LocationCollectionCommandOuterClass$LocationCollectionCommand.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return LocationCollectionCommandOuterClass$LocationCollectionCommand.a;
            }
            case 4: {
                return new ahaz((ahbh)LocationCollectionCommandOuterClass$LocationCollectionCommand.a);
            }
            case 3: {
                return new LocationCollectionCommandOuterClass$LocationCollectionCommand();
            }
            case 2: {
                return newMessageInfo((MessageLite)LocationCollectionCommandOuterClass$LocationCollectionCommand.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0003\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0002", new Object[] { "b", "c", "f", "d" });
            }
            case 1: {
                if (o == null) {
                    g = 0;
                }
                this.g = g;
                return null;
            }
            case 0: {
                return this.g;
            }
        }
    }
}
