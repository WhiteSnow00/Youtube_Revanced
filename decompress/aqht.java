import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqht extends ahcz implements aheo
{
    public static final aqht a;
    private static volatile ahev d;
    public int b;
    public aqjz c;
    
    static {
        ahcz.registerDefaultInstance(aqht.class, a = new aqht());
    }
    
    private aqht() {
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
                if ((d = aqht.d) == null) {
                    synchronized (aqht.class) {
                        if (aqht.d == null) {
                            aqht.d = (ahev)new ahcs((ahcz)aqht.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aqht.a;
            }
            case 4: {
                return new ahcr((ahcz)aqht.a);
            }
            case 3: {
                return new aqht();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aqht.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1009\u0000", new Object[] { "b", "c" });
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
