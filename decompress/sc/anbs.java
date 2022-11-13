import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class anbs extends ahbh implements ahcw
{
    public static final anbs a;
    private static volatile ahdd d;
    public int b;
    public Object c;
    private byte e;
    
    static {
        ahbh.registerDefaultInstance((Class)anbs.class, (ahbh)(a = new anbs()));
    }
    
    private anbs() {
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
                if ((d = anbs.d) == null) {
                    synchronized (anbs.class) {
                        if (anbs.d == null) {
                            anbs.d = (ahdd)new ahba((ahbh)anbs.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return anbs.a;
            }
            case 4: {
                return new ahaz((ahbh)anbs.a);
            }
            case 3: {
                return new anbs();
            }
            case 2: {
                return newMessageInfo((MessageLite)anbs.a, "\u0001\u0002\u0001\u0000\ueca8\u3807\uf173\u97cf\u0002\u0000\u0000\u0002\ueca8\u3807\u143c\u0000\uf173\u97cf\u143c\u0000", new Object[] { "c", "b", anbp.class, anbm.class });
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
