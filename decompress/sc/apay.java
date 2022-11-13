import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apay extends ahbh implements ahcw
{
    public static final apay a;
    private static volatile ahdd b;
    private int c;
    private ajut d;
    private ajut e;
    private aida f;
    private aida g;
    private ahhu h;
    private byte i;
    
    static {
        ahbh.registerDefaultInstance((Class)apay.class, (ahbh)(a = new apay()));
    }
    
    private apay() {
        this.i = 2;
        emptyProtobufList();
        emptyProtobufList();
        final ahab b = ahab.b;
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
                if ((b = apay.b) == null) {
                    synchronized (apay.class) {
                        if (apay.b == null) {
                            apay.b = (ahdd)new ahba((ahbh)apay.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return apay.a;
            }
            case 4: {
                return new ahaz((ahbh)apay.a);
            }
            case 3: {
                return new apay();
            }
            case 2: {
                return newMessageInfo((MessageLite)apay.a, "\u0001\u0005\u0000\u0001\u0001\b\u0005\u0000\u0000\u0005\u0001\u1409\u0000\u0002\u1409\u0001\u0006\u1409\u0006\u0007\u1409\u0002\b\u1409\u0003", new Object[] { "c", "d", "e", "h", "f", "g" });
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
