import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aigi extends ahcz implements aheo
{
    public static final aigi a;
    private static volatile ahev c;
    public angk b;
    private int d;
    private angg e;
    private byte f;
    
    static {
        ahcz.registerDefaultInstance(aigi.class, a = new aigi());
    }
    
    private aigi() {
        this.f = 2;
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte f = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev c;
                if ((c = aigi.c) == null) {
                    synchronized (aigi.class) {
                        if (aigi.c == null) {
                            aigi.c = (ahev)new ahcs((ahcz)aigi.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return aigi.a;
            }
            case 4: {
                return new ahcr((ahcz)aigi.a);
            }
            case 3: {
                return new aigi();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aigi.a, "\u0001\u0002\u0000\u0001\ufdd2\u178f\uee01\u189d\u0002\u0000\u0000\u0002\ufdd2\u178f\u1409\u0000\uee01\u189d\u1409\u0001", new Object[] { "d", "e", "b" });
            }
            case 1: {
                if (o == null) {
                    f = 0;
                }
                this.f = f;
                return null;
            }
            case 0: {
                return this.f;
            }
        }
    }
}
