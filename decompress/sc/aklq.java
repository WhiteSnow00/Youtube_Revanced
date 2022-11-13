import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aklq extends ahbh implements ahcw
{
    public static final aklq a;
    private static volatile ahdd g;
    public int b;
    public akli c;
    public String d;
    public ahbx e;
    public aklr f;
    private aiqj h;
    private aiqj i;
    private aiqj j;
    private aiqj k;
    private aiqj l;
    private byte m;
    
    static {
        ahbh.registerDefaultInstance((Class)aklq.class, (ahbh)(a = new aklq()));
    }
    
    private aklq() {
        this.m = 2;
        this.d = "";
        this.e = emptyProtobufList();
        emptyProtobufList();
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
                final ahdd g;
                if ((g = aklq.g) == null) {
                    synchronized (aklq.class) {
                        if (aklq.g == null) {
                            aklq.g = (ahdd)new ahba((ahbh)aklq.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return aklq.a;
            }
            case 4: {
                return new ahaz((ahbh)aklq.a);
            }
            case 3: {
                return new aklq();
            }
            case 2: {
                return newMessageInfo((MessageLite)aklq.a, "\u0001\t\u0000\u0001\u0001\f\t\u0000\u0001\b\u0001\u1409\u0000\u0003\u1008\u0001\u0004\u041b\u0005\u1409\u0002\u0006\u1409\u0005\u0007\u1409\u0003\t\u1409\u0004\u000b\u1409\u0006\f\u1409\u0007", new Object[] { "b", "c", "d", "e", aklo.class, "h", "f", "i", "j", "k", "l" });
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
