import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amiv extends agzi implements ahax
{
    public static final amiv a;
    private static volatile ahbe b;
    private int c;
    private ajsq d;
    private ajsq e;
    private ajsq f;
    private aibc g;
    private ajsq h;
    private ajsq i;
    private ajsq j;
    private ajsq k;
    private ajsq l;
    private ajsq m;
    private ajsq n;
    private aioe o;
    private ahyq p;
    private ahyq q;
    private ahyq r;
    private ahpg s;
    private alim t;
    private amer u;
    private ahfw v;
    private aibc w;
    private byte x;
    
    static {
        agzi.registerDefaultInstance((Class)amiv.class, (agzi)(a = new amiv()));
    }
    
    private amiv() {
        this.x = 2;
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        final agyc b = agyc.b;
        emptyProtobufList();
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
                final ahbe b2;
                if ((b2 = amiv.b) == null) {
                    synchronized (amiv.class) {
                        if (amiv.b == null) {
                            amiv.b = (ahbe)new agzb((agzi)amiv.a);
                        }
                    }
                }
                return b2;
            }
            case 5: {
                return amiv.a;
            }
            case 4: {
                return new agza((agzi)amiv.a);
            }
            case 3: {
                return new amiv();
            }
            case 2: {
                return newMessageInfo((MessageLite)amiv.a, "\u0001\u0014\u0000\u0001\u0003$\u0014\u0000\u0000\u0014\u0003\u1409\u0002\u0004\u1409\u0004\u0005\u1409\u0006\u0007\u1409\t\b\u1409\n\t\u1409\f\n\u1409\r\u000b\u1409\u000f\u000e\u1409\u0013\u0010\u1409\u0017\u0012\u1409\u000b\u0013\u1409\u0014\u0015\u1409\u000e\u0016\u1409\u0015\u0018\u1409\u0010\u0019\u1409\u0011\u001a\u1409\u0012\u001c\u1409\u0003!\u1409\u0005$\u1409\u001b", new Object[] { "c", "d", "f", "h", "i", "j", "l", "m", "o", "s", "v", "k", "t", "n", "u", "p", "q", "r", "e", "g", "w" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.x = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.x;
            }
        }
    }
}
