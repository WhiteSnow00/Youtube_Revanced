import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class anpw extends ahbh implements ahcw
{
    public static final anpw a;
    private static volatile ahdd j;
    public int b;
    public anpn c;
    public ahbx d;
    public anuv e;
    public boolean f;
    public ahmo g;
    public ahab h;
    public String i;
    private ahhu k;
    private anuv l;
    private byte m;
    
    static {
        ahbh.registerDefaultInstance((Class)anpw.class, (ahbh)(a = new anpw()));
    }
    
    private anpw() {
        this.m = 2;
        this.d = emptyProtobufList();
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
                if ((j = anpw.j) == null) {
                    synchronized (anpw.class) {
                        if (anpw.j == null) {
                            anpw.j = (ahdd)new ahba((ahbh)anpw.a);
                        }
                    }
                }
                return j;
            }
            case 5: {
                return anpw.a;
            }
            case 4: {
                return new ahaz((ahbh)anpw.a);
            }
            case 3: {
                return new anpw();
            }
            case 2: {
                return newMessageInfo((MessageLite)anpw.a, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0001\u0005\u0001\u1409\u0000\u0002\u001b\u0003\u1409\u0001\u0004\u1409\u0004\u0005\u100a\u0005\u0006\u1007\u0002\u0007\u1409\u0003\b\u1409\u0006\t\u1008\u0007", new Object[] { "b", "c", "d", anpi.class, "e", "k", "h", "f", "g", "l", "i" });
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
