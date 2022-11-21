import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alhm extends ahcz implements aheo
{
    public static final alhm a;
    private static volatile ahev e;
    public aknj b;
    public algz c;
    public ahbt d;
    private int f;
    private alhn g;
    private byte h;
    
    static {
        ahcz.registerDefaultInstance(alhm.class, a = new alhm());
    }
    
    private alhm() {
        this.h = 2;
        this.d = ahbt.b;
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
                final ahev e;
                if ((e = alhm.e) == null) {
                    synchronized (alhm.class) {
                        if (alhm.e == null) {
                            alhm.e = (ahev)new ahcs((ahcz)alhm.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return alhm.a;
            }
            case 4: {
                return new ahcr((ahcz)alhm.a);
            }
            case 3: {
                return new alhm();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)alhm.a, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0003\u0001\u1409\u0000\u0003\u1409\u0001\u0004\u1409\u0002\u0005\u100a\u0003", new Object[] { "f", "b", "c", "g", "d" });
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
