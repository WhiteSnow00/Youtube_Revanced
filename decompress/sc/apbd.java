import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apbd extends ahbh implements ahcw
{
    public static final apbd a;
    private static volatile ahdd b;
    private int c;
    private ajut d;
    private ajut e;
    private ajut f;
    private apex g;
    private aiqj h;
    private amgv i;
    private ahhu j;
    private ajut k;
    private ajut l;
    private byte m;
    
    static {
        ahbh.registerDefaultInstance((Class)apbd.class, (ahbh)(a = new apbd()));
    }
    
    private apbd() {
        this.m = 2;
        final ahab b = ahab.b;
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
                if ((b = apbd.b) == null) {
                    synchronized (apbd.class) {
                        if (apbd.b == null) {
                            apbd.b = (ahdd)new ahba((ahbh)apbd.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return apbd.a;
            }
            case 4: {
                return new ahaz((ahbh)apbd.a);
            }
            case 3: {
                return new apbd();
            }
            case 2: {
                return newMessageInfo((MessageLite)apbd.a, "\u0001\t\u0000\u0001\u0002\u000f\t\u0000\u0000\t\u0002\u1409\r\u0003\u1409\u000e\u0006\u1409\f\u0007\u1409\u0001\b\u1409\u0002\t\u1409\u0003\f\u1409\t\r\u1409\u0006\u000f\u1409\n", new Object[] { "c", "k", "l", "j", "d", "e", "f", "h", "g", "i" });
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
