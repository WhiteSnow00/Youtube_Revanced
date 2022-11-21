import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aloh extends ahcz implements aheo
{
    public static final aloh a;
    private static volatile ahev d;
    public int b;
    public String c;
    
    static {
        ahcz.registerDefaultInstance(aloh.class, a = new aloh());
    }
    
    private aloh() {
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
                final ahev d;
                if ((d = aloh.d) == null) {
                    synchronized (aloh.class) {
                        if (aloh.d == null) {
                            aloh.d = (ahev)new ahcs((ahcz)aloh.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aloh.a;
            }
            case 4: {
                return new ahcr((ahcz)aloh.a);
            }
            case 3: {
                return new aloh();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aloh.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1008\u0000", new Object[] { "b", "c" });
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
