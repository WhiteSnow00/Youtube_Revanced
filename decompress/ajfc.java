import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajfc extends ahbh implements ahcw
{
    public static final ajfc a;
    private static volatile ahdd b;
    private int c;
    private ajut d;
    private ajut e;
    private aida f;
    private ahhu g;
    private byte h;
    
    static {
        ahbh.registerDefaultInstance((Class)ajfc.class, (ahbh)(a = new ajfc()));
    }
    
    private ajfc() {
        this.h = 2;
        emptyProtobufList();
        final ahab b = ahab.b;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte h = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd b;
                if ((b = ajfc.b) == null) {
                    synchronized (ajfc.class) {
                        if (ajfc.b == null) {
                            ajfc.b = (ahdd)new ahba((ahbh)ajfc.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return ajfc.a;
            }
            case 4: {
                return new ahaz((ahbh)ajfc.a);
            }
            case 3: {
                return new ajfc();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajfc.a, "\u0001\u0004\u0000\u0001\u0001\u0007\u0004\u0000\u0000\u0004\u0001\u1409\u0001\u0002\u1409\u0002\u0003\u1409\u0004\u0007\u1409\u0000", new Object[] { "c", "e", "f", "g", "d" });
            }
            case 1: {
                if (o == null) {
                    h = 0;
                }
                this.h = h;
                return null;
            }
            case 0: {
                return this.h;
            }
        }
    }
}
