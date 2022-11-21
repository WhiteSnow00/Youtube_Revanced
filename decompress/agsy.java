import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agsy extends ahcz implements aheo
{
    public static final agsy a;
    private static volatile ahev d;
    public int b;
    public ahbt c;
    
    static {
        ahcz.registerDefaultInstance(agsy.class, a = new agsy());
    }
    
    private agsy() {
        this.c = ahbt.b;
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
                if ((d = agsy.d) == null) {
                    synchronized (agsy.class) {
                        if (agsy.d == null) {
                            agsy.d = (ahev)new ahcs((ahcz)agsy.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return agsy.a;
            }
            case 4: {
                return new ahcr((ahcz)agsy.a);
            }
            case 3: {
                return new agsy();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)agsy.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u100a\u0000", new Object[] { "b", "c" });
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
