import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

@Deprecated
public final class aprp extends ahbh implements ahcw
{
    public static final aprp a;
    private static volatile ahdd l;
    public int b;
    public ajut c;
    public aiqj d;
    public ahbx e;
    public aprd f;
    public aprn g;
    public aprk h;
    public boolean i;
    public ajut j;
    public ahab k;
    private amgv m;
    private ahhu n;
    private byte o;
    
    static {
        ahbh.registerDefaultInstance((Class)aprp.class, (ahbh)(a = new aprp()));
    }
    
    private aprp() {
        this.o = 2;
        this.e = emptyProtobufList();
        this.k = ahab.b;
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
                final ahdd l;
                if ((l = aprp.l) == null) {
                    synchronized (aprp.class) {
                        if (aprp.l == null) {
                            aprp.l = (ahdd)new ahba((ahbh)aprp.a);
                        }
                    }
                }
                return l;
            }
            case 5: {
                return aprp.a;
            }
            case 4: {
                return new ahaz((ahbh)aprp.a);
            }
            case 3: {
                return new aprp();
            }
            case 2: {
                return newMessageInfo((MessageLite)aprp.a, "\u0001\u000b\u0000\u0001\u0001\u000b\u000b\u0000\u0001\t\u0001\u1409\u0000\u0002\u1409\u0002\u0003\u041b\u0004\u1409\u0003\u0005\u1409\u0004\u0006\u1409\u0005\u0007\u1007\u0006\b\u1409\u0007\t\u1409\t\n\u100a\n\u000b\u1409\b", new Object[] { "b", "c", "d", "e", ajut.class, "f", "g", "h", "i", "j", "n", "k", "m" });
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
