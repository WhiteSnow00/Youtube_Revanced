import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class anas extends ahbh implements ahcw
{
    public static final anas a;
    private static volatile ahdd j;
    public int b;
    public ajut c;
    public ajut d;
    public anaq e;
    public anaq f;
    public ahbx g;
    public aiqj h;
    public ajut i;
    private anar k;
    private ajut l;
    private byte m;
    
    static {
        ahbh.registerDefaultInstance((Class)anas.class, (ahbh)(a = new anas()));
    }
    
    private anas() {
        this.m = 2;
        this.g = emptyProtobufList();
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
                if ((j = anas.j) == null) {
                    synchronized (anas.class) {
                        if (anas.j == null) {
                            anas.j = (ahdd)new ahba((ahbh)anas.a);
                        }
                    }
                }
                return j;
            }
            case 5: {
                return anas.a;
            }
            case 4: {
                return new ahaz((ahbh)anas.a);
            }
            case 3: {
                return new anas();
            }
            case 2: {
                return newMessageInfo((MessageLite)anas.a, "\u0001\t\u0000\u0001\u0002\f\t\u0000\u0001\t\u0002\u1409\u0001\u0003\u1409\u0002\u0006\u1409\u0004\u0007\u1409\u0005\b\u041b\t\u1409\u0006\n\u1409\u0007\u000b\u1409\u0003\f\u1409\b", new Object[] { "b", "c", "d", "e", "f", "g", anat.class, "h", "i", "k", "l" });
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
