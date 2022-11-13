import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajxm extends ahbh implements ahcw
{
    public static final ajxm a;
    private static volatile ahdd k;
    public int b;
    public ajut c;
    public ajut d;
    public aida e;
    public aotp f;
    public akdi g;
    public aotp h;
    public aiqj i;
    public ahab j;
    private aiqj l;
    private ahhu m;
    private byte n;
    
    static {
        ahbh.registerDefaultInstance((Class)ajxm.class, (ahbh)(a = new ajxm()));
    }
    
    private ajxm() {
        this.n = 2;
        this.j = ahab.b;
        emptyProtobufList();
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte n = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd k;
                if ((k = ajxm.k) == null) {
                    synchronized (ajxm.class) {
                        if (ajxm.k == null) {
                            ajxm.k = (ahdd)new ahba((ahbh)ajxm.a);
                        }
                    }
                }
                return k;
            }
            case 5: {
                return ajxm.a;
            }
            case 4: {
                return new ahaz((ahbh)ajxm.a);
            }
            case 3: {
                return new ajxm();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajxm.a, "\u0001\n\u0000\u0001\u0001\n\n\u0000\u0000\t\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0002\u0004\u1409\u0003\u0005\u1409\u0004\u0006\u1409\u0005\u0007\u1409\u0006\b\u1409\n\t\u100a\u000b\n\u1409\u0007", new Object[] { "b", "c", "d", "e", "f", "g", "h", "i", "m", "j", "l" });
            }
            case 1: {
                if (o == null) {
                    n = 0;
                }
                this.n = n;
                return null;
            }
            case 0: {
                return this.n;
            }
        }
    }
}
