import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amvf extends agzi implements ahax
{
    private static volatile ahbe B;
    public static final agzr a;
    public static final amvf b;
    public boolean A;
    private int C;
    private byte D;
    public int c;
    public boolean d;
    public agzy e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;
    public boolean j;
    public boolean k;
    public boolean l;
    public boolean m;
    public boolean n;
    public boolean o;
    public boolean p;
    public boolean q;
    public boolean r;
    public boolean s;
    public boolean t;
    public long u;
    public long v;
    public boolean w;
    public agzq x;
    public aizz y;
    public int z;
    
    static {
        a = (agzr)new altr(5);
        agzi.registerDefaultInstance(amvf.class, b = new amvf());
    }
    
    private amvf() {
        this.D = 2;
        emptyIntList();
        this.e = agzi.emptyProtobufList();
        this.x = agzi.emptyIntList();
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
                final ahbe b2;
                if ((b2 = amvf.B) == null) {
                    synchronized (amvf.class) {
                        if (amvf.B == null) {
                            amvf.B = (ahbe)new agzb((agzi)amvf.b);
                        }
                    }
                }
                return b2;
            }
            case 5: {
                return amvf.b;
            }
            case 4: {
                return new agza((agzi)amvf.b);
            }
            case 3: {
                return new amvf();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)amvf.b, "\u0001\u0018\u0000\u0002\u0014@\u0018\u0000\u0002\u0001\u0014\u1007\u0011\u0018\u041b\u001a\u1007\u0013\u001b\u1007\u0014\u001d\u1007\u0016\u001f\u1007\u0018%\u1007\u001e'\u1007 -\u1007%.\u1007&0\u1007(1\u1007)2\u1007*4\u1007+7\u1007-8\u1007.9\u1007/:\u10020;\u10021<\u10072=\u001e>\u10093?\u10044@\u10075", new Object[] { "C", "c", "d", "e", ajsj.class, "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", ahrg.a(), "y", "z", "A" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.D = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.D;
            }
        }
    }
}
