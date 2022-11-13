import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class anoz extends ahbh implements ahcw
{
    public static final anoz a;
    private static volatile ahdd b;
    private int c;
    private ajut d;
    private ajut e;
    private ajut f;
    private ajut g;
    private aiqj h;
    private aida i;
    private byte j;
    
    static {
        ahbh.registerDefaultInstance((Class)anoz.class, (ahbh)(a = new anoz()));
    }
    
    private anoz() {
        this.j = 2;
        emptyProtobufList();
        emptyProtobufList();
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte j = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd b;
                if ((b = anoz.b) == null) {
                    synchronized (anoz.class) {
                        if (anoz.b == null) {
                            anoz.b = (ahdd)new ahba((ahbh)anoz.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return anoz.a;
            }
            case 4: {
                return new ahaz((ahbh)anoz.a);
            }
            case 3: {
                return new anoz();
            }
            case 2: {
                return newMessageInfo((MessageLite)anoz.a, "\u0001\u0006\u0000\u0001\u0002\t\u0006\u0000\u0000\u0006\u0002\u1409\u0001\u0004\u1409\u0003\u0005\u1409\u0004\u0006\u1409\u0005\u0007\u1409\u0006\t\u1409\u0007", new Object[] { "c", "d", "e", "f", "g", "h", "i" });
            }
            case 1: {
                if (o == null) {
                    j = 0;
                }
                this.j = j;
                return null;
            }
            case 0: {
                return this.j;
            }
        }
    }
}
