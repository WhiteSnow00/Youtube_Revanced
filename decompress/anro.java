import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class anro extends ahcz implements aheo
{
    public static final anro a;
    private static volatile ahev f;
    public int b;
    public int c;
    public int d;
    public int e;
    
    static {
        ahcz.registerDefaultInstance(anro.class, a = new anro());
    }
    
    private anro() {
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
                if ((f = anro.f) == null) {
                    synchronized (anro.class) {
                        if (anro.f == null) {
                            anro.f = (ahev)new ahcs((ahcz)anro.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return anro.a;
            }
            case 4: {
                return new ahcr((ahcz)anro.a);
            }
            case 3: {
                return new anro();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)anro.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u100c\u0000\u0002\u1004\u0001\u0003\u100c\u0002", new Object[] { "b", "c", anrk.a(), "d", "e", anrj.a() });
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
