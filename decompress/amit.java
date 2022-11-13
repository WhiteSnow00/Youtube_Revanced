import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amit extends ahbh implements ahcw
{
    public static final amit a;
    private static volatile ahdd e;
    public int b;
    public ajut c;
    public akdi d;
    private byte f;
    
    static {
        ahbh.registerDefaultInstance((Class)amit.class, (ahbh)(a = new amit()));
    }
    
    private amit() {
        this.f = 2;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte f = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd e;
                if ((e = amit.e) == null) {
                    synchronized (amit.class) {
                        if (amit.e == null) {
                            amit.e = (ahdd)new ahba((ahbh)amit.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return amit.a;
            }
            case 4: {
                return new ahaz((ahbh)amit.a);
            }
            case 3: {
                return new amit();
            }
            case 2: {
                return newMessageInfo((MessageLite)amit.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001\u1409\u0000\u0002\u1409\u0001", new Object[] { "b", "c", "d" });
            }
            case 1: {
                if (o == null) {
                    f = 0;
                }
                this.f = f;
                return null;
            }
            case 0: {
                return this.f;
            }
        }
    }
}
