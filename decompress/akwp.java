import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akwp extends ahcz implements aheo
{
    public static final akwp a;
    private static volatile ahev f;
    public int b;
    public aknj c;
    public aisc d;
    public ahxw e;
    private aisc g;
    private byte h;
    
    static {
        ahcz.registerDefaultInstance(akwp.class, a = new akwp());
    }
    
    private akwp() {
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
                if ((f = akwp.f) == null) {
                    synchronized (akwp.class) {
                        if (akwp.f == null) {
                            akwp.f = (ahev)new ahcs((ahcz)akwp.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return akwp.a;
            }
            case 4: {
                return new ahcr((ahcz)akwp.a);
            }
            case 3: {
                return new akwp();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)akwp.a, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0003\u0001\u1409\u0000\u0002\u1409\u0001\u0004\u1009\u0003\u0005\u1409\u0002", new Object[] { "b", "c", "d", "e", "g" });
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
