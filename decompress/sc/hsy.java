import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hsy extends ahbh implements ahcw
{
    public static final hsy a;
    private static volatile ahdd f;
    public boolean b;
    public int c;
    public int d;
    public String e;
    
    static {
        ahbh.registerDefaultInstance((Class)hsy.class, (ahbh)(a = new hsy()));
    }
    
    private hsy() {
        this.e = "";
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd f;
                if ((f = hsy.f) == null) {
                    synchronized (hsy.class) {
                        if (hsy.f == null) {
                            hsy.f = (ahdd)new ahba((ahbh)hsy.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return hsy.a;
            }
            case 4: {
                return new ahaz((ahbh)hsy.a);
            }
            case 3: {
                return new hsy();
            }
            case 2: {
                return newMessageInfo((MessageLite)hsy.a, "\u0000\u0004\u0000\u0000\u0001\u0005\u0004\u0000\u0000\u0000\u0001\u0007\u0002\u0004\u0003\u0004\u0005\u0208", new Object[] { "b", "c", "d", "e" });
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
