import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajuk extends ahbh implements ahcw
{
    public static final ajuk a;
    private static volatile ahdd d;
    public ahbx b;
    public ahbx c;
    private byte e;
    
    static {
        ahbh.registerDefaultInstance((Class)ajuk.class, (ahbh)(a = new ajuk()));
    }
    
    private ajuk() {
        this.e = 2;
        this.b = emptyProtobufList();
        this.c = emptyProtobufList();
        emptyProtobufList();
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte e = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd d;
                if ((d = ajuk.d) == null) {
                    synchronized (ajuk.class) {
                        if (ajuk.d == null) {
                            ajuk.d = (ahdd)new ahba((ahbh)ajuk.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return ajuk.a;
            }
            case 4: {
                return new ahaz((ahbh)ajuk.a);
            }
            case 3: {
                return new ajuk();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajuk.a, "\u0001\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0002\u0001\u041b\u0002\u041b", new Object[] { "b", ajuj.class, "c", ajuj.class });
            }
            case 1: {
                if (o == null) {
                    e = 0;
                }
                this.e = e;
                return null;
            }
            case 0: {
                return this.e;
            }
        }
    }
}
