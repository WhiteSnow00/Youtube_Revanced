import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class albs extends ahbh implements ahcw
{
    public static final albs a;
    private static volatile ahdd d;
    public int b;
    public Object c;
    
    static {
        ahbh.registerDefaultInstance((Class)albs.class, (ahbh)(a = new albs()));
    }
    
    private albs() {
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
                if ((d = albs.d) == null) {
                    synchronized (albs.class) {
                        if (albs.d == null) {
                            albs.d = (ahdd)new ahba((ahbh)albs.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return albs.a;
            }
            case 4: {
                return new ahaz((ahbh)albs.a);
            }
            case 3: {
                return new albs();
            }
            case 2: {
                return newMessageInfo((MessageLite)albs.a, "\u0001\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u103b\u0000\u0002\u103c\u0000", new Object[] { "c", "b", albr.class });
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
