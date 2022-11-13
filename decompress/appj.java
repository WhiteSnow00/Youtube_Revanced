import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class appj extends ahbh implements ahcw
{
    public static final appj a;
    private static volatile ahdd l;
    public int b;
    public String c;
    public ajut d;
    public int e;
    public ajut f;
    public int g;
    public ajut h;
    public String i;
    public ajut j;
    public int k;
    private byte m;
    
    static {
        ahbh.registerDefaultInstance((Class)appj.class, (ahbh)(a = new appj()));
    }
    
    private appj() {
        this.m = 2;
        this.c = "";
        this.i = "";
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte m = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd l;
                if ((l = appj.l) == null) {
                    synchronized (appj.class) {
                        if (appj.l == null) {
                            appj.l = (ahdd)new ahba((ahbh)appj.a);
                        }
                    }
                }
                return l;
            }
            case 5: {
                return appj.a;
            }
            case 4: {
                return new ahaz((ahbh)appj.a);
            }
            case 3: {
                return new appj();
            }
            case 2: {
                return newMessageInfo((MessageLite)appj.a, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0000\u0004\u0001\u1008\u0000\u0002\u1409\u0001\u0003\u1409\u0003\u0004\u1409\u0005\u0005\u1008\u0006\u0006\u1409\u0007\u0007\u100b\u0002\b\u100b\u0004\t\u100b\b", new Object[] { "b", "c", "d", "f", "h", "i", "j", "e", "g", "k" });
            }
            case 1: {
                if (o == null) {
                    m = 0;
                }
                this.m = m;
                return null;
            }
            case 0: {
                return this.m;
            }
        }
    }
}
