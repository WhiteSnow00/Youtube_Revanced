import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class andy extends ahbh implements ahcw
{
    public static final andy a;
    private static volatile ahdd b;
    private int c;
    private aieo d;
    private byte e;
    
    static {
        ahbh.registerDefaultInstance((Class)andy.class, (ahbh)(a = new andy()));
    }
    
    private andy() {
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
                final ahdd b;
                if ((b = andy.b) == null) {
                    synchronized (andy.class) {
                        if (andy.b == null) {
                            andy.b = (ahdd)new ahba((ahbh)andy.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return andy.a;
            }
            case 4: {
                return new ahaz((ahbh)andy.a);
            }
            case 3: {
                return new andy();
            }
            case 2: {
                return newMessageInfo((MessageLite)andy.a, "\u0001\u0001\u0000\u0001\uf151\u208b\uf151\u208b\u0001\u0000\u0000\u0001\uf151\u208b\u1409\u0000", new Object[] { "c", "d" });
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
