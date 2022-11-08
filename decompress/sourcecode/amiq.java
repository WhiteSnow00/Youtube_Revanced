import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amiq extends agzi implements ahax
{
    public static final amiq a;
    private static volatile ahbe e;
    public String b;
    public long c;
    public int d;
    private int f;
    
    static {
        agzi.registerDefaultInstance((Class)amiq.class, (agzi)(a = new amiq()));
    }
    
    private amiq() {
        this.b = "";
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe e;
                if ((e = amiq.e) == null) {
                    synchronized (amiq.class) {
                        if (amiq.e == null) {
                            amiq.e = (ahbe)new agzb((agzi)amiq.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return amiq.a;
            }
            case 4: {
                return new agza((agzi)amiq.a);
            }
            case 3: {
                return new amiq();
            }
            case 2: {
                return newMessageInfo((MessageLite)amiq.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1002\u0001\u0003\u1004\u0002", new Object[] { "f", "b", "c", "d" });
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
