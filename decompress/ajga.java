import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajga extends ahbh implements ahcw
{
    public static final ajga a;
    private static volatile ahdd d;
    public int b;
    public boolean c;
    
    static {
        ahbh.registerDefaultInstance((Class)ajga.class, (ahbh)(a = new ajga()));
    }
    
    private ajga() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd d;
                if ((d = ajga.d) == null) {
                    synchronized (ajga.class) {
                        if (ajga.d == null) {
                            ajga.d = (ahdd)new ahba((ahbh)ajga.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return ajga.a;
            }
            case 4: {
                return new ahaz((ahbh)ajga.a);
            }
            case 3: {
                return new ajga();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajga.a, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002\u1007\u0001", new Object[] { "b", "c" });
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
