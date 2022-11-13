import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class anvj extends ahbh implements ahcw
{
    public static final anvj a;
    private static volatile ahdd b;
    private int c;
    private ajut d;
    private amye e;
    private aida f;
    private ajut g;
    private aida h;
    private aibz i;
    private byte j;
    
    static {
        ahbh.registerDefaultInstance((Class)anvj.class, (ahbh)(a = new anvj()));
    }
    
    private anvj() {
        this.j = 2;
        emptyProtobufList();
        emptyProtobufList();
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
                if ((b = anvj.b) == null) {
                    synchronized (anvj.class) {
                        if (anvj.b == null) {
                            anvj.b = (ahdd)new ahba((ahbh)anvj.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return anvj.a;
            }
            case 4: {
                return new ahaz((ahbh)anvj.a);
            }
            case 3: {
                return new anvj();
            }
            case 2: {
                return newMessageInfo((MessageLite)anvj.a, "\u0001\u0006\u0000\u0001\u0001\b\u0006\u0000\u0000\u0006\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0002\u0004\u1409\u0003\u0007\u1409\u0004\b\u1409\u0005", new Object[] { "c", "d", "e", "f", "g", "h", "i" });
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
