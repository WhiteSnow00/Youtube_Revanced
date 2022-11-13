import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apbl extends ahbh implements ahcw
{
    public static final apbl a;
    private static volatile ahdd b;
    private int c;
    private ahhu d;
    private byte e;
    
    static {
        ahbh.registerDefaultInstance((Class)apbl.class, (ahbh)(a = new apbl()));
    }
    
    private apbl() {
        this.e = 2;
        emptyProtobufList();
        final ahab b = ahab.b;
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
                if ((b = apbl.b) == null) {
                    synchronized (apbl.class) {
                        if (apbl.b == null) {
                            apbl.b = (ahdd)new ahba((ahbh)apbl.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return apbl.a;
            }
            case 4: {
                return new ahaz((ahbh)apbl.a);
            }
            case 3: {
                return new apbl();
            }
            case 2: {
                return newMessageInfo((MessageLite)apbl.a, "\u0001\u0001\u0000\u0001\u0005\u0005\u0001\u0000\u0000\u0001\u0005\u1409\u0003", new Object[] { "c", "d" });
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
