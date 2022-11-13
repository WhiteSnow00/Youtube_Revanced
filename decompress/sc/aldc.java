import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aldc extends ahbh implements ahcw
{
    public static final aldc a;
    private static volatile ahdd r;
    public int b;
    public akli c;
    public ahbx d;
    public anuv e;
    public apmd f;
    public boolean g;
    public int h;
    public aiqj i;
    public String j;
    public aldb k;
    public alda l;
    public akug m;
    public aiqj n;
    public boolean o;
    public aldd p;
    public ahab q;
    private ajvo s;
    private ahhu t;
    private byte u;
    
    static {
        ahbh.registerDefaultInstance((Class)aldc.class, (ahbh)(a = new aldc()));
    }
    
    private aldc() {
        this.u = 2;
        this.d = emptyProtobufList();
        this.j = "";
        this.q = ahab.b;
    }
    
    public final void a() {
        final ahbx d = this.d;
        if (!d.c()) {
            this.d = ahbh.mutableCopy(d);
        }
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte u = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd r;
                if ((r = aldc.r) == null) {
                    synchronized (aldc.class) {
                        if (aldc.r == null) {
                            aldc.r = (ahdd)new ahba((ahbh)aldc.a);
                        }
                    }
                }
                return r;
            }
            case 5: {
                return aldc.a;
            }
            case 4: {
                return new ahaz((byte[][])null, (short[][][])null);
            }
            case 3: {
                return new aldc();
            }
            case 2: {
                return newMessageInfo((MessageLite)aldc.a, "\u0001\u0011\u0000\u0001\u0001\u0309\u0011\u0000\u0001\n\u0001\u1409\u0000\u0003\u041b\u0004\u1409\u0002\u0005\u1007\u0003\u0006\u1004\u0004\u0007\u1409\u0005\b\u1009\t\t\u1008\u0006\n\u1409\n\u000b\u1007\u000b\f\u1409\u000e\r\u100a\u000f\u000e\u1409\u0001\u000f\u1409\f\u0010\u1009\b\u0011\u1409\u0007\u0309\u1409\r", new Object[] { "b", "c", "d", aldd.class, "f", "g", "h", "i", "m", "j", "n", "o", "t", "q", "e", "p", "l", "k", "s" });
            }
            case 1: {
                if (o == null) {
                    u = 0;
                }
                this.u = u;
                return null;
            }
            case 0: {
                return this.u;
            }
        }
    }
}
