import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajbd extends ahbh implements ahcw
{
    public static final ajbd a;
    private static volatile ahdd b;
    private int c;
    private ajut d;
    private apmu e;
    private aiqj f;
    private aiqj g;
    private aiqj h;
    private ajut i;
    private ajut j;
    private ajut k;
    private anuv l;
    private byte m;
    
    static {
        ahbh.registerDefaultInstance((Class)ajbd.class, (ahbh)(a = new ajbd()));
    }
    
    private ajbd() {
        this.m = 2;
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte m = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd b;
                if ((b = ajbd.b) == null) {
                    synchronized (ajbd.class) {
                        if (ajbd.b == null) {
                            ajbd.b = (ahdd)new ahba((ahbh)ajbd.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return ajbd.a;
            }
            case 4: {
                return new ahaz((ahbh)ajbd.a);
            }
            case 3: {
                return new ajbd();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajbd.a, "\u0001\t\u0000\u0001\u0001\u0014\t\u0000\u0000\t\u0001\u1409\u0000\u0004\u1409\u0003\u0006\u1409\u0004\u0007\u1409\u0005\t\u1409\u0006\u000b\u1409\u0007\f\u1409\b\r\u1409\t\u0014\u1409\n", new Object[] { "c", "d", "e", "f", "g", "h", "i", "j", "k", "l" });
            }
            case 1: {
                if (o == null) {
                    m = 0;
                }
                this.m = m;
                return null;
            }
            case 0: {
                return this.m;
            }
        }
    }
}
