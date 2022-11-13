import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jae extends ahbh implements ahcw
{
    public static final jae a;
    private static volatile ahdd g;
    public int b;
    public boolean c;
    public long d;
    public long e;
    public long f;
    
    static {
        ahbh.registerDefaultInstance((Class)jae.class, (ahbh)(a = new jae()));
    }
    
    private jae() {
        this.d = -1L;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd g;
                if ((g = jae.g) == null) {
                    synchronized (jae.class) {
                        if (jae.g == null) {
                            jae.g = (ahdd)new ahba((ahbh)jae.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return jae.a;
            }
            case 4: {
                return new ahaz((ahbh)jae.a);
            }
            case 3: {
                return new jae();
            }
            case 2: {
                return newMessageInfo((MessageLite)jae.a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u1007\u0000\u0002\u1002\u0001\u0003\u1002\u0002\u0004\u1002\u0003", new Object[] { "b", "c", "d", "e", "f" });
            }
            case 1: {
                return null;
            }
            case 0: {
                return 1;
            }
        }
    }
}
