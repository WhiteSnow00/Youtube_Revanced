import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akxf extends ahbh implements ahcw
{
    public static final akxf a;
    private static volatile ahdd u;
    public int b;
    public aklg c;
    public String d;
    public boolean e;
    public boolean f;
    public ancr g;
    public boolean h;
    public String i;
    public int j;
    public String k;
    public ahbp l;
    public String m;
    public String n;
    public String o;
    public boolean p;
    public akxg q;
    public akxk r;
    public akxh s;
    public ahab t;
    private byte v;
    
    static {
        ahbh.registerDefaultInstance((Class)akxf.class, (ahbh)(a = new akxf()));
    }
    
    private akxf() {
        this.v = 2;
        this.d = "";
        this.i = "";
        this.k = "";
        final ahab b = ahab.b;
        this.l = emptyIntList();
        this.m = "";
        this.n = "";
        this.o = "";
        this.t = ahab.b;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte v = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd u;
                if ((u = akxf.u) == null) {
                    synchronized (akxf.class) {
                        if (akxf.u == null) {
                            akxf.u = (ahdd)new ahba((ahbh)akxf.a);
                        }
                    }
                }
                return u;
            }
            case 5: {
                return akxf.a;
            }
            case 4: {
                return new ahaz((float[])null);
            }
            case 3: {
                return new akxf();
            }
            case 2: {
                return newMessageInfo((MessageLite)akxf.a, "\u0001\u0012\u0000\u0001\u0001\u001d\u0012\u0000\u0001\u0002\u0001\u1409\u0000\u0002\u1008\u0001\u0003\u1007\u0002\u0004\u1409\u0004\u0005\u1007\u0003\b\u1007\u0005\t\u1008\b\n\u1004\t\f\u1008\u000b\u000f\u0016\u0013\u1008\u0010\u0016\u1008\u0013\u0017\u1008\u0014\u0019\u1007\u0015\u001a\u1009\u0016\u001b\u1009\u0017\u001c\u1009\u0018\u001d\u100a\u0019", new Object[] { "b", "c", "d", "e", "g", "f", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t" });
            }
            case 1: {
                if (o == null) {
                    v = 0;
                }
                this.v = v;
                return null;
            }
            case 0: {
                return this.v;
            }
        }
    }
}
