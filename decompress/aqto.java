import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqto extends ahbh implements ahcw
{
    public static final aqto a;
    private static volatile ahdd f;
    public int b;
    public int c;
    public Object d;
    public String e;
    
    static {
        ahbh.registerDefaultInstance((Class)aqto.class, (ahbh)(a = new aqto()));
    }
    
    private aqto() {
        this.c = 0;
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
                if ((f = aqto.f) == null) {
                    synchronized (aqto.class) {
                        if (aqto.f == null) {
                            aqto.f = (ahdd)new ahba((ahbh)aqto.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return aqto.a;
            }
            case 4: {
                return new ahaz((ahbh)aqto.a);
            }
            case 3: {
                return new aqto();
            }
            case 2: {
                return newMessageInfo((MessageLite)aqto.a, "\u0001\u0003\u0001\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u103c\u0000\u0003\u103b\u0000", new Object[] { "d", "c", "b", "e", aqts.class });
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
