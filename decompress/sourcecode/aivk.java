import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aivk extends agzi implements ahax
{
    public static final aivk a;
    private static volatile ahbe b;
    private int c;
    private ajsq d;
    private aibc e;
    private aioe f;
    private aibc g;
    private ajsq h;
    private ajsq i;
    private aibc j;
    private aibc k;
    private ajsq l;
    private ajsq m;
    private ajsq n;
    private aivp o;
    private aivl p;
    private aivm q;
    private aivn r;
    private aibc s;
    private aibc t;
    private ajsq u;
    private ajsq v;
    private ahfw w;
    private ajsq x;
    private byte y;
    
    static {
        agzi.registerDefaultInstance(aivk.class, a = new aivk());
    }
    
    private aivk() {
        this.y = 2;
        final agyc b = agyc.b;
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
                if ((b2 = aivk.b) == null) {
                    synchronized (aivk.class) {
                        if (aivk.b == null) {
                            aivk.b = (ahbe)new agzb((agzi)aivk.a);
                        }
                    }
                }
                return b2;
            }
            case 5: {
                return aivk.a;
            }
            case 4: {
                return new agza((agzi)aivk.a);
            }
            case 3: {
                return new aivk();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aivk.a, "\u0001\u0015\u0000\u0001\u0001\u0016\u0015\u0000\u0000\u0015\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0002\u0004\u1409\u0004\u0005\u1409\u0005\u0006\u1409\u0006\u0007\u1409\u0007\b\u1409\b\t\u1409\t\n\u1409\n\u000b\u1409\u0013\r\u1409\u0003\u000e\u1409\u000b\u000f\u1409\u000e\u0010\u1409\u000f\u0011\u1409\u0010\u0012\u1409\f\u0013\u1409\u0011\u0014\u1409\u0012\u0015\u1409\r\u0016\u1409\u0015", new Object[] { "c", "d", "e", "f", "h", "i", "j", "k", "l", "m", "n", "w", "g", "o", "r", "s", "t", "p", "u", "v", "q", "x" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.y = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.y;
            }
        }
    }
}
