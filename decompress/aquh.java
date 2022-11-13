import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aquh extends ahbh implements ahcw
{
    public static final aquh a;
    private static volatile ahdd f;
    public int b;
    public int c;
    public int d;
    public int e;
    
    static {
        ahbh.registerDefaultInstance((Class)aquh.class, (ahbh)(a = new aquh()));
    }
    
    private aquh() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd f;
                if ((f = aquh.f) == null) {
                    synchronized (aquh.class) {
                        if (aquh.f == null) {
                            aquh.f = (ahdd)new ahba((ahbh)aquh.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return aquh.a;
            }
            case 4: {
                return new ahaz((ahbh)aquh.a);
            }
            case 3: {
                return new aquh();
            }
            case 2: {
                return newMessageInfo((MessageLite)aquh.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u1004\u0000\u0002\u1004\u0001\u0003\u1004\u0002", new Object[] { "b", "c", "d", "e" });
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
