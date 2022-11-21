import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agur extends ahcz implements aheo
{
    public static final agur a;
    private static volatile ahev d;
    public int b;
    public int c;
    
    static {
        ahcz.registerDefaultInstance(agur.class, a = new agur());
    }
    
    private agur() {
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
                if ((d = agur.d) == null) {
                    synchronized (agur.class) {
                        if (agur.d == null) {
                            agur.d = (ahev)new ahcs((ahcz)agur.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return agur.a;
            }
            case 4: {
                return new ahcr((ahcz)agur.a);
            }
            case 3: {
                return new agur();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)agur.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u100c\u0000", new Object[] { "b", "c", aqyn.a() });
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
