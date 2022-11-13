import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajwc extends ahbh implements ahcw
{
    public static final ajwc a;
    private static volatile ahdd b;
    private int c;
    private aiwm d;
    private ajab e;
    private aivu f;
    private byte g;
    
    static {
        ahbh.registerDefaultInstance((Class)ajwc.class, (ahbh)(a = new ajwc()));
    }
    
    private ajwc() {
        this.g = 2;
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
                final ahdd b;
                if ((b = ajwc.b) == null) {
                    synchronized (ajwc.class) {
                        if (ajwc.b == null) {
                            ajwc.b = (ahdd)new ahba((ahbh)ajwc.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return ajwc.a;
            }
            case 4: {
                return new ahaz((ahbh)ajwc.a);
            }
            case 3: {
                return new ajwc();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajwc.a, "\u0001\u0003\u0000\u0001\uf143\u1824\uf5b1\u2f1e\u0003\u0000\u0000\u0003\uf143\u1824\u1409\u0000\ue567\u1832\u1409\u0002\uf5b1\u2f1e\u1409\u0001", new Object[] { "c", "d", "f", "e" });
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
