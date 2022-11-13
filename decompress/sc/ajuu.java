import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajuu extends ahbh implements ahcw
{
    public static final ajuu a;
    private static volatile ahdd d;
    public int b;
    public ahik c;
    
    static {
        ahbh.registerDefaultInstance((Class)ajuu.class, (ahbh)(a = new ajuu()));
    }
    
    private ajuu() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd d;
                if ((d = ajuu.d) == null) {
                    synchronized (ajuu.class) {
                        if (ajuu.d == null) {
                            ajuu.d = (ahdd)new ahba((ahbh)ajuu.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return ajuu.a;
            }
            case 4: {
                return new ahaz((ahbh)ajuu.a);
            }
            case 3: {
                return new ajuu();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajuu.a, "\u0001\u0001\u0000\u0001\uecfa\u241c\uecfa\u241c\u0001\u0000\u0000\u0000\uecfa\u241c\u1009\u0000", new Object[] { "b", "c" });
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
