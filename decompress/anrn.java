import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class anrn extends ahcz implements aheo
{
    public static final anrn a;
    private static volatile ahev g;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    
    static {
        ahcz.registerDefaultInstance(anrn.class, a = new anrn());
    }
    
    private anrn() {
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
                if ((g = anrn.g) == null) {
                    synchronized (anrn.class) {
                        if (anrn.g == null) {
                            anrn.g = (ahev)new ahcs((ahcz)anrn.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return anrn.a;
            }
            case 4: {
                return new ahcr((ahcz)anrn.a);
            }
            case 3: {
                return new anrn();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)anrn.a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u100c\u0000\u0002\u1004\u0001\u0003\u100c\u0002\u0004\u100c\u0003", new Object[] { "b", "c", anrk.a(), "d", "e", anri.a(), "f", anri.a() });
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
