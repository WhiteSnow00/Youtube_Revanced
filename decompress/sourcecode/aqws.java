import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqws extends agzi implements ahax
{
    public static final aqws a;
    private static volatile ahbe g;
    public int b;
    public aqvj c;
    public String d;
    public String e;
    public aqwr f;
    
    static {
        agzi.registerDefaultInstance(aqws.class, a = new aqws());
    }
    
    private aqws() {
        this.d = "";
        this.e = "";
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
                if ((g = aqws.g) == null) {
                    synchronized (aqws.class) {
                        if (aqws.g == null) {
                            aqws.g = (ahbe)new agzb((agzi)aqws.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return aqws.a;
            }
            case 4: {
                return new agza((agzi)aqws.a);
            }
            case 3: {
                return new aqws();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aqws.a, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0000\u0001\u1009\u0000\u0002\u1008\u0001\u0003\u1008\u0002\u0005\u1009\u0003", new Object[] { "b", "c", "d", "e", "f" });
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
