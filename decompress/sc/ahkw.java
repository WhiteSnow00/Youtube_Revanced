import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahkw extends ahbh implements ahcw
{
    public static final ahkw a;
    private static volatile ahdd d;
    public int b;
    public ajrv c;
    private byte e;
    
    static {
        ahbh.registerDefaultInstance((Class)ahkw.class, (ahbh)(a = new ahkw()));
    }
    
    private ahkw() {
        this.e = 2;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte e = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd d;
                if ((d = ahkw.d) == null) {
                    synchronized (ahkw.class) {
                        if (ahkw.d == null) {
                            ahkw.d = (ahdd)new ahba((ahbh)ahkw.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return ahkw.a;
            }
            case 4: {
                return new ahaz((ahbh)ahkw.a);
            }
            case 3: {
                return new ahkw();
            }
            case 2: {
                return newMessageInfo((MessageLite)ahkw.a, "\u0001\u0001\u0000\u0001\uf486\u28b5\uf486\u28b5\u0001\u0000\u0000\u0001\uf486\u28b5\u1409\u0000", new Object[] { "b", "c" });
            }
            case 1: {
                if (o == null) {
                    e = 0;
                }
                this.e = e;
                return null;
            }
            case 0: {
                return this.e;
            }
        }
    }
}
