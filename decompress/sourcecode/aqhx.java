import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqhx extends agzi implements ahax
{
    public static final aqhx a;
    private static volatile ahbe g;
    public int b;
    public String c;
    public int d;
    public boolean e;
    public int f;
    
    static {
        agzi.registerDefaultInstance((Class)aqhx.class, (agzi)(a = new aqhx()));
    }
    
    private aqhx() {
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
                if ((g = aqhx.g) == null) {
                    synchronized (aqhx.class) {
                        if (aqhx.g == null) {
                            aqhx.g = (ahbe)new agzb((agzi)aqhx.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return aqhx.a;
            }
            case 4: {
                return new agza((agzi)aqhx.a);
            }
            case 3: {
                return new aqhx();
            }
            case 2: {
                return newMessageInfo((MessageLite)aqhx.a, "\u0001\u0004\u0000\u0001\u0001\u0006\u0004\u0000\u0000\u0000\u0001\u1008\u0001\u0002\u1004\u0002\u0004\u1007\u0004\u0006\u100c\u0006", new Object[] { "b", "c", "d", "e", "f", apfn.p });
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
