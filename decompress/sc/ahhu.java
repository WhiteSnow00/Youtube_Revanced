import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahhu extends ahbh implements ahcw
{
    public static final ahhu a;
    private static volatile ahdd d;
    public int b;
    public int c;
    private afsc e;
    private byte f;
    
    static {
        ahbh.registerDefaultInstance((Class)ahhu.class, (ahbh)(a = new ahhu()));
    }
    
    private ahhu() {
        this.f = 2;
        emptyIntList();
        ahbh.emptyProtobufList();
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
                final ahdd d;
                if ((d = ahhu.d) == null) {
                    synchronized (ahhu.class) {
                        if (ahhu.d == null) {
                            ahhu.d = (ahdd)new ahba((ahbh)ahhu.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return ahhu.a;
            }
            case 4: {
                return new ahaz((ahbh)ahhu.a);
            }
            case 3: {
                return new ahhu();
            }
            case 2: {
                return newMessageInfo((MessageLite)ahhu.a, "\u0001\u0002\u0000\u0001\u0001«\u0002\u0000\u0000\u0001\u0001\u1004\u0000«\u1409\u0006", new Object[] { "b", "c", "e" });
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
