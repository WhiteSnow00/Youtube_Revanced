import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajyf extends ahbh implements ahcw
{
    public static final ajyf a;
    private static volatile ahdd f;
    public int b;
    public akli c;
    public aiqj d;
    public ahab e;
    private ahhu g;
    private ajvo h;
    private byte i;
    
    static {
        ahbh.registerDefaultInstance((Class)ajyf.class, (ahbh)(a = new ajyf()));
    }
    
    private ajyf() {
        this.i = 2;
        this.e = ahab.b;
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
                if ((f = ajyf.f) == null) {
                    synchronized (ajyf.class) {
                        if (ajyf.f == null) {
                            ajyf.f = (ahdd)new ahba((ahbh)ajyf.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return ajyf.a;
            }
            case 4: {
                return new ahaz((ahbh)ajyf.a);
            }
            case 3: {
                return new ajyf();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajyf.a, "\u0001\u0005\u0000\u0001\u0001\u0309\u0005\u0000\u0000\u0004\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0002\u0004\u100a\u0003\u0309\u1409\u0004", new Object[] { "b", "c", "d", "g", "e", "h" });
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
