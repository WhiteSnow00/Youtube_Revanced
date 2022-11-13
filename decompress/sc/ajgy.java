import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajgy extends ahbh implements ahcw
{
    public static final ajgy a;
    public static final ahbf b;
    private static volatile ahdd w;
    public int c;
    public int d;
    public Object e;
    public String f;
    public String g;
    public String h;
    public String i;
    public int j;
    public String k;
    public int l;
    public boolean m;
    public String n;
    public String o;
    public int p;
    public String q;
    public int r;
    public String s;
    public String t;
    public ahbx u;
    public aotp v;
    private byte x;
    
    static {
        final ajgy a2 = new ajgy();
        ahbh.registerDefaultInstance((Class)ajgy.class, (ahbh)(a = a2));
        b = ahbh.newSingularGeneratedExtension((MessageLite)ajqe.a, (Object)a2, (MessageLite)a2, (ahbm)null, 284, ahek.k, (Class)ajgy.class);
    }
    
    private ajgy() {
        this.d = 0;
        this.x = 2;
        this.f = "";
        this.g = "";
        this.h = "";
        this.i = "";
        this.k = "";
        this.n = "";
        this.o = "";
        this.q = "";
        this.s = "";
        this.t = "";
        this.u = emptyProtobufList();
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte x = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd w;
                if ((w = ajgy.w) == null) {
                    synchronized (ajgy.class) {
                        if (ajgy.w == null) {
                            ajgy.w = (ahdd)new ahba((ahbh)ajgy.a);
                        }
                    }
                }
                return w;
            }
            case 5: {
                return ajgy.a;
            }
            case 4: {
                return new ahaz((int[][][])null, (char[][])null);
            }
            case 3: {
                return new ajgy();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajgy.a, "\u0001\u0013\u0001\u0001\u0001\u0014\u0013\u0000\u0001\u0003\u0001\u1008\u0000\u0002\u1008\u0001\u0003\u1008\u0002\u0004\u1008\u0003\u0005\u1004\u0004\u0006\u1008\u0005\u0007\u1004\u0006\b\u143c\u0000\t\u1004\u000e\n\u1008\u000f\u000b\u1008\u0010\f\u001b\r\u1409\u0011\u000e\u1007\u0007\u000f\u1008\b\u0010\u1008\t\u0011\u1004\n\u0013\u143c\u0000\u0014\u1008\r", new Object[] { "e", "d", "c", "f", "g", "h", "i", "j", "k", "l", aotp.class, "r", "s", "t", "u", aiab.class, "v", "m", "n", "o", "p", ajgx.class, "q" });
            }
            case 1: {
                if (o == null) {
                    x = 0;
                }
                this.x = x;
                return null;
            }
            case 0: {
                return this.x;
            }
        }
    }
}
