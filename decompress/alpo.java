import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alpo extends ahbh implements ahcw
{
    public static final alpo a;
    private static volatile ahdd m;
    public int b;
    public String c;
    public anuv d;
    public anuv e;
    public boolean f;
    public String g;
    public aiqj h;
    public aiqj i;
    public boolean j;
    public int k;
    public alpn l;
    private byte n;
    
    static {
        ahbh.registerDefaultInstance((Class)alpo.class, (ahbh)(a = new alpo()));
    }
    
    private alpo() {
        this.n = 2;
        this.c = "";
        emptyProtobufList();
        this.g = "";
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
                final ahdd m;
                if ((m = alpo.m) == null) {
                    synchronized (alpo.class) {
                        if (alpo.m == null) {
                            alpo.m = (ahdd)new ahba((ahbh)alpo.a);
                        }
                    }
                }
                return m;
            }
            case 5: {
                return alpo.a;
            }
            case 4: {
                return new ahaz((ahbh)alpo.a);
            }
            case 3: {
                return new alpo();
            }
            case 2: {
                return newMessageInfo((MessageLite)alpo.a, "\u0001\n\u0000\u0001\u0001\u000b\n\u0000\u0000\u0004\u0001\u1409\u0001\u0002\u1409\u0002\u0003\u1008\u0000\u0005\u1007\u0003\u0006\u1008\u0004\u0007\u1409\u0005\b\u1409\u0006\t\u1007\u0007\n\u100c\b\u000b\u1009\t", new Object[] { "b", "d", "e", "c", "f", "g", "h", "i", "j", "k", alnf.i, "l" });
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
