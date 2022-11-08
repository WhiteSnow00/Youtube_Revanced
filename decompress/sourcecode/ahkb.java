import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahkb extends agzi implements ahax
{
    public static final ahkb a;
    private static volatile ahbe g;
    public int b;
    public int c;
    public int d;
    public int e;
    public String f;
    
    static {
        agzi.registerDefaultInstance((Class)ahkb.class, (agzi)(a = new ahkb()));
    }
    
    private ahkb() {
        this.f = "";
        final agyc b = agyc.b;
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe g;
                if ((g = ahkb.g) == null) {
                    synchronized (ahkb.class) {
                        if (ahkb.g == null) {
                            ahkb.g = (ahbe)new agzb((agzi)ahkb.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return ahkb.a;
            }
            case 4: {
                return new agza((agzi)ahkb.a);
            }
            case 3: {
                return new ahkb();
            }
            case 2: {
                return newMessageInfo((MessageLite)ahkb.a, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0000\u0001\u100c\u0000\u0002\u100c\u0001\u0003\u100c\u0002\u0005\u1008\u0004", new Object[] { "b", "c", akce.n, "d", akce.o, "e", akce.p, "f" });
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
