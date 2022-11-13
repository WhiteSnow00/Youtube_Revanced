import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajww extends ahbh implements ahcw
{
    public static final ajww a;
    private static volatile ahdd b;
    private int c;
    private ahhu d;
    private ajut e;
    private aida f;
    private aida g;
    private ajwx h;
    private byte i;
    
    static {
        ahbh.registerDefaultInstance((Class)ajww.class, (ahbh)(a = new ajww()));
    }
    
    private ajww() {
        this.i = 2;
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
                if ((b = ajww.b) == null) {
                    synchronized (ajww.class) {
                        if (ajww.b == null) {
                            ajww.b = (ahdd)new ahba((ahbh)ajww.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return ajww.a;
            }
            case 4: {
                return new ahaz((ahbh)ajww.a);
            }
            case 3: {
                return new ajww();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajww.a, "\u0001\u0005\u0000\u0001\u0002\t\u0005\u0000\u0000\u0005\u0002\u1409\u0001\u0004\u1409\u0003\u0007\u1409\u0005\b\u1409\u0006\t\u1409\u0007", new Object[] { "c", "d", "e", "f", "g", "h" });
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
