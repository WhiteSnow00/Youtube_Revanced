import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apat extends ahbh implements ahcw
{
    public static final apat a;
    private static volatile ahdd d;
    public int b;
    public Object c;
    
    static {
        ahbh.registerDefaultInstance((Class)apat.class, (ahbh)(a = new apat()));
    }
    
    private apat() {
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
                if ((d = apat.d) == null) {
                    synchronized (apat.class) {
                        if (apat.d == null) {
                            apat.d = (ahdd)new ahba((ahbh)apat.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return apat.a;
            }
            case 4: {
                return new ahaz((ahbh)apat.a);
            }
            case 3: {
                return new apat();
            }
            case 2: {
                return newMessageInfo((MessageLite)apat.a, "\u0001\u0001\u0001\u0000\uec16\u387f\uec16\u387f\u0001\u0000\u0000\u0000\uec16\u387f\u103c\u0000", new Object[] { "c", "b", aibe.class });
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
