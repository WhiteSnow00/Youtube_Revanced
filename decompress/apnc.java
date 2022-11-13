import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apnc extends ahbh implements ahcw
{
    public static final apnc a;
    private static volatile ahdd b;
    private int c;
    private ahhu d;
    private anuv e;
    private anuv f;
    private anuv g;
    private anuv h;
    private aiqj i;
    private ahmo j;
    private byte k;
    
    static {
        ahbh.registerDefaultInstance((Class)apnc.class, (ahbh)(a = new apnc()));
    }
    
    private apnc() {
        this.k = 2;
        final ahab b = ahab.b;
        emptyProtobufList();
        emptyProtobufList();
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte k = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd b;
                if ((b = apnc.b) == null) {
                    synchronized (apnc.class) {
                        if (apnc.b == null) {
                            apnc.b = (ahdd)new ahba((ahbh)apnc.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return apnc.a;
            }
            case 4: {
                return new ahaz((ahbh)apnc.a);
            }
            case 3: {
                return new apnc();
            }
            case 2: {
                return newMessageInfo((MessageLite)apnc.a, "\u0001\u0007\u0000\u0001\u0001\n\u0007\u0000\u0000\u0007\u0001\u1409\u0000\u0003\u1409\u0002\u0004\u1409\u0004\u0006\u1409\u0003\b\u1409\u0006\t\u1409\u0007\n\u1409\u0005", new Object[] { "c", "d", "e", "g", "f", "i", "j", "h" });
            }
            case 1: {
                if (o == null) {
                    k = 0;
                }
                this.k = k;
                return null;
            }
            case 0: {
                return this.k;
            }
        }
    }
}
