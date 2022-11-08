import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alsz extends agzi implements ahax
{
    public static final alsz a;
    private static volatile ahbe g;
    public int b;
    public String c;
    public String d;
    public String e;
    public long f;
    
    static {
        agzi.registerDefaultInstance(alsz.class, a = new alsz());
    }
    
    private alsz() {
        this.c = "";
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
                if ((g = alsz.g) == null) {
                    synchronized (alsz.class) {
                        if (alsz.g == null) {
                            alsz.g = (ahbe)new agzb((agzi)alsz.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return alsz.a;
            }
            case 4: {
                return new agza((agzi)alsz.a);
            }
            case 3: {
                return new alsz();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)alsz.a, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0000\u0001\u1008\u0000\u0003\u1008\u0001\u0004\u1008\u0002\u0005\u1002\u0003", new Object[] { "b", "c", "d", "e", "f" });
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
