import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class appd extends ahbc implements ahbd
{
    private static volatile ahdd B;
    public static final appd a;
    public anuv A;
    private aiqj C;
    private ahhu D;
    private aiao E;
    private aiqj F;
    private byte G;
    public int b;
    public ajut c;
    public ajut d;
    public aotp e;
    public ajut f;
    public aijz g;
    public ajut h;
    public ajut i;
    public ajut j;
    public aiqj k;
    public appc m;
    public amgv n;
    public boolean o;
    public ahbx p;
    public ahab q;
    public String r;
    public aiao s;
    public aiao t;
    public ajut u;
    public apfs v;
    public ahbx w;
    public appe x;
    public apkr y;
    public anuv z;
    
    static {
        ahbh.registerDefaultInstance((Class)appd.class, (ahbh)(a = new appd()));
    }
    
    private appd() {
        this.G = 2;
        this.p = emptyProtobufList();
        this.q = ahab.b;
        this.r = "";
        this.w = emptyProtobufList();
        emptyProtobufList();
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte g = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd b;
                if ((b = appd.B) == null) {
                    synchronized (appd.class) {
                        if (appd.B == null) {
                            appd.B = (ahdd)new ahba((ahbh)appd.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return appd.a;
            }
            case 4: {
                return new ahbb((ahbc)appd.a);
            }
            case 3: {
                return new appd();
            }
            case 2: {
                return newMessageInfo((MessageLite)appd.a, "\u0001\u001c\u0000\u0001\u0001\"\u001c\u0000\u0002\u0017\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0002\u0004\u1409\u0003\u0005\u1409\u0006\u0006\u1409\u0007\u0007\u1409\t\b\u1409\n\t\u1409\u000b\n\u1007\f\f\u1409\u0010\r\u100a\u0012\u000e\u1008\u0013\u000f\u041b\u0010\u1409\u0005\u0011\u1409\u0014\u0012\u1409\u0015\u0013\u1409\u0016\u0014\u1409\u0017\u0015\u1409\b\u0017\u1409\u0018\u0019\u041b\u001a\u1009\u001a\u001b\u1009\u001b\u001d\u1409\u001c\u001f\u1409\u001e \u1409\u001f\"\u1409\u000e", new Object[] { "b", "c", "d", "e", "f", "h", "i", "k", "m", "n", "o", "D", "q", "r", "p", aotd.class, "g", "E", "s", "t", "u", "j", "v", "w", aiae.class, "x", "y", "z", "F", "A", "C" });
            }
            case 1: {
                if (o == null) {
                    g = 0;
                }
                this.G = g;
                return null;
            }
            case 0: {
                return this.G;
            }
        }
    }
}
