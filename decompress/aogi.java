import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aogi extends ahbh implements ahcw
{
    public static final aogi a;
    private static volatile ahdd d;
    public int b;
    public Object c;
    
    static {
        ahbh.registerDefaultInstance((Class)aogi.class, (ahbh)(a = new aogi()));
    }
    
    private aogi() {
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
                if ((d = aogi.d) == null) {
                    synchronized (aogi.class) {
                        if (aogi.d == null) {
                            aogi.d = (ahdd)new ahba((ahbh)aogi.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aogi.a;
            }
            case 4: {
                return new ahaz((ahbh)aogi.a);
            }
            case 3: {
                return new aogi();
            }
            case 2: {
                return newMessageInfo((MessageLite)aogi.a, "\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u103c\u0000", new Object[] { "c", "b", ajpu.class });
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
