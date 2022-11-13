import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class angl extends ahbh implements ahcw
{
    private static volatile ahdd A;
    public static final angl a;
    private aiqj B;
    private angn C;
    private anuv D;
    private anuv E;
    private anuv F;
    private anuv G;
    private anuv H;
    private aiqj I;
    private aiqj J;
    private aiqj K;
    private aiqj L;
    private aiqj M;
    private ajut N;
    private anfx O;
    private anuv P;
    private anuv Q;
    private anuv R;
    private anuv S;
    private byte T;
    public int b;
    public int c;
    public ahbx d;
    public angk e;
    public angm f;
    public angc g;
    public angi h;
    public angh i;
    public angq j;
    public anuv k;
    public anuv l;
    public anuv m;
    public ajut n;
    public anuv o;
    public anuv p;
    public aida q;
    public anuv r;
    public apnr s;
    public apnr t;
    public anuv u;
    public anuv v;
    public anuv w;
    public anuv x;
    public ahbx y;
    public boolean z;
    
    static {
        ahbh.registerDefaultInstance((Class)angl.class, (ahbh)(a = new angl()));
    }
    
    private angl() {
        this.T = 2;
        this.d = emptyProtobufList();
        emptyProtobufList();
        this.y = emptyProtobufList();
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte t = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd a2;
                if ((a2 = angl.A) == null) {
                    synchronized (angl.class) {
                        if (angl.A == null) {
                            angl.A = (ahdd)new ahba((ahbh)angl.a);
                        }
                    }
                }
                return a2;
            }
            case 5: {
                return angl.a;
            }
            case 4: {
                return new ahaz((ahbh)angl.a);
            }
            case 3: {
                return new angl();
            }
            case 2: {
                return newMessageInfo((MessageLite)angl.a, "\u0001)\u0000\u0002\u00011)\u0000\u0002&\u0001\u041b\u0002\u1409\u0000\u0003\u1409\t\u0004\u1409\n\u0005\u1409\u0001\u0006\u1409\u0004\u0007\u1409\b\b\u1409\f\r\u1409\r\u000e\u1409\u000e\u000f\u1409\u0011\u0010\u1409\u0013\u0011\u1409\u0007\u0012\u1409\u0014\u0013\u1409\u000b\u0014\u1409\u000f\u0015\u1409\u0016\u0016\u1409\u0017\u0017\u1409\u001b\u0019\u1409 \u001a\u1409!\u001b\u1409\"\u001c\u1409#\u001d\u1409$\u001e\u1409\u001c\u001f\u1409% \u1409\u001e\"\u1009\u0019#\u1009\u001a$\u1409&%\u1409\u0012'\u1409\u001f(\u1409')\u1409\u001d*\u041b+\u1409(,\u1409\u0015.\u1409)/\u1409*0\u1409\u00181\u1007+", new Object[] { "b", "c", "d", angb.class, "e", "h", "i", "f", "g", "C", "j", "E", "F", "l", "n", "B", "o", "D", "k", "q", "r", "u", "I", "J", "K", "L", "M", "H", "N", "w", "s", "t", "O", "m", "x", "P", "v", "y", anuv.class, "Q", "p", "R", "S", "G", "z" });
            }
            case 1: {
                if (o == null) {
                    t = 0;
                }
                this.T = t;
                return null;
            }
            case 0: {
                return this.T;
            }
        }
    }
}
