import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class anut extends ahbh implements ahcw
{
    public static final anut a;
    private static volatile ahdd d;
    public int b;
    public Object c;
    
    static {
        ahbh.registerDefaultInstance((Class)anut.class, (ahbh)(a = new anut()));
    }
    
    private anut() {
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
                if ((d = anut.d) == null) {
                    synchronized (anut.class) {
                        if (anut.d == null) {
                            anut.d = (ahdd)new ahba((ahbh)anut.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return anut.a;
            }
            case 4: {
                return new ahaz((ahbh)anut.a);
            }
            case 3: {
                return new anut();
            }
            case 2: {
                return newMessageInfo((MessageLite)anut.a, "\u0001\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u103e\u0000\u0002\u103e\u0000", new Object[] { "c", "b" });
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
