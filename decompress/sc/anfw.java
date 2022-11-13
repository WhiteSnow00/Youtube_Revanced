import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class anfw extends ahbh implements ahcw
{
    public static final anfw a;
    private static volatile ahdd e;
    public int b;
    public int c;
    public ahbx d;
    private byte f;
    
    static {
        ahbh.registerDefaultInstance((Class)anfw.class, (ahbh)(a = new anfw()));
    }
    
    private anfw() {
        this.f = 2;
        this.d = emptyProtobufList();
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
                final ahdd e;
                if ((e = anfw.e) == null) {
                    synchronized (anfw.class) {
                        if (anfw.e == null) {
                            anfw.e = (ahdd)new ahba((ahbh)anfw.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return anfw.a;
            }
            case 4: {
                return new ahaz((ahbh)anfw.a);
            }
            case 3: {
                return new anfw();
            }
            case 2: {
                return newMessageInfo((MessageLite)anfw.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0001\u0001\u1004\u0000\u0002\u041b", new Object[] { "b", "c", "d", anuv.class });
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
