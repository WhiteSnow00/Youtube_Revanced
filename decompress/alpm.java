import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alpm extends ahbh implements ahcw
{
    public static final alpm a;
    private static volatile ahdd e;
    public int b;
    public ajut c;
    public anuv d;
    private anuv f;
    private byte g;
    
    static {
        ahbh.registerDefaultInstance((Class)alpm.class, (ahbh)(a = new alpm()));
    }
    
    private alpm() {
        this.g = 2;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte g = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd e;
                if ((e = alpm.e) == null) {
                    synchronized (alpm.class) {
                        if (alpm.e == null) {
                            alpm.e = (ahdd)new ahba((ahbh)alpm.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return alpm.a;
            }
            case 4: {
                return new ahaz((ahbh)alpm.a);
            }
            case 3: {
                return new alpm();
            }
            case 2: {
                return newMessageInfo((MessageLite)alpm.a, "\u0001\u0003\u0000\u0001\u0002\u0004\u0003\u0000\u0000\u0003\u0002\u1409\u0001\u0003\u1409\u0002\u0004\u1409\u0003", new Object[] { "b", "c", "d", "f" });
            }
            case 1: {
                if (o == null) {
                    g = 0;
                }
                this.g = g;
                return null;
            }
            case 0: {
                return this.g;
            }
        }
    }
}
