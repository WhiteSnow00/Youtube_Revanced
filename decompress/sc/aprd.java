import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aprd extends ahbh implements ahcw
{
    public static final aprd a;
    private static volatile ahdd d;
    public int b;
    public Object c;
    private byte e;
    
    static {
        ahbh.registerDefaultInstance((Class)aprd.class, (ahbh)(a = new aprd()));
    }
    
    private aprd() {
        this.b = 0;
        this.e = 2;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte e = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd d;
                if ((d = aprd.d) == null) {
                    synchronized (aprd.class) {
                        if (aprd.d == null) {
                            aprd.d = (ahdd)new ahba((ahbh)aprd.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aprd.a;
            }
            case 4: {
                return new ahaz((ahbh)aprd.a);
            }
            case 3: {
                return new aprd();
            }
            case 2: {
                return newMessageInfo((MessageLite)aprd.a, "\u0001\u0004\u0001\u0000\uf3bf\u17d3\ue0ef\u3f6a\u0004\u0000\u0000\u0004\uf3bf\u17d3\u143c\u0000\ufc6c\u17d3\u143c\u0000\uea0c\u3a83\u143c\u0000\ue0ef\u3f6a\u143c\u0000", new Object[] { "c", "b", apre.class, aprw.class, aprh.class, aokg.class });
            }
            case 1: {
                if (o == null) {
                    e = 0;
                }
                this.e = e;
                return null;
            }
            case 0: {
                return this.e;
            }
        }
    }
}
