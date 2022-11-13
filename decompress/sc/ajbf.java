import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajbf extends ahbh implements ahcw
{
    public static final ajbf a;
    private static volatile ahdd b;
    private int c;
    private ajut d;
    private ajut e;
    private byte f;
    
    static {
        ahbh.registerDefaultInstance((Class)ajbf.class, (ahbh)(a = new ajbf()));
    }
    
    private ajbf() {
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
                final ahdd b;
                if ((b = ajbf.b) == null) {
                    synchronized (ajbf.class) {
                        if (ajbf.b == null) {
                            ajbf.b = (ahdd)new ahba((ahbh)ajbf.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return ajbf.a;
            }
            case 4: {
                return new ahaz((ahbh)ajbf.a);
            }
            case 3: {
                return new ajbf();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajbf.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001\u1409\u0000\u0002\u1409\u0001", new Object[] { "c", "d", "e" });
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
