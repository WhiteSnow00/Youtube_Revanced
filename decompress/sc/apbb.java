import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apbb extends ahbh implements ahcw
{
    public static final apbb a;
    private static volatile ahdd b;
    private int c;
    private amhi d;
    private byte e;
    
    static {
        ahbh.registerDefaultInstance((Class)apbb.class, (ahbh)(a = new apbb()));
    }
    
    private apbb() {
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
                if ((b = apbb.b) == null) {
                    synchronized (apbb.class) {
                        if (apbb.b == null) {
                            apbb.b = (ahdd)new ahba((ahbh)apbb.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return apbb.a;
            }
            case 4: {
                return new ahaz((ahbh)apbb.a);
            }
            case 3: {
                return new apbb();
            }
            case 2: {
                return newMessageInfo((MessageLite)apbb.a, "\u0001\u0001\u0000\u0001\ue592\u1be6\ue592\u1be6\u0001\u0000\u0000\u0001\ue592\u1be6\u1409\u0000", new Object[] { "c", "d" });
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
