import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agth extends ahcz implements aheo
{
    public static final agth a;
    private static volatile ahev c;
    public ahej b;
    private ahej d;
    private ahej e;
    
    static {
        ahcz.registerDefaultInstance(agth.class, a = new agth());
    }
    
    private agth() {
        this.b = ahej.a;
        final ahej a = ahej.a;
        this.d = a;
        this.e = a;
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        switch (ahcy.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev c;
                if ((c = agth.c) == null) {
                    synchronized (agth.class) {
                        if (agth.c == null) {
                            agth.c = (ahev)new ahcs((ahcz)agth.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return agth.a;
            }
            case 4: {
                return new ahcr((ahcz)agth.a);
            }
            case 3: {
                return new agth();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)agth.a, "\u0001\u0003\u0000\u0000\u0001\u0003\u0003\u0003\u0000\u0000\u00012\u0002\u0832\u00032", new Object[] { "b", agte.a, "e", agtd.a, afsd.i, "d", agtg.a });
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
