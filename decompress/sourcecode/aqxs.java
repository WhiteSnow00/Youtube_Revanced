import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqxs extends agzi implements ahax
{
    public static final aqxs a;
    private static volatile ahbe g;
    public int b;
    public String c;
    public String d;
    public int e;
    public int f;
    
    static {
        agzi.registerDefaultInstance(aqxs.class, a = new aqxs());
    }
    
    private aqxs() {
        this.c = "";
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
                final ahbe g;
                if ((g = aqxs.g) == null) {
                    synchronized (aqxs.class) {
                        if (aqxs.g == null) {
                            aqxs.g = (ahbe)new agzb((agzi)aqxs.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return aqxs.a;
            }
            case 4: {
                return new agza((agzi)aqxs.a);
            }
            case 3: {
                return new aqxs();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aqxs.a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1004\u0002\u0003\u1004\u0003\u0004\u1008\u0001", new Object[] { "b", "c", "e", "f", "d" });
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
