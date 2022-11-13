import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajwv extends ahbh implements ahcw
{
    public static final ajwv a;
    private static volatile ahdd b;
    private int c;
    private ahhu d;
    private byte e;
    
    static {
        ahbh.registerDefaultInstance((Class)ajwv.class, (ahbh)(a = new ajwv()));
    }
    
    private ajwv() {
        this.e = 2;
        final ahab b = ahab.b;
        emptyProtobufList();
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte e = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd b;
                if ((b = ajwv.b) == null) {
                    synchronized (ajwv.class) {
                        if (ajwv.b == null) {
                            ajwv.b = (ahdd)new ahba((ahbh)ajwv.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return ajwv.a;
            }
            case 4: {
                return new ahaz((ahbh)ajwv.a);
            }
            case 3: {
                return new ajwv();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajwv.a, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0001\u0002\u1409\u0001", new Object[] { "c", "d" });
            }
            case 1: {
                if (o == null) {
                    e = 0;
                }
                this.e = e;
                return null;
            }
            case 0: {
                return this.e;
            }
        }
    }
}
