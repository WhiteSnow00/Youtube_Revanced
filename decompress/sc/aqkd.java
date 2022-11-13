import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqkd extends ahbh implements ahcw
{
    public static final aqkd a;
    public static final ahbf b;
    private static volatile ahdd d;
    public String c;
    private int e;
    private byte f;
    
    static {
        final aqkd a2 = new aqkd();
        ahbh.registerDefaultInstance((Class)aqkd.class, (ahbh)(a = a2));
        b = ahbh.newSingularGeneratedExtension((MessageLite)aqfg.a, (Object)a2, (MessageLite)a2, (ahbm)null, 361707526, ahek.k, (Class)aqkd.class);
    }
    
    private aqkd() {
        this.f = 2;
        this.c = "";
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte f = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd d;
                if ((d = aqkd.d) == null) {
                    synchronized (aqkd.class) {
                        if (aqkd.d == null) {
                            aqkd.d = (ahdd)new ahba((ahbh)aqkd.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aqkd.a;
            }
            case 4: {
                return new ahaz((ahbh)aqkd.a);
            }
            case 3: {
                return new aqkd();
            }
            case 2: {
                return newMessageInfo((MessageLite)aqkd.a, "\u0001\u0001\u0000\u0001\t\t\u0001\u0000\u0000\u0000\t\u1008\u0007", new Object[] { "e", "c" });
            }
            case 1: {
                if (o == null) {
                    f = 0;
                }
                this.f = f;
                return null;
            }
            case 0: {
                return this.f;
            }
        }
    }
}
