import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aexi extends ahcz implements aheo
{
    public static final aexi a;
    private static volatile ahev d;
    public int b;
    public Object c;
    
    static {
        ahcz.registerDefaultInstance(aexi.class, a = new aexi());
    }
    
    private aexi() {
        this.b = 0;
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        switch (ahcy.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev d;
                if ((d = aexi.d) == null) {
                    synchronized (aexi.class) {
                        if (aexi.d == null) {
                            aexi.d = (ahev)new ahcs((ahcz)aexi.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aexi.a;
            }
            case 4: {
                return new ahcr((ahcz)aexi.a);
            }
            case 3: {
                return new aexi();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aexi.a, "\u0000\u0004\u0001\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001=\u0000\u0002<\u0000\u0003=\u0000\u0004<\u0000", new Object[] { "c", "b", aexe.class, aexh.class });
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
