import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajuj extends ahbh implements ahcw
{
    public static final ajuj a;
    private static volatile ahdd f;
    public int b;
    public ajut c;
    public ajut d;
    public ajui e;
    private byte g;
    
    static {
        ahbh.registerDefaultInstance((Class)ajuj.class, (ahbh)(a = new ajuj()));
    }
    
    private ajuj() {
        this.g = 2;
        emptyProtobufList();
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
                if ((f = ajuj.f) == null) {
                    synchronized (ajuj.class) {
                        if (ajuj.f == null) {
                            ajuj.f = (ahdd)new ahba((ahbh)ajuj.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return ajuj.a;
            }
            case 4: {
                return new ahaz((ahbh)ajuj.a);
            }
            case 3: {
                return new ajuj();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajuj.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0002\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1009\u0002", new Object[] { "b", "c", "d", "e" });
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
