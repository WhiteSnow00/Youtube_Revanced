import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apaw extends ahbh implements ahcw
{
    public static final apaw a;
    private static volatile ahdd b;
    private int c;
    private apav d;
    private ahhu e;
    private byte f;
    
    static {
        ahbh.registerDefaultInstance((Class)apaw.class, (ahbh)(a = new apaw()));
    }
    
    private apaw() {
        this.f = 2;
        emptyProtobufList();
        final ahab b = ahab.b;
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
                final ahdd b;
                if ((b = apaw.b) == null) {
                    synchronized (apaw.class) {
                        if (apaw.b == null) {
                            apaw.b = (ahdd)new ahba((ahbh)apaw.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return apaw.a;
            }
            case 4: {
                return new ahaz((ahbh)apaw.a);
            }
            case 3: {
                return new apaw();
            }
            case 2: {
                return newMessageInfo((MessageLite)apaw.a, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0002\u0001\u1409\u0000\u0003\u1409\u0001", new Object[] { "c", "d", "e" });
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
