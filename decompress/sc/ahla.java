import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahla extends ahbh implements ahcw
{
    public static final ahla a;
    private static volatile ahdd f;
    public int b;
    public ahkz c;
    public ahlb d;
    public boolean e;
    
    static {
        ahbh.registerDefaultInstance((Class)ahla.class, (ahbh)(a = new ahla()));
    }
    
    private ahla() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd f;
                if ((f = ahla.f) == null) {
                    synchronized (ahla.class) {
                        if (ahla.f == null) {
                            ahla.f = (ahdd)new ahba((ahbh)ahla.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return ahla.a;
            }
            case 4: {
                return new ahaz((ahbh)ahla.a);
            }
            case 3: {
                return new ahla();
            }
            case 2: {
                return newMessageInfo((MessageLite)ahla.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u1009\u0000\u0002\u1009\u0001\u0003\u1007\u0002", new Object[] { "b", "c", "d", "e" });
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
