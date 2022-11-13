import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class atzd extends ahbh implements ahcw
{
    public static final atzd a;
    private static volatile ahdd v;
    public int b;
    public long c;
    public String d;
    public String e;
    public atxt f;
    public atxz g;
    public atyo h;
    public atyw i;
    public atxd j;
    public atyu k;
    public atyd l;
    public atwz m;
    public atzc n;
    public atyr o;
    public ahbx p;
    public atym q;
    public atza r;
    public atys s;
    public atxm t;
    public atyl u;
    private atyn w;
    private byte x;
    
    static {
        ahbh.registerDefaultInstance((Class)atzd.class, (ahbh)(a = new atzd()));
    }
    
    private atzd() {
        this.x = 2;
        this.d = "";
        this.e = "";
        emptyProtobufList();
        emptyProtobufList();
        this.p = emptyProtobufList();
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
                final ahdd v;
                if ((v = atzd.v) == null) {
                    synchronized (atzd.class) {
                        if (atzd.v == null) {
                            atzd.v = (ahdd)new ahba((ahbh)atzd.a);
                        }
                    }
                }
                return v;
            }
            case 5: {
                return atzd.a;
            }
            case 4: {
                return new ahaz((char[])null, (float[])null);
            }
            case 3: {
                return new atzd();
            }
            case 2: {
                return newMessageInfo((MessageLite)atzd.a, "\u0001\u0014\u0000\u0001\u0001\"\u0014\u0000\u0001\b\u0001\u1409\u0003\u0002\u1005\u0000\u0003\u1008\u0001\u0005\u1009\u0018\u0006\u1409\u0005\u0007\u1409\u0006\b\u1409\u0019\t\u1009\u0007\n\u1409\b\f\u1009\n\u000e\u1409\u001b\u0010\u1409\f\u0011\u1008\u0002\u0015\u1009\u001c\u0017\u1009\u001a\u001d\u1409\u0015\u001e\u1009\u0016\u001f\u1009\u0017 \u1009\u0013\"\u001b", new Object[] { "b", "f", "c", "d", "q", "g", "h", "r", "i", "j", "k", "t", "l", "e", "u", "s", "w", "n", "o", "m", "p", atxp.class });
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
