import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class anql extends ahbh implements ahcw
{
    public static final anql a;
    private static volatile ahdd q;
    public int b;
    public ajut c;
    public ajut d;
    public ajut e;
    public akdi f;
    public aotp g;
    public aiqj h;
    public ahbx i;
    public amgv j;
    public anqk k;
    public long l;
    public long m;
    public ahmo n;
    public ahab o;
    public String p;
    private ahhu r;
    private byte s;
    
    static {
        ahbh.registerDefaultInstance((Class)anql.class, (ahbh)(a = new anql()));
    }
    
    private anql() {
        this.s = 2;
        this.i = emptyProtobufList();
        this.o = ahab.b;
        this.p = "";
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
                final ahdd q;
                if ((q = anql.q) == null) {
                    synchronized (anql.class) {
                        if (anql.q == null) {
                            anql.q = (ahdd)new ahba((ahbh)anql.a);
                        }
                    }
                }
                return q;
            }
            case 5: {
                return anql.a;
            }
            case 4: {
                return new ahaz((ahbh)anql.a);
            }
            case 3: {
                return new anql();
            }
            case 2: {
                return newMessageInfo((MessageLite)anql.a, "\u0001\u000f\u0000\u0001\u0001\u000f\u000f\u0000\u0001\n\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0002\u0004\u1409\u0003\u0005\u1409\u0004\u0006\u1409\u0005\u0007\u041b\b\u1409\u0006\t\u1409\u000b\n\u100a\f\u000b\u1009\u0007\f\u1002\b\r\u1002\t\u000e\u1409\n\u000f\u1008\r", new Object[] { "b", "c", "d", "e", "f", "g", "h", "i", aiqj.class, "j", "r", "o", "k", "l", "m", "n", "p" });
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
