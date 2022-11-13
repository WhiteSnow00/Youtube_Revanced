import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahle extends ahbh implements ahcw
{
    public static final ahle a;
    private static volatile ahdd b;
    private int c;
    private ajut d;
    private ajut e;
    private ajut f;
    private ajut g;
    private ajut h;
    private ajut i;
    private ajut j;
    private aiqj k;
    private ahhu l;
    private byte m;
    
    static {
        ahbh.registerDefaultInstance((Class)ahle.class, (ahbh)(a = new ahle()));
    }
    
    private ahle() {
        this.m = 2;
        emptyProtobufList();
        emptyProtobufList();
        final ahab b = ahab.b;
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
                if ((b = ahle.b) == null) {
                    synchronized (ahle.class) {
                        if (ahle.b == null) {
                            ahle.b = (ahdd)new ahba((ahbh)ahle.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return ahle.a;
            }
            case 4: {
                return new ahaz((ahbh)ahle.a);
            }
            case 3: {
                return new ahle();
            }
            case 2: {
                return newMessageInfo((MessageLite)ahle.a, "\u0001\t\u0000\u0001\u0005\u000f\t\u0000\u0000\t\u0005\u1409\u0003\u0006\u1409\u0004\u0007\u1409\u0005\b\u1409\u0006\n\u1409\b\u000b\u1409\t\f\u1409\n\u000e\u1409\u000b\u000f\u1409\f", new Object[] { "c", "d", "e", "f", "g", "h", "i", "j", "k", "l" });
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
