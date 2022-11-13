import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amkk extends ahbh implements ahcw
{
    public static final amkk a;
    private static volatile ahdd g;
    public int b;
    public ahab c;
    public ahbx d;
    public boolean e;
    public ajdw f;
    private ajut h;
    private ahhu i;
    private aiqj j;
    private anuv k;
    private byte l;
    
    static {
        ahbh.registerDefaultInstance((Class)amkk.class, (ahbh)(a = new amkk()));
    }
    
    private amkk() {
        this.l = 2;
        this.c = ahab.b;
        this.d = emptyProtobufList();
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
                final ahdd g;
                if ((g = amkk.g) == null) {
                    synchronized (amkk.class) {
                        if (amkk.g == null) {
                            amkk.g = (ahdd)new ahba((ahbh)amkk.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return amkk.a;
            }
            case 4: {
                return new ahaz((ahbh)amkk.a);
            }
            case 3: {
                return new amkk();
            }
            case 2: {
                return newMessageInfo((MessageLite)amkk.a, "\u0001\b\u0000\u0001\u0001\t\b\u0000\u0001\u0006\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u100a\u0002\u0004\u041b\u0006\u1007\u0005\u0007\u1409\u0003\b\u1409\u0007\t\u1409\u0006", new Object[] { "b", "h", "i", "c", "d", amkj.class, "e", "j", "k", "f" });
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
