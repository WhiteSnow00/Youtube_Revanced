import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class angg extends ahbh implements ahcw
{
    public static final angg a;
    private static volatile ahdd t;
    private ajut A;
    private ahhu B;
    private byte C;
    public int b;
    public ajut c;
    public ajut d;
    public ajut e;
    public ajut f;
    public angd g;
    public ange h;
    public angj i;
    public aotp j;
    public ahbx k;
    public int l;
    public int m;
    public boolean n;
    public ahbx o;
    public boolean p;
    public String q;
    public anuv r;
    public ahab s;
    private ajut u;
    private ajut v;
    private aiqj w;
    private angd x;
    private aiae y;
    private ajut z;
    
    static {
        ahbh.registerDefaultInstance((Class)angg.class, (ahbh)(a = new angg()));
    }
    
    private angg() {
        this.C = 2;
        this.k = emptyProtobufList();
        this.m = -1;
        this.o = emptyProtobufList();
        this.q = "";
        this.s = ahab.b;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte c = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd t;
                if ((t = angg.t) == null) {
                    synchronized (angg.class) {
                        if (angg.t == null) {
                            angg.t = (ahdd)new ahba((ahbh)angg.a);
                        }
                    }
                }
                return t;
            }
            case 5: {
                return angg.a;
            }
            case 4: {
                return new ahaz((ahbh)angg.a);
            }
            case 3: {
                return new angg();
            }
            case 2: {
                return newMessageInfo((MessageLite)angg.a, "\u0001\u0019\u0000\u0001\u0001\u001d\u0019\u0000\u0002\u0013\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0002\u0004\u1409\u0004\u0005\u1409\u0006\u0006\u1409\b\u0007\u1409\n\b\u1004\f\t\u1409\u0005\n\u1409\t\u000b\u1409\u0018\f\u100a\u0019\r\u1409\u000b\u000f\u1409\u0007\u0010\u041b\u0011\u1409\u000f\u0012\u1007\u0010\u0013\u041b\u0014\u1007\u0011\u0015\u1008\u0014\u0016\u1409\u0003\u0017\u1409\u0015\u001a\u1409\u0016\u001c\u1004\r\u001d\u1409\u0017", new Object[] { "b", "c", "d", "e", "u", "v", "w", "j", "l", "g", "i", "B", "s", "x", "h", "k", aotd.class, "y", "n", "o", anuv.class, "p", "q", "f", "z", "A", "m", "r" });
            }
            case 1: {
                if (o == null) {
                    c = 0;
                }
                this.C = c;
                return null;
            }
            case 0: {
                return this.C;
            }
        }
    }
}
