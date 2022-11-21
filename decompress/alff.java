import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alff extends ahcz implements aheo
{
    public static final alff a;
    private static volatile ahev v;
    public int b;
    public String c;
    public String d;
    public ahdk e;
    public String f;
    public boolean g;
    public ahdk h;
    public ahdk i;
    public ahdk j;
    public ahdk k;
    public ahdk l;
    public ahdk m;
    public ahdk n;
    public ahdk o;
    public boolean p;
    public int q;
    public boolean r;
    public boolean s;
    public boolean t;
    public boolean u;
    
    static {
        ahcz.registerDefaultInstance(alff.class, a = new alff());
    }
    
    private alff() {
        this.c = "";
        this.d = "";
        this.e = ahcz.emptyLongList();
        this.f = "";
        emptyLongList();
        this.h = ahcz.emptyLongList();
        this.i = ahcz.emptyLongList();
        this.j = ahcz.emptyLongList();
        this.k = ahcz.emptyLongList();
        this.l = ahcz.emptyLongList();
        this.m = ahcz.emptyLongList();
        this.n = ahcz.emptyLongList();
        this.o = ahcz.emptyLongList();
        emptyProtobufList();
        emptyProtobufList();
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        switch (ahcy.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev v;
                if ((v = alff.v) == null) {
                    synchronized (alff.class) {
                        if (alff.v == null) {
                            alff.v = (ahev)new ahcs((ahcz)alff.a);
                        }
                    }
                }
                return v;
            }
            case 5: {
                return alff.a;
            }
            case 4: {
                return new ahcr((char[])null, (int[][])null);
            }
            case 3: {
                return new alff();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)alff.a, "\u0001\u0013\u0000\u0001\u0002C\u0013\u0000\t\u0000\u0002\u1008\u0001\u0003\u1008\u0000\u0004\u1007\n\u0005\u0015\u0006\u0015\u0007\u0015\b\u0015\t\u0015\n\u0015\f\u1004\u000b\u000f\u1007\r\u0012\u1007\u000f\u0015\u1007\u0015/\u1007\u000e:\u0015@\u0015A\u0015B\u1008\u0003C\u1007\u0004", new Object[] { "b", "d", "c", "p", "e", "i", "j", "k", "l", "m", "q", "r", "t", "u", "s", "h", "n", "o", "f", "g" });
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
