import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class albc extends agzi implements ahax
{
    public static final albc a;
    private static volatile ahbe v;
    public int b;
    public String c;
    public String d;
    public agzt e;
    public String f;
    public boolean g;
    public agzt h;
    public agzt i;
    public agzt j;
    public agzt k;
    public agzt l;
    public agzt m;
    public agzt n;
    public agzt o;
    public boolean p;
    public int q;
    public boolean r;
    public boolean s;
    public boolean t;
    public boolean u;
    
    static {
        agzi.registerDefaultInstance((Class)albc.class, (agzi)(a = new albc()));
    }
    
    private albc() {
        this.c = "";
        this.d = "";
        this.e = emptyLongList();
        this.f = "";
        emptyLongList();
        this.h = emptyLongList();
        this.i = emptyLongList();
        this.j = emptyLongList();
        this.k = emptyLongList();
        this.l = emptyLongList();
        this.m = emptyLongList();
        this.n = emptyLongList();
        this.o = emptyLongList();
        emptyProtobufList();
        emptyProtobufList();
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe v;
                if ((v = albc.v) == null) {
                    synchronized (albc.class) {
                        if (albc.v == null) {
                            albc.v = (ahbe)new agzb((agzi)albc.a);
                        }
                    }
                }
                return v;
            }
            case 5: {
                return albc.a;
            }
            case 4: {
                return new agza((char[])null, (char[])null);
            }
            case 3: {
                return new albc();
            }
            case 2: {
                return newMessageInfo((MessageLite)albc.a, "\u0001\u0013\u0000\u0001\u0002C\u0013\u0000\t\u0000\u0002\u1008\u0001\u0003\u1008\u0000\u0004\u1007\n\u0005\u0015\u0006\u0015\u0007\u0015\b\u0015\t\u0015\n\u0015\f\u1004\u000b\u000f\u1007\r\u0012\u1007\u000f\u0015\u1007\u0015/\u1007\u000e:\u0015@\u0015A\u0015B\u1008\u0003C\u1007\u0004", new Object[] { "b", "d", "c", "p", "e", "i", "j", "k", "l", "m", "q", "r", "t", "u", "s", "h", "n", "o", "f", "g" });
            }
            case 1: {
                return null;
            }
            case 0: {
                return 1;
            }
        }
    }
}
