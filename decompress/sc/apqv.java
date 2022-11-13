import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apqv extends ahbh implements ahcw
{
    public static final apqv a;
    private static volatile ahdd d;
    public int b;
    public Object c;
    
    static {
        ahbh.registerDefaultInstance((Class)apqv.class, (ahbh)(a = new apqv()));
    }
    
    private apqv() {
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
                if ((d = apqv.d) == null) {
                    synchronized (apqv.class) {
                        if (apqv.d == null) {
                            apqv.d = (ahdd)new ahba((ahbh)apqv.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return apqv.a;
            }
            case 4: {
                return new ahaz((ahbh)apqv.a);
            }
            case 3: {
                return new apqv();
            }
            case 2: {
                return newMessageInfo((MessageLite)apqv.a, "\u0001\u0001\u0001\u0000\uec16\u387f\uec16\u387f\u0001\u0000\u0000\u0000\uec16\u387f\u103c\u0000", new Object[] { "c", "b", aibe.class });
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
