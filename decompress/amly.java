import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amly extends ahbh implements ahcw
{
    public static final amly a;
    public static final ahbf b;
    private static volatile ahdd d;
    public String c;
    private int e;
    
    static {
        final amly a2 = new amly();
        ahbh.registerDefaultInstance((Class)amly.class, (ahbh)(a = a2));
        b = ahbh.newSingularGeneratedExtension((MessageLite)aqhl.a, (Object)a2, (MessageLite)a2, (ahbm)null, 471576040, ahek.k, (Class)amly.class);
    }
    
    private amly() {
        this.c = "";
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd d;
                if ((d = amly.d) == null) {
                    synchronized (amly.class) {
                        if (amly.d == null) {
                            amly.d = (ahdd)new ahba((ahbh)amly.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return amly.a;
            }
            case 4: {
                return new ahaz((ahbh)amly.a);
            }
            case 3: {
                return new amly();
            }
            case 2: {
                return newMessageInfo((MessageLite)amly.a, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002\u1008\u0000", new Object[] { "e", "c" });
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
