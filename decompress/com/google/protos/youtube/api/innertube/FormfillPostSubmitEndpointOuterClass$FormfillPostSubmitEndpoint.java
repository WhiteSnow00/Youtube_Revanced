// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class FormfillPostSubmitEndpointOuterClass$FormfillPostSubmitEndpoint extends agzi implements ahax
{
    public static final FormfillPostSubmitEndpointOuterClass$FormfillPostSubmitEndpoint a;
    private static volatile ahbe e;
    public static final agzg formfillPostSubmitEndpoint;
    public ahky b;
    public String c;
    public int d;
    private int f;
    
    static {
        final FormfillPostSubmitEndpointOuterClass$FormfillPostSubmitEndpoint a2 = new FormfillPostSubmitEndpointOuterClass$FormfillPostSubmitEndpoint();
        agzi.registerDefaultInstance((Class)FormfillPostSubmitEndpointOuterClass$FormfillPostSubmitEndpoint.class, (agzi)(a = a2));
        formfillPostSubmitEndpoint = agzi.newSingularGeneratedExtension((MessageLite)aioe.a, (Object)a2, (MessageLite)a2, (agzn)null, 160183255, ahcm.k, (Class)FormfillPostSubmitEndpointOuterClass$FormfillPostSubmitEndpoint.class);
    }
    
    private FormfillPostSubmitEndpointOuterClass$FormfillPostSubmitEndpoint() {
        this.c = "";
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe e;
                if ((e = FormfillPostSubmitEndpointOuterClass$FormfillPostSubmitEndpoint.e) == null) {
                    synchronized (FormfillPostSubmitEndpointOuterClass$FormfillPostSubmitEndpoint.class) {
                        if (FormfillPostSubmitEndpointOuterClass$FormfillPostSubmitEndpoint.e == null) {
                            FormfillPostSubmitEndpointOuterClass$FormfillPostSubmitEndpoint.e = (ahbe)new agzb((agzi)FormfillPostSubmitEndpointOuterClass$FormfillPostSubmitEndpoint.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return FormfillPostSubmitEndpointOuterClass$FormfillPostSubmitEndpoint.a;
            }
            case 4: {
                return new agza((agzi)FormfillPostSubmitEndpointOuterClass$FormfillPostSubmitEndpoint.a);
            }
            case 3: {
                return new FormfillPostSubmitEndpointOuterClass$FormfillPostSubmitEndpoint();
            }
            case 2: {
                return newMessageInfo((MessageLite)FormfillPostSubmitEndpointOuterClass$FormfillPostSubmitEndpoint.a, "\u0001\u0003\u0000\u0001\u0001\u0007\u0003\u0000\u0000\u0000\u0001\u1009\u0000\u0006\u1008\u0005\u0007\u100c\u0006", new Object[] { "f", "b", "c", "d", ajrv.p });
            }
            case 1: {
                return null;
            }
            case 0: {
                return 1;
            }
        }
    }
}
