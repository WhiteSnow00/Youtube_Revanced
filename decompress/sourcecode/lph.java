import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lph extends agzi implements ahax
{
    public static final lph a;
    private static volatile ahbe p;
    public int b;
    public int c;
    public String d;
    public String e;
    public String f;
    public long g;
    public long h;
    public lpf i;
    public long j;
    public agzy k;
    public lpg l;
    public long m;
    public abxv n;
    public agyo o;
    private byte q;
    
    static {
        agzi.registerDefaultInstance(lph.class, a = new lph());
    }
    
    private lph() {
        this.q = 2;
        this.c = 8;
        this.d = "";
        this.e = "";
        this.f = "";
        this.k = agzi.emptyProtobufList();
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
                final ahbe p3;
                if ((p3 = lph.p) == null) {
                    synchronized (lph.class) {
                        if (lph.p == null) {
                            lph.p = (ahbe)new agzb((agzi)lph.a);
                        }
                    }
                }
                return p3;
            }
            case 5: {
                return lph.a;
            }
            case 4: {
                return new agza((agzi)lph.a);
            }
            case 3: {
                return new lph();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)lph.a, "\u0001\r\u0000\u0001\u0001\u0018\r\u0000\u0001\u0000\u0001\u100c\u0000\u0002\u1008\u0001\u0003\u1008\u0002\u0004\u1009\u0006\u0005\u1003\u0004\u0006\u1002\u0005\u0007\u1002\u0007\u000b\u001a\u000e\u1009\f\u000f\u1008\u0003\u0012\u1002\u000f\u0017\u1009\u0013\u0018\u1009\u0014", new Object[] { "b", "c", ehk.n, "d", "e", "i", "g", "h", "j", "k", "l", "f", "m", "n", "o" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.q = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.q;
            }
        }
    }
}
