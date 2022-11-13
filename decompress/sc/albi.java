import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class albi extends ahbh implements ahcw
{
    public static final albi a;
    private static volatile ahdd e;
    public akli b;
    public ahbx c;
    public ahab d;
    private int f;
    private ahhu g;
    private ajvo h;
    private byte i;
    
    static {
        ahbh.registerDefaultInstance((Class)albi.class, (ahbh)(a = new albi()));
    }
    
    private albi() {
        this.i = 2;
        this.c = emptyProtobufList();
        this.d = ahab.b;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte i = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd e;
                if ((e = albi.e) == null) {
                    synchronized (albi.class) {
                        if (albi.e == null) {
                            albi.e = (ahdd)new ahba((ahbh)albi.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return albi.a;
            }
            case 4: {
                return new ahaz((ahbh)albi.a);
            }
            case 3: {
                return new albi();
            }
            case 2: {
                return newMessageInfo((MessageLite)albi.a, "\u0001\u0005\u0000\u0001\u0001\u0309\u0005\u0000\u0001\u0004\u0001\u1409\u0000\u0003\u041b\u0005\u1409\u0001\u0006\u100a\u0002\u0309\u1409\u0003", new Object[] { "f", "b", "c", aiqj.class, "g", "d", "h" });
            }
            case 1: {
                if (o == null) {
                    i = 0;
                }
                this.i = i;
                return null;
            }
            case 0: {
                return this.i;
            }
        }
    }
}
