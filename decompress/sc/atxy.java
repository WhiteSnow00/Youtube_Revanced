import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class atxy extends ahbh implements ahcw
{
    private static volatile ahdd A;
    public static final atxy a;
    private byte B;
    public int b;
    public String c;
    public String d;
    public String e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public atyj l;
    public int m;
    public atxw n;
    public int o;
    public atxm p;
    public long q;
    public int r;
    public int s;
    public int t;
    public int u;
    public String v;
    public ahbs w;
    public String x;
    public atyc y;
    public atxu z;
    
    static {
        ahbh.registerDefaultInstance((Class)atxy.class, (ahbh)(a = new atxy()));
    }
    
    private atxy() {
        this.B = 2;
        this.c = "";
        this.d = "";
        this.e = "";
        emptyProtobufList();
        this.v = "";
        this.w = emptyLongList();
        this.x = "";
        emptyProtobufList();
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte b = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd a2;
                if ((a2 = atxy.A) == null) {
                    synchronized (atxy.class) {
                        if (atxy.A == null) {
                            atxy.A = (ahdd)new ahba((ahbh)atxy.a);
                        }
                    }
                }
                return a2;
            }
            case 5: {
                return atxy.a;
            }
            case 4: {
                return new ahaz((int[][][])null, (char[][][])null);
            }
            case 3: {
                return new atxy();
            }
            case 2: {
                return newMessageInfo((MessageLite)atxy.a, "\u0001\u0018\u0000\u0001\u0001\u001b\u0018\u0000\u0001\u0001\u0001\u1008\u0000\u0002\u1008\u0001\u0003\u1004\u0003\u0004\u1004\u0004\u0005\u1004\u0005\u0006\u100b\u0006\u0007\u100b\u0007\b\u100c\b\n\u1009\t\u000b\u1009\u000b\f\u1409\r\r\u1002\u000e\u000e\u100c\u000f\u000f\u100c\u0010\u0010\u1004\u0012\u0011\u1008\u0013\u0013\u1004\u0011\u0014\u1008\u0015\u0015(\u0016\u1009\u0016\u0018\u100c\n\u0019\u1008\u0002\u001a\u1009\u0017\u001b\u100c\f", new Object[] { "b", "c", "d", "f", "g", "h", "i", "j", "k", areg.m, "l", "n", "p", "q", "r", atyb.a(), "s", areg.l, "u", "v", "t", "x", "w", "y", "m", atxx.a(), "e", "z", "o", atya.a() });
            }
            case 1: {
                if (o == null) {
                    b = 0;
                }
                this.B = b;
                return null;
            }
            case 0: {
                return this.B;
            }
        }
    }
}
