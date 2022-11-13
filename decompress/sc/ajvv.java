import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajvv extends ahbh implements ahcw
{
    public static final ajvv a;
    private static volatile ahdd g;
    public int b;
    public ajut c;
    public ahab d;
    public ahbx e;
    public anuv f;
    private anuv h;
    private ahhu i;
    private byte j;
    
    static {
        ahbh.registerDefaultInstance((Class)ajvv.class, (ahbh)(a = new ajvv()));
    }
    
    private ajvv() {
        this.j = 2;
        this.d = ahab.b;
        this.e = emptyProtobufList();
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte j = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd g;
                if ((g = ajvv.g) == null) {
                    synchronized (ajvv.class) {
                        if (ajvv.g == null) {
                            ajvv.g = (ahdd)new ahba((ahbh)ajvv.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return ajvv.a;
            }
            case 4: {
                return new ahaz((ahbh)ajvv.a);
            }
            case 3: {
                return new ajvv();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajvv.a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0005\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0002\u0004\u100a\u0003\u0005\u041b\u0006\u1409\u0004", new Object[] { "b", "c", "h", "i", "d", "e", anuv.class, "f" });
            }
            case 1: {
                if (o == null) {
                    j = 0;
                }
                this.j = j;
                return null;
            }
            case 0: {
                return this.j;
            }
        }
    }
}
