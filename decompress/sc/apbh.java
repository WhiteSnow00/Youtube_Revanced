import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apbh extends ahbh implements ahcw
{
    public static final apbh a;
    private static volatile ahdd b;
    private int c;
    private ajut d;
    private ajut e;
    private ajut f;
    private ajut g;
    private ahhu h;
    private ajut i;
    private ajut j;
    private byte k;
    
    static {
        ahbh.registerDefaultInstance((Class)apbh.class, (ahbh)(a = new apbh()));
    }
    
    private apbh() {
        this.k = 2;
        emptyProtobufList();
        emptyProtobufList();
        final ahab b = ahab.b;
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
                if ((b = apbh.b) == null) {
                    synchronized (apbh.class) {
                        if (apbh.b == null) {
                            apbh.b = (ahdd)new ahba((ahbh)apbh.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return apbh.a;
            }
            case 4: {
                return new ahaz((ahbh)apbh.a);
            }
            case 3: {
                return new apbh();
            }
            case 2: {
                return newMessageInfo((MessageLite)apbh.a, "\u0001\u0007\u0000\u0001\u0001\t\u0007\u0000\u0000\u0007\u0001\u1409\u0001\u0003\u1409\u0007\u0004\u1409\b\u0005\u1409\u0002\u0006\u1409\u0003\u0007\u1409\u0005\t\u1409\u0004", new Object[] { "c", "d", "i", "j", "e", "f", "h", "g" });
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
