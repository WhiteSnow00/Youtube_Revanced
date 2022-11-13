import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akwy extends ahbh implements ahcw
{
    public static final akwy a;
    private static volatile ahdd d;
    public int b;
    public Object c;
    private byte e;
    
    static {
        ahbh.registerDefaultInstance((Class)akwy.class, (ahbh)(a = new akwy()));
    }
    
    private akwy() {
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
                if ((d = akwy.d) == null) {
                    synchronized (akwy.class) {
                        if (akwy.d == null) {
                            akwy.d = (ahdd)new ahba((ahbh)akwy.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return akwy.a;
            }
            case 4: {
                return new ahaz((ahbh)akwy.a);
            }
            case 3: {
                return new akwy();
            }
            case 2: {
                return newMessageInfo((MessageLite)akwy.a, "\u0001\t\u0001\u0000\uf364\u1bd3\ue2df\ua7cb\t\u0000\u0000\b\uf364\u1bd3\u143c\u0000\uf321\u1e90\u143c\u0000\ue80f\u1ecc\u143c\u0000\uf767\u224e\u143c\u0000\ue94e\u22ec\u143c\u0000\ue22b\u2916\u143c\u0000\uf811\u2b8e\u143c\u0000\uf2ec\u69c5\u103c\u0000\ue2df\ua7cb\u143c\u0000", new Object[] { "c", "b", anew.class, aixf.class, anfo.class, anfp.class, anfd.class, apxw.class, anhe.class, aifi.class, anev.class });
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
