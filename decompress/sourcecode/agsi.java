import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agsi extends agzi implements ahax
{
    public static final agsi a;
    private static volatile ahbe g;
    public String b;
    public agyo c;
    public agyo d;
    public int e;
    public double f;
    
    static {
        agzi.registerDefaultInstance(agsi.class, a = new agsi());
    }
    
    private agsi() {
        this.b = "";
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
                if ((g = agsi.g) == null) {
                    synchronized (agsi.class) {
                        if (agsi.g == null) {
                            agsi.g = (ahbe)new agzb((agzi)agsi.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return agsi.a;
            }
            case 4: {
                return new agza((agzi)agsi.a);
            }
            case 3: {
                return new agsi();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)agsi.a, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001\u0208\u0002\t\u0003\f\u0004\u0000\u0005\t", new Object[] { "b", "c", "e", "f", "d" });
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
