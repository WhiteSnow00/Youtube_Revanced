import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agng extends agzi implements ahax
{
    public static final agng a;
    private static volatile ahbe g;
    public int b;
    public Object c;
    public String d;
    public String e;
    public String f;
    private int h;
    
    static {
        agzi.registerDefaultInstance(agng.class, a = new agng());
    }
    
    private agng() {
        this.b = 0;
        this.d = "";
        this.e = "";
        this.f = "";
        agzi.emptyProtobufList();
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
                if ((g = agng.g) == null) {
                    synchronized (agng.class) {
                        if (agng.g == null) {
                            agng.g = (ahbe)new agzb((agzi)agng.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return agng.a;
            }
            case 4: {
                return new agza((agzi)agng.a);
            }
            case 3: {
                return new agng();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)agng.a, "\u0001\u0005\u0001\u0001\u0001\u0006\u0005\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1008\u0001\u0003\u103b\u0000\u0004\u1008\u0004\u0006\u103c\u0000", new Object[] { "c", "b", "h", "d", "e", "f", agnf.class });
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
