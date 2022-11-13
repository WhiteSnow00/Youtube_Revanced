import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amkc extends ahbh implements ahcw
{
    public static final amkc a;
    private static volatile ahdd n;
    public int b;
    public ajut c;
    public amka d;
    public amkg e;
    public aiqj f;
    public ahbx g;
    public aiqj h;
    public String i;
    public aiqj j;
    public anuv k;
    public boolean l;
    public anuv m;
    private amka o;
    private byte p;
    
    static {
        ahbh.registerDefaultInstance((Class)amkc.class, (ahbh)(a = new amkc()));
    }
    
    private amkc() {
        this.p = 2;
        this.g = emptyProtobufList();
        this.i = "";
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte p3 = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd n;
                if ((n = amkc.n) == null) {
                    synchronized (amkc.class) {
                        if (amkc.n == null) {
                            amkc.n = (ahdd)new ahba((ahbh)amkc.a);
                        }
                    }
                }
                return n;
            }
            case 5: {
                return amkc.a;
            }
            case 4: {
                return new ahaz((ahbh)amkc.a);
            }
            case 3: {
                return new amkc();
            }
            case 2: {
                return newMessageInfo((MessageLite)amkc.a, "\u0001\f\u0000\u0001\u0001\f\f\u0000\u0001\n\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0002\u0004\u1409\u0003\u0005\u1409\u0004\u0006\u041b\u0007\u1409\u0005\b\u1008\u0006\t\u1409\u0007\n\u1409\b\u000b\u1007\t\f\u1409\n", new Object[] { "b", "c", "d", "o", "e", "f", "g", anuv.class, "h", "i", "j", "k", "l", "m" });
            }
            case 1: {
                if (o == null) {
                    p3 = 0;
                }
                this.p = p3;
                return null;
            }
            case 0: {
                return this.p;
            }
        }
    }
}
