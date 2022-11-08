import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agpy extends agzi implements ahax
{
    public static final agpy a;
    private static volatile ahbe e;
    public String b;
    public String c;
    public String d;
    private int f;
    
    static {
        agzi.registerDefaultInstance(agpy.class, a = new agpy());
    }
    
    private agpy() {
        this.b = "";
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
                final ahbe e;
                if ((e = agpy.e) == null) {
                    synchronized (agpy.class) {
                        if (agpy.e == null) {
                            agpy.e = (ahbe)new agzb((agzi)agpy.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return agpy.a;
            }
            case 4: {
                return new agza((agzi)agpy.a);
            }
            case 3: {
                return new agpy();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)agpy.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1008\u0001\u0003\u1008\u0002", new Object[] { "f", "b", "c", "d" });
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
