import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class anuy extends ahbh implements ahcw
{
    public static final anuy a;
    private static volatile ahdd h;
    public int b;
    public int c;
    public boolean d;
    public int e;
    public long f;
    public long g;
    
    static {
        ahbh.registerDefaultInstance((Class)anuy.class, (ahbh)(a = new anuy()));
    }
    
    private anuy() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd h;
                if ((h = anuy.h) == null) {
                    synchronized (anuy.class) {
                        if (anuy.h == null) {
                            anuy.h = (ahdd)new ahba((ahbh)anuy.a);
                        }
                    }
                }
                return h;
            }
            case 5: {
                return anuy.a;
            }
            case 4: {
                return new ahaz((ahbh)anuy.a);
            }
            case 3: {
                return new anuy();
            }
            case 2: {
                return newMessageInfo((MessageLite)anuy.a, "\u0001\u0005\u0000\u0001\u0001\b\u0005\u0000\u0000\u0000\u0001\u1004\u0000\u0003\u1007\u0002\u0004\u1004\u0003\u0006\u1002\u0005\b\u1002\u0007", new Object[] { "b", "c", "d", "e", "f", "g" });
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
