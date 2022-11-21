import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aifg extends ahcz implements aheo
{
    public static final aifg a;
    private static volatile ahev g;
    public int b;
    public int c;
    public Object d;
    public ahbt e;
    public long f;
    
    static {
        ahcz.registerDefaultInstance(aifg.class, a = new aifg());
    }
    
    private aifg() {
        this.c = 0;
        this.e = ahbt.b;
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        switch (ahcy.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev g;
                if ((g = aifg.g) == null) {
                    synchronized (aifg.class) {
                        if (aifg.g == null) {
                            aifg.g = (ahev)new ahcs((ahcz)aifg.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return aifg.a;
            }
            case 4: {
                return new ahcr((ahcz)aifg.a);
            }
            case 3: {
                return new aifg();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aifg.a, "\u0001\u0005\u0001\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001\u100a\u0000\u0002\u1003\u0001\u0003\u103b\u0000\u0004\u103c\u0000\u0005\u103b\u0000", new Object[] { "d", "c", "b", "e", "f", aluj.class });
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
