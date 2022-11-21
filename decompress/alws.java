import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alws extends ahcz implements aheo
{
    public static final alws a;
    private static volatile ahev f;
    public int b;
    public String c;
    public int d;
    public alwt e;
    
    static {
        ahcz.registerDefaultInstance(alws.class, a = new alws());
    }
    
    private alws() {
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
                final ahev f;
                if ((f = alws.f) == null) {
                    synchronized (alws.class) {
                        if (alws.f == null) {
                            alws.f = (ahev)new ahcs((ahcz)alws.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return alws.a;
            }
            case 4: {
                return new ahcr((ahcz)alws.a);
            }
            case 3: {
                return new alws();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)alws.a, "\u0001\u0003\u0000\u0001\u0003\u0005\u0003\u0000\u0000\u0000\u0003\u1008\u0002\u0004\u100c\u0003\u0005\u1009\u0004", new Object[] { "b", "c", "d", aidb.g, "e" });
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
