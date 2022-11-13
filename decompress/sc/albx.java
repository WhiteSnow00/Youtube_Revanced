import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class albx extends ahbh implements ahcw
{
    public static final albx a;
    private static volatile ahdd d;
    public int b;
    public aklg c;
    private albw e;
    private byte f;
    
    static {
        ahbh.registerDefaultInstance((Class)albx.class, (ahbh)(a = new albx()));
    }
    
    private albx() {
        this.f = 2;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte f = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd d;
                if ((d = albx.d) == null) {
                    synchronized (albx.class) {
                        if (albx.d == null) {
                            albx.d = (ahdd)new ahba((ahbh)albx.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return albx.a;
            }
            case 4: {
                return new ahaz((ahbh)albx.a);
            }
            case 3: {
                return new albx();
            }
            case 2: {
                return newMessageInfo((MessageLite)albx.a, "\u0001\u0002\u0000\u0001\u0001\u000f\u0002\u0000\u0000\u0002\u0001\u1409\u0000\u000f\u1409\r", new Object[] { "b", "c", "e" });
            }
            case 1: {
                if (o == null) {
                    f = 0;
                }
                this.f = f;
                return null;
            }
            case 0: {
                return this.f;
            }
        }
    }
}
