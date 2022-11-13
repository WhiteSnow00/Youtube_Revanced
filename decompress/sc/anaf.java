import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class anaf extends ahbh implements ahcw
{
    public static final anaf a;
    private static volatile ahdd b;
    private int c;
    private amzy d;
    private byte e;
    
    static {
        ahbh.registerDefaultInstance((Class)anaf.class, (ahbh)(a = new anaf()));
    }
    
    private anaf() {
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
                final ahdd b;
                if ((b = anaf.b) == null) {
                    synchronized (anaf.class) {
                        if (anaf.b == null) {
                            anaf.b = (ahdd)new ahba((ahbh)anaf.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return anaf.a;
            }
            case 4: {
                return new ahaz((ahbh)anaf.a);
            }
            case 3: {
                return new anaf();
            }
            case 2: {
                return newMessageInfo((MessageLite)anaf.a, "\u0001\u0001\u0000\u0001\uf976\u3e95\uf976\u3e95\u0001\u0000\u0000\u0001\uf976\u3e95\u1409\u0000", new Object[] { "c", "d" });
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
