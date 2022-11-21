import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqps extends ahcz implements aheo
{
    public static final aqps a;
    private static volatile ahev e;
    public int b;
    public Object c;
    public ahdc d;
    
    static {
        ahcz.registerDefaultInstance(aqps.class, a = new aqps());
    }
    
    private aqps() {
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
                if ((e = aqps.e) == null) {
                    synchronized (aqps.class) {
                        if (aqps.e == null) {
                            aqps.e = (ahev)new ahcs((ahcz)aqps.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return aqps.a;
            }
            case 4: {
                return new ahcr((ahcz)aqps.a);
            }
            case 3: {
                return new aqps();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aqps.a, "\u0001\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u0012\u0002\u103c\u0000", new Object[] { "c", "b", "d", aqpr.class });
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
