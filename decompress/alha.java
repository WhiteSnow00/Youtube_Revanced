import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alha extends ahcz implements aheo
{
    public static final alha a;
    private static volatile ahev f;
    public int b;
    public int c;
    public Object d;
    public aqal e;
    private byte g;
    
    static {
        ahcz.registerDefaultInstance(alha.class, a = new alha());
    }
    
    private alha() {
        this.c = 0;
        this.g = 2;
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte g = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev f;
                if ((f = alha.f) == null) {
                    synchronized (alha.class) {
                        if (alha.f == null) {
                            alha.f = (ahev)new ahcs((ahcz)alha.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return alha.a;
            }
            case 4: {
                return new ahcr((ahcz)alha.a);
            }
            case 3: {
                return new alha();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)alha.a, "\u0001\b\u0001\u0001\uf875\u1be7\ue893\ub05f\b\u0000\u0000\b\uf875\u1be7\u143c\u0000\uf437\u1f3b\u1409\u0007\ue642\u2d46\u143c\u0000\ue35f\u4d02\u143c\u0000\ued59\u5db2\u143c\u0000\uec17\u5ddb\u143c\u0000\uf475\u6168\u143c\u0000\ue893\ub05f\u143c\u0000", new Object[] { "d", "c", "b", apzo.class, "e", amig.class, apaq.class, aomi.class, apar.class, aomh.class, aoly.class });
            }
            case 1: {
                if (o == null) {
                    g = 0;
                }
                this.g = g;
                return null;
            }
            case 0: {
                return this.g;
            }
        }
    }
}
