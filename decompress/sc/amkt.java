import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amkt extends ahbh implements ahcw
{
    public static final amkt a;
    private static volatile ahdd f;
    public int b;
    public amks c;
    public boolean d;
    public int e;
    
    static {
        ahbh.registerDefaultInstance((Class)amkt.class, (ahbh)(a = new amkt()));
    }
    
    private amkt() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd f;
                if ((f = amkt.f) == null) {
                    synchronized (amkt.class) {
                        if (amkt.f == null) {
                            amkt.f = (ahdd)new ahba((ahbh)amkt.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return amkt.a;
            }
            case 4: {
                return new ahaz((ahbh)amkt.a);
            }
            case 3: {
                return new amkt();
            }
            case 2: {
                return newMessageInfo((MessageLite)amkt.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u1009\u0000\u0002\u1007\u0001\u0003\u1004\u0002", new Object[] { "b", "c", "d", "e" });
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
