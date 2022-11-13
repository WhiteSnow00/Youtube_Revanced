import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class albf extends ahbh implements ahcw
{
    public static final albf a;
    private static volatile ahdd e;
    public int b;
    public int c;
    public boolean d;
    private int f;
    
    static {
        ahbh.registerDefaultInstance((Class)albf.class, (ahbh)(a = new albf()));
    }
    
    private albf() {
        final ahab b = ahab.b;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd e;
                if ((e = albf.e) == null) {
                    synchronized (albf.class) {
                        if (albf.e == null) {
                            albf.e = (ahdd)new ahba((ahbh)albf.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return albf.a;
            }
            case 4: {
                return new ahaz((ahbh)albf.a);
            }
            case 3: {
                return new albf();
            }
            case 2: {
                return newMessageInfo((MessageLite)albf.a, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001\u1004\u0000\u0003\u100b\u0002\u0004\u1007\u0003", new Object[] { "f", "b", "c", "d" });
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
