import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class airn extends ahcz implements aheo
{
    public static final airn a;
    private static volatile ahev d;
    public int b;
    public int c;
    
    static {
        ahcz.registerDefaultInstance(airn.class, a = new airn());
    }
    
    private airn() {
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
                if ((d = airn.d) == null) {
                    synchronized (airn.class) {
                        if (airn.d == null) {
                            airn.d = (ahev)new ahcs((ahcz)airn.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return airn.a;
            }
            case 4: {
                return new ahcr((ahcz)airn.a);
            }
            case 3: {
                return new airn();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)airn.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u100c\u0000", new Object[] { "b", "c", aine.k });
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
