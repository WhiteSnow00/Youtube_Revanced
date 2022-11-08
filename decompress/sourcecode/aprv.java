import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aprv extends agzi implements ahax
{
    public static final aprv a;
    private static volatile ahbe c;
    public String b;
    private int d;
    
    static {
        agzi.registerDefaultInstance((Class)aprv.class, (agzi)(a = new aprv()));
    }
    
    private aprv() {
        this.b = "";
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe c;
                if ((c = aprv.c) == null) {
                    synchronized (aprv.class) {
                        if (aprv.c == null) {
                            aprv.c = (ahbe)new agzb((agzi)aprv.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return aprv.a;
            }
            case 4: {
                return new agza((agzi)aprv.a);
            }
            case 3: {
                return new aprv();
            }
            case 2: {
                return newMessageInfo((MessageLite)aprv.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1008\u0000", new Object[] { "d", "b" });
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
