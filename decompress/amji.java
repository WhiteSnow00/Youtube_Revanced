import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amji extends ahbh implements ahcw
{
    public static final amji a;
    private static volatile ahdd c;
    public alft b;
    private int d;
    private byte e;
    
    static {
        ahbh.registerDefaultInstance((Class)amji.class, (ahbh)(a = new amji()));
    }
    
    private amji() {
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
                final ahdd c;
                if ((c = amji.c) == null) {
                    synchronized (amji.class) {
                        if (amji.c == null) {
                            amji.c = (ahdd)new ahba((ahbh)amji.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return amji.a;
            }
            case 4: {
                return new ahaz((ahbh)amji.a);
            }
            case 3: {
                return new amji();
            }
            case 2: {
                return newMessageInfo((MessageLite)amji.a, "\u0001\u0001\u0000\u0001\ueadb\u3b09\ueadb\u3b09\u0001\u0000\u0000\u0001\ueadb\u3b09\u1409\u0000", new Object[] { "d", "b" });
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
