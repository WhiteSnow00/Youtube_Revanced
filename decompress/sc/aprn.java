import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

@Deprecated
public final class aprn extends ahbh implements ahcw
{
    public static final aprn a;
    private static volatile ahdd e;
    public int b;
    public ajut c;
    public ahbx d;
    private ahhu f;
    private byte g;
    
    static {
        ahbh.registerDefaultInstance((Class)aprn.class, (ahbh)(a = new aprn()));
    }
    
    private aprn() {
        this.g = 2;
        this.d = emptyProtobufList();
        final ahab b = ahab.b;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte g = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd e;
                if ((e = aprn.e) == null) {
                    synchronized (aprn.class) {
                        if (aprn.e == null) {
                            aprn.e = (ahdd)new ahba((ahbh)aprn.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return aprn.a;
            }
            case 4: {
                return new ahaz((ahbh)aprn.a);
            }
            case 3: {
                return new aprn();
            }
            case 2: {
                return newMessageInfo((MessageLite)aprn.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0003\u0001\u1409\u0000\u0002\u041b\u0003\u1409\u0001", new Object[] { "b", "c", "d", apro.class, "f" });
            }
            case 1: {
                if (o == null) {
                    g = 0;
                }
                this.g = g;
                return null;
            }
            case 0: {
                return this.g;
            }
        }
    }
}
