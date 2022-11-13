import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajvn extends ahbh implements ahcw
{
    public static final ajvn a;
    private static volatile ahdd l;
    public int b;
    public int c;
    public ajut d;
    public String e;
    public ajut f;
    public ajut g;
    public aiqj h;
    public apjn i;
    public String j;
    public ahab k;
    private ahhu m;
    private byte n;
    
    static {
        ahbh.registerDefaultInstance((Class)ajvn.class, (ahbh)(a = new ajvn()));
    }
    
    private ajvn() {
        this.n = 2;
        this.e = "";
        this.j = "";
        this.k = ahab.b;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte n = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd l;
                if ((l = ajvn.l) == null) {
                    synchronized (ajvn.class) {
                        if (ajvn.l == null) {
                            ajvn.l = (ahdd)new ahba((ahbh)ajvn.a);
                        }
                    }
                }
                return l;
            }
            case 5: {
                return ajvn.a;
            }
            case 4: {
                return new ahaz((ahbh)ajvn.a);
            }
            case 3: {
                return new ajvn();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajvn.a, "\u0001\n\u0000\u0001\u0001\n\n\u0000\u0000\u0006\u0001\u100c\u0000\u0002\u1409\u0001\u0003\u1008\u0002\u0004\u1409\u0003\u0005\u1409\u0004\u0006\u1409\u0005\u0007\u1409\u0006\b\u1008\u0007\t\u1409\b\n\u100a\t", new Object[] { "b", "c", ajty.q, "d", "e", "f", "g", "h", "i", "j", "m", "k" });
            }
            case 1: {
                if (o == null) {
                    n = 0;
                }
                this.n = n;
                return null;
            }
            case 0: {
                return this.n;
            }
        }
    }
}
