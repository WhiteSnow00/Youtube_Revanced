import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajxw extends ahbh implements ahcw
{
    public static final ajxw a;
    private static volatile ahdd d;
    public int b;
    public anwr c;
    
    static {
        ahbh.registerDefaultInstance((Class)ajxw.class, (ahbh)(a = new ajxw()));
    }
    
    private ajxw() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd d;
                if ((d = ajxw.d) == null) {
                    synchronized (ajxw.class) {
                        if (ajxw.d == null) {
                            ajxw.d = (ahdd)new ahba((ahbh)ajxw.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return ajxw.a;
            }
            case 4: {
                return new ahaz((ahbh)ajxw.a);
            }
            case 3: {
                return new ajxw();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajxw.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1009\u0000", new Object[] { "b", "c" });
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
