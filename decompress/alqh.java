import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alqh extends ahbh implements ahcw
{
    public static final alqh a;
    private static volatile ahdd d;
    public int b;
    public Object c;
    private byte e;
    
    static {
        ahbh.registerDefaultInstance((Class)alqh.class, (ahbh)(a = new alqh()));
    }
    
    private alqh() {
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
                if ((d = alqh.d) == null) {
                    synchronized (alqh.class) {
                        if (alqh.d == null) {
                            alqh.d = (ahdd)new ahba((ahbh)alqh.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return alqh.a;
            }
            case 4: {
                return new ahaz((ahbh)alqh.a);
            }
            case 3: {
                return new alqh();
            }
            case 2: {
                return newMessageInfo((MessageLite)alqh.a, "\u0001\u000f\u0001\u0000\ufd38\u37ee\uf266\uba6f\u000f\u0000\u0000\u000e\ufd38\u37ee\u143c\u0000\ue67e\u3dbf\u143c\u0000\ufc8a\u3e4d\u143c\u0000\ufb93\u3f2d\u143c\u0000\uee50\u3f8d\u143c\u0000\ue359\u4612\u103c\u0000\ue9ba\u4614\u143c\u0000\uf492\u4933\u143c\u0000\uee51\u4ecc\u143c\u0000\uf616\u5df7\u143c\u0000\uf602\u6ed0\u143c\u0000\uf863\u7800\u143c\u0000\uf9a6\u8c63\u143c\u0000\ueba6\ub50b\u143c\u0000\uf266\uba6f\u143c\u0000", new Object[] { "c", "b", alqo.class, alqk.class, alqi.class, alri.class, alql.class, alqn.class, alqf.class, ajmo.class, alqp.class, alrj.class, alqj.class, alqg.class, alru.class, aoji.class, aojj.class });
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
