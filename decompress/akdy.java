import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akdy extends ahcz implements aheo
{
    public static final akdy a;
    private static volatile ahev g;
    public int b;
    public int c;
    public long d;
    public long e;
    public boolean f;
    
    static {
        ahcz.registerDefaultInstance(akdy.class, a = new akdy());
    }
    
    private akdy() {
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
                if ((g = akdy.g) == null) {
                    synchronized (akdy.class) {
                        if (akdy.g == null) {
                            akdy.g = (ahev)new ahcs((ahcz)akdy.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return akdy.a;
            }
            case 4: {
                return new ahcr((ahcz)akdy.a);
            }
            case 3: {
                return new akdy();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)akdy.a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u100c\u0000\u0002\u1002\u0001\u0003\u1002\u0002\u0004\u1007\u0003", new Object[] { "b", "c", akan.p, "d", "e", "f" });
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
