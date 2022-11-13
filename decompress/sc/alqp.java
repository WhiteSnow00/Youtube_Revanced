import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alqp extends ahbh implements ahcw
{
    public static final alqp a;
    private static volatile ahdd i;
    public int b;
    public int c;
    public Object d;
    public String e;
    public ajut f;
    public anuv g;
    public aiqj h;
    private aiqj j;
    private ahhu k;
    private byte l;
    
    static {
        ahbh.registerDefaultInstance((Class)alqp.class, (ahbh)(a = new alqp()));
    }
    
    private alqp() {
        this.c = 0;
        this.l = 2;
        this.e = "";
        final ahab b = ahab.b;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte l = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd i;
                if ((i = alqp.i) == null) {
                    synchronized (alqp.class) {
                        if (alqp.i == null) {
                            alqp.i = (ahdd)new ahba((ahbh)alqp.a);
                        }
                    }
                }
                return i;
            }
            case 5: {
                return alqp.a;
            }
            case 4: {
                return new ahaz((ahbh)alqp.a);
            }
            case 3: {
                return new alqp();
            }
            case 2: {
                return newMessageInfo((MessageLite)alqp.a, "\u0001\b\u0001\u0001\u0001\n\b\u0000\u0000\u0007\u0001\u1008\u0000\u0003\u143c\u0000\u0004\u143c\u0000\u0005\u1409\u0004\u0006\u1409\u0005\u0007\u1409\u0006\t\u1409\b\n\u1409\t", new Object[] { "d", "c", "b", "e", akdi.class, anuv.class, "f", "g", "h", "j", "k" });
            }
            case 1: {
                if (o == null) {
                    l = 0;
                }
                this.l = l;
                return null;
            }
            case 0: {
                return this.l;
            }
        }
    }
}
