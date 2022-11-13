import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aoye extends ahbh implements ahcw
{
    public static final aoye a;
    private static volatile ahdd d;
    public ahbx b;
    public anuv c;
    private int e;
    private ahhu f;
    private byte g;
    
    static {
        ahbh.registerDefaultInstance((Class)aoye.class, (ahbh)(a = new aoye()));
    }
    
    private aoye() {
        this.g = 2;
        this.b = emptyProtobufList();
        final ahab b = ahab.b;
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
                final ahdd d;
                if ((d = aoye.d) == null) {
                    synchronized (aoye.class) {
                        if (aoye.d == null) {
                            aoye.d = (ahdd)new ahba((ahbh)aoye.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aoye.a;
            }
            case 4: {
                return new ahaz((ahbh)aoye.a);
            }
            case 3: {
                return new aoye();
            }
            case 2: {
                return newMessageInfo((MessageLite)aoye.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0003\u0001\u041b\u0002\u1409\u0000\u0003\u1409\u0001", new Object[] { "e", "b", anuv.class, "c", "f" });
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
