import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class anpj extends ahbh implements ahcw
{
    public static final anpj a;
    private static volatile ahdd f;
    public int b;
    public int c;
    public int d;
    public int e;
    
    static {
        ahbh.registerDefaultInstance((Class)anpj.class, (ahbh)(a = new anpj()));
    }
    
    private anpj() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd f;
                if ((f = anpj.f) == null) {
                    synchronized (anpj.class) {
                        if (anpj.f == null) {
                            anpj.f = (ahdd)new ahba((ahbh)anpj.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return anpj.a;
            }
            case 4: {
                return new ahaz((ahbh)anpj.a);
            }
            case 3: {
                return new anpj();
            }
            case 2: {
                return newMessageInfo((MessageLite)anpj.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u100c\u0000\u0002\u1004\u0001\u0003\u100c\u0002", new Object[] { "b", "c", anpe.a(), "d", "e", anpf.a() });
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
