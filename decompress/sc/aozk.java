import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aozk extends ahbh implements ahcw
{
    public static final aozk a;
    private static volatile ahdd b;
    private int c;
    private aida d;
    private ajut e;
    private ajut f;
    private ahhu g;
    private aozl h;
    private byte i;
    
    static {
        ahbh.registerDefaultInstance((Class)aozk.class, (ahbh)(a = new aozk()));
    }
    
    private aozk() {
        this.i = 2;
        emptyProtobufList();
        final ahab b = ahab.b;
        emptyProtobufList();
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte i = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd b;
                if ((b = aozk.b) == null) {
                    synchronized (aozk.class) {
                        if (aozk.b == null) {
                            aozk.b = (ahdd)new ahba((ahbh)aozk.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aozk.a;
            }
            case 4: {
                return new ahaz((ahbh)aozk.a);
            }
            case 3: {
                return new aozk();
            }
            case 2: {
                return newMessageInfo((MessageLite)aozk.a, "\u0001\u0005\u0000\u0001\u0003\u000e\u0005\u0000\u0000\u0005\u0003\u1409\u0006\u0005\u1409\u0002\t\u1409\u0004\n\u1409\u0005\u000e\u1409\n", new Object[] { "c", "g", "d", "e", "f", "h" });
            }
            case 1: {
                if (o == null) {
                    i = 0;
                }
                this.i = i;
                return null;
            }
            case 0: {
                return this.i;
            }
        }
    }
}
