import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajkc extends ahbh implements ahcw
{
    public static final ajkc a;
    private static volatile ahdd m;
    public int b;
    public int c;
    public Object d;
    public ajut e;
    public ajut f;
    public String g;
    public boolean h;
    public ahik i;
    public aiqj j;
    public akdi k;
    public ajut l;
    private ajut n;
    private aiyg o;
    private anuv p;
    private byte q;
    
    static {
        ahbh.registerDefaultInstance((Class)ajkc.class, (ahbh)(a = new ajkc()));
    }
    
    private ajkc() {
        this.c = 0;
        this.q = 2;
        this.g = "";
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
                final ahdd m;
                if ((m = ajkc.m) == null) {
                    synchronized (ajkc.class) {
                        if (ajkc.m == null) {
                            ajkc.m = (ahdd)new ahba((ahbh)ajkc.a);
                        }
                    }
                }
                return m;
            }
            case 5: {
                return ajkc.a;
            }
            case 4: {
                return new ahaz((ahbh)ajkc.a);
            }
            case 3: {
                return new ajkc();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajkc.a, "\u0001\r\u0001\u0001\u0001\u000f\r\u0000\u0000\b\u0001\u1409\u0000\u0002\u1008\u0003\u0003\u1007\u0007\u0004\u1009\t\u0006\u1037\u0000\u0007\u103b\u0000\b\u1409\u0001\t\u1409\n\n\u1409\u000b\f\u1409\r\r\u1409\u000e\u000e\u1409\u0002\u000f\u1409\u000f", new Object[] { "d", "c", "b", "e", "g", "h", "i", "n", "o", "p", "j", "k", "f", "l" });
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
