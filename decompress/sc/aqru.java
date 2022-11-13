import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqru extends ahbh implements ahcw
{
    public static final aqru a;
    private static volatile ahdd d;
    public int b;
    public Object c;
    
    static {
        ahbh.registerDefaultInstance((Class)aqru.class, (ahbh)(a = new aqru()));
    }
    
    private aqru() {
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
                if ((d = aqru.d) == null) {
                    synchronized (aqru.class) {
                        if (aqru.d == null) {
                            aqru.d = (ahdd)new ahba((ahbh)aqru.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aqru.a;
            }
            case 4: {
                return new ahaz((ahbh)aqru.a);
            }
            case 3: {
                return new aqru();
            }
            case 2: {
                return newMessageInfo((MessageLite)aqru.a, "\u0001\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u103c\u0000\u0002\u103c\u0000", new Object[] { "c", "b", ahan.class, aqrs.class });
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
