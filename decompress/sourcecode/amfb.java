import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amfb extends agzi implements ahax
{
    public static final amfb a;
    private static volatile ahbe g;
    public int b;
    public String c;
    public String d;
    public agzy e;
    public double f;
    
    static {
        agzi.registerDefaultInstance((Class)amfb.class, (agzi)(a = new amfb()));
    }
    
    private amfb() {
        this.c = "";
        this.d = "";
        this.e = emptyProtobufList();
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe g;
                if ((g = amfb.g) == null) {
                    synchronized (amfb.class) {
                        if (amfb.g == null) {
                            amfb.g = (ahbe)new agzb((agzi)amfb.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return amfb.a;
            }
            case 4: {
                return new agza((agzi)amfb.a);
            }
            case 3: {
                return new amfb();
            }
            case 2: {
                return newMessageInfo((MessageLite)amfb.a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u1008\u0000\u0002\u1008\u0001\u0003\u001b\u0004\u1000\u0002", new Object[] { "b", "c", "d", "e", amfa.class, "f" });
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
