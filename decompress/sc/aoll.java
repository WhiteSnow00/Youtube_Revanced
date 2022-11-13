import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aoll extends ahbh implements ahcw
{
    public static final aoll a;
    private static volatile ahdd b;
    private int c;
    private ajut d;
    private ajut e;
    private ajut f;
    private ajut g;
    private anuv h;
    private byte i;
    
    static {
        ahbh.registerDefaultInstance((Class)aoll.class, (ahbh)(a = new aoll()));
    }
    
    private aoll() {
        this.i = 2;
        emptyProtobufList();
        emptyProtobufList();
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte i = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd b;
                if ((b = aoll.b) == null) {
                    synchronized (aoll.class) {
                        if (aoll.b == null) {
                            aoll.b = (ahdd)new ahba((ahbh)aoll.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aoll.a;
            }
            case 4: {
                return new ahaz((ahbh)aoll.a);
            }
            case 3: {
                return new aoll();
            }
            case 2: {
                return newMessageInfo((MessageLite)aoll.a, "\u0001\u0005\u0000\u0001\u0001\t\u0005\u0000\u0000\u0005\u0001\u1409\u0000\u0002\u1409\u0002\u0003\u1409\u0003\u0007\u1409\u0005\t\u1409\u0001", new Object[] { "c", "d", "f", "g", "h", "e" });
            }
            case 1: {
                if (o == null) {
                    i = 0;
                }
                this.i = i;
                return null;
            }
            case 0: {
                return this.i;
            }
        }
    }
}
