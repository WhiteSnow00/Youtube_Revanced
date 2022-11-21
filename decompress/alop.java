import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alop extends ahcz implements aheo
{
    public static final alop a;
    private static volatile ahev g;
    public int b;
    public String c;
    public boolean d;
    public int e;
    public int f;
    
    static {
        ahcz.registerDefaultInstance(alop.class, a = new alop());
    }
    
    private alop() {
        this.c = "";
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
                if ((g = alop.g) == null) {
                    synchronized (alop.class) {
                        if (alop.g == null) {
                            alop.g = (ahev)new ahcs((ahcz)alop.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return alop.a;
            }
            case 4: {
                return new ahcr((ahcz)alop.a);
            }
            case 3: {
                return new alop();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)alop.a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1007\u0001\u0003\u100c\u0002\u0004\u100c\u0003", new Object[] { "b", "c", "d", "e", alox.a(), "f", ankj.h });
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
