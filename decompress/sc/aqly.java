import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqly extends ahbh implements ahcw
{
    public static final aqly a;
    private static volatile ahdd d;
    public String b;
    public agzo c;
    private int e;
    
    static {
        ahbh.registerDefaultInstance((Class)aqly.class, (ahbh)(a = new aqly()));
    }
    
    private aqly() {
        this.b = "";
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd d;
                if ((d = aqly.d) == null) {
                    synchronized (aqly.class) {
                        if (aqly.d == null) {
                            aqly.d = (ahdd)new ahba((ahbh)aqly.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aqly.a;
            }
            case 4: {
                return new ahaz((ahbh)aqly.a);
            }
            case 3: {
                return new aqly();
            }
            case 2: {
                return newMessageInfo((MessageLite)aqly.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1009\u0001", new Object[] { "e", "b", "c" });
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
