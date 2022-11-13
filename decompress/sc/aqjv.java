import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqjv extends ahbh implements ahcw
{
    public static final aqjv a;
    public static final ahbf b;
    private static volatile ahdd d;
    public aqjt c;
    private int e;
    private aqei f;
    private aqin g;
    private aqks h;
    private anns i;
    private ahhu j;
    private alxt k;
    private byte l;
    
    static {
        final aqjv a2 = new aqjv();
        ahbh.registerDefaultInstance((Class)aqjv.class, (ahbh)(a = a2));
        b = ahbh.newSingularGeneratedExtension((MessageLite)aqfg.a, (Object)a2, (MessageLite)a2, (ahbm)null, 400157044, ahek.k, (Class)aqjv.class);
    }
    
    private aqjv() {
        this.l = 2;
        final ahab b = ahab.b;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte l = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd d;
                if ((d = aqjv.d) == null) {
                    synchronized (aqjv.class) {
                        if (aqjv.d == null) {
                            aqjv.d = (ahdd)new ahba((ahbh)aqjv.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aqjv.a;
            }
            case 4: {
                return new ahaz((ahbh)aqjv.a);
            }
            case 3: {
                return new aqjv();
            }
            case 2: {
                return newMessageInfo((MessageLite)aqjv.a, "\u0001\u0007\u0000\u0001\u0006\u0017\u0007\u0000\u0000\u0005\u0006\u1409\u0006\b\u1409\t\n\u1409\u0015\u000b\u1409\b\f\u1409\n\u0016\u1009\u001c\u0017\u1009\u0001", new Object[] { "e", "c", "h", "j", "g", "i", "k", "f" });
            }
            case 1: {
                if (o == null) {
                    l = 0;
                }
                this.l = l;
                return null;
            }
            case 0: {
                return this.l;
            }
        }
    }
}
