import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aprf extends ahbh implements ahcw
{
    public static final aprf a;
    private static volatile ahdd o;
    public int b;
    public aotp c;
    public ajut d;
    public ajut e;
    public ajut f;
    public ajut g;
    public aiqj h;
    public ahbx i;
    public ahbx j;
    public int k;
    public amgv l;
    public String m;
    public ahab n;
    private apfs p;
    private anuv q;
    private ahhu r;
    private byte s;
    
    static {
        ahbh.registerDefaultInstance((Class)aprf.class, (ahbh)(a = new aprf()));
    }
    
    private aprf() {
        this.s = 2;
        this.i = emptyProtobufList();
        this.j = emptyProtobufList();
        this.m = "";
        this.n = ahab.b;
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
                if ((o3 = aprf.o) == null) {
                    synchronized (aprf.class) {
                        if (aprf.o == null) {
                            aprf.o = (ahdd)new ahba((ahbh)aprf.a);
                        }
                    }
                }
                return o3;
            }
            case 5: {
                return aprf.a;
            }
            case 4: {
                return new ahaz((ahbh)aprf.a);
            }
            case 3: {
                return new aprf();
            }
            case 2: {
                return newMessageInfo((MessageLite)aprf.a, "\u0001\u000f\u0000\u0001\u0001\u0010\u000f\u0000\u0002\f\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0002\u0004\u1409\u0004\u0005\u1409\u0006\u0006\u1409\r\u0007\u100a\u000e\t\u041b\n\u041b\u000b\u100c\b\f\u1409\t\r\u1008\n\u000e\u1409\u0003\u000f\u1409\u0005\u0010\u1409\u000b", new Object[] { "b", "c", "d", "e", "g", "h", "r", "n", "i", aotd.class, "j", aprc.class, "k", apow.q, "l", "m", "f", "p", "q" });
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
