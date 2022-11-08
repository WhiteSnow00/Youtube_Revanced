import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahzs extends agzi implements ahax
{
    public static final ahzs a;
    private static volatile ahbe e;
    public int b;
    public long c;
    public String d;
    
    static {
        agzi.registerDefaultInstance(ahzs.class, a = new ahzs());
    }
    
    private ahzs() {
        this.d = "";
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe e;
                if ((e = ahzs.e) == null) {
                    synchronized (ahzs.class) {
                        if (ahzs.e == null) {
                            ahzs.e = (ahbe)new agzb((agzi)ahzs.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return ahzs.a;
            }
            case 4: {
                return new agza((agzi)ahzs.a);
            }
            case 3: {
                return new ahzs();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ahzs.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1002\u0000\u0002\u1008\u0001", new Object[] { "b", "c", "d" });
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
