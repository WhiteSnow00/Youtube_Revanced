import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alqc extends ahbh implements ahcw
{
    public static final alqc a;
    private static volatile ahdd l;
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;
    public String j;
    public boolean k;
    private int m;
    
    static {
        ahbh.registerDefaultInstance((Class)alqc.class, (ahbh)(a = new alqc()));
    }
    
    private alqc() {
        this.j = "";
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd l;
                if ((l = alqc.l) == null) {
                    synchronized (alqc.class) {
                        if (alqc.l == null) {
                            alqc.l = (ahdd)new ahba((ahbh)alqc.a);
                        }
                    }
                }
                return l;
            }
            case 5: {
                return alqc.a;
            }
            case 4: {
                return new ahaz((ahbh)alqc.a);
            }
            case 3: {
                return new alqc();
            }
            case 2: {
                return newMessageInfo((MessageLite)alqc.a, "\u0001\n\u0000\u0001\u0003\u0015\n\u0000\u0000\u0000\u0003\u1007\u0001\u0004\u1007\u0002\u0005\u1007\u0003\u0006\u1007\u0004\n\u1007\u0007\r\u1007\b\u000e\u1007\t\u0012\u1007\n\u0014\u1008\f\u0015\u1007\r", new Object[] { "m", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k" });
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
