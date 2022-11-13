import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akfe extends ahbh implements ahcw
{
    public static final akfe a;
    private static volatile ahdd b;
    private int c;
    private ajut d;
    private ajut e;
    private ajut f;
    private ajut g;
    private aiqj h;
    private amgv i;
    private ajut j;
    private ahhu k;
    private byte l;
    
    static {
        ahbh.registerDefaultInstance((Class)akfe.class, (ahbh)(a = new akfe()));
    }
    
    private akfe() {
        this.l = 2;
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
                if ((b = akfe.b) == null) {
                    synchronized (akfe.class) {
                        if (akfe.b == null) {
                            akfe.b = (ahdd)new ahba((ahbh)akfe.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return akfe.a;
            }
            case 4: {
                return new ahaz((ahbh)akfe.a);
            }
            case 3: {
                return new akfe();
            }
            case 2: {
                return newMessageInfo((MessageLite)akfe.a, "\u0001\b\u0000\u0001\u0001\u000f\b\u0000\u0000\b\u0001\u1409\u0000\u0003\u1409\u0002\u0004\u1409\u0003\u0007\u1409\u0006\b\u1409\u0007\t\u1409\b\f\u1409\u000e\u000f\u1409\u0004", new Object[] { "c", "d", "e", "f", "h", "i", "j", "k", "g" });
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
