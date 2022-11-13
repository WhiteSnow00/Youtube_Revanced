import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amjm extends ahbh implements ahcw
{
    public static final amjm a;
    private static volatile ahdd t;
    public int b;
    public long c;
    public boolean d;
    public ajqg e;
    public anqt f;
    public boolean g;
    public boolean h;
    public boolean i;
    public boolean j;
    public int k;
    public int l;
    public boolean m;
    public boolean n;
    public boolean o;
    public int p;
    public boolean q;
    public boolean r;
    public boolean s;
    private int u;
    private int v;
    
    static {
        ahbh.registerDefaultInstance((Class)amjm.class, (ahbh)(a = new amjm()));
    }
    
    private amjm() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd t;
                if ((t = amjm.t) == null) {
                    synchronized (amjm.class) {
                        if (amjm.t == null) {
                            amjm.t = (ahdd)new ahba((ahbh)amjm.a);
                        }
                    }
                }
                return t;
            }
            case 5: {
                return amjm.a;
            }
            case 4: {
                return new ahaz((ahbh)amjm.a);
            }
            case 3: {
                return new amjm();
            }
            case 2: {
                return newMessageInfo((MessageLite)amjm.a, "\u0001\u0011\u0000\u0003\u0011S\u0011\u0000\u0000\u0000\u0011\u1002\u000f\u0012\u1007\u0010&\u1009 1\u1009*3\u1007+4\u1007,7\u1007/:\u10073;\u10044<\u10045B\u10078D\u1007:E\u1004;H\u10079I\u1007>J\u1007?S\u1007H", new Object[] { "u", "b", "v", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "o", "p", "n", "q", "r", "s" });
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
