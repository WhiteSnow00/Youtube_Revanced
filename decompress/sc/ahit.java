import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahit extends ahbh implements ahcw
{
    public static final ahit a;
    private static volatile ahdd g;
    public int b;
    public boolean c;
    public aida d;
    public aida e;
    public String f;
    private byte h;
    
    static {
        ahbh.registerDefaultInstance((Class)ahit.class, (ahbh)(a = new ahit()));
    }
    
    private ahit() {
        this.h = 2;
        this.f = "";
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
                final ahdd g;
                if ((g = ahit.g) == null) {
                    synchronized (ahit.class) {
                        if (ahit.g == null) {
                            ahit.g = (ahdd)new ahba((ahbh)ahit.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return ahit.a;
            }
            case 4: {
                return new ahaz((ahbh)ahit.a);
            }
            case 3: {
                return new ahit();
            }
            case 2: {
                return newMessageInfo((MessageLite)ahit.a, "\u0001\u0004\u0000\u0001\u0002\u0005\u0004\u0000\u0000\u0002\u0002\u1007\u0002\u0003\u1409\u0003\u0004\u1409\u0004\u0005\u1008\u0005", new Object[] { "b", "c", "d", "e", "f" });
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
