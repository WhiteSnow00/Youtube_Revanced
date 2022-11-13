import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class anqg extends ahbh implements ahcw
{
    public static final anqg a;
    private static volatile ahdd j;
    public int b;
    public anpm c;
    public ahbx d;
    public anuv e;
    public ahmo f;
    public ahab g;
    public String h;
    public boolean i;
    private ahhu k;
    private anuv l;
    private byte m;
    
    static {
        ahbh.registerDefaultInstance((Class)anqg.class, (ahbh)(a = new anqg()));
    }
    
    private anqg() {
        this.m = 2;
        this.d = emptyProtobufList();
        this.g = ahab.b;
        this.h = "";
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
                if ((j = anqg.j) == null) {
                    synchronized (anqg.class) {
                        if (anqg.j == null) {
                            anqg.j = (ahdd)new ahba((ahbh)anqg.a);
                        }
                    }
                }
                return j;
            }
            case 5: {
                return anqg.a;
            }
            case 4: {
                return new ahaz((ahbh)anqg.a);
            }
            case 3: {
                return new anqg();
            }
            case 2: {
                return newMessageInfo((MessageLite)anqg.a, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0001\u0005\u0001\u1409\u0000\u0002\u001b\u0003\u1409\u0001\u0004\u1409\u0003\u0005\u100a\u0004\u0006\u1409\u0002\u0007\u1409\u0005\b\u1008\u0006\t\u1007\u0007", new Object[] { "b", "c", "d", anpi.class, "e", "k", "g", "f", "l", "h", "i" });
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
