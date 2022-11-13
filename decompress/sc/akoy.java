import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akoy extends ahbh implements ahcw
{
    public static final akoy a;
    private static volatile ahdd j;
    public int b;
    public akli c;
    public ahbx d;
    public anuv e;
    public int f;
    public anuv g;
    public anuv h;
    public double i;
    private apmd k;
    private ajvo l;
    private byte m;
    
    static {
        ahbh.registerDefaultInstance((Class)akoy.class, (ahbh)(a = new akoy()));
    }
    
    private akoy() {
        this.m = 2;
        this.d = emptyProtobufList();
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
                final ahdd j;
                if ((j = akoy.j) == null) {
                    synchronized (akoy.class) {
                        if (akoy.j == null) {
                            akoy.j = (ahdd)new ahba((ahbh)akoy.a);
                        }
                    }
                }
                return j;
            }
            case 5: {
                return akoy.a;
            }
            case 4: {
                return new ahaz((ahbh)akoy.a);
            }
            case 3: {
                return new akoy();
            }
            case 2: {
                return newMessageInfo((MessageLite)akoy.a, "\u0001\t\u0000\u0001\u0001\u0309\t\u0000\u0001\u0007\u0001\u1409\u0000\u0003\u041b\u0004\u1409\u0001\u0006\u100c\u0002\u0007\u1409\u0003\b\u1409\u0004\n\u1000\u0006\u000b\u1409\u0007\u0309\u1409\b", new Object[] { "b", "c", "d", anuv.class, "e", "f", amza.a(), "g", "h", "i", "k", "l" });
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
