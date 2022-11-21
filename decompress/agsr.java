import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agsr extends ahcz implements aheo
{
    public static final agsr a;
    private static volatile ahev g;
    public int b;
    public String c;
    public long d;
    public int e;
    public ahfq f;
    
    static {
        ahcz.registerDefaultInstance(agsr.class, a = new agsr());
    }
    
    private agsr() {
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
                final ahev g;
                if ((g = agsr.g) == null) {
                    synchronized (agsr.class) {
                        if (agsr.g == null) {
                            agsr.g = (ahev)new ahcs((ahcz)agsr.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return agsr.a;
            }
            case 4: {
                return new ahcr((ahcz)agsr.a);
            }
            case 3: {
                return new agsr();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)agsr.a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1002\u0001\u0003\u100c\u0002\u0004\u1009\u0003", new Object[] { "b", "c", "d", "e", afsd.g, "f" });
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
