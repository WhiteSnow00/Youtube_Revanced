import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahhe extends ahbh implements ahcw
{
    public static final ahhe a;
    private static volatile ahdd b;
    private int c;
    private afrf d;
    private byte e;
    
    static {
        ahbh.registerDefaultInstance((Class)ahhe.class, (ahbh)(a = new ahhe()));
    }
    
    private ahhe() {
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
                final ahdd b;
                if ((b = ahhe.b) == null) {
                    synchronized (ahhe.class) {
                        if (ahhe.b == null) {
                            ahhe.b = (ahdd)new ahba((ahbh)ahhe.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return ahhe.a;
            }
            case 4: {
                return new ahaz((ahbh)ahhe.a);
            }
            case 3: {
                return new ahhe();
            }
            case 2: {
                return newMessageInfo((MessageLite)ahhe.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u1409\u0000", new Object[] { "c", "d" });
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
