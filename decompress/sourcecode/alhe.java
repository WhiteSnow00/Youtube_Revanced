import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alhe extends agzd implements agze
{
    public static final alhe a;
    private static volatile ahbe q;
    public int b;
    public Object c;
    public int d;
    public Object e;
    public int f;
    public Object g;
    public int h;
    public ajsq i;
    public ajsq j;
    public aibc k;
    public aibc m;
    public agyc n;
    public agzy o;
    public boolean p;
    private int r;
    private ajsq s;
    private ahfw t;
    private aioe u;
    private alhd v;
    private byte w;
    
    static {
        agzi.registerDefaultInstance((Class)alhe.class, (agzi)(a = new alhe()));
    }
    
    private alhe() {
        this.b = 0;
        this.d = 0;
        this.f = 0;
        this.w = 2;
        this.n = agyc.b;
        this.o = emptyProtobufList();
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
                final ahbe q;
                if ((q = alhe.q) == null) {
                    synchronized (alhe.class) {
                        if (alhe.q == null) {
                            alhe.q = (ahbe)new agzb((agzi)alhe.a);
                        }
                    }
                }
                return q;
            }
            case 5: {
                return alhe.a;
            }
            case 4: {
                return new agzc(alhe.a);
            }
            case 3: {
                return new alhe();
            }
            case 2: {
                return newMessageInfo((MessageLite)alhe.a, "\u0001\u0012\u0003\u0001\u0001\u0018\u0012\u0000\u0001\f\u0001\u1409\u0001\u0002\u1409\u0002\u0003\u1409\u0003\u0004\u1409\u0005\u0005\u143c\u0000\u0007\u103b\u0002\b\u1409\r\t\u100a\u000e\n\u1409\u0004\u000b\u1409\u000f\f\u041b\r\u1007\u0010\u000e\u143c\u0001\u000f\u1409\u0011\u0014\u103c\u0002\u0015\u103c\u0001\u0016\u100c\u0000\u0018\u143c\u0000", new Object[] { "c", "b", "e", "d", "g", "f", "r", "i", "j", "k", "s", aorm.class, "t", "n", "m", "u", "o", aioe.class, "p", aorr.class, "v", alhc.class, alhf.class, "h", albn.n, ahwq.class });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.w = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.w;
            }
        }
    }
}
