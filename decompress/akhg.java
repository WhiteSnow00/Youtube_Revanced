import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akhg extends ahbh implements ahcw
{
    public static final akhg a;
    private static volatile ahdd d;
    public int b;
    public boolean c;
    
    static {
        ahbh.registerDefaultInstance((Class)akhg.class, (ahbh)(a = new akhg()));
    }
    
    private akhg() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd d;
                if ((d = akhg.d) == null) {
                    synchronized (akhg.class) {
                        if (akhg.d == null) {
                            akhg.d = (ahdd)new ahba((ahbh)akhg.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return akhg.a;
            }
            case 4: {
                return new ahaz((ahbh)akhg.a);
            }
            case 3: {
                return new akhg();
            }
            case 2: {
                return newMessageInfo((MessageLite)akhg.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1007\u0000", new Object[] { "b", "c" });
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
