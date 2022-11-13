// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class TextMessageEndpointOuterClass$TextMessageEndpoint extends ahbh implements ahcw
{
    public static final TextMessageEndpointOuterClass$TextMessageEndpoint a;
    private static volatile ahdd d;
    public static final ahbf textMessageEndpoint;
    public String b;
    public ahbx c;
    private int e;
    private byte f;
    
    static {
        final TextMessageEndpointOuterClass$TextMessageEndpoint a2 = new TextMessageEndpointOuterClass$TextMessageEndpoint();
        ahbh.registerDefaultInstance((Class)TextMessageEndpointOuterClass$TextMessageEndpoint.class, (ahbh)(a = a2));
        textMessageEndpoint = ahbh.newSingularGeneratedExtension((MessageLite)aiqj.a, (Object)a2, (MessageLite)a2, (ahbm)null, 90566164, ahek.k, (Class)TextMessageEndpointOuterClass$TextMessageEndpoint.class);
    }
    
    private TextMessageEndpointOuterClass$TextMessageEndpoint() {
        this.f = 2;
        this.b = "";
        this.c = ahbh.emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
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
                final ahdd d;
                if ((d = TextMessageEndpointOuterClass$TextMessageEndpoint.d) == null) {
                    synchronized (TextMessageEndpointOuterClass$TextMessageEndpoint.class) {
                        if (TextMessageEndpointOuterClass$TextMessageEndpoint.d == null) {
                            TextMessageEndpointOuterClass$TextMessageEndpoint.d = (ahdd)new ahba((ahbh)TextMessageEndpointOuterClass$TextMessageEndpoint.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return TextMessageEndpointOuterClass$TextMessageEndpoint.a;
            }
            case 4: {
                return new ahaz((ahbh)TextMessageEndpointOuterClass$TextMessageEndpoint.a);
            }
            case 3: {
                return new TextMessageEndpointOuterClass$TextMessageEndpoint();
            }
            case 2: {
                return newMessageInfo((MessageLite)TextMessageEndpointOuterClass$TextMessageEndpoint.a, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0001\u0000\u0002\u1008\u0001\u0003\u001a", new Object[] { "e", "b", "c" });
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
