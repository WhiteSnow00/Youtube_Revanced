import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class anbp extends ahbh implements ahcw
{
    public static final anbp a;
    private static volatile ahdd n;
    public int b;
    public int c;
    public Object d;
    public String e;
    public String f;
    public aiqj g;
    public ajut h;
    public anbo i;
    public anbn j;
    public ahab k;
    public int l;
    public anuv m;
    private aiqj o;
    private ahhu p;
    private byte q;
    
    static {
        ahbh.registerDefaultInstance((Class)anbp.class, (ahbh)(a = new anbp()));
    }
    
    private anbp() {
        this.c = 0;
        this.q = 2;
        this.e = "";
        this.f = "";
        this.k = ahab.b;
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
                final ahdd n;
                if ((n = anbp.n) == null) {
                    synchronized (anbp.class) {
                        if (anbp.n == null) {
                            anbp.n = (ahdd)new ahba((ahbh)anbp.a);
                        }
                    }
                }
                return n;
            }
            case 5: {
                return anbp.a;
            }
            case 4: {
                return new ahaz((ahbh)anbp.a);
            }
            case 3: {
                return new anbp();
            }
            case 2: {
                return newMessageInfo((MessageLite)anbp.a, "\u0001\r\u0001\u0001\u0001\u000f\r\u0000\u0000\b\u0001\u1008\u0000\u0002\u1409\u0002\u0003\u1409\u0004\u0005\u143c\u0000\u0006\u1009\b\u0007\u1409\t\b\u1409\n\t\u100a\u000b\n\u1008\u0001\u000b\u100c\f\f\u1409\r\u000e\u1409\u0003\u000f\u143c\u0000", new Object[] { "d", "c", "b", "e", "g", "h", akdi.class, "i", "j", "p", "k", "f", "l", anbq.a(), "m", "o", aotp.class });
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
