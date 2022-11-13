import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agoq extends ahbh implements ahcw
{
    public static final agoq a;
    private static volatile ahdd f;
    public int b;
    public long c;
    public ahbs d;
    public ahbx e;
    
    static {
        ahbh.registerDefaultInstance((Class)agoq.class, (ahbh)(a = new agoq()));
    }
    
    private agoq() {
        ahbh.emptyProtobufList();
        this.d = emptyLongList();
        this.e = emptyProtobufList();
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd f;
                if ((f = agoq.f) == null) {
                    synchronized (agoq.class) {
                        if (agoq.f == null) {
                            agoq.f = (ahdd)new ahba((ahbh)agoq.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return agoq.a;
            }
            case 4: {
                return new ahaz((ahbh)agoq.a);
            }
            case 3: {
                return new agoq();
            }
            case 2: {
                return newMessageInfo((MessageLite)agoq.a, "\u0001\u0003\u0000\u0001\u0004\u0006\u0003\u0000\u0002\u0000\u0004\u001b\u0005\u1005\u0001\u0006\u0017", new Object[] { "b", "e", agop.class, "c", "d" });
            }
            case 1: {
                return null;
            }
            case 0: {
                return 1;
            }
        }
    }
}
