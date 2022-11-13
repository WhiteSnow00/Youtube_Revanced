import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apae extends ahbh implements ahcw
{
    public static final apae a;
    private static volatile ahdd b;
    private int c;
    private ahhu d;
    private byte e;
    
    static {
        ahbh.registerDefaultInstance((Class)apae.class, (ahbh)(a = new apae()));
    }
    
    private apae() {
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
                if ((b = apae.b) == null) {
                    synchronized (apae.class) {
                        if (apae.b == null) {
                            apae.b = (ahdd)new ahba((ahbh)apae.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return apae.a;
            }
            case 4: {
                return new ahaz((ahbh)apae.a);
            }
            case 3: {
                return new apae();
            }
            case 2: {
                return newMessageInfo((MessageLite)apae.a, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0001\u0002\u1409\u0000", new Object[] { "c", "d" });
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
