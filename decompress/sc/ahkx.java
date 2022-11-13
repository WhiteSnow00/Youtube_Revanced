import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahkx extends ahbh implements ahcw
{
    public static final ahkx a;
    private static volatile ahdd f;
    public int b;
    public aiqj c;
    public ahbx d;
    public ahab e;
    private ahhu g;
    private byte h;
    
    static {
        ahbh.registerDefaultInstance((Class)ahkx.class, (ahbh)(a = new ahkx()));
    }
    
    private ahkx() {
        this.h = 2;
        this.d = emptyProtobufList();
        this.e = ahab.b;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte h = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd f;
                if ((f = ahkx.f) == null) {
                    synchronized (ahkx.class) {
                        if (ahkx.f == null) {
                            ahkx.f = (ahdd)new ahba((ahbh)ahkx.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return ahkx.a;
            }
            case 4: {
                return new ahaz((ahbh)ahkx.a);
            }
            case 3: {
                return new ahkx();
            }
            case 2: {
                return newMessageInfo((MessageLite)ahkx.a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0003\u0001\u1409\u0000\u0002\u041b\u0003\u1409\u0001\u0004\u100a\u0002", new Object[] { "b", "c", "d", aiqj.class, "g", "e" });
            }
            case 1: {
                if (o == null) {
                    h = 0;
                }
                this.h = h;
                return null;
            }
            case 0: {
                return this.h;
            }
        }
    }
}
