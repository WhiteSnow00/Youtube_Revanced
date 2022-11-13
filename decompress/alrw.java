import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alrw extends ahbh implements ahcw
{
    public static final alrw a;
    private static volatile ahdd d;
    public int b;
    public int c;
    
    static {
        ahbh.registerDefaultInstance((Class)alrw.class, (ahbh)(a = new alrw()));
    }
    
    private alrw() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd d;
                if ((d = alrw.d) == null) {
                    synchronized (alrw.class) {
                        if (alrw.d == null) {
                            alrw.d = (ahdd)new ahba((ahbh)alrw.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return alrw.a;
            }
            case 4: {
                return new ahaz((ahbh)alrw.a);
            }
            case 3: {
                return new alrw();
            }
            case 2: {
                return newMessageInfo((MessageLite)alrw.a, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002\u100b\u0001", new Object[] { "b", "c" });
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
