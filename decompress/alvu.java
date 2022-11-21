import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alvu extends ahcz implements aheo
{
    public static final alvu a;
    private static volatile ahev b;
    private int c;
    private ajbe d;
    private alua e;
    private alvr f;
    private alvx g;
    private amjv h;
    private alvq i;
    private alvt j;
    private byte k;
    
    static {
        ahcz.registerDefaultInstance(alvu.class, a = new alvu());
    }
    
    private alvu() {
        this.k = 2;
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte k = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev b;
                if ((b = alvu.b) == null) {
                    synchronized (alvu.class) {
                        if (alvu.b == null) {
                            alvu.b = (ahev)new ahcs((ahcz)alvu.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return alvu.a;
            }
            case 4: {
                return new ahcr((ahcz)alvu.a);
            }
            case 3: {
                return new alvu();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)alvu.a, "\u0001\u0007\u0000\u0001\ufd47\u1fc8\ufc49\u4483\u0007\u0000\u0000\u0007\ufd47\u1fc8\u1409\n\ue87a\u2102\u1409\u0000\ue90f\u285c\u1409\u0007\ue0de\u2926\u1409\t\uf02d\u2d31\u1409\f\ue55b\u37ee\u1409\u0001\ufc49\u4483\u1409\r", new Object[] { "c", "h", "d", "f", "g", "i", "e", "j" });
            }
            case 1: {
                if (o == null) {
                    k = 0;
                }
                this.k = k;
                return null;
            }
            case 0: {
                return this.k;
            }
        }
    }
}
