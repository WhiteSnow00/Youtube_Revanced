import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqfi extends ahbh implements ahcw
{
    public static final aqfi a;
    public static final ahbf b;
    private static volatile ahdd d;
    public ahcr c;
    
    static {
        final aqfi a2 = new aqfi();
        ahbh.registerDefaultInstance((Class)aqfi.class, (ahbh)(a = a2));
        b = ahbh.newSingularGeneratedExtension((MessageLite)aqfg.a, (Object)a2, (MessageLite)a2, (ahbm)null, 188495463, ahek.k, (Class)aqfi.class);
    }
    
    private aqfi() {
        this.c = ahcr.a;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd d;
                if ((d = aqfi.d) == null) {
                    synchronized (aqfi.class) {
                        if (aqfi.d == null) {
                            aqfi.d = (ahdd)new ahba((ahbh)aqfi.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aqfi.a;
            }
            case 4: {
                return new ahaz((int[])null, (int[])null);
            }
            case 3: {
                return new aqfi();
            }
            case 2: {
                return newMessageInfo((MessageLite)aqfi.a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[] { "c", aqfh.a });
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
