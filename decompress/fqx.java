import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fqx extends ahbh implements ahcw
{
    public static final fqx a;
    private static volatile ahdd p;
    public int b;
    public boolean c;
    public boolean d;
    public int e;
    public ahcr f;
    public boolean g;
    public int h;
    public int i;
    public int j;
    public int k;
    public int l;
    public int m;
    public boolean n;
    public int o;
    
    static {
        ahbh.registerDefaultInstance((Class)fqx.class, (ahbh)(a = new fqx()));
    }
    
    private fqx() {
        this.f = ahcr.a;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd p3;
                if ((p3 = fqx.p) == null) {
                    synchronized (fqx.class) {
                        if (fqx.p == null) {
                            fqx.p = (ahdd)new ahba((ahbh)fqx.a);
                        }
                    }
                }
                return p3;
            }
            case 5: {
                return fqx.a;
            }
            case 4: {
                return new ahaz((ahbh)fqx.a);
            }
            case 3: {
                return new fqx();
            }
            case 2: {
                return newMessageInfo((MessageLite)fqx.a, "\u0001\r\u0000\u0001\u0001\r\r\u0001\u0000\u0000\u0001\u1007\u0000\u0002\u1007\u0001\u0003\u1004\u0002\u00042\u0005\u1007\u0003\u0006\u1004\u0004\u0007\u1004\u0005\b\u1004\u0006\t\u1004\u0007\n\u1004\b\u000b\u1004\t\f\u1007\n\r\u1004\u000b", new Object[] { "b", "c", "d", "e", "f", fqw.a, "g", "h", "i", "j", "k", "l", "m", "n", "o" });
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
