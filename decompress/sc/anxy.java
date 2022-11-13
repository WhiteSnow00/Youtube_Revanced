import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class anxy extends ahbh implements ahcw
{
    public static final anxy a;
    private static volatile ahdd d;
    public boolean b;
    public int c;
    private int e;
    
    static {
        ahbh.registerDefaultInstance((Class)anxy.class, (ahbh)(a = new anxy()));
    }
    
    private anxy() {
        emptyIntList();
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd d;
                if ((d = anxy.d) == null) {
                    synchronized (anxy.class) {
                        if (anxy.d == null) {
                            anxy.d = (ahdd)new ahba((ahbh)anxy.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return anxy.a;
            }
            case 4: {
                return new ahaz((ahbh)anxy.a);
            }
            case 3: {
                return new anxy();
            }
            case 2: {
                return newMessageInfo((MessageLite)anxy.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1007\u0000\u0002\u1004\u0001", new Object[] { "e", "b", "c" });
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
