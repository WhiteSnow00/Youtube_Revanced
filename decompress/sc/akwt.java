import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akwt extends ahbh implements ahcw
{
    public static final akwt a;
    private static volatile ahdd d;
    public int b;
    public aluq c;
    private byte e;
    
    static {
        ahbh.registerDefaultInstance((Class)akwt.class, (ahbh)(a = new akwt()));
    }
    
    private akwt() {
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
                if ((d = akwt.d) == null) {
                    synchronized (akwt.class) {
                        if (akwt.d == null) {
                            akwt.d = (ahdd)new ahba((ahbh)akwt.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return akwt.a;
            }
            case 4: {
                return new ahaz((ahbh)akwt.a);
            }
            case 3: {
                return new akwt();
            }
            case 2: {
                return newMessageInfo((MessageLite)akwt.a, "\u0001\u0001\u0000\u0001\ufe9b\u33ab\ufe9b\u33ab\u0001\u0000\u0000\u0001\ufe9b\u33ab\u1409\u0000", new Object[] { "b", "c" });
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
