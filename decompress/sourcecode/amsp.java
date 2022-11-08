import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amsp extends agzi implements ahax
{
    public static final amsp a;
    private static volatile ahbe j;
    public int b;
    public String c;
    public int d;
    public int e;
    public boolean f;
    public int g;
    public String h;
    public boolean i;
    
    static {
        agzi.registerDefaultInstance(amsp.class, a = new amsp());
    }
    
    private amsp() {
        this.c = "";
        this.h = "";
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe j;
                if ((j = amsp.j) == null) {
                    synchronized (amsp.class) {
                        if (amsp.j == null) {
                            amsp.j = (ahbe)new agzb((agzi)amsp.a);
                        }
                    }
                }
                return j;
            }
            case 5: {
                return amsp.a;
            }
            case 4: {
                return new agza((agzi)amsp.a);
            }
            case 3: {
                return new amsp();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)amsp.a, "\u0001\u0007\u0000\u0001\u0001\t\u0007\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u100b\u0001\u0004\u1007\u0004\u0006\u100c\u0006\u0007\u100b\u0002\b\u1008\u0007\t\u1007\b", new Object[] { "b", "c", "d", "f", "g", amsc.k, "e", "h", "i" });
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
