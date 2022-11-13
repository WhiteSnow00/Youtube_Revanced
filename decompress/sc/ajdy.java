import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajdy extends ahbh implements ahcw
{
    public static final ajdy a;
    private static volatile ahdd e;
    public int b;
    public int c;
    public int d;
    
    static {
        ahbh.registerDefaultInstance((Class)ajdy.class, (ahbh)(a = new ajdy()));
    }
    
    private ajdy() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd e;
                if ((e = ajdy.e) == null) {
                    synchronized (ajdy.class) {
                        if (ajdy.e == null) {
                            ajdy.e = (ahdd)new ahba((ahbh)ajdy.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return ajdy.a;
            }
            case 4: {
                return new ahaz((ahbh)ajdy.a);
            }
            case 3: {
                return new ajdy();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajdy.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u100c\u0000\u0002\u100c\u0001", new Object[] { "b", "c", ajdz.a(), "d", amqs.a() });
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
