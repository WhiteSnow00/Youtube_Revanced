import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alaz extends agzi implements ahax
{
    public static final alaz a;
    private static volatile ahbe q;
    public int b;
    public akjf c;
    public agzy d;
    public anss e;
    public apjz f;
    public boolean g;
    public int h;
    public aioe i;
    public String j;
    public alax k;
    public aksd l;
    public aioe m;
    public boolean n;
    public alba o;
    public agyc p;
    private alay r;
    private ajtl s;
    private ahfw t;
    private byte u;
    
    static {
        agzi.registerDefaultInstance((Class)alaz.class, (agzi)(a = new alaz()));
    }
    
    private alaz() {
        this.u = 2;
        this.d = emptyProtobufList();
        this.j = "";
        this.p = agyc.b;
    }
    
    public final void a() {
        final agzy d = this.d;
        if (!d.c()) {
            this.d = agzi.mutableCopy(d);
        }
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
                if ((q = alaz.q) == null) {
                    synchronized (alaz.class) {
                        if (alaz.q == null) {
                            alaz.q = (ahbe)new agzb((agzi)alaz.a);
                        }
                    }
                }
                return q;
            }
            case 5: {
                return alaz.a;
            }
            case 4: {
                return new agza((char[][][])null, (int[])null);
            }
            case 3: {
                return new alaz();
            }
            case 2: {
                return newMessageInfo((MessageLite)alaz.a, "\u0001\u0011\u0000\u0001\u0001\u0309\u0011\u0000\u0001\n\u0001\u1409\u0000\u0003\u041b\u0004\u1409\u0002\u0005\u1007\u0003\u0006\u1004\u0004\u0007\u1409\u0005\b\u1009\t\t\u1008\u0006\n\u1409\n\u000b\u1007\u000b\f\u1409\u000e\r\u100a\u000f\u000e\u1409\u0001\u000f\u1409\f\u0010\u1009\b\u0011\u1409\u0007\u0309\u1409\r", new Object[] { "b", "c", "d", alba.class, "f", "g", "h", "i", "l", "j", "m", "n", "t", "p", "e", "o", "k", "r", "s" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.u = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.u;
            }
        }
    }
}
