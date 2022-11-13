import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class anpt extends ahbh implements ahcw
{
    public static final anpt a;
    private static volatile ahdd j;
    public int b;
    public anpn c;
    public anpa d;
    public ahbx e;
    public anuv f;
    public ahmo g;
    public String h;
    public ahab i;
    private ahhu k;
    private anuv l;
    private byte m;
    
    static {
        ahbh.registerDefaultInstance((Class)anpt.class, (ahbh)(a = new anpt()));
    }
    
    private anpt() {
        this.m = 2;
        this.e = emptyProtobufList();
        this.h = "";
        this.i = ahab.b;
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
                if ((j = anpt.j) == null) {
                    synchronized (anpt.class) {
                        if (anpt.j == null) {
                            anpt.j = (ahdd)new ahba((ahbh)anpt.a);
                        }
                    }
                }
                return j;
            }
            case 5: {
                return anpt.a;
            }
            case 4: {
                return new ahaz((ahbh)anpt.a);
            }
            case 3: {
                return new anpt();
            }
            case 2: {
                return newMessageInfo((MessageLite)anpt.a, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0001\u0006\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u001b\u0004\u1409\u0002\u0005\u1409\u0005\u0006\u100a\u0006\u0007\u1409\u0003\b\u1409\u0007\t\u1008\u0004", new Object[] { "b", "c", "d", "e", anph.class, "f", "k", "i", "g", "l", "h" });
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
