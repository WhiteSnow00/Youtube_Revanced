import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajvk extends ahbh implements ahcw
{
    public static final ajvk a;
    private static volatile ahdd y;
    private byte A;
    public int b;
    public aotp c;
    public ajut d;
    public ajut e;
    public ajut f;
    public ajut g;
    public ajut h;
    public boolean i;
    public aiqj j;
    public ajut k;
    public ajut l;
    public ahbx m;
    public ajut n;
    public anuv o;
    public anuv p;
    public ahab q;
    public aiqj r;
    public String s;
    public anuv t;
    public anuv u;
    public int v;
    public ajut w;
    public aotp x;
    private ahhu z;
    
    static {
        ahbh.registerDefaultInstance((Class)ajvk.class, (ahbh)(a = new ajvk()));
    }
    
    private ajvk() {
        this.A = 2;
        this.m = emptyProtobufList();
        this.q = ahab.b;
        this.s = "";
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte a2 = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd y;
                if ((y = ajvk.y) == null) {
                    synchronized (ajvk.class) {
                        if (ajvk.y == null) {
                            ajvk.y = (ahdd)new ahba((ahbh)ajvk.a);
                        }
                    }
                }
                return y;
            }
            case 5: {
                return ajvk.a;
            }
            case 4: {
                return new ahaz((ahbh)ajvk.a);
            }
            case 3: {
                return new ajvk();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajvk.a, "\u0001\u0017\u0000\u0001\u0001\u0017\u0017\u0000\u0001\u0013\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u041b\u0004\u1409\n\u0005\u1409\f\u0006\u1409\r\u0007\u100a\u000e\b\u1409\u0002\t\u1409\u0004\n\u1409\b\u000b\u1409\u000b\f\u1409\u000f\r\u1409\u0005\u000e\u1007\u0006\u000f\u1008\u0010\u0010\u1409\u0011\u0011\u1409\u0012\u0012\u100c\u0013\u0013\u1409\u0007\u0014\u1409\u0003\u0015\u1409\t\u0016\u1409\u0014\u0017\u1409\u0015", new Object[] { "b", "c", "d", "m", anuv.class, "n", "p", "z", "q", "e", "g", "k", "o", "r", "h", "i", "s", "t", "u", "v", ajty.o, "j", "f", "l", "w", "x" });
            }
            case 1: {
                if (o == null) {
                    a2 = 0;
                }
                this.A = a2;
                return null;
            }
            case 0: {
                return this.A;
            }
        }
    }
}
