import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class anor extends ahbh implements ahcw
{
    public static final anor a;
    private static volatile ahdd s;
    public int b;
    public aotp c;
    public ajut d;
    public float e;
    public ajut f;
    public ajut g;
    public aiqj h;
    public ahbx i;
    public aida j;
    public amgv k;
    public anop l;
    public long m;
    public long n;
    public anoq o;
    public ahmo p;
    public ahab q;
    public String r;
    private ahhu t;
    private byte u;
    
    static {
        ahbh.registerDefaultInstance((Class)anor.class, (ahbh)(a = new anor()));
    }
    
    private anor() {
        this.u = 2;
        this.i = emptyProtobufList();
        this.q = ahab.b;
        this.r = "";
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
                final ahdd s;
                if ((s = anor.s) == null) {
                    synchronized (anor.class) {
                        if (anor.s == null) {
                            anor.s = (ahdd)new ahba((ahbh)anor.a);
                        }
                    }
                }
                return s;
            }
            case 5: {
                return anor.a;
            }
            case 4: {
                return new ahaz((ahbh)anor.a);
            }
            case 3: {
                return new anor();
            }
            case 2: {
                return newMessageInfo((MessageLite)anor.a, "\u0001\u0011\u0000\u0001\u0001\u0011\u0011\u0000\u0001\n\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1001\u0002\u0004\u1409\u0003\u0005\u1409\u0004\u0006\u1409\u0005\u0007\u041b\b\u1409\u0006\t\u1409\u0007\n\u1009\b\u000b\u1409\r\f\u100a\u000e\r\u1002\t\u000e\u1002\n\u000f\u1009\u000b\u0010\u1409\f\u0011\u1008\u000f", new Object[] { "b", "c", "d", "e", "f", "g", "h", "i", aiqj.class, "j", "k", "l", "t", "q", "m", "n", "o", "p", "r" });
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
