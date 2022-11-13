import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqms extends ahbh implements ahcw
{
    public static final aqms a;
    private static volatile ahdd f;
    public int b;
    public ahbk c;
    public ahbk d;
    public int e;
    
    static {
        ahbh.registerDefaultInstance((Class)aqms.class, (ahbh)(a = new aqms()));
    }
    
    private aqms() {
        emptyDoubleList();
        this.c = emptyDoubleList();
        this.d = emptyDoubleList();
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd f;
                if ((f = aqms.f) == null) {
                    synchronized (aqms.class) {
                        if (aqms.f == null) {
                            aqms.f = (ahdd)new ahba((ahbh)aqms.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return aqms.a;
            }
            case 4: {
                return new ahaz((ahbh)aqms.a);
            }
            case 3: {
                return new aqms();
            }
            case 2: {
                return newMessageInfo((MessageLite)aqms.a, "\u0001\u0003\u0000\u0001\u0002\u0004\u0003\u0000\u0002\u0000\u0002\u0012\u0003\u0012\u0004\u100b\u0000", new Object[] { "b", "c", "d", "e" });
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
