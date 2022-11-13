import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alrb extends ahbh implements ahcw
{
    public static final alrb a;
    private static volatile ahdd d;
    public int b;
    public Object c;
    private byte e;
    
    static {
        ahbh.registerDefaultInstance((Class)alrb.class, (ahbh)(a = new alrb()));
    }
    
    private alrb() {
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
                if ((d = alrb.d) == null) {
                    synchronized (alrb.class) {
                        if (alrb.d == null) {
                            alrb.d = (ahdd)new ahba((ahbh)alrb.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return alrb.a;
            }
            case 4: {
                return new ahaz((ahbh)alrb.a);
            }
            case 3: {
                return new alrb();
            }
            case 2: {
                return newMessageInfo((MessageLite)alrb.a, "\u0001\u0005\u0001\u0000\uf6dc\u3c3c\ufa47\uc337\u0005\u0000\u0000\u0005\uf6dc\u3c3c\u143c\u0000\ue68a\u3d88\u143c\u0000\uf407\u5a86\u143c\u0000\uf9fc\u7ebd\u143c\u0000\ufa47\uc337\u143c\u0000", new Object[] { "c", "b", ajom.class, alpr.class, alrt.class, alrk.class, alrv.class });
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
