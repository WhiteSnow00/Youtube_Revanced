import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajcs extends ahbh implements ahcw
{
    public static final ajcs a;
    private static volatile ahdd d;
    public int b;
    public anuv c;
    private aiqj e;
    private aiqj f;
    private aiqj g;
    private ahhu h;
    private byte i;
    
    static {
        ahbh.registerDefaultInstance((Class)ajcs.class, (ahbh)(a = new ajcs()));
    }
    
    private ajcs() {
        this.i = 2;
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        final ahab b = ahab.b;
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
                final ahdd d;
                if ((d = ajcs.d) == null) {
                    synchronized (ajcs.class) {
                        if (ajcs.d == null) {
                            ajcs.d = (ahdd)new ahba((ahbh)ajcs.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return ajcs.a;
            }
            case 4: {
                return new ahaz((ahbh)ajcs.a);
            }
            case 3: {
                return new ajcs();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajcs.a, "\u0001\u0005\u0000\u0001\u0004\t\u0005\u0000\u0000\u0005\u0004\u1409\u0005\u0006\u1409\u0001\u0007\u1409\u0002\b\u1409\u0000\t\u1409\u0003", new Object[] { "b", "h", "e", "f", "c", "g" });
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
