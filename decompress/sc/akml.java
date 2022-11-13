import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akml extends ahbh implements ahcw
{
    public static final akml a;
    private static volatile ahdd d;
    public int b;
    public int c;
    
    static {
        ahbh.registerDefaultInstance((Class)akml.class, (ahbh)(a = new akml()));
    }
    
    private akml() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd d;
                if ((d = akml.d) == null) {
                    synchronized (akml.class) {
                        if (akml.d == null) {
                            akml.d = (ahdd)new ahba((ahbh)akml.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return akml.a;
            }
            case 4: {
                return new ahaz((ahbh)akml.a);
            }
            case 3: {
                return new akml();
            }
            case 2: {
                return newMessageInfo((MessageLite)akml.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u100c\u0000", new Object[] { "b", "c", aibi.i });
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
