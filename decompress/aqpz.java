import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqpz extends ahcz implements aheo
{
    public static final aqpz a;
    private static volatile ahev e;
    public int b;
    public Object c;
    public ahdc d;
    
    static {
        ahcz.registerDefaultInstance(aqpz.class, a = new aqpz());
    }
    
    private aqpz() {
        this.b = 0;
        this.d = ahcz.emptyDoubleList();
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        switch (ahcy.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev e;
                if ((e = aqpz.e) == null) {
                    synchronized (aqpz.class) {
                        if (aqpz.e == null) {
                            aqpz.e = (ahev)new ahcs((ahcz)aqpz.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return aqpz.a;
            }
            case 4: {
                return new ahcr((ahcz)aqpz.a);
            }
            case 3: {
                return new aqpz();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aqpz.a, "\u0001\u0004\u0001\u0000\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u0012\u0002\u103c\u0000\u0003\u103c\u0000\u0004\u103c\u0000", new Object[] { "c", "b", "d", aqpr.class, aqqa.class, aqpq.class });
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
