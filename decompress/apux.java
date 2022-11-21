import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apux extends ahcz implements aheo
{
    public static final apux a;
    private static volatile ahev f;
    public int b;
    public anfs c;
    public anfr d;
    public anft e;
    
    static {
        ahcz.registerDefaultInstance(apux.class, a = new apux());
    }
    
    private apux() {
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
                if ((f = apux.f) == null) {
                    synchronized (apux.class) {
                        if (apux.f == null) {
                            apux.f = (ahev)new ahcs((ahcz)apux.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return apux.a;
            }
            case 4: {
                return new ahcr((ahcz)apux.a);
            }
            case 3: {
                return new apux();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)apux.a, "\u0001\u0003\u0000\u0001\uf027\u2085\ue433\u2ca7\u0003\u0000\u0000\u0000\uf027\u2085\u1009\u0001\ue7c7\u20a1\u1009\u0000\ue433\u2ca7\u1009\u0003", new Object[] { "b", "d", "c", "e" });
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
