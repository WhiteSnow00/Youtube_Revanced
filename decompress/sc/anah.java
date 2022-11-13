import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class anah extends ahbh implements ahcw
{
    public static final anah a;
    private static volatile ahdd d;
    public int b;
    public anaj c;
    private byte e;
    
    static {
        ahbh.registerDefaultInstance((Class)anah.class, (ahbh)(a = new anah()));
    }
    
    private anah() {
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
                if ((d = anah.d) == null) {
                    synchronized (anah.class) {
                        if (anah.d == null) {
                            anah.d = (ahdd)new ahba((ahbh)anah.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return anah.a;
            }
            case 4: {
                return new ahaz((ahbh)anah.a);
            }
            case 3: {
                return new anah();
            }
            case 2: {
                return newMessageInfo((MessageLite)anah.a, "\u0001\u0001\u0000\u0001\uf2fb\u3f82\uf2fb\u3f82\u0001\u0000\u0000\u0001\uf2fb\u3f82\u1409\u0000", new Object[] { "b", "c" });
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
