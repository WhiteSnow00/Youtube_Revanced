import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

@Deprecated
public final class aprj extends ahbh implements ahcw
{
    public static final aprj a;
    private static volatile ahdd h;
    public int b;
    public ajut c;
    public aiqj d;
    public ahbx e;
    public aprn f;
    public ahab g;
    private ajut i;
    private ahhu j;
    private byte k;
    
    static {
        ahbh.registerDefaultInstance((Class)aprj.class, (ahbh)(a = new aprj()));
    }
    
    private aprj() {
        this.k = 2;
        this.e = emptyProtobufList();
        this.g = ahab.b;
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
                final ahdd h;
                if ((h = aprj.h) == null) {
                    synchronized (aprj.class) {
                        if (aprj.h == null) {
                            aprj.h = (ahdd)new ahba((ahbh)aprj.a);
                        }
                    }
                }
                return h;
            }
            case 5: {
                return aprj.a;
            }
            case 4: {
                return new ahaz((ahbh)aprj.a);
            }
            case 3: {
                return new aprj();
            }
            case 2: {
                return newMessageInfo((MessageLite)aprj.a, "\u0001\u0007\u0000\u0001\u0001\t\u0007\u0000\u0001\u0006\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u041b\u0006\u1409\u0004\u0007\u1409\u0005\b\u1409\u0006\t\u100a\u0007", new Object[] { "b", "c", "d", "e", apri.class, "f", "i", "j", "g" });
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
