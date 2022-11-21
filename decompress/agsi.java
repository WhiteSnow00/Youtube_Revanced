import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agsi extends ahcz implements aheo
{
    public static final agsi a;
    private static volatile ahev d;
    public int b;
    public agsh c;
    
    static {
        ahcz.registerDefaultInstance(agsi.class, a = new agsi());
    }
    
    private agsi() {
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
                if ((d = agsi.d) == null) {
                    synchronized (agsi.class) {
                        if (agsi.d == null) {
                            agsi.d = (ahev)new ahcs((ahcz)agsi.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return agsi.a;
            }
            case 4: {
                return new ahcr((ahcz)agsi.a);
            }
            case 3: {
                return new agsi();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)agsi.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1009\u0000", new Object[] { "b", "c" });
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
