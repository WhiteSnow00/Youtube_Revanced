import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajyd extends ahbh implements ahcw
{
    public static final ajyd a;
    private static volatile ahdd p;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public String g;
    public int h;
    public int i;
    public ajut j;
    public int k;
    public int l;
    public ajut m;
    public int n;
    public ajut o;
    private byte q;
    
    static {
        ahbh.registerDefaultInstance((Class)ajyd.class, (ahbh)(a = new ajyd()));
    }
    
    private ajyd() {
        this.q = 2;
        this.g = "";
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte q = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd p3;
                if ((p3 = ajyd.p) == null) {
                    synchronized (ajyd.class) {
                        if (ajyd.p == null) {
                            ajyd.p = (ahdd)new ahba((ahbh)ajyd.a);
                        }
                    }
                }
                return p3;
            }
            case 5: {
                return ajyd.a;
            }
            case 4: {
                return new ahaz((ahbh)ajyd.a);
            }
            case 3: {
                return new ajyd();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajyd.a, "\u0001\r\u0000\u0001\u0006\u0012\r\u0000\u0000\u0003\u0006\u1004\u0000\u0007\u1004\u0001\b\u1004\u0002\t\u1004\u0003\n\u1004\b\u000b\u1004\t\f\u1004\u000b\r\u1409\u0007\u000e\u1409\n\u000f\u1409\f\u0010\u1004\u0005\u0011\u1004\u0006\u0012\u1008\u0004", new Object[] { "b", "c", "d", "e", "f", "k", "l", "n", "j", "m", "o", "h", "i", "g" });
            }
            case 1: {
                if (o == null) {
                    q = 0;
                }
                this.q = q;
                return null;
            }
            case 0: {
                return this.q;
            }
        }
    }
}
