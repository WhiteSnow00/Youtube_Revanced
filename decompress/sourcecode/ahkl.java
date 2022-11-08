import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahkl extends agzi implements ahax
{
    public static final ahkl a;
    private static volatile ahbe j;
    public int b;
    public ajsq c;
    public ajsq d;
    public ajsq e;
    public aioe f;
    public aorm g;
    public ahkm h;
    public aioe i;
    private ajsq k;
    private ahfw l;
    private aioe m;
    private aioe n;
    private anss o;
    private byte p;
    
    static {
        agzi.registerDefaultInstance((Class)ahkl.class, (agzi)(a = new ahkl()));
    }
    
    private ahkl() {
        this.p = 2;
        final agyc b = agyc.b;
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
                final ahbe j;
                if ((j = ahkl.j) == null) {
                    synchronized (ahkl.class) {
                        if (ahkl.j == null) {
                            ahkl.j = (ahbe)new agzb((agzi)ahkl.a);
                        }
                    }
                }
                return j;
            }
            case 5: {
                return ahkl.a;
            }
            case 4: {
                return new agza((agzi)ahkl.a);
            }
            case 3: {
                return new ahkl();
            }
            case 2: {
                return newMessageInfo((MessageLite)ahkl.a, "\u0001\f\u0000\u0001\u0001\u0013\f\u0000\u0000\f\u0001\u1409\u0000\u0002\u1409\u0003\u0003\u1409\u0004\u0004\u1409\u0006\u0005\u1409\r\t\u1409\u000f\n\u1409\u0010\u000b\u1409\u0011\f\u1409\u0002\u0010\u1409\t\u0011\u1409\n\u0013\u1409\u0012", new Object[] { "b", "c", "e", "f", "g", "m", "h", "i", "n", "d", "k", "l", "o" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.p = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.p;
            }
        }
    }
}
