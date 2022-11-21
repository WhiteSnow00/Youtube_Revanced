import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alot extends ahcz implements aheo
{
    public static final alot a;
    private static volatile ahev d;
    public int b;
    public String c;
    
    static {
        ahcz.registerDefaultInstance(alot.class, a = new alot());
    }
    
    private alot() {
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
                if ((d = alot.d) == null) {
                    synchronized (alot.class) {
                        if (alot.d == null) {
                            alot.d = (ahev)new ahcs((ahcz)alot.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return alot.a;
            }
            case 4: {
                return new ahcr((ahcz)alot.a);
            }
            case 3: {
                return new alot();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)alot.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1008\u0000", new Object[] { "b", "c" });
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
