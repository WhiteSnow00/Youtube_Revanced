import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class anqe extends ahbh implements ahcw
{
    public static final anqe a;
    private static volatile ahdd i;
    public int b;
    public anqd c;
    public ahbx d;
    public anuv e;
    public ahmo f;
    public ahab g;
    public String h;
    private ahhu j;
    private byte k;
    
    static {
        ahbh.registerDefaultInstance((Class)anqe.class, (ahbh)(a = new anqe()));
    }
    
    private anqe() {
        this.k = 2;
        this.d = emptyProtobufList();
        this.g = ahab.b;
        this.h = "";
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte k = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd i;
                if ((i = anqe.i) == null) {
                    synchronized (anqe.class) {
                        if (anqe.i == null) {
                            anqe.i = (ahdd)new ahba((ahbh)anqe.a);
                        }
                    }
                }
                return i;
            }
            case 5: {
                return anqe.a;
            }
            case 4: {
                return new ahaz((ahbh)anqe.a);
            }
            case 3: {
                return new anqe();
            }
            case 2: {
                return newMessageInfo((MessageLite)anqe.a, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0001\u0004\u0001\u1409\u0000\u0002\u001b\u0003\u1409\u0001\u0004\u1409\u0003\u0005\u100a\u0004\u0006\u1409\u0002\u0007\u1008\u0005", new Object[] { "b", "c", "d", anpi.class, "e", "j", "g", "f", "h" });
            }
            case 1: {
                if (o == null) {
                    k = 0;
                }
                this.k = k;
                return null;
            }
            case 0: {
                return this.k;
            }
        }
    }
}
