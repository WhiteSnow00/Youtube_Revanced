import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akfx extends ahcz implements aheo
{
    public static final akfx a;
    private static volatile ahev g;
    public int b;
    public double c;
    public double d;
    public double e;
    public double f;
    
    static {
        ahcz.registerDefaultInstance(akfx.class, a = new akfx());
    }
    
    private akfx() {
        this.e = 1.0;
        this.f = 1.0;
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        switch (ahcy.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev g;
                if ((g = akfx.g) == null) {
                    synchronized (akfx.class) {
                        if (akfx.g == null) {
                            akfx.g = (ahev)new ahcs((ahcz)akfx.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return akfx.a;
            }
            case 4: {
                return new ahcr((ahcz)akfx.a);
            }
            case 3: {
                return new akfx();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)akfx.a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u1000\u0000\u0002\u1000\u0001\u0003\u1000\u0002\u0004\u1000\u0003", new Object[] { "b", "c", "d", "e", "f" });
            }
            case 1: {
                return null;
            }
            case 0: {
                return 1;
            }
        }
    }
}
