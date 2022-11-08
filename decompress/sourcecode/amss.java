import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amss extends agzi implements ahax
{
    public static final amss a;
    private static volatile ahbe n;
    public int b;
    public String c;
    public aorm d;
    public amre e;
    public agzy f;
    public String g;
    public String h;
    public long i;
    public agzy j;
    public boolean k;
    public ajsq l;
    public long m;
    private byte o;
    
    static {
        agzi.registerDefaultInstance(amss.class, a = new amss());
    }
    
    private amss() {
        this.o = 2;
        this.c = "";
        this.f = agzi.emptyProtobufList();
        this.g = "";
        this.h = "";
        this.j = agzi.emptyProtobufList();
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
                final ahbe n;
                if ((n = amss.n) == null) {
                    synchronized (amss.class) {
                        if (amss.n == null) {
                            amss.n = (ahbe)new agzb((agzi)amss.a);
                        }
                    }
                }
                return n;
            }
            case 5: {
                return amss.a;
            }
            case 4: {
                return new agza((agzi)amss.a);
            }
            case 3: {
                return new amss();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)amss.a, "\u0001\u000b\u0000\u0001\u0001\f\u000b\u0000\u0002\u0005\u0001\u1008\u0000\u0002\u1409\u0001\u0003\u1409\u0002\u0004\u041b\u0005\u1008\u0003\u0006\u1008\u0004\u0007\u1002\u0005\b\u041b\t\u1007\u0006\u000b\u1409\b\f\u1002\t", new Object[] { "b", "c", "d", "e", "f", amtp.class, "g", "h", "i", "j", amsr.class, "k", "l", "m" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.o = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.o;
            }
        }
    }
}
