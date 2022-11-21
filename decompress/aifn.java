import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aifn extends ahcz implements aheo
{
    public static final aifn a;
    private static volatile ahev f;
    public int b;
    public aooo c;
    public aikb d;
    public apjc e;
    private aies g;
    private byte h;
    
    static {
        ahcz.registerDefaultInstance(aifn.class, a = new aifn());
    }
    
    private aifn() {
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
                final ahev f;
                if ((f = aifn.f) == null) {
                    synchronized (aifn.class) {
                        if (aifn.f == null) {
                            aifn.f = (ahev)new ahcs((ahcz)aifn.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return aifn.a;
            }
            case 4: {
                return new ahcr((ahcz)aifn.a);
            }
            case 3: {
                return new aifn();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aifn.a, "\u0001\u0004\u0000\u0001\ue084\u1870\ueb11\u1f11\u0004\u0000\u0000\u0004\ue084\u1870\u1409\u0001\ue2d9\u1a6d\u1409\u0000\ue61f\u1e16\u1409\u0002\ueb11\u1f11\u1409\u0003", new Object[] { "b", "d", "c", "e", "g" });
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
