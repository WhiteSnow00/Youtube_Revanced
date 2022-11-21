import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aksa extends ahcz implements aheo
{
    public static final aksa a;
    private static volatile ahev e;
    public int b;
    public Object c;
    public aknj d;
    private int f;
    private byte g;
    
    static {
        ahcz.registerDefaultInstance(aksa.class, a = new aksa());
    }
    
    private aksa() {
        this.b = 0;
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
                final ahev e;
                if ((e = aksa.e) == null) {
                    synchronized (aksa.class) {
                        if (aksa.e == null) {
                            aksa.e = (ahev)new ahcs((ahcz)aksa.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return aksa.a;
            }
            case 4: {
                return new ahcr((ahcz)aksa.a);
            }
            case 3: {
                return new aksa();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aksa.a, "\u0001\u0003\u0001\u0001\u0001\u0004\u0003\u0000\u0000\u0003\u0001\u1409\u0000\u0003\u143c\u0000\u0004\u143c\u0000", new Object[] { "c", "b", "f", "d", aisc.class, aisc.class });
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
