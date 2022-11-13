import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apbp extends ahbh implements ahcw
{
    public static final apbp a;
    private static volatile ahdd b;
    private int c;
    private ajtu d;
    private byte e;
    
    static {
        ahbh.registerDefaultInstance((Class)apbp.class, (ahbh)(a = new apbp()));
    }
    
    private apbp() {
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
                if ((b = apbp.b) == null) {
                    synchronized (apbp.class) {
                        if (apbp.b == null) {
                            apbp.b = (ahdd)new ahba((ahbh)apbp.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return apbp.a;
            }
            case 4: {
                return new ahaz((ahbh)apbp.a);
            }
            case 3: {
                return new apbp();
            }
            case 2: {
                return newMessageInfo((MessageLite)apbp.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u1409\u0000", new Object[] { "c", "d" });
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
