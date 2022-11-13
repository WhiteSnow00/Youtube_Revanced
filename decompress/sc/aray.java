import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aray extends ahbh implements ahcw
{
    public static final aray a;
    private static volatile ahdd d;
    public int b;
    public Object c;
    
    static {
        ahbh.registerDefaultInstance((Class)aray.class, (ahbh)(a = new aray()));
    }
    
    private aray() {
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
                if ((d = aray.d) == null) {
                    synchronized (aray.class) {
                        if (aray.d == null) {
                            aray.d = (ahdd)new ahba((ahbh)aray.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aray.a;
            }
            case 4: {
                return new ahaz((ahbh)aray.a);
            }
            case 3: {
                return new aray();
            }
            case 2: {
                return newMessageInfo((MessageLite)aray.a, "\u0001\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u103c\u0000\u0002\u103c\u0000", new Object[] { "c", "b", arav.class, arax.class });
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
