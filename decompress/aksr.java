import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aksr extends ahcz implements aheo
{
    public static final aksr a;
    private static volatile ahev f;
    public int b;
    public int c;
    public Object d;
    public aknh e;
    private byte g;
    
    static {
        ahcz.registerDefaultInstance(aksr.class, a = new aksr());
    }
    
    private aksr() {
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
                if ((f = aksr.f) == null) {
                    synchronized (aksr.class) {
                        if (aksr.f == null) {
                            aksr.f = (ahev)new ahcs((ahcz)aksr.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return aksr.a;
            }
            case 4: {
                return new ahcr((ahcz)aksr.a);
            }
            case 3: {
                return new aksr();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aksr.a, "\u0001\u0003\u0001\u0001\u0001\u0004\u0003\u0000\u0000\u0001\u0001\u1409\u0000\u0003\u103b\u0000\u0004\u103b\u0000", new Object[] { "d", "c", "b", "e" });
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
