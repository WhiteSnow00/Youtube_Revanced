import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akov extends ahbh implements ahcw
{
    public static final akov a;
    private static volatile ahdd f;
    public int b;
    public aklg c;
    public ahbx d;
    public ahbx e;
    private byte g;
    
    static {
        ahbh.registerDefaultInstance((Class)akov.class, (ahbh)(a = new akov()));
    }
    
    private akov() {
        this.g = 2;
        this.d = ahbh.emptyProtobufList();
        this.e = ahbh.emptyProtobufList();
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte g = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd f;
                if ((f = akov.f) == null) {
                    synchronized (akov.class) {
                        if (akov.f == null) {
                            akov.f = (ahdd)new ahba((ahbh)akov.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return akov.a;
            }
            case 4: {
                return new ahaz((int[])null);
            }
            case 3: {
                return new akov();
            }
            case 2: {
                return newMessageInfo((MessageLite)akov.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0002\u0001\u0001\u1409\u0000\u0002\u001a\u0003\u001a", new Object[] { "b", "c", "d", "e" });
            }
            case 1: {
                if (o == null) {
                    g = 0;
                }
                this.g = g;
                return null;
            }
            case 0: {
                return this.g;
            }
        }
    }
}
