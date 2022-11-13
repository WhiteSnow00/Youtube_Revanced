import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aies extends ahbh implements ahcw
{
    public static final aies a;
    private static volatile ahdd b;
    private int c;
    private amrc d;
    private byte e;
    
    static {
        ahbh.registerDefaultInstance((Class)aies.class, (ahbh)(a = new aies()));
    }
    
    private aies() {
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
                if ((b = aies.b) == null) {
                    synchronized (aies.class) {
                        if (aies.b == null) {
                            aies.b = (ahdd)new ahba((ahbh)aies.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aies.a;
            }
            case 4: {
                return new ahaz((ahbh)aies.a);
            }
            case 3: {
                return new aies();
            }
            case 2: {
                return newMessageInfo((MessageLite)aies.a, "\u0001\u0001\u0000\u0001\ueee9\u18d1\ueee9\u18d1\u0001\u0000\u0000\u0001\ueee9\u18d1\u1409\u0001", new Object[] { "c", "d" });
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
