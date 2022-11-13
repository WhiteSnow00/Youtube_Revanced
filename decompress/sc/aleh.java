import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aleh extends ahbh implements ahcw
{
    public static final aleh a;
    private static volatile ahdd e;
    public int b;
    public boolean c;
    public int d;
    
    static {
        ahbh.registerDefaultInstance((Class)aleh.class, (ahbh)(a = new aleh()));
    }
    
    private aleh() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd e;
                if ((e = aleh.e) == null) {
                    synchronized (aleh.class) {
                        if (aleh.e == null) {
                            aleh.e = (ahdd)new ahba((ahbh)aleh.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return aleh.a;
            }
            case 4: {
                return new ahaz((ahbh)aleh.a);
            }
            case 3: {
                return new aleh();
            }
            case 2: {
                return newMessageInfo((MessageLite)aleh.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1007\u0000\u0002\u1004\u0001", new Object[] { "b", "c", "d" });
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
