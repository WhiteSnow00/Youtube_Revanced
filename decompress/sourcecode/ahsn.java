import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahsn extends agzi implements ahax
{
    public static final ahsn a;
    private static volatile ahbe g;
    public int b;
    public String c;
    public String d;
    public long e;
    public long f;
    
    static {
        agzi.registerDefaultInstance(ahsn.class, a = new ahsn());
    }
    
    private ahsn() {
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
                final ahbe g;
                if ((g = ahsn.g) == null) {
                    synchronized (ahsn.class) {
                        if (ahsn.g == null) {
                            ahsn.g = (ahbe)new agzb((agzi)ahsn.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return ahsn.a;
            }
            case 4: {
                return new agza((agzi)ahsn.a);
            }
            case 3: {
                return new ahsn();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ahsn.a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1008\u0001\u0003\u1002\u0002\u0004\u1002\u0003", new Object[] { "b", "c", "d", "e", "f" });
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
