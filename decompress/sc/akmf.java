import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akmf extends ahbh implements ahcw
{
    public static final akmf a;
    private static volatile ahdd d;
    public int b;
    public Object c;
    private byte e;
    
    static {
        ahbh.registerDefaultInstance((Class)akmf.class, (ahbh)(a = new akmf()));
    }
    
    private akmf() {
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
                if ((d = akmf.d) == null) {
                    synchronized (akmf.class) {
                        if (akmf.d == null) {
                            akmf.d = (ahdd)new ahba((ahbh)akmf.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return akmf.a;
            }
            case 4: {
                return new ahaz((ahbh)akmf.a);
            }
            case 3: {
                return new akmf();
            }
            case 2: {
                return newMessageInfo((MessageLite)akmf.a, "\u0001\u0001\u0001\u0000\uf073\u28c2\uf073\u28c2\u0001\u0000\u0000\u0001\uf073\u28c2\u143c\u0000", new Object[] { "c", "b", aluc.class });
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
