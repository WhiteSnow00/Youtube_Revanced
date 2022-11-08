// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class BackstageImageUploadEndpointOuterClass$BackstageImageUploadEndpoint extends agzi implements ahax
{
    public static final BackstageImageUploadEndpointOuterClass$BackstageImageUploadEndpoint a;
    public static final agzg backstageImageUploadEndpoint;
    private static volatile ahbe k;
    public int b;
    public String c;
    public String d;
    public ahxc e;
    public ahwv f;
    public anss g;
    public aioe h;
    public boolean i;
    public anss j;
    private ajsq l;
    private ajsq m;
    private byte n;
    
    static {
        final BackstageImageUploadEndpointOuterClass$BackstageImageUploadEndpoint a2 = new BackstageImageUploadEndpointOuterClass$BackstageImageUploadEndpoint();
        agzi.registerDefaultInstance((Class)BackstageImageUploadEndpointOuterClass$BackstageImageUploadEndpoint.class, (agzi)(a = a2));
        backstageImageUploadEndpoint = agzi.newSingularGeneratedExtension((MessageLite)aioe.a, (Object)a2, (MessageLite)a2, (agzn)null, 125827176, ahcm.k, (Class)BackstageImageUploadEndpointOuterClass$BackstageImageUploadEndpoint.class);
    }
    
    private BackstageImageUploadEndpointOuterClass$BackstageImageUploadEndpoint() {
        this.n = 2;
        this.c = "";
        this.d = "";
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
                final ahbe k;
                if ((k = BackstageImageUploadEndpointOuterClass$BackstageImageUploadEndpoint.k) == null) {
                    synchronized (BackstageImageUploadEndpointOuterClass$BackstageImageUploadEndpoint.class) {
                        if (BackstageImageUploadEndpointOuterClass$BackstageImageUploadEndpoint.k == null) {
                            BackstageImageUploadEndpointOuterClass$BackstageImageUploadEndpoint.k = (ahbe)new agzb((agzi)BackstageImageUploadEndpointOuterClass$BackstageImageUploadEndpoint.a);
                        }
                    }
                }
                return k;
            }
            case 5: {
                return BackstageImageUploadEndpointOuterClass$BackstageImageUploadEndpoint.a;
            }
            case 4: {
                return new agza((agzi)BackstageImageUploadEndpointOuterClass$BackstageImageUploadEndpoint.a);
            }
            case 3: {
                return new BackstageImageUploadEndpointOuterClass$BackstageImageUploadEndpoint();
            }
            case 2: {
                return newMessageInfo((MessageLite)BackstageImageUploadEndpointOuterClass$BackstageImageUploadEndpoint.a, "\u0001\n\u0000\u0001\u0001\r\n\u0000\u0000\u0006\u0001\u1008\u0000\u0002\u1008\u0001\u0003\u1009\u0002\u0004\u1409\u0003\u0007\u1409\u0006\b\u1409\u0007\t\u1007\b\u000b\u1409\u000b\f\u1409\f\r\u1409\t", new Object[] { "b", "c", "d", "e", "f", "g", "h", "i", "l", "m", "j" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.n = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.n;
            }
        }
    }
}
