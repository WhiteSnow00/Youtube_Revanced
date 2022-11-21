import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqor extends ahcz implements aheo
{
    public static final aqor a;
    private static volatile ahev d;
    public String b;
    public ahbg c;
    private int e;
    
    static {
        ahcz.registerDefaultInstance(aqor.class, a = new aqor());
    }
    
    private aqor() {
        this.b = "";
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
                if ((d = aqor.d) == null) {
                    synchronized (aqor.class) {
                        if (aqor.d == null) {
                            aqor.d = (ahev)new ahcs((ahcz)aqor.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aqor.a;
            }
            case 4: {
                return new ahcr((ahcz)aqor.a);
            }
            case 3: {
                return new aqor();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aqor.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1009\u0001", new Object[] { "e", "b", "c" });
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
