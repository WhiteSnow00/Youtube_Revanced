import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alpl extends ahbh implements ahcw
{
    public static final alpl a;
    private static volatile ahdd d;
    public int b;
    public Object c;
    private byte e;
    
    static {
        ahbh.registerDefaultInstance((Class)alpl.class, (ahbh)(a = new alpl()));
    }
    
    private alpl() {
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
                if ((d = alpl.d) == null) {
                    synchronized (alpl.class) {
                        if (alpl.d == null) {
                            alpl.d = (ahdd)new ahba((ahbh)alpl.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return alpl.a;
            }
            case 4: {
                return new ahaz((ahbh)alpl.a);
            }
            case 3: {
                return new alpl();
            }
            case 2: {
                return newMessageInfo((MessageLite)alpl.a, "\u0001\u0001\u0001\u0000\uf751\u3d4a\uf751\u3d4a\u0001\u0000\u0000\u0001\uf751\u3d4a\u143c\u0000", new Object[] { "c", "b", alpk.class });
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
