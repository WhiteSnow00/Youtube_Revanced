import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amle extends ahbh implements ahcw
{
    public static final amle a;
    private static volatile ahdd d;
    public int b;
    public Object c;
    private byte e;
    
    static {
        ahbh.registerDefaultInstance((Class)amle.class, (ahbh)(a = new amle()));
    }
    
    private amle() {
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
                if ((d = amle.d) == null) {
                    synchronized (amle.class) {
                        if (amle.d == null) {
                            amle.d = (ahdd)new ahba((ahbh)amle.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return amle.a;
            }
            case 4: {
                return new ahaz((ahbh)amle.a);
            }
            case 3: {
                return new amle();
            }
            case 2: {
                return newMessageInfo((MessageLite)amle.a, "\u0001\u0005\u0001\u0000\ufefc\u2a3b\ufbe5\u9d2a\u0005\u0000\u0000\u0005\ufefc\u2a3b\u143c\u0000\ue1ce\u3a42\u143c\u0000\uf5b1\u73a8\u143c\u0000\ue504\u89b4\u143c\u0000\ufbe5\u9d2a\u143c\u0000", new Object[] { "c", "b", alww.class, amlj.class, anng.class, aifz.class, ajth.class });
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
