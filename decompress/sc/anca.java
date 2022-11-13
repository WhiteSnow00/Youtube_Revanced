import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class anca extends ahbh implements ahcw
{
    public static final anca a;
    private static volatile ahdd e;
    public ahbx b;
    public boolean c;
    public boolean d;
    private int f;
    private ahcr g;
    
    static {
        ahbh.registerDefaultInstance((Class)anca.class, (ahbh)(a = new anca()));
    }
    
    private anca() {
        this.g = ahcr.a;
        this.b = emptyProtobufList();
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd e;
                if ((e = anca.e) == null) {
                    synchronized (anca.class) {
                        if (anca.e == null) {
                            anca.e = (ahdd)new ahba((ahbh)anca.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return anca.a;
            }
            case 4: {
                return new ahaz((ahbh)anca.a);
            }
            case 3: {
                return new anca();
            }
            case 2: {
                return newMessageInfo((MessageLite)anca.a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0001\u0001\u0000\u0001\u001b\u00022\u0003\u1007\u0000\u0004\u1007\u0001", new Object[] { "f", "b", anby.class, "g", anbz.a, "c", "d" });
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
