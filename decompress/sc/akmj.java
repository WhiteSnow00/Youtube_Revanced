import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akmj extends ahbh implements ahcw
{
    public static final akmj a;
    private static volatile ahdd d;
    public akli b;
    public ahbx c;
    private int e;
    private byte f;
    
    static {
        ahbh.registerDefaultInstance((Class)akmj.class, (ahbh)(a = new akmj()));
    }
    
    private akmj() {
        this.f = 2;
        this.c = emptyProtobufList();
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte f = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd d;
                if ((d = akmj.d) == null) {
                    synchronized (akmj.class) {
                        if (akmj.d == null) {
                            akmj.d = (ahdd)new ahba((ahbh)akmj.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return akmj.a;
            }
            case 4: {
                return new ahaz((ahbh)akmj.a);
            }
            case 3: {
                return new akmj();
            }
            case 2: {
                return newMessageInfo((MessageLite)akmj.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0002\u0001\u1409\u0000\u0002\u041b", new Object[] { "e", "b", "c", aiqj.class });
            }
            case 1: {
                if (o == null) {
                    f = 0;
                }
                this.f = f;
                return null;
            }
            case 0: {
                return this.f;
            }
        }
    }
}
