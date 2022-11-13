import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apsb extends ahbh implements ahcw
{
    public static final apsb a;
    private static volatile ahdd d;
    public int b;
    public int c;
    
    static {
        ahbh.registerDefaultInstance((Class)apsb.class, (ahbh)(a = new apsb()));
    }
    
    private apsb() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd d;
                if ((d = apsb.d) == null) {
                    synchronized (apsb.class) {
                        if (apsb.d == null) {
                            apsb.d = (ahdd)new ahba((ahbh)apsb.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return apsb.a;
            }
            case 4: {
                return new ahaz((ahbh)apsb.a);
            }
            case 3: {
                return new apsb();
            }
            case 2: {
                return newMessageInfo((MessageLite)apsb.a, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002\u100c\u0001", new Object[] { "b", "c", anza.a() });
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
