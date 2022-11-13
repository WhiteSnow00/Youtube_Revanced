import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aktw extends ahbh implements ahcw
{
    public static final aktw a;
    private static volatile ahdd d;
    public int b;
    public boolean c;
    
    static {
        ahbh.registerDefaultInstance((Class)aktw.class, (ahbh)(a = new aktw()));
    }
    
    private aktw() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd d;
                if ((d = aktw.d) == null) {
                    synchronized (aktw.class) {
                        if (aktw.d == null) {
                            aktw.d = (ahdd)new ahba((ahbh)aktw.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aktw.a;
            }
            case 4: {
                return new ahaz((ahbh)aktw.a);
            }
            case 3: {
                return new aktw();
            }
            case 2: {
                return newMessageInfo((MessageLite)aktw.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1007\u0000", new Object[] { "b", "c" });
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
