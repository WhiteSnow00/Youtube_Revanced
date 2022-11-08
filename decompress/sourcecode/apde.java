import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apde extends agzi implements ahax
{
    public static final apde a;
    private static volatile ahbe b;
    private aioe A;
    private anss B;
    private byte C;
    private int c;
    private int d;
    private ajsq e;
    private aioe f;
    private ajsq g;
    private ajsq h;
    private ajsq i;
    private ajsq j;
    private ajsq k;
    private ajsq l;
    private ajsq m;
    private ajsq n;
    private ajsq o;
    private ajsq p;
    private ajsq q;
    private ajsq r;
    private ajsq s;
    private aioe t;
    private apct u;
    private amer v;
    private ahfw w;
    private anss x;
    private anss y;
    private anss z;
    
    static {
        agzi.registerDefaultInstance(apde.class, a = new apde());
    }
    
    private apde() {
        this.C = 2;
        emptyProtobufList();
        final agyc b = agyc.b;
        emptyProtobufList();
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
                final ahbe b2;
                if ((b2 = apde.b) == null) {
                    synchronized (apde.class) {
                        if (apde.b == null) {
                            apde.b = (ahbe)new agzb((agzi)apde.a);
                        }
                    }
                }
                return b2;
            }
            case 5: {
                return apde.a;
            }
            case 4: {
                return new agza((agzi)apde.a);
            }
            case 3: {
                return new apde();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)apde.a, "\u0001\u0018\u0000\u0002\u0002)\u0018\u0000\u0000\u0018\u0002\u1409\u0004\u0003\u1409\u0007\u0004\u1409\b\u0005\u1409\t\u0006\u1409\n\u0007\u1409\u000b\b\u1409\f\t\u1409\u000e\f\u1409\u001a\r\u1409\u001b\u000e\u1409\r\u0013\u1409\u001e\u0014\u1409\u0005\u0016\u1409\u000f\u0017\u1409\u0010\u0018\u1409\u0011\u0019\u1409\u0012\u001a\u1409\u0015\u001d\u1409\u0014#\u1409 $\u1409!%\u1409#&\u1409\")\u1409$", new Object[] { "c", "d", "e", "g", "h", "i", "j", "k", "l", "n", "u", "v", "m", "w", "f", "o", "p", "q", "r", "t", "s", "x", "y", "A", "z", "B" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.C = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.C;
            }
        }
    }
}
