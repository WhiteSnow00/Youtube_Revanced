import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akze extends ahcz implements aheo
{
    public static final akze a;
    private static volatile ahev g;
    public int b;
    public amhq c;
    public apyi d;
    public aoxu e;
    public aisg f;
    private byte h;
    
    static {
        ahcz.registerDefaultInstance(akze.class, a = new akze());
    }
    
    private akze() {
        this.h = 2;
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte h = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev g;
                if ((g = akze.g) == null) {
                    synchronized (akze.class) {
                        if (akze.g == null) {
                            akze.g = (ahev)new ahcs((ahcz)akze.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return akze.a;
            }
            case 4: {
                return new ahcr((ahcz)akze.a);
            }
            case 3: {
                return new akze();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)akze.a, "\u0001\u0004\u0000\u0001\uefcf\u2e35\ue60b\u56e4\u0004\u0000\u0000\u0004\uefcf\u2e35\u1409\u0000\uf23f\u3911\u1409\u0001\ueb41\u48e5\u1409\u0002\ue60b\u56e4\u1409\u0003", new Object[] { "b", "c", "d", "e", "f" });
            }
            case 1: {
                if (o == null) {
                    h = 0;
                }
                this.h = h;
                return null;
            }
            case 0: {
                return this.h;
            }
        }
    }
}
