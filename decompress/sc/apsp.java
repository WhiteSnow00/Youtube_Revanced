import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apsp extends ahbh implements ahcw
{
    public static final apsp a;
    private static volatile ahdd b;
    private int c;
    private aidi d;
    private byte e;
    
    static {
        ahbh.registerDefaultInstance((Class)apsp.class, (ahbh)(a = new apsp()));
    }
    
    private apsp() {
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
                if ((b = apsp.b) == null) {
                    synchronized (apsp.class) {
                        if (apsp.b == null) {
                            apsp.b = (ahdd)new ahba((ahbh)apsp.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return apsp.a;
            }
            case 4: {
                return new ahaz((ahbh)apsp.a);
            }
            case 3: {
                return new apsp();
            }
            case 2: {
                return newMessageInfo((MessageLite)apsp.a, "\u0001\u0001\u0000\u0001\ue5d8\u2622\ue5d8\u2622\u0001\u0000\u0000\u0001\ue5d8\u2622\u1409\u0000", new Object[] { "c", "d" });
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
