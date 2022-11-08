import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class anjy extends agzi implements ahax
{
    public static final anjy a;
    private static volatile ahbe j;
    public int b;
    public int c;
    public ajsq d;
    public ajsq e;
    public int f;
    public aioe g;
    public agzy h;
    public aioe i;
    private byte k;
    
    static {
        agzi.registerDefaultInstance(anjy.class, a = new anjy());
    }
    
    private anjy() {
        this.k = 2;
        this.h = agzi.emptyProtobufList();
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        final int ordinal = agzh.ordinal();
        boolean b = true;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe j;
                if ((j = anjy.j) == null) {
                    synchronized (anjy.class) {
                        if (anjy.j == null) {
                            anjy.j = (ahbe)new agzb((agzi)anjy.a);
                        }
                    }
                }
                return j;
            }
            case 5: {
                return anjy.a;
            }
            case 4: {
                return new agza((agzi)anjy.a);
            }
            case 3: {
                return new anjy();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)anjy.a, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0001\u0005\u0001\u1004\u0000\u0002\u1409\u0001\u0003\u1409\u0002\u0004\u100c\u0003\u0005\u1409\u0004\u0006\u041b\u0007\u1409\u0005", new Object[] { "b", "c", "d", "e", "f", aijn.s, "g", "h", aioe.class, "i" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.k = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.k;
            }
        }
    }
}
