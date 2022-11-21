import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahks extends ahcz implements aheo
{
    public static final ahks a;
    private static volatile ahev d;
    public int b;
    public boolean c;
    
    static {
        ahcz.registerDefaultInstance(ahks.class, a = new ahks());
    }
    
    private ahks() {
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
                if ((d = ahks.d) == null) {
                    synchronized (ahks.class) {
                        if (ahks.d == null) {
                            ahks.d = (ahev)new ahcs((ahcz)ahks.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return ahks.a;
            }
            case 4: {
                return new ahcr((ahcz)ahks.a);
            }
            case 3: {
                return new ahks();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)ahks.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1007\u0000", new Object[] { "b", "c" });
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
