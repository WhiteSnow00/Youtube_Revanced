import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqre extends ahbh implements ahcw
{
    public static final aqre a;
    private static volatile ahdd f;
    public int b;
    public ahan c;
    public boolean d;
    public boolean e;
    
    static {
        ahbh.registerDefaultInstance((Class)aqre.class, (ahbh)(a = new aqre()));
    }
    
    private aqre() {
        this.e = true;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd f;
                if ((f = aqre.f) == null) {
                    synchronized (aqre.class) {
                        if (aqre.f == null) {
                            aqre.f = (ahdd)new ahba((ahbh)aqre.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return aqre.a;
            }
            case 4: {
                return new ahaz((ahbh)aqre.a);
            }
            case 3: {
                return new aqre();
            }
            case 2: {
                return newMessageInfo((MessageLite)aqre.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u1009\u0000\u0002\u1007\u0001\u0003\u1007\u0002", new Object[] { "b", "c", "d", "e" });
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
