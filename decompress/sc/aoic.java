import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aoic extends ahbh implements ahcw
{
    public static final aoic a;
    private static volatile ahdd g;
    public int b;
    public boolean c;
    public ajut d;
    public ajut e;
    public aida f;
    private byte h;
    
    static {
        ahbh.registerDefaultInstance((Class)aoic.class, (ahbh)(a = new aoic()));
    }
    
    private aoic() {
        this.h = 2;
    }
    
    public static void a(final aoic aoic) {
        aoic.b |= 0x1;
        aoic.c = true;
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
                if ((g = aoic.g) == null) {
                    synchronized (aoic.class) {
                        if (aoic.g == null) {
                            aoic.g = (ahdd)new ahba((ahbh)aoic.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return aoic.a;
            }
            case 4: {
                return new ahaz((ahbh)aoic.a);
            }
            case 3: {
                return new aoic();
            }
            case 2: {
                return newMessageInfo((MessageLite)aoic.a, "\u0001\u0004\u0000\u0001\f\u0016\u0004\u0000\u0000\u0003\f\u1007\u0000\u0013\u1409\u0001\u0014\u1409\u0002\u0016\u1409\u0003", new Object[] { "b", "c", "d", "e", "f" });
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
