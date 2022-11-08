import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agoh extends agzi implements ahax
{
    public static final agoh a;
    private static volatile ahbe e;
    public agoj b;
    public String c;
    public agnk d;
    
    static {
        agzi.registerDefaultInstance(agoh.class, a = new agoh());
    }
    
    private agoh() {
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
                if ((e = agoh.e) == null) {
                    synchronized (agoh.class) {
                        if (agoh.e == null) {
                            agoh.e = (ahbe)new agzb((agzi)agoh.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return agoh.a;
            }
            case 4: {
                return new agza((agzi)agoh.a);
            }
            case 3: {
                return new agoh();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)agoh.a, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0002\u0208\u0003\t", new Object[] { "b", "c", "d" });
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
