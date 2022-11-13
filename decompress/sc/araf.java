import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class araf extends ahbh implements ahcw
{
    public static final araf a;
    private static volatile ahdd e;
    public int b;
    public aqxx c;
    public arae d;
    
    static {
        ahbh.registerDefaultInstance((Class)araf.class, (ahbh)(a = new araf()));
    }
    
    private araf() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd e;
                if ((e = araf.e) == null) {
                    synchronized (araf.class) {
                        if (araf.e == null) {
                            araf.e = (ahdd)new ahba((ahbh)araf.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return araf.a;
            }
            case 4: {
                return new ahaz((ahbh)araf.a);
            }
            case 3: {
                return new araf();
            }
            case 2: {
                return newMessageInfo((MessageLite)araf.a, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0000\u0002\u1009\u0001\u0003\u1009\u0002", new Object[] { "b", "c", "d" });
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
