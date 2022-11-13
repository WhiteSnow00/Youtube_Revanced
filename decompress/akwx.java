import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akwx extends ahbh implements ahcw
{
    public static final akwx a;
    private static volatile ahdd d;
    public int b;
    public Object c;
    
    static {
        ahbh.registerDefaultInstance((Class)akwx.class, (ahbh)(a = new akwx()));
    }
    
    private akwx() {
        this.b = 0;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd d;
                if ((d = akwx.d) == null) {
                    synchronized (akwx.class) {
                        if (akwx.d == null) {
                            akwx.d = (ahdd)new ahba((ahbh)akwx.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return akwx.a;
            }
            case 4: {
                return new ahaz((ahbh)akwx.a);
            }
            case 3: {
                return new akwx();
            }
            case 2: {
                return newMessageInfo((MessageLite)akwx.a, "\u0001\u0001\u0001\u0000\ufd9e\u3443\ufd9e\u3443\u0001\u0000\u0000\u0000\ufd9e\u3443\u103c\u0000", new Object[] { "c", "b", ance.class });
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
