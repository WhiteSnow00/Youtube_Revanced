import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aned extends ahbh implements ahcw
{
    public static final aned a;
    private static volatile ahdd g;
    public ahbx b;
    public ahbx c;
    public ahbx d;
    public int e;
    public ahbp f;
    private int h;
    private andy i;
    private byte j;
    
    static {
        ahbh.registerDefaultInstance((Class)aned.class, (ahbh)(a = new aned()));
    }
    
    private aned() {
        this.j = 2;
        this.b = emptyProtobufList();
        this.c = emptyProtobufList();
        this.d = emptyProtobufList();
        this.f = emptyIntList();
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
                if ((g = aned.g) == null) {
                    synchronized (aned.class) {
                        if (aned.g == null) {
                            aned.g = (ahdd)new ahba((ahbh)aned.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return aned.a;
            }
            case 4: {
                return new ahaz((ahbh)aned.a);
            }
            case 3: {
                return new aned();
            }
            case 2: {
                return newMessageInfo((MessageLite)aned.a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0004\u0003\u0001\u041b\u0002\u001b\u0003\u041b\u0004\u1004\u0000\u0005\u1409\u0001\u0006\u0016", new Object[] { "h", "b", anec.class, "c", aneb.class, "d", anee.class, "e", "i", "f" });
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
