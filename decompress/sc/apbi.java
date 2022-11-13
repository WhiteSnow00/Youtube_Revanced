import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apbi extends ahbh implements ahcw
{
    public static final apbi a;
    private static volatile ahdd b;
    private int c;
    private apbh d;
    private byte e;
    
    static {
        ahbh.registerDefaultInstance((Class)apbi.class, (ahbh)(a = new apbi()));
    }
    
    private apbi() {
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
                if ((b = apbi.b) == null) {
                    synchronized (apbi.class) {
                        if (apbi.b == null) {
                            apbi.b = (ahdd)new ahba((ahbh)apbi.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return apbi.a;
            }
            case 4: {
                return new ahaz((ahbh)apbi.a);
            }
            case 3: {
                return new apbi();
            }
            case 2: {
                return newMessageInfo((MessageLite)apbi.a, "\u0001\u0001\u0000\u0001\uf34b\u40fa\uf34b\u40fa\u0001\u0000\u0000\u0001\uf34b\u40fa\u1409\u0000", new Object[] { "c", "d" });
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
