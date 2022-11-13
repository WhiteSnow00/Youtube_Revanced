import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alej extends ahbh implements ahcw
{
    public static final alej a;
    private static volatile ahdd d;
    public int b;
    public Object c;
    private byte e;
    
    static {
        ahbh.registerDefaultInstance((Class)alej.class, (ahbh)(a = new alej()));
    }
    
    private alej() {
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
                if ((d = alej.d) == null) {
                    synchronized (alej.class) {
                        if (alej.d == null) {
                            alej.d = (ahdd)new ahba((ahbh)alej.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return alej.a;
            }
            case 4: {
                return new ahaz((ahbh)alej.a);
            }
            case 3: {
                return new alej();
            }
            case 2: {
                return newMessageInfo((MessageLite)alej.a, "\u0001\u0006\u0001\u0000\uefcf\u2e35\uefaa\uc8b4\u0006\u0000\u0000\u0006\uefcf\u2e35\u143c\u0000\ufa55\u30cf\u143c\u0000\ufb74\u3a2c\u143c\u0000\ueb41\u48e5\u143c\u0000\ue1c0\ua279\u143c\u0000\uefaa\uc8b4\u143c\u0000", new Object[] { "c", "b", amfo.class, ajfc.class, ajwo.class, aovi.class, aixp.class, aicd.class });
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
