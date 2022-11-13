import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahju extends ahbh implements ahcw
{
    public static final ahju a;
    private static volatile ahdd d;
    public ahbx b;
    public ahjs c;
    private int e;
    private ahhu f;
    private ajut g;
    private byte h;
    
    static {
        ahbh.registerDefaultInstance((Class)ahju.class, (ahbh)(a = new ahju()));
    }
    
    private ahju() {
        this.h = 2;
        this.b = emptyProtobufList();
        emptyProtobufList();
        final ahab b = ahab.b;
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
                final ahdd d;
                if ((d = ahju.d) == null) {
                    synchronized (ahju.class) {
                        if (ahju.d == null) {
                            ahju.d = (ahdd)new ahba((ahbh)ahju.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return ahju.a;
            }
            case 4: {
                return new ahaz((ahbh)ahju.a);
            }
            case 3: {
                return new ahju();
            }
            case 2: {
                return newMessageInfo((MessageLite)ahju.a, "\u0001\u0004\u0000\u0001\u0001\u0007\u0004\u0000\u0001\u0004\u0001\u041b\u0004\u1409\u0000\u0005\u1409\u0003\u0007\u1409\u0002", new Object[] { "e", "b", ahjt.class, "f", "g", "c" });
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
