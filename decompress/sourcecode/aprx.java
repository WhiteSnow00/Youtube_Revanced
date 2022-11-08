import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aprx extends agzi implements ahax
{
    public static final aprx a;
    private static volatile ahbe g;
    public int b;
    public String c;
    public int d;
    public boolean e;
    public int f;
    
    static {
        agzi.registerDefaultInstance((Class)aprx.class, (agzi)(a = new aprx()));
    }
    
    private aprx() {
        this.c = "";
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe g;
                if ((g = aprx.g) == null) {
                    synchronized (aprx.class) {
                        if (aprx.g == null) {
                            aprx.g = (ahbe)new agzb((agzi)aprx.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return aprx.a;
            }
            case 4: {
                return new agza((agzi)aprx.a);
            }
            case 3: {
                return new aprx();
            }
            case 2: {
                return newMessageInfo((MessageLite)aprx.a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u100c\u0001\u0003\u1007\u0002\u0004\u1004\u0003", new Object[] { "b", "c", "d", apsc.d, "e", "f" });
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
