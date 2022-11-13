import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aovy extends ahbh implements ahcw
{
    public static final aovy a;
    private static volatile ahdd f;
    public int b;
    public aovw c;
    public aovx d;
    public amyk e;
    
    static {
        ahbh.registerDefaultInstance((Class)aovy.class, (ahbh)(a = new aovy()));
    }
    
    private aovy() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd f;
                if ((f = aovy.f) == null) {
                    synchronized (aovy.class) {
                        if (aovy.f == null) {
                            aovy.f = (ahdd)new ahba((ahbh)aovy.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return aovy.a;
            }
            case 4: {
                return new ahaz((ahbh)aovy.a);
            }
            case 3: {
                return new aovy();
            }
            case 2: {
                return newMessageInfo((MessageLite)aovy.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u1009\u0000\u0002\u1009\u0001\u0003\u1009\u0002", new Object[] { "b", "c", "d", "e" });
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
