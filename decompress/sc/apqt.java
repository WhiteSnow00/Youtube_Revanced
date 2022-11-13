import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

@Deprecated
public final class apqt extends ahbh implements ahcw
{
    public static final apqt a;
    private static volatile ahdd b;
    private int c;
    private ajut d;
    private aiqj e;
    private aiao f;
    private aiao g;
    private aprd h;
    private aprn i;
    private ajut j;
    private ahhu k;
    private byte l;
    
    static {
        ahbh.registerDefaultInstance((Class)apqt.class, (ahbh)(a = new apqt()));
    }
    
    private apqt() {
        this.l = 2;
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        final ahab b = ahab.b;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte l = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd b;
                if ((b = apqt.b) == null) {
                    synchronized (apqt.class) {
                        if (apqt.b == null) {
                            apqt.b = (ahdd)new ahba((ahbh)apqt.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return apqt.a;
            }
            case 4: {
                return new ahaz((ahbh)apqt.a);
            }
            case 3: {
                return new apqt();
            }
            case 2: {
                return newMessageInfo((MessageLite)apqt.a, "\u0001\b\u0000\u0001\u0001\r\b\u0000\u0000\b\u0001\u1409\u0000\u0002\u1409\u0001\u0005\u1409\u0004\u0006\u1409\u0005\t\u1409\u0007\n\u1409\b\f\u1409\u0002\r\u1409\u0003", new Object[] { "c", "d", "e", "h", "i", "j", "k", "f", "g" });
            }
            case 1: {
                if (o == null) {
                    l = 0;
                }
                this.l = l;
                return null;
            }
            case 0: {
                return this.l;
            }
        }
    }
}
