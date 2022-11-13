import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class anfl extends ahbh implements ahcw
{
    public static final anfl a;
    private static volatile ahdd e;
    public int b;
    public boolean c;
    public int d;
    
    static {
        ahbh.registerDefaultInstance((Class)anfl.class, (ahbh)(a = new anfl()));
    }
    
    private anfl() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd e;
                if ((e = anfl.e) == null) {
                    synchronized (anfl.class) {
                        if (anfl.e == null) {
                            anfl.e = (ahdd)new ahba((ahbh)anfl.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return anfl.a;
            }
            case 4: {
                return new ahaz((ahbh)anfl.a);
            }
            case 3: {
                return new anfl();
            }
            case 2: {
                return newMessageInfo((MessageLite)anfl.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1007\u0000\u0002\u100c\u0001", new Object[] { "b", "c", "d", anfi.a() });
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
