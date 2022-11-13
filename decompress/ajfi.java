import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajfi extends ahbh implements ahcw
{
    public static final ajfi a;
    private static volatile ahdd d;
    public ahbp b;
    public ahbp c;
    
    static {
        ahbh.registerDefaultInstance((Class)ajfi.class, (ahbh)(a = new ajfi()));
    }
    
    private ajfi() {
        this.b = emptyIntList();
        this.c = emptyIntList();
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd d;
                if ((d = ajfi.d) == null) {
                    synchronized (ajfi.class) {
                        if (ajfi.d == null) {
                            ajfi.d = (ahdd)new ahba((ahbh)ajfi.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return ajfi.a;
            }
            case 4: {
                return new ahaz((ahbh)ajfi.a);
            }
            case 3: {
                return new ajfi();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajfi.a, "\u0001\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001\u0016\u0002\u0016", new Object[] { "b", "c" });
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
