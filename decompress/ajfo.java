import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajfo extends ahbh implements ahcw
{
    public static final ajfo a;
    private static volatile ahdd e;
    public int b;
    public long c;
    public ajut d;
    private byte f;
    
    static {
        ahbh.registerDefaultInstance((Class)ajfo.class, (ahbh)(a = new ajfo()));
    }
    
    private ajfo() {
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
                if ((e = ajfo.e) == null) {
                    synchronized (ajfo.class) {
                        if (ajfo.e == null) {
                            ajfo.e = (ahdd)new ahba((ahbh)ajfo.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return ajfo.a;
            }
            case 4: {
                return new ahaz((ahbh)ajfo.a);
            }
            case 3: {
                return new ajfo();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajfo.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001\u1003\u0000\u0002\u1409\u0001", new Object[] { "b", "c", "d" });
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
