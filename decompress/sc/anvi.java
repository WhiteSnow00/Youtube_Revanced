import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class anvi extends ahbh implements ahcw
{
    public static final anvi a;
    private static volatile ahdd j;
    public int b;
    public amye c;
    public ajut d;
    public ajut e;
    public aida f;
    public aida g;
    public aibz h;
    public ahab i;
    private ajut k;
    private aida l;
    private aibz m;
    private ahhu n;
    private byte o;
    
    static {
        ahbh.registerDefaultInstance((Class)anvi.class, (ahbh)(a = new anvi()));
    }
    
    private anvi() {
        this.o = 2;
        this.i = ahab.b;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte o3 = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd j;
                if ((j = anvi.j) == null) {
                    synchronized (anvi.class) {
                        if (anvi.j == null) {
                            anvi.j = (ahdd)new ahba((ahbh)anvi.a);
                        }
                    }
                }
                return j;
            }
            case 5: {
                return anvi.a;
            }
            case 4: {
                return new ahaz((ahbh)anvi.a);
            }
            case 3: {
                return new anvi();
            }
            case 2: {
                return newMessageInfo((MessageLite)anvi.a, "\u0001\u000b\u0000\u0001\u0001\u000b\u000b\u0000\u0000\n\u0001\u1409\u0000\u0002\u1409\t\u0003\u100a\n\u0004\u1409\u0001\u0005\u1409\u0004\u0006\u1409\u0005\u0007\u1409\u0002\b\u1409\u0003\t\u1409\u0006\n\u1409\u0007\u000b\u1409\b", new Object[] { "b", "c", "n", "i", "d", "f", "l", "k", "e", "g", "h", "m" });
            }
            case 1: {
                if (o == null) {
                    o3 = 0;
                }
                this.o = o3;
                return null;
            }
            case 0: {
                return this.o;
            }
        }
    }
}
