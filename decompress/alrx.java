import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alrx extends ahbh implements ahcw
{
    public static final alrx a;
    private static volatile ahdd d;
    public int b;
    public Object c;
    private byte e;
    
    static {
        ahbh.registerDefaultInstance((Class)alrx.class, (ahbh)(a = new alrx()));
    }
    
    private alrx() {
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
                if ((d = alrx.d) == null) {
                    synchronized (alrx.class) {
                        if (alrx.d == null) {
                            alrx.d = (ahdd)new ahba((ahbh)alrx.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return alrx.a;
            }
            case 4: {
                return new ahaz((ahbh)alrx.a);
            }
            case 3: {
                return new alrx();
            }
            case 2: {
                return newMessageInfo((MessageLite)alrx.a, "\u0001\u0003\u0001\u0000\ue592\u1be6\ue4ee\u3f2e\u0003\u0000\u0000\u0003\ue592\u1be6\u143c\u0000\ue0bd\u39da\u143c\u0000\ue4ee\u3f2e\u143c\u0000", new Object[] { "c", "b", amhi.class, alrc.class, alsf.class });
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
