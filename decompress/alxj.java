import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alxj extends ahcz implements aheo
{
    public static final alxj a;
    private static volatile ahev f;
    public int b;
    public double c;
    public double d;
    public double e;
    
    static {
        ahcz.registerDefaultInstance(alxj.class, a = new alxj());
    }
    
    private alxj() {
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
                if ((f = alxj.f) == null) {
                    synchronized (alxj.class) {
                        if (alxj.f == null) {
                            alxj.f = (ahev)new ahcs((ahcz)alxj.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return alxj.a;
            }
            case 4: {
                return new ahcr((ahcz)alxj.a);
            }
            case 3: {
                return new alxj();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)alxj.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u1000\u0000\u0002\u1000\u0001\u0003\u1000\u0002", new Object[] { "b", "c", "d", "e" });
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
