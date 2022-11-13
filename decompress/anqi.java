import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class anqi extends ahbh implements ahcw
{
    public static final anqi a;
    private static volatile ahdd b;
    private int c;
    private ajut d;
    private ajut e;
    private ajut f;
    private anuv g;
    private aiqj h;
    private aiqj i;
    private aiqj j;
    private amgv k;
    private ahmo l;
    private ahhu m;
    private anuv n;
    private anuv o;
    private byte p;
    
    static {
        ahbh.registerDefaultInstance((Class)anqi.class, (ahbh)(a = new anqi()));
    }
    
    private anqi() {
        this.p = 2;
        emptyProtobufList();
        emptyProtobufList();
        final ahab b = ahab.b;
        emptyProtobufList();
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte p3 = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd b;
                if ((b = anqi.b) == null) {
                    synchronized (anqi.class) {
                        if (anqi.b == null) {
                            anqi.b = (ahdd)new ahba((ahbh)anqi.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return anqi.a;
            }
            case 4: {
                return new ahaz((ahbh)anqi.a);
            }
            case 3: {
                return new anqi();
            }
            case 2: {
                return newMessageInfo((MessageLite)anqi.a, "\u0001\f\u0000\u0001\u0003\u0016\f\u0000\u0000\f\u0003\u1409\u0002\u0004\u1409\u0003\u0005\u1409\u0004\u0006\u1409\u0005\u0007\u1409\u0006\n\u1409\t\u000b\u1409\n\f\u1409\u000b\u0011\u1409\b\u0012\u1409\u000f\u0013\u1409\u0010\u0016\u1409\u0007", new Object[] { "c", "d", "e", "f", "g", "h", "k", "l", "m", "j", "n", "o", "i" });
            }
            case 1: {
                if (o == null) {
                    p3 = 0;
                }
                this.p = p3;
                return null;
            }
            case 0: {
                return this.p;
            }
        }
    }
}
