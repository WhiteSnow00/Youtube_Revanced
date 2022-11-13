import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alrp extends ahbh implements ahcw
{
    public static final alrp a;
    private static volatile ahdd e;
    public int b;
    public double c;
    public ajut d;
    private byte f;
    
    static {
        ahbh.registerDefaultInstance((Class)alrp.class, (ahbh)(a = new alrp()));
    }
    
    private alrp() {
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
                final ahdd e;
                if ((e = alrp.e) == null) {
                    synchronized (alrp.class) {
                        if (alrp.e == null) {
                            alrp.e = (ahdd)new ahba((ahbh)alrp.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return alrp.a;
            }
            case 4: {
                return new ahaz((ahbh)alrp.a);
            }
            case 3: {
                return new alrp();
            }
            case 2: {
                return newMessageInfo((MessageLite)alrp.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001\u1000\u0000\u0002\u1409\u0001", new Object[] { "b", "c", "d" });
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
