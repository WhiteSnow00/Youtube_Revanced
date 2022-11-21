import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ansy extends ahcz implements aheo
{
    public static final ansy a;
    private static volatile ahev e;
    public int b;
    public int c;
    public int d;
    
    static {
        ahcz.registerDefaultInstance(ansy.class, a = new ansy());
    }
    
    private ansy() {
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        switch (ahcy.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev e;
                if ((e = ansy.e) == null) {
                    synchronized (ansy.class) {
                        if (ansy.e == null) {
                            ansy.e = (ahev)new ahcs((ahcz)ansy.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return ansy.a;
            }
            case 4: {
                return new ahcr((ahcz)ansy.a);
            }
            case 3: {
                return new ansy();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)ansy.a, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0000\u0002\u100c\u0001\u0003\u100c\u0002", new Object[] { "b", "c", ansp.f, "d", ansp.e });
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
