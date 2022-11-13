import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akvd extends ahbh implements ahcw
{
    public static final akvd a;
    private static volatile ahdd f;
    public int b;
    public aklg c;
    public ahab d;
    public ahab e;
    private byte g;
    
    static {
        ahbh.registerDefaultInstance((Class)akvd.class, (ahbh)(a = new akvd()));
    }
    
    private akvd() {
        this.g = 2;
        this.d = ahab.b;
        this.e = ahab.b;
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
                final ahdd f;
                if ((f = akvd.f) == null) {
                    synchronized (akvd.class) {
                        if (akvd.f == null) {
                            akvd.f = (ahdd)new ahba((ahbh)akvd.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return akvd.a;
            }
            case 4: {
                return new ahaz((ahbh)akvd.a);
            }
            case 3: {
                return new akvd();
            }
            case 2: {
                return newMessageInfo((MessageLite)akvd.a, "\u0001\u0003\u0000\u0001\u0001\u0005\u0003\u0000\u0000\u0001\u0001\u1409\u0000\u0004\u100a\u0002\u0005\u100a\u0005", new Object[] { "b", "c", "d", "e" });
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
