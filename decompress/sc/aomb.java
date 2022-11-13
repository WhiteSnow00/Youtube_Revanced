import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aomb extends ahbh implements ahcw
{
    public static final aomb a;
    private static volatile ahdd d;
    public int b;
    public Object c;
    
    static {
        ahbh.registerDefaultInstance((Class)aomb.class, (ahbh)(a = new aomb()));
    }
    
    private aomb() {
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
                if ((d = aomb.d) == null) {
                    synchronized (aomb.class) {
                        if (aomb.d == null) {
                            aomb.d = (ahdd)new ahba((ahbh)aomb.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aomb.a;
            }
            case 4: {
                return new ahaz((ahbh)aomb.a);
            }
            case 3: {
                return new aomb();
            }
            case 2: {
                return newMessageInfo((MessageLite)aomb.a, "\u0001\u0001\u0001\u0000\ue5a9\u4109\ue5a9\u4109\u0001\u0000\u0000\u0000\ue5a9\u4109\u103c\u0000", new Object[] { "c", "b", aomj.class });
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
