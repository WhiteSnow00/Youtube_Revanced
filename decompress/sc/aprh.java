import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aprh extends ahbh implements ahcw
{
    public static final aprh a;
    private static volatile ahdd p;
    public int b;
    public aotp c;
    public aiqj d;
    public ajut e;
    public ajut f;
    public ajut g;
    public aiao h;
    public ahbx i;
    public apqq j;
    public anuv k;
    public String l;
    public apqs m;
    public ahil n;
    public ahab o;
    private apfs q;
    private ahhu r;
    private byte s;
    
    static {
        ahbh.registerDefaultInstance((Class)aprh.class, (ahbh)(a = new aprh()));
    }
    
    private aprh() {
        this.s = 2;
        this.i = emptyProtobufList();
        this.l = "";
        this.o = ahab.b;
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
                final ahdd p3;
                if ((p3 = aprh.p) == null) {
                    synchronized (aprh.class) {
                        if (aprh.p == null) {
                            aprh.p = (ahdd)new ahba((ahbh)aprh.a);
                        }
                    }
                }
                return p3;
            }
            case 5: {
                return aprh.a;
            }
            case 4: {
                return new ahaz((ahbh)aprh.a);
            }
            case 3: {
                return new aprh();
            }
            case 2: {
                return newMessageInfo((MessageLite)aprh.a, "\u0001\u000f\u0000\u0001\u0001\u000f\u000f\u0000\u0001\f\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0002\u0004\u1409\u0003\u0005\u1409\u0004\u0006\u1409\f\u0007\u100a\r\b\u1409\u0006\t\u041b\n\u1409\u0007\u000b\u1409\n\f\u1009\u000b\r\u1409\u0005\u000e\u1409\b\u000f\u1008\t", new Object[] { "b", "c", "d", "e", "f", "g", "r", "o", "h", "i", aotd.class, "j", "m", "n", "q", "k", "l" });
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
