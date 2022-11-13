import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class andr extends ahbh implements ahcw
{
    public static final andr a;
    private static volatile ahdd j;
    public int b;
    public float c;
    public apnr d;
    public apnr e;
    public apnr f;
    public boolean g;
    public long h;
    public long i;
    
    static {
        ahbh.registerDefaultInstance((Class)andr.class, (ahbh)(a = new andr()));
    }
    
    private andr() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd j;
                if ((j = andr.j) == null) {
                    synchronized (andr.class) {
                        if (andr.j == null) {
                            andr.j = (ahdd)new ahba((ahbh)andr.a);
                        }
                    }
                }
                return j;
            }
            case 5: {
                return andr.a;
            }
            case 4: {
                return new ahaz((ahbh)andr.a);
            }
            case 3: {
                return new andr();
            }
            case 2: {
                return newMessageInfo((MessageLite)andr.a, "\u0001\u0007\u0000\u0001\u0001\b\u0007\u0000\u0000\u0000\u0001\u1001\u0000\u0002\u1007\u0005\u0004\u1002\u0006\u0005\u1002\u0007\u0006\u1009\u0002\u0007\u1009\u0003\b\u1009\u0004", new Object[] { "b", "c", "g", "h", "i", "d", "e", "f" });
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
