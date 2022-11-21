import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqpd extends ahcz implements aheo
{
    private static final aqpd a;
    private static volatile ahev b;
    private int c;
    private aqoy d;
    private aqod e;
    private byte f;
    
    static {
        ahcz.registerDefaultInstance(aqpd.class, a = new aqpd());
    }
    
    private aqpd() {
        this.f = 2;
    }
    
    public static aqpc a() {
        return (aqpc)aqpd.a.createBuilder();
    }
    
    static aqpd b() {
        return aqpd.a;
    }
    
    public static void c(final aqpd aqpd, final aqoy aqoy) {
        aqpd.e(aqoy);
    }
    
    public static void d(final aqpd aqpd, final aqod aqod) {
        aqpd.f(aqod);
    }
    
    private void e(final aqoy d) {
        this.d = d;
        this.c |= 0x1;
    }
    
    private void f(final aqod e) {
        this.e = e;
        this.c |= 0x2;
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte f = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev b;
                if ((b = aqpd.b) == null) {
                    synchronized (aqpd.class) {
                        if (aqpd.b == null) {
                            aqpd.b = (ahev)new ahcs((ahcz)aqpd.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aqpd.a;
            }
            case 4: {
                return new aqpc();
            }
            case 3: {
                return new aqpd();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aqpd.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001\u1009\u0000\u0002\u1409\u0001", new Object[] { "c", "d", "e" });
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
