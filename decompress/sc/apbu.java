import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apbu extends ahbh implements ahcw
{
    public static final apbu a;
    private static volatile ahdd b;
    private int c;
    private ajut d;
    private byte e;
    
    static {
        ahbh.registerDefaultInstance((Class)apbu.class, (ahbh)(a = new apbu()));
    }
    
    private apbu() {
        this.e = 2;
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
                if ((b = apbu.b) == null) {
                    synchronized (apbu.class) {
                        if (apbu.b == null) {
                            apbu.b = (ahdd)new ahba((ahbh)apbu.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return apbu.a;
            }
            case 4: {
                return new ahaz((ahbh)apbu.a);
            }
            case 3: {
                return new apbu();
            }
            case 2: {
                return newMessageInfo((MessageLite)apbu.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u1409\u0000", new Object[] { "c", "d" });
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
