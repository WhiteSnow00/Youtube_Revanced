import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajwh extends ahbh implements ahcw
{
    public static final ajwh a;
    private static volatile ahdd k;
    public int b;
    public ajut c;
    public aotp d;
    public aotp e;
    public aotp f;
    public akdi g;
    public ahbx h;
    public aida i;
    public aida j;
    private ahhu l;
    private byte m;
    
    static {
        ahbh.registerDefaultInstance((Class)ajwh.class, (ahbh)(a = new ajwh()));
    }
    
    private ajwh() {
        this.m = 2;
        this.h = emptyProtobufList();
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
                final ahdd k;
                if ((k = ajwh.k) == null) {
                    synchronized (ajwh.class) {
                        if (ajwh.k == null) {
                            ajwh.k = (ahdd)new ahba((ahbh)ajwh.a);
                        }
                    }
                }
                return k;
            }
            case 5: {
                return ajwh.a;
            }
            case 4: {
                return new ahaz((ahbh)ajwh.a);
            }
            case 3: {
                return new ajwh();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajwh.a, "\u0001\t\u0000\u0001\u0001\n\t\u0000\u0001\t\u0001\u1409\b\u0003\u1409\u0000\u0004\u1409\u0001\u0005\u1409\u0002\u0006\u1409\u0003\u0007\u1409\u0004\b\u041b\t\u1409\u0005\n\u1409\u0006", new Object[] { "b", "l", "c", "d", "e", "f", "g", "h", ajut.class, "i", "j" });
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
