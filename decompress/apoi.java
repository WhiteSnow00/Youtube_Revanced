import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apoi extends ahcz implements aheo
{
    private static final apoi a;
    private static volatile ahev b;
    private int c;
    private Object d;
    
    static {
        ahcz.registerDefaultInstance(apoi.class, a = new apoi());
    }
    
    private apoi() {
        this.c = 0;
    }
    
    public static apoh a() {
        return (apoh)apoi.a.createBuilder();
    }
    
    static apoi b() {
        return apoi.a;
    }
    
    public static void c(final apoi apoi, final apog apog) {
        apoi.d(apog);
    }
    
    private void d(final apog d) {
        d.getClass();
        this.d = d;
        this.c = 1;
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        switch (ahcy.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev b;
                if ((b = apoi.b) == null) {
                    synchronized (apoi.class) {
                        if (apoi.b == null) {
                            apoi.b = (ahev)new ahcs((ahcz)apoi.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return apoi.a;
            }
            case 4: {
                return new apoh();
            }
            case 3: {
                return new apoi();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)apoi.a, "\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u103c\u0000", new Object[] { "d", "c", apog.class });
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
