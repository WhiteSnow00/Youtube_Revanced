import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aojf extends ahbh implements ahcw
{
    public static final aojf a;
    private static volatile ahdd j;
    public int b;
    public anuv c;
    public ajut d;
    public ajut e;
    public aida f;
    public ahbx g;
    public ahbx h;
    public ahab i;
    private anuv k;
    private ahhu l;
    private byte m;
    
    static {
        ahbh.registerDefaultInstance((Class)aojf.class, (ahbh)(a = new aojf()));
    }
    
    private aojf() {
        this.m = 2;
        this.g = emptyProtobufList();
        this.h = emptyProtobufList();
        this.i = ahab.b;
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
                if ((j = aojf.j) == null) {
                    synchronized (aojf.class) {
                        if (aojf.j == null) {
                            aojf.j = (ahdd)new ahba((ahbh)aojf.a);
                        }
                    }
                }
                return j;
            }
            case 5: {
                return aojf.a;
            }
            case 4: {
                return new ahaz((ahbh)aojf.a);
            }
            case 3: {
                return new aojf();
            }
            case 2: {
                return newMessageInfo((MessageLite)aojf.a, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0002\b\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0002\u0004\u1409\u0004\u0005\u1409\u0005\u0006\u100a\u0006\u0007\u1409\u0003\b\u041b\t\u041b", new Object[] { "b", "c", "d", "e", "f", "l", "i", "k", "g", aiqj.class, "h", aiqj.class });
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
