import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agpx extends agzi implements ahax
{
    public static final agpx a;
    private static volatile ahbe e;
    public String b;
    public String c;
    public float d;
    private int f;
    
    static {
        agzi.registerDefaultInstance(agpx.class, a = new agpx());
    }
    
    private agpx() {
        this.b = "";
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
                final ahbe e;
                if ((e = agpx.e) == null) {
                    synchronized (agpx.class) {
                        if (agpx.e == null) {
                            agpx.e = (ahbe)new agzb((agzi)agpx.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return agpx.a;
            }
            case 4: {
                return new agza((agzi)agpx.a);
            }
            case 3: {
                return new agpx();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)agpx.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1008\u0001\u0003\u1001\u0002", new Object[] { "f", "b", "c", "d" });
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
