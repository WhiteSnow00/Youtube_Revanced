import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class anqf extends ahbh implements ahcw
{
    public static final anqf a;
    private static volatile ahdd j;
    public int b;
    public anpm c;
    public anpa d;
    public ahbx e;
    public anuv f;
    public ahmo g;
    public ahab h;
    public String i;
    private ahhu k;
    private anuv l;
    private byte m;
    
    static {
        ahbh.registerDefaultInstance((Class)anqf.class, (ahbh)(a = new anqf()));
    }
    
    private anqf() {
        this.m = 2;
        this.e = emptyProtobufList();
        this.h = ahab.b;
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
                final ahdd j;
                if ((j = anqf.j) == null) {
                    synchronized (anqf.class) {
                        if (anqf.j == null) {
                            anqf.j = (ahdd)new ahba((ahbh)anqf.a);
                        }
                    }
                }
                return j;
            }
            case 5: {
                return anqf.a;
            }
            case 4: {
                return new ahaz((ahbh)anqf.a);
            }
            case 3: {
                return new anqf();
            }
            case 2: {
                return newMessageInfo((MessageLite)anqf.a, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0001\u0006\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u001b\u0004\u1409\u0002\u0005\u1409\u0004\u0006\u100a\u0005\u0007\u1409\u0003\b\u1409\u0006\t\u1008\u0007", new Object[] { "b", "c", "d", "e", anph.class, "f", "k", "h", "g", "l", "i" });
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
