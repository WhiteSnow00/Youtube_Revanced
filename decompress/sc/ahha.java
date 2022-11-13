import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahha extends ahbh implements ahcw
{
    public static final ahha a;
    private static volatile ahdd b;
    private int c;
    private afrf d;
    private byte e;
    
    static {
        ahbh.registerDefaultInstance((Class)ahha.class, (ahbh)(a = new ahha()));
    }
    
    private ahha() {
        this.e = 2;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte e = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd b;
                if ((b = ahha.b) == null) {
                    synchronized (ahha.class) {
                        if (ahha.b == null) {
                            ahha.b = (ahdd)new ahba((ahbh)ahha.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return ahha.a;
            }
            case 4: {
                return new ahaz((ahbh)ahha.a);
            }
            case 3: {
                return new ahha();
            }
            case 2: {
                return newMessageInfo((MessageLite)ahha.a, "\u0001\u0001\u0000\u0001\u0005\u0005\u0001\u0000\u0000\u0001\u0005\u1409\u0004", new Object[] { "c", "d" });
            }
            case 1: {
                if (o == null) {
                    e = 0;
                }
                this.e = e;
                return null;
            }
            case 0: {
                return this.e;
            }
        }
    }
}
