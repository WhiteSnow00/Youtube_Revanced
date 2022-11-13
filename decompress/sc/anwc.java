import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class anwc extends ahbh implements ahcw
{
    public static final anwc a;
    private static volatile ahdd d;
    public int b;
    public ajby c;
    
    static {
        ahbh.registerDefaultInstance((Class)anwc.class, (ahbh)(a = new anwc()));
    }
    
    private anwc() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd d;
                if ((d = anwc.d) == null) {
                    synchronized (anwc.class) {
                        if (anwc.d == null) {
                            anwc.d = (ahdd)new ahba((ahbh)anwc.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return anwc.a;
            }
            case 4: {
                return new ahaz((short[][][])null, (float[][])null);
            }
            case 3: {
                return new anwc();
            }
            case 2: {
                return newMessageInfo((MessageLite)anwc.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1009\u0000", new Object[] { "b", "c" });
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
