import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alnm extends ahbh implements ahcw
{
    public static final alnm a;
    private static volatile ahdd o;
    public int b;
    public ajut c;
    public ajut d;
    public String e;
    public int f;
    public ajut g;
    public ajut h;
    public ajut i;
    public anuv j;
    public anuv k;
    public ajut l;
    public ajut m;
    public aida n;
    private ajut p;
    private ajut q;
    private aida r;
    private byte s;
    
    static {
        ahbh.registerDefaultInstance((Class)alnm.class, (ahbh)(a = new alnm()));
    }
    
    private alnm() {
        this.s = 2;
        this.e = "";
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte s = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd o3;
                if ((o3 = alnm.o) == null) {
                    synchronized (alnm.class) {
                        if (alnm.o == null) {
                            alnm.o = (ahdd)new ahba((ahbh)alnm.a);
                        }
                    }
                }
                return o3;
            }
            case 5: {
                return alnm.a;
            }
            case 4: {
                return new ahaz((ahbh)alnm.a);
            }
            case 3: {
                return new alnm();
            }
            case 2: {
                return newMessageInfo((MessageLite)alnm.a, "\u0001\u000f\u0000\u0001\u0001\u0014\u000f\u0000\u0000\r\u0001\u1409\u0000\u0002\u1409\u0005\u0003\u1409\u0006\u0005\u1409\u0007\u0007\u1409\b\t\u1409\t\n\u1409\n\f\u1409\u0001\r\u1409\u000b\u000e\u1409\f\u000f\u1409\u000e\u0010\u1409\u0002\u0011\u1409\u000f\u0012\u1004\u0004\u0014\u1008\u0003", new Object[] { "b", "c", "g", "h", "i", "j", "k", "q", "d", "l", "m", "n", "p", "r", "f", "e" });
            }
            case 1: {
                if (o == null) {
                    s = 0;
                }
                this.s = s;
                return null;
            }
            case 0: {
                return this.s;
            }
        }
    }
}
