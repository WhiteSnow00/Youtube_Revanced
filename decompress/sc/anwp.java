import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class anwp extends ahbh implements ahcw
{
    public static final anwp a;
    private static volatile ahdd e;
    public boolean b;
    public boolean c;
    public int d;
    private int f;
    
    static {
        ahbh.registerDefaultInstance((Class)anwp.class, (ahbh)(a = new anwp()));
    }
    
    private anwp() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd e;
                if ((e = anwp.e) == null) {
                    synchronized (anwp.class) {
                        if (anwp.e == null) {
                            anwp.e = (ahdd)new ahba((ahbh)anwp.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return anwp.a;
            }
            case 4: {
                return new ahaz((ahbh)anwp.a);
            }
            case 3: {
                return new anwp();
            }
            case 2: {
                return newMessageInfo((MessageLite)anwp.a, "\u0001\u0003\u0000\u0001\u0001\u0013\u0003\u0000\u0000\u0000\u0001\u1007\u0000\r\u1007\u000f\u0013\u1004\u0016", new Object[] { "f", "b", "c", "d" });
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
