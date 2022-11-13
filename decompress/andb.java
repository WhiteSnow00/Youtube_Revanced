import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class andb extends ahbh implements ahcw
{
    public static final andb a;
    private static volatile ahdd e;
    public int b;
    public boolean c;
    public boolean d;
    
    static {
        ahbh.registerDefaultInstance((Class)andb.class, (ahbh)(a = new andb()));
    }
    
    private andb() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd e;
                if ((e = andb.e) == null) {
                    synchronized (andb.class) {
                        if (andb.e == null) {
                            andb.e = (ahdd)new ahba((ahbh)andb.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return andb.a;
            }
            case 4: {
                return new ahaz((ahbh)andb.a);
            }
            case 3: {
                return new andb();
            }
            case 2: {
                return newMessageInfo((MessageLite)andb.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1007\u0000\u0002\u1007\u0001", new Object[] { "b", "c", "d" });
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
