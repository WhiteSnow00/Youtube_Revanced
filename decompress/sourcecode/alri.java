import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alri extends agzi implements ahax
{
    public static final alri a;
    private static volatile ahbe g;
    public int b;
    public String c;
    public long d;
    public float e;
    public float f;
    
    static {
        agzi.registerDefaultInstance(alri.class, a = new alri());
    }
    
    private alri() {
        this.c = "";
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe g;
                if ((g = alri.g) == null) {
                    synchronized (alri.class) {
                        if (alri.g == null) {
                            alri.g = (ahbe)new agzb((agzi)alri.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return alri.a;
            }
            case 4: {
                return new agza((agzi)alri.a);
            }
            case 3: {
                return new alri();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)alri.a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1002\u0001\u0003\u1001\u0002\u0004\u1001\u0003", new Object[] { "b", "c", "d", "e", "f" });
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
