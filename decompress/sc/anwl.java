import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class anwl extends ahbh implements ahcw
{
    public static final anwl a;
    private static volatile ahdd d;
    public int b;
    public boolean c;
    private int e;
    
    static {
        ahbh.registerDefaultInstance((Class)anwl.class, (ahbh)(a = new anwl()));
    }
    
    private anwl() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd d;
                if ((d = anwl.d) == null) {
                    synchronized (anwl.class) {
                        if (anwl.d == null) {
                            anwl.d = (ahdd)new ahba((ahbh)anwl.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return anwl.a;
            }
            case 4: {
                return new ahaz((ahbh)anwl.a);
            }
            case 3: {
                return new anwl();
            }
            case 2: {
                return newMessageInfo((MessageLite)anwl.a, "\u0001\u0002\u0000\u0001\u0006\u0007\u0002\u0000\u0000\u0000\u0006\u1004\u0000\u0007\u1007\u0001", new Object[] { "e", "b", "c" });
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
