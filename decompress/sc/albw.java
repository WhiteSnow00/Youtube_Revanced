import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class albw extends ahbh implements ahcw
{
    public static final albw a;
    private static volatile ahdd b;
    private int c;
    private albz d;
    private byte e;
    
    static {
        ahbh.registerDefaultInstance((Class)albw.class, (ahbh)(a = new albw()));
    }
    
    private albw() {
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
                if ((b = albw.b) == null) {
                    synchronized (albw.class) {
                        if (albw.b == null) {
                            albw.b = (ahdd)new ahba((ahbh)albw.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return albw.a;
            }
            case 4: {
                return new ahaz((ahbh)albw.a);
            }
            case 3: {
                return new albw();
            }
            case 2: {
                return newMessageInfo((MessageLite)albw.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u1409\u0000", new Object[] { "c", "d" });
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
