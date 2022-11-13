import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alpv extends ahbh implements ahcw
{
    public static final alpv a;
    private static volatile ahdd f;
    public int b;
    public ajut c;
    public ahbx d;
    public alpu e;
    private alpu g;
    private ahhu h;
    private byte i;
    
    static {
        ahbh.registerDefaultInstance((Class)alpv.class, (ahbh)(a = new alpv()));
    }
    
    private alpv() {
        this.i = 2;
        this.d = emptyProtobufList();
        final ahab b = ahab.b;
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
                final ahdd f;
                if ((f = alpv.f) == null) {
                    synchronized (alpv.class) {
                        if (alpv.f == null) {
                            alpv.f = (ahdd)new ahba((ahbh)alpv.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return alpv.a;
            }
            case 4: {
                return new ahaz((ahbh)alpv.a);
            }
            case 3: {
                return new alpv();
            }
            case 2: {
                return newMessageInfo((MessageLite)alpv.a, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0001\u0005\u0001\u1409\u0003\u0003\u1409\u0000\u0004\u041b\u0005\u1409\u0001\u0006\u1409\u0002", new Object[] { "b", "h", "c", "d", ajut.class, "e", "g" });
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
