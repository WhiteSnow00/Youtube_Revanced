import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqih extends ahcz implements aheo
{
    public static final aqih a;
    private static volatile ahev d;
    public int b;
    public boolean c;
    
    static {
        ahcz.registerDefaultInstance(aqih.class, a = new aqih());
    }
    
    private aqih() {
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
                if ((d = aqih.d) == null) {
                    synchronized (aqih.class) {
                        if (aqih.d == null) {
                            aqih.d = (ahev)new ahcs((ahcz)aqih.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aqih.a;
            }
            case 4: {
                return new ahcr((ahcz)aqih.a);
            }
            case 3: {
                return new aqih();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aqih.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1007\u0000", new Object[] { "b", "c" });
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
