import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class anwi extends ahbh implements ahcw
{
    public static final anwi a;
    public static final ahbf b;
    private static volatile ahdd d;
    public boolean c;
    private int e;
    
    static {
        final anwi a2 = new anwi();
        ahbh.registerDefaultInstance((Class)anwi.class, (ahbh)(a = a2));
        b = ahbh.newSingularGeneratedExtension((MessageLite)aqgw.a, (Object)a2, (MessageLite)a2, (ahbm)null, 305711371, ahek.k, (Class)anwi.class);
    }
    
    private anwi() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd d;
                if ((d = anwi.d) == null) {
                    synchronized (anwi.class) {
                        if (anwi.d == null) {
                            anwi.d = (ahdd)new ahba((ahbh)anwi.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return anwi.a;
            }
            case 4: {
                return new ahaz((ahbh)anwi.a);
            }
            case 3: {
                return new anwi();
            }
            case 2: {
                return newMessageInfo((MessageLite)anwi.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1007\u0000", new Object[] { "e", "c" });
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
