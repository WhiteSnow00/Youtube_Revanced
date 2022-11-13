import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aouz extends ahbh implements ahcw
{
    public static final aouz a;
    private static volatile ahdd b;
    private int c;
    private ajut d;
    private byte e;
    
    static {
        ahbh.registerDefaultInstance((Class)aouz.class, (ahbh)(a = new aouz()));
    }
    
    private aouz() {
        this.e = 2;
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
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
                if ((b = aouz.b) == null) {
                    synchronized (aouz.class) {
                        if (aouz.b == null) {
                            aouz.b = (ahdd)new ahba((ahbh)aouz.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aouz.a;
            }
            case 4: {
                return new ahaz((ahbh)aouz.a);
            }
            case 3: {
                return new aouz();
            }
            case 2: {
                return newMessageInfo((MessageLite)aouz.a, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0001\u0002\u1409\u0000", new Object[] { "c", "d" });
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
