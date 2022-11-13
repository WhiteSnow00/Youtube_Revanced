import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aldf extends ahbh implements ahcw
{
    public static final aldf a;
    private static volatile ahdd v;
    public int b;
    public String c;
    public String d;
    public ahbs e;
    public String f;
    public boolean g;
    public ahbs h;
    public ahbs i;
    public ahbs j;
    public ahbs k;
    public ahbs l;
    public ahbs m;
    public ahbs n;
    public ahbs o;
    public boolean p;
    public int q;
    public boolean r;
    public boolean s;
    public boolean t;
    public boolean u;
    
    static {
        ahbh.registerDefaultInstance((Class)aldf.class, (ahbh)(a = new aldf()));
    }
    
    private aldf() {
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
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd v;
                if ((v = aldf.v) == null) {
                    synchronized (aldf.class) {
                        if (aldf.v == null) {
                            aldf.v = (ahdd)new ahba((ahbh)aldf.a);
                        }
                    }
                }
                return v;
            }
            case 5: {
                return aldf.a;
            }
            case 4: {
                return new ahaz((byte[][][])null, (float[][])null);
            }
            case 3: {
                return new aldf();
            }
            case 2: {
                return newMessageInfo((MessageLite)aldf.a, "\u0001\u0013\u0000\u0001\u0002C\u0013\u0000\t\u0000\u0002\u1008\u0001\u0003\u1008\u0000\u0004\u1007\n\u0005\u0015\u0006\u0015\u0007\u0015\b\u0015\t\u0015\n\u0015\f\u1004\u000b\u000f\u1007\r\u0012\u1007\u000f\u0015\u1007\u0015/\u1007\u000e:\u0015@\u0015A\u0015B\u1008\u0003C\u1007\u0004", new Object[] { "b", "d", "c", "p", "e", "i", "j", "k", "l", "m", "q", "r", "t", "u", "s", "h", "n", "o", "f", "g" });
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
