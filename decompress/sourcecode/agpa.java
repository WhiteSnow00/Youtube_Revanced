import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agpa extends agzi implements ahax
{
    public static final agpa a;
    private static volatile ahbe g;
    public int b;
    public String c;
    public long d;
    public int e;
    public ahca f;
    
    static {
        agzi.registerDefaultInstance(agpa.class, a = new agpa());
    }
    
    private agpa() {
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
                if ((g = agpa.g) == null) {
                    synchronized (agpa.class) {
                        if (agpa.g == null) {
                            agpa.g = (ahbe)new agzb((agzi)agpa.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return agpa.a;
            }
            case 4: {
                return new agza((agzi)agpa.a);
            }
            case 3: {
                return new agpa();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)agpa.a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1002\u0001\u0003\u100c\u0002\u0004\u1009\u0003", new Object[] { "b", "c", "d", "e", afon.g, "f" });
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
