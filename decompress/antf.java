import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class antf extends ahcz implements aheo
{
    public static final ahdi a;
    public static final antf b;
    private static volatile ahev t;
    public int c;
    public boolean d;
    public boolean e;
    public alyj f;
    public int g;
    public int h;
    public boolean i;
    public String j;
    public boolean k;
    public String l;
    public boolean m;
    public boolean n;
    public boolean o;
    public boolean p;
    public ahvo q;
    public ahdh r;
    public boolean s;
    private int u;
    
    static {
        a = (ahdi)new alxv(8);
        ahcz.registerDefaultInstance(antf.class, b = new antf());
    }
    
    private antf() {
        this.j = "";
        this.l = "";
        emptyIntList();
        this.r = ahcz.emptyIntList();
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        switch (ahcy.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev t;
                if ((t = antf.t) == null) {
                    synchronized (antf.class) {
                        if (antf.t == null) {
                            antf.t = (ahev)new ahcs((ahcz)antf.b);
                        }
                    }
                }
                return t;
            }
            case 5: {
                return antf.b;
            }
            case 4: {
                return new ahcr((ahcz)antf.b);
            }
            case 3: {
                return new antf();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)antf.b, "\u0001\u0010\u0000\u0002\u0001(\u0010\u0000\u0001\u0000\u0001\u1007\u0000\u0002\u1007\u0001\u0003\u1009\u0002\u0005\u100c\u0004\u0007\u1004\u0006\b\u1007\u0007\t\u1008\b\n\u1007\t\u000b\u1008\n\u001b\u1007\u001a\u001d\u1007\u001c\u001f\u1007\u001e \u1007\u001f%\u1009#'\u001e(\u1007%", new Object[] { "c", "u", "d", "e", "f", "g", aine.i, "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", ante.a(), "s" });
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
