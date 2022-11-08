import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adko extends agzi implements ahax
{
    public static final adko a;
    private static volatile ahbe i;
    public int b;
    public int c;
    public String d;
    public long e;
    public long f;
    public long g;
    public long h;
    
    static {
        agzi.registerDefaultInstance(adko.class, a = new adko());
    }
    
    private adko() {
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
                final ahbe i;
                if ((i = adko.i) == null) {
                    synchronized (adko.class) {
                        if (adko.i == null) {
                            adko.i = (ahbe)new agzb((agzi)adko.a);
                        }
                    }
                }
                return i;
            }
            case 5: {
                return adko.a;
            }
            case 4: {
                return new agza((agzi)adko.a);
            }
            case 3: {
                return new adko();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)adko.a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001\u100c\u0000\u0002\u1008\u0001\u0003\u1003\u0002\u0004\u1003\u0003\u0005\u1003\u0004\u0006\u1003\u0005", new Object[] { "b", "c", pdu.n, "d", "e", "f", "g", "h" });
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
