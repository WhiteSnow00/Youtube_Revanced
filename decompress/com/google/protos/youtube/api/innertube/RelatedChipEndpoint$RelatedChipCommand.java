// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class RelatedChipEndpoint$RelatedChipCommand extends ahbh implements ahcw
{
    public static final RelatedChipEndpoint$RelatedChipCommand a;
    private static volatile ahdd f;
    public static final ahbf relatedChipCommand;
    public int b;
    public int c;
    public Object d;
    public anuv e;
    private byte g;
    
    static {
        final RelatedChipEndpoint$RelatedChipCommand a2 = new RelatedChipEndpoint$RelatedChipCommand();
        ahbh.registerDefaultInstance((Class)RelatedChipEndpoint$RelatedChipCommand.class, (ahbh)(a = a2));
        relatedChipCommand = ahbh.newSingularGeneratedExtension((MessageLite)aiqj.a, (Object)a2, (MessageLite)a2, (ahbm)null, 189079648, ahek.k, (Class)RelatedChipEndpoint$RelatedChipCommand.class);
    }
    
    private RelatedChipEndpoint$RelatedChipCommand() {
        this.c = 0;
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
                final ahdd f;
                if ((f = RelatedChipEndpoint$RelatedChipCommand.f) == null) {
                    synchronized (RelatedChipEndpoint$RelatedChipCommand.class) {
                        if (RelatedChipEndpoint$RelatedChipCommand.f == null) {
                            RelatedChipEndpoint$RelatedChipCommand.f = (ahdd)new ahba((ahbh)RelatedChipEndpoint$RelatedChipCommand.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return RelatedChipEndpoint$RelatedChipCommand.a;
            }
            case 4: {
                return new ahaz((ahbh)RelatedChipEndpoint$RelatedChipCommand.a);
            }
            case 3: {
                return new RelatedChipEndpoint$RelatedChipCommand();
            }
            case 2: {
                return newMessageInfo((MessageLite)RelatedChipEndpoint$RelatedChipCommand.a, "\u0001\u0003\u0001\u0001\u0001\u0004\u0003\u0000\u0000\u0002\u0001\u143c\u0000\u0003\u103a\u0000\u0004\u1409\u0003", new Object[] { "d", "c", "b", aiyg.class, "e" });
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
