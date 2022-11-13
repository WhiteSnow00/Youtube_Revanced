import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajax extends ahbh implements ahcw
{
    public static final ajax a;
    private static volatile ahdd d;
    public int b;
    public Object c;
    
    static {
        ahbh.registerDefaultInstance((Class)ajax.class, (ahbh)(a = new ajax()));
    }
    
    private ajax() {
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
                if ((d = ajax.d) == null) {
                    synchronized (ajax.class) {
                        if (ajax.d == null) {
                            ajax.d = (ahdd)new ahba((ahbh)ajax.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return ajax.a;
            }
            case 4: {
                return new ahaz((ahbh)ajax.a);
            }
            case 3: {
                return new ajax();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajax.a, "\u0001\u0001\u0001\u0000\uec16\u387f\uec16\u387f\u0001\u0000\u0000\u0000\uec16\u387f\u103c\u0000", new Object[] { "c", "b", aibe.class });
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
