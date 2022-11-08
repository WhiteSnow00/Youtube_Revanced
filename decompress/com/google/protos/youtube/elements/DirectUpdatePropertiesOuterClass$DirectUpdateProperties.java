// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.elements;

import com.google.protobuf.MessageLite;

public final class DirectUpdatePropertiesOuterClass$DirectUpdateProperties extends agzi implements ahax
{
    public static final DirectUpdatePropertiesOuterClass$DirectUpdateProperties a;
    public static final agzg b;
    private static volatile ahbe c;
    private byte d;
    
    static {
        final DirectUpdatePropertiesOuterClass$DirectUpdateProperties a2 = new DirectUpdatePropertiesOuterClass$DirectUpdateProperties();
        agzi.registerDefaultInstance((Class)DirectUpdatePropertiesOuterClass$DirectUpdateProperties.class, (agzi)(a = a2));
        b = agzi.newSingularGeneratedExtension((MessageLite)aqek.a, (Object)a2, (MessageLite)a2, (agzn)null, 402418170, ahcm.k, (Class)DirectUpdatePropertiesOuterClass$DirectUpdateProperties.class);
    }
    
    private DirectUpdatePropertiesOuterClass$DirectUpdateProperties() {
        this.d = 2;
        emptyProtobufList();
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe c;
                if ((c = DirectUpdatePropertiesOuterClass$DirectUpdateProperties.c) == null) {
                    synchronized (DirectUpdatePropertiesOuterClass$DirectUpdateProperties.class) {
                        if (DirectUpdatePropertiesOuterClass$DirectUpdateProperties.c == null) {
                            DirectUpdatePropertiesOuterClass$DirectUpdateProperties.c = (ahbe)new agzb((agzi)DirectUpdatePropertiesOuterClass$DirectUpdateProperties.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return DirectUpdatePropertiesOuterClass$DirectUpdateProperties.a;
            }
            case 4: {
                return new agza((agzi)DirectUpdatePropertiesOuterClass$DirectUpdateProperties.a);
            }
            case 3: {
                return new DirectUpdatePropertiesOuterClass$DirectUpdateProperties();
            }
            case 2: {
                return newMessageInfo((MessageLite)DirectUpdatePropertiesOuterClass$DirectUpdateProperties.a, "\u0001\u0000", (Object[])null);
            }
            case 1: {
                this.d = (byte)((o != null) ? 1 : 0);
                return null;
            }
            case 0: {
                return this.d;
            }
        }
    }
}
