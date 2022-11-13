import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aker extends ahbh implements ahcw
{
    public static final aker a;
    private static volatile ahdd g;
    public aket b;
    public akeo c;
    public ahbx d;
    public akem e;
    public boolean f;
    private int h;
    private ahhu i;
    private byte j;
    
    static {
        ahbh.registerDefaultInstance((Class)aker.class, (ahbh)(a = new aker()));
    }
    
    private aker() {
        this.j = 2;
        this.d = emptyProtobufList();
        final ahab b = ahab.b;
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
                if ((g = aker.g) == null) {
                    synchronized (aker.class) {
                        if (aker.g == null) {
                            aker.g = (ahdd)new ahba((ahbh)aker.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return aker.a;
            }
            case 4: {
                return new ahaz((ahbh)aker.a);
            }
            case 3: {
                return new aker();
            }
            case 2: {
                return newMessageInfo((MessageLite)aker.a, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0001\u0004\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u001b\u0004\u1409\u0002\u0005\u1409\u0004\u0007\u1007\u0005", new Object[] { "h", "b", "c", "d", akep.class, "i", "e", "f" });
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
