import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class anaj extends ahbh implements ahcw
{
    public static final anaj a;
    private static volatile ahdd i;
    public int b;
    public ajut c;
    public anak d;
    public anal e;
    public anak f;
    public anai g;
    public ajut h;
    private ajut j;
    private ajut k;
    private byte l;
    
    static {
        ahbh.registerDefaultInstance((Class)anaj.class, (ahbh)(a = new anaj()));
    }
    
    private anaj() {
        this.l = 2;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte l = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd i;
                if ((i = anaj.i) == null) {
                    synchronized (anaj.class) {
                        if (anaj.i == null) {
                            anaj.i = (ahdd)new ahba((ahbh)anaj.a);
                        }
                    }
                }
                return i;
            }
            case 5: {
                return anaj.a;
            }
            case 4: {
                return new ahaz((ahbh)anaj.a);
            }
            case 3: {
                return new anaj();
            }
            case 2: {
                return newMessageInfo((MessageLite)anaj.a, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\b\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0002\u0004\u1409\u0003\u0005\u1409\u0004\u0006\u1409\u0005\u0007\u1409\u0006\b\u1409\u0007", new Object[] { "b", "c", "d", "e", "f", "g", "h", "j", "k" });
            }
            case 1: {
                if (o == null) {
                    l = 0;
                }
                this.l = l;
                return null;
            }
            case 0: {
                return this.l;
            }
        }
    }
}
