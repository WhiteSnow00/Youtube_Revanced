// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class RelatedChipEndpoint$RelatedChipCommand extends agzi implements ahax
{
    public static final RelatedChipEndpoint$RelatedChipCommand a;
    private static volatile ahbe f;
    public static final agzg relatedChipCommand;
    public int b;
    public int c;
    public Object d;
    public anss e;
    private byte g;
    
    static {
        final RelatedChipEndpoint$RelatedChipCommand a2 = new RelatedChipEndpoint$RelatedChipCommand();
        agzi.registerDefaultInstance((Class)RelatedChipEndpoint$RelatedChipCommand.class, (agzi)(a = a2));
        relatedChipCommand = agzi.newSingularGeneratedExtension((MessageLite)aioe.a, (Object)a2, (MessageLite)a2, (agzn)null, 189079648, ahcm.k, (Class)RelatedChipEndpoint$RelatedChipCommand.class);
    }
    
    private RelatedChipEndpoint$RelatedChipCommand() {
        this.c = 0;
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
                final ahbe f;
                if ((f = RelatedChipEndpoint$RelatedChipCommand.f) == null) {
                    synchronized (RelatedChipEndpoint$RelatedChipCommand.class) {
                        if (RelatedChipEndpoint$RelatedChipCommand.f == null) {
                            RelatedChipEndpoint$RelatedChipCommand.f = (ahbe)new agzb((agzi)RelatedChipEndpoint$RelatedChipCommand.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return RelatedChipEndpoint$RelatedChipCommand.a;
            }
            case 4: {
                return new agza((agzi)RelatedChipEndpoint$RelatedChipCommand.a);
            }
            case 3: {
                return new RelatedChipEndpoint$RelatedChipCommand();
            }
            case 2: {
                return newMessageInfo((MessageLite)RelatedChipEndpoint$RelatedChipCommand.a, "\u0001\u0003\u0001\u0001\u0001\u0004\u0003\u0000\u0000\u0002\u0001\u143c\u0000\u0003\u103a\u0000\u0004\u1409\u0003", new Object[] { "d", "c", "b", aiwb.class, "e" });
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
