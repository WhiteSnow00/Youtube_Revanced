import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amto extends agzi implements ahax
{
    public static final amto a;
    private static volatile ahbe q;
    public int b;
    public String c;
    public aorm d;
    public amre e;
    public String f;
    public String g;
    public long h;
    public long i;
    public String j;
    public ajsq k;
    public String l;
    public String m;
    public String n;
    public long o;
    public amtn p;
    private byte r;
    
    static {
        agzi.registerDefaultInstance(amto.class, a = new amto());
    }
    
    private amto() {
        this.r = 2;
        this.c = "";
        this.f = "";
        this.g = "";
        this.j = "";
        this.l = "";
        this.m = "";
        this.n = "";
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
                final ahbe q;
                if ((q = amto.q) == null) {
                    synchronized (amto.class) {
                        if (amto.q == null) {
                            amto.q = (ahbe)new agzb((agzi)amto.a);
                        }
                    }
                }
                return q;
            }
            case 5: {
                return amto.a;
            }
            case 4: {
                return new agza((agzi)amto.a);
            }
            case 3: {
                return new amto();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)amto.a, "\u0001\u000e\u0000\u0001\u0001\u0011\u000e\u0000\u0000\u0004\u0001\u1008\u0000\u0002\u1409\u0001\u0003\u1409\u0002\u0004\u1008\u0003\u0005\u1008\u0004\u0006\u1002\u0005\u0007\u1002\u0006\b\u1008\b\t\u1409\t\n\u1008\n\f\u1008\u000b\r\u1008\f\u0010\u1002\r\u0011\u1409\u000e", new Object[] { "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.r = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.r;
            }
        }
    }
}
