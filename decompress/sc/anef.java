import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class anef extends ahbh implements ahcw
{
    public static final anef a;
    private static volatile ahdd s;
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e;
    public boolean f;
    public long g;
    public int h;
    public boolean i;
    public boolean j;
    public boolean k;
    public boolean l;
    public ahud m;
    public boolean n;
    public boolean o;
    public boolean p;
    public boolean q;
    public boolean r;
    private int t;
    private int u;
    
    static {
        ahbh.registerDefaultInstance((Class)anef.class, (ahbh)(a = new anef()));
    }
    
    private anef() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd s;
                if ((s = anef.s) == null) {
                    synchronized (anef.class) {
                        if (anef.s == null) {
                            anef.s = (ahdd)new ahba((ahbh)anef.a);
                        }
                    }
                }
                return s;
            }
            case 5: {
                return anef.a;
            }
            case 4: {
                return new ahaz((ahbh)anef.a);
            }
            case 3: {
                return new anef();
            }
            case 2: {
                return newMessageInfo((MessageLite)anef.a, "\u0001\u0011\u0000\u0002\u0002\uf119\u89c9\u0011\u0000\u0000\u0000\u0002\u1007\u0001\u0003\u1007\u0002\u0004\u1007\u0003\r\u1007\u000b\u000e\u1007\f\u0012\u1002\u0010\u0019\u1004\u0015\u001f\u1007\u001b \u1007\u001c$\u1007\u001f)\u1007#.\u1007(/\u1007)1\u1007+7\u10071?\u10078\uf119\u89c9\u1009%", new Object[] { "t", "u", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "n", "o", "p", "q", "r", "m" });
            }
            case 1: {
                return null;
            }
            case 0: {
                return 1;
            }
        }
    }
}
