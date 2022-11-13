import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class anvx extends ahbh implements ahcw
{
    public static final anvx a;
    private static volatile ahdd b;
    private int c;
    private ahhu d;
    private ajut e;
    private anuv f;
    private anuv g;
    private anuv h;
    private anuv i;
    private byte j;
    
    static {
        ahbh.registerDefaultInstance((Class)anvx.class, (ahbh)(a = new anvx()));
    }
    
    private anvx() {
        this.j = 2;
        emptyProtobufList();
        emptyProtobufList();
        final ahab b = ahab.b;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte j = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd b;
                if ((b = anvx.b) == null) {
                    synchronized (anvx.class) {
                        if (anvx.b == null) {
                            anvx.b = (ahdd)new ahba((ahbh)anvx.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return anvx.a;
            }
            case 4: {
                return new ahaz((ahbh)anvx.a);
            }
            case 3: {
                return new anvx();
            }
            case 2: {
                return newMessageInfo((MessageLite)anvx.a, "\u0001\u0006\u0000\u0001\u0002\u000b\u0006\u0000\u0000\u0006\u0002\u1409\u0001\u0005\u1409\u0003\u0006\u1409\u0004\b\u1409\u0006\t\u1409\u0007\u000b\u1409\u0005", new Object[] { "c", "d", "e", "f", "h", "i", "g" });
            }
            case 1: {
                if (o == null) {
                    j = 0;
                }
                this.j = j;
                return null;
            }
            case 0: {
                return this.j;
            }
        }
    }
}
