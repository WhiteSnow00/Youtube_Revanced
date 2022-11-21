import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akbp extends ahcz implements aheo
{
    public static final akbp a;
    private static volatile ahev f;
    public int b;
    public int c;
    public int d;
    public int e;
    private int g;
    
    static {
        ahcz.registerDefaultInstance(akbp.class, a = new akbp());
    }
    
    private akbp() {
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        switch (ahcy.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev f;
                if ((f = akbp.f) == null) {
                    synchronized (akbp.class) {
                        if (akbp.f == null) {
                            akbp.f = (ahev)new ahcs((ahcz)akbp.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return akbp.a;
            }
            case 4: {
                return new ahcr((ahcz)akbp.a);
            }
            case 3: {
                return new akbp();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)akbp.a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u1004\u0000\u0002\u1004\u0001\u0003\u1004\u0002\u0004\u1004\u0003", new Object[] { "g", "b", "c", "d", "e" });
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
