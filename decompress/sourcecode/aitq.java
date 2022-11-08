import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aitq extends agzi implements ahax
{
    public static final aitq a;
    private static volatile ahbe p;
    public int b;
    public aorm c;
    public agzy d;
    public ajsq e;
    public ajsq f;
    public agzy g;
    public ajsq h;
    public agzy i;
    public ajsq j;
    public agzy k;
    public agzy l;
    public aioe m;
    public amer n;
    public agyc o;
    private ahfw q;
    private byte r;
    
    static {
        agzi.registerDefaultInstance(aitq.class, a = new aitq());
    }
    
    private aitq() {
        this.r = 2;
        this.d = agzi.emptyProtobufList();
        this.g = agzi.emptyProtobufList();
        emptyProtobufList();
        this.i = agzi.emptyProtobufList();
        this.k = agzi.emptyProtobufList();
        this.l = agzi.emptyProtobufList();
        this.o = agyc.b;
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
                if ((p3 = aitq.p) == null) {
                    synchronized (aitq.class) {
                        if (aitq.p == null) {
                            aitq.p = (ahbe)new agzb((agzi)aitq.a);
                        }
                    }
                }
                return p3;
            }
            case 5: {
                return aitq.a;
            }
            case 4: {
                return new agza((agzi)aitq.a);
            }
            case 3: {
                return new aitq();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aitq.a, "\u0001\u000e\u0000\u0001\u0001\u000f\u000e\u0000\u0005\r\u0001\u1409\u0000\u0002\u041b\u0003\u1409\u0002\u0004\u041b\u0005\u1409\u0003\u0006\u041b\u0007\u1409\u0004\b\u041b\t\u041b\n\u1409\u0005\u000b\u1409\u0006\r\u100a\b\u000e\u1409\t\u000f\u1409\u0001", new Object[] { "b", "c", "d", aora.class, "f", "g", ahyq.class, "h", "i", ajsq.class, "j", "k", ajsq.class, "l", ahyq.class, "m", "n", "o", "q", "e" });
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
