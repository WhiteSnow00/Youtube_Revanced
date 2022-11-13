import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajwb extends ahbh implements ahcw
{
    public static final ajwb a;
    private static volatile ahdd b;
    private int c;
    private ajut d;
    private ajut e;
    private ajut f;
    private aiqj g;
    private ajwc h;
    private ajxd i;
    private ahhu j;
    private byte k;
    
    static {
        ahbh.registerDefaultInstance((Class)ajwb.class, (ahbh)(a = new ajwb()));
    }
    
    private ajwb() {
        this.k = 2;
        emptyProtobufList();
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
                if ((b = ajwb.b) == null) {
                    synchronized (ajwb.class) {
                        if (ajwb.b == null) {
                            ajwb.b = (ahdd)new ahba((ahbh)ajwb.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return ajwb.a;
            }
            case 4: {
                return new ahaz((ahbh)ajwb.a);
            }
            case 3: {
                return new ajwb();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajwb.a, "\u0001\u0007\u0000\u0001\u0001\u000b\u0007\u0000\u0000\u0007\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0002\u0004\u1409\u0003\t\u1409\u0005\n\u1409\u0006\u000b\u1409\u0007", new Object[] { "c", "d", "e", "f", "g", "h", "i", "j" });
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
