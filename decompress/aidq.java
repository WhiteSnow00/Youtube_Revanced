import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aidq extends ahbh implements ahcw
{
    public static final aidq a;
    private static volatile ahdd d;
    public int b;
    public aiho c;
    private byte e;
    
    static {
        ahbh.registerDefaultInstance((Class)aidq.class, (ahbh)(a = new aidq()));
    }
    
    private aidq() {
        this.e = 2;
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
                if ((d = aidq.d) == null) {
                    synchronized (aidq.class) {
                        if (aidq.d == null) {
                            aidq.d = (ahdd)new ahba((ahbh)aidq.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aidq.a;
            }
            case 4: {
                return new ahaz((ahbh)aidq.a);
            }
            case 3: {
                return new aidq();
            }
            case 2: {
                return newMessageInfo((MessageLite)aidq.a, "\u0001\u0001\u0000\u0001\uf601\u18c7\uf601\u18c7\u0001\u0000\u0000\u0001\uf601\u18c7\u1409\u0000", new Object[] { "b", "c" });
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
