import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahkh extends ahbh implements ahcw
{
    public static final ahkh a;
    private static volatile ahdd j;
    public int b;
    public ahki c;
    public ahkj d;
    public ahkk e;
    public ahkl f;
    public ahkg g;
    public ahkm h;
    public ajci i;
    private byte k;
    
    static {
        ahbh.registerDefaultInstance((Class)ahkh.class, (ahbh)(a = new ahkh()));
    }
    
    private ahkh() {
        this.k = 2;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte k = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd j;
                if ((j = ahkh.j) == null) {
                    synchronized (ahkh.class) {
                        if (ahkh.j == null) {
                            ahkh.j = (ahdd)new ahba((ahbh)ahkh.a);
                        }
                    }
                }
                return j;
            }
            case 5: {
                return ahkh.a;
            }
            case 4: {
                return new ahaz((ahbh)ahkh.a);
            }
            case 3: {
                return new ahkh();
            }
            case 2: {
                return newMessageInfo((MessageLite)ahkh.a, "\u0001\u0007\u0000\u0001\ueec5\u24cf\ue7d0\u4960\u0007\u0000\u0000\u0001\ueec5\u24cf\u1009\u0002\uef11\u24cf\u1009\u0003\ufb8e\u24d0\u1009\u0000\uf120\u2923\u1409\u0007\uff12\u455b\u1009\n\ue3b9\u4717\u1009\u0004\ue7d0\u4960\u1009\u000b", new Object[] { "b", "d", "e", "c", "g", "h", "f", "i" });
            }
            case 1: {
                if (o == null) {
                    k = 0;
                }
                this.k = k;
                return null;
            }
            case 0: {
                return this.k;
            }
        }
    }
}
