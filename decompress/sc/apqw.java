import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apqw extends ahbh implements ahcw
{
    public static final apqw a;
    private static volatile ahdd d;
    public int b;
    public Object c;
    private byte e;
    
    static {
        ahbh.registerDefaultInstance((Class)apqw.class, (ahbh)(a = new apqw()));
    }
    
    private apqw() {
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
                if ((d = apqw.d) == null) {
                    synchronized (apqw.class) {
                        if (apqw.d == null) {
                            apqw.d = (ahdd)new ahba((ahbh)apqw.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return apqw.a;
            }
            case 4: {
                return new ahaz((ahbh)apqw.a);
            }
            case 3: {
                return new apqw();
            }
            case 2: {
                return newMessageInfo((MessageLite)apqw.a, "\u0001\u0003\u0001\u0000\ue113\u3a90\uf492\u4933\u0003\u0000\u0000\u0003\ue113\u3a90\u143c\u0000\uffdb\u3e3c\u143c\u0000\uf492\u4933\u143c\u0000", new Object[] { "c", "b", aprf.class, aoki.class, ajmo.class });
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
