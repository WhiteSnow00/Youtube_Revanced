import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahil extends ahbh implements ahcw
{
    public static final ahil a;
    private static volatile ahdd d;
    public int b;
    public ahik c;
    
    static {
        ahbh.registerDefaultInstance((Class)ahil.class, (ahbh)(a = new ahil()));
    }
    
    private ahil() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd d;
                if ((d = ahil.d) == null) {
                    synchronized (ahil.class) {
                        if (ahil.d == null) {
                            ahil.d = (ahdd)new ahba((ahbh)ahil.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return ahil.a;
            }
            case 4: {
                return new ahaz((ahbh)ahil.a);
            }
            case 3: {
                return new ahil();
            }
            case 2: {
                return newMessageInfo((MessageLite)ahil.a, "\u0001\u0001\u0000\u0001\uecfa\u241c\uecfa\u241c\u0001\u0000\u0000\u0000\uecfa\u241c\u1009\u0000", new Object[] { "b", "c" });
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
