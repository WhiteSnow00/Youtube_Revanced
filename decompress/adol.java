import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adol extends ahcz implements aheo
{
    public static final adol a;
    private static volatile ahev f;
    public double b;
    public double c;
    public String d;
    public String e;
    private int g;
    
    static {
        ahcz.registerDefaultInstance(adol.class, a = new adol());
    }
    
    private adol() {
        this.d = "";
        this.e = "";
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
                if ((f = adol.f) == null) {
                    synchronized (adol.class) {
                        if (adol.f == null) {
                            adol.f = (ahev)new ahcs((ahcz)adol.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return adol.a;
            }
            case 4: {
                return new ahcr((ahcz)adol.a);
            }
            case 3: {
                return new adol();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)adol.a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u1000\u0000\u0002\u1000\u0001\u0003\u1008\u0002\u0004\u1008\u0003", new Object[] { "g", "b", "c", "d", "e" });
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
