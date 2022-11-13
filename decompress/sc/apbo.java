import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apbo extends ahbh implements ahcw
{
    public static final apbo a;
    private static volatile ahdd b;
    private int c;
    private apbp d;
    private byte e;
    
    static {
        ahbh.registerDefaultInstance((Class)apbo.class, (ahbh)(a = new apbo()));
    }
    
    private apbo() {
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
                if ((b = apbo.b) == null) {
                    synchronized (apbo.class) {
                        if (apbo.b == null) {
                            apbo.b = (ahdd)new ahba((ahbh)apbo.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return apbo.a;
            }
            case 4: {
                return new ahaz((ahbh)apbo.a);
            }
            case 3: {
                return new apbo();
            }
            case 2: {
                return newMessageInfo((MessageLite)apbo.a, "\u0001\u0001\u0000\u0001\b\b\u0001\u0000\u0000\u0001\b\u1409\u0007", new Object[] { "c", "d" });
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
