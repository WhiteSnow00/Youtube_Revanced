import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agaq extends agzi implements ahax
{
    public static final agaq a;
    private static volatile ahbe e;
    public int b;
    public agar c;
    public agyc d;
    
    static {
        agzi.registerDefaultInstance(agaq.class, a = new agaq());
    }
    
    private agaq() {
        this.d = agyc.b;
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
                if ((e = agaq.e) == null) {
                    synchronized (agaq.class) {
                        if (agaq.e == null) {
                            agaq.e = (ahbe)new agzb((agzi)agaq.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return agaq.a;
            }
            case 4: {
                return new agza((agzi)agaq.a);
            }
            case 3: {
                return new agaq();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)agaq.a, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[] { "b", "c", "d" });
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
