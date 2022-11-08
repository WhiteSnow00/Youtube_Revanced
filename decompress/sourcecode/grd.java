import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class grd extends agzi implements ahax
{
    public static final grd a;
    private static volatile ahbe j;
    public int b;
    public String c;
    public boolean d;
    public int e;
    public int f;
    public boolean g;
    public boolean h;
    public boolean i;
    
    static {
        agzi.registerDefaultInstance((Class)grd.class, (agzi)(a = new grd()));
    }
    
    private grd() {
        this.c = "";
        this.f = 2;
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe j;
                if ((j = grd.j) == null) {
                    synchronized (grd.class) {
                        if (grd.j == null) {
                            grd.j = (ahbe)new agzb((agzi)grd.a);
                        }
                    }
                }
                return j;
            }
            case 5: {
                return grd.a;
            }
            case 4: {
                return new agza((agzi)grd.a);
            }
            case 3: {
                return new grd();
            }
            case 2: {
                return newMessageInfo((MessageLite)grd.a, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1007\u0001\u0003\u1004\u0002\u0004\u100c\u0003\u0005\u1007\u0004\u0006\u1007\u0005\u0007\u1007\u0006", new Object[] { "b", "c", "d", "e", "f", ehk.k, "g", "h", "i" });
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
