import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aimz extends agzi implements ahax
{
    public static final aimz a;
    private static volatile ahbe g;
    public int b;
    public String c;
    public String d;
    public long e;
    public long f;
    
    static {
        agzi.registerDefaultInstance(aimz.class, a = new aimz());
    }
    
    private aimz() {
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
                if ((g = aimz.g) == null) {
                    synchronized (aimz.class) {
                        if (aimz.g == null) {
                            aimz.g = (ahbe)new agzb((agzi)aimz.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return aimz.a;
            }
            case 4: {
                return new agza((agzi)aimz.a);
            }
            case 3: {
                return new aimz();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aimz.a, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1008\u0001\u0003\u1002\u0002\u0005\u1002\u0004", new Object[] { "b", "c", "d", "e", "f" });
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
