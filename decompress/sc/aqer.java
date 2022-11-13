import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqer extends ahbh implements ahcw
{
    public static final aqer a;
    private static volatile ahdd f;
    public int b;
    public aqgv c;
    public aqgv d;
    public aqgv e;
    
    static {
        ahbh.registerDefaultInstance((Class)aqer.class, (ahbh)(a = new aqer()));
    }
    
    private aqer() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd f;
                if ((f = aqer.f) == null) {
                    synchronized (aqer.class) {
                        if (aqer.f == null) {
                            aqer.f = (ahdd)new ahba((ahbh)aqer.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return aqer.a;
            }
            case 4: {
                return new ahaz((ahbh)aqer.a);
            }
            case 3: {
                return new aqer();
            }
            case 2: {
                return newMessageInfo((MessageLite)aqer.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u1009\u0000\u0002\u1009\u0001\u0003\u1009\u0002", new Object[] { "b", "c", "d", "e" });
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
