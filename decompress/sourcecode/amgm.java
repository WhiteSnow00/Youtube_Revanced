import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amgm extends agzi implements ahax
{
    public static final amgm a;
    private static volatile ahbe i;
    public int b;
    public ajsq c;
    public ajsq d;
    public akbf e;
    public aorm f;
    public aioe g;
    public anss h;
    private byte j;
    
    static {
        agzi.registerDefaultInstance((Class)amgm.class, (agzi)(a = new amgm()));
    }
    
    private amgm() {
        this.j = 2;
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        final int ordinal = agzh.ordinal();
        boolean b = true;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe i;
                if ((i = amgm.i) == null) {
                    synchronized (amgm.class) {
                        if (amgm.i == null) {
                            amgm.i = (ahbe)new agzb((agzi)amgm.a);
                        }
                    }
                }
                return i;
            }
            case 5: {
                return amgm.a;
            }
            case 4: {
                return new agza((agzi)amgm.a);
            }
            case 3: {
                return new amgm();
            }
            case 2: {
                return newMessageInfo((MessageLite)amgm.a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0006\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0003\u0004\u1409\u0004\u0005\u1409\u0005\u0006\u1409\u0006", new Object[] { "b", "c", "d", "e", "f", "g", "h" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.j = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.j;
            }
        }
    }
}
