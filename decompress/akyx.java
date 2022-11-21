import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akyx extends ahcz implements aheo
{
    public static final akyx a;
    private static volatile ahev d;
    public int b;
    public Object c;
    
    static {
        ahcz.registerDefaultInstance(akyx.class, a = new akyx());
    }
    
    private akyx() {
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
                if ((d = akyx.d) == null) {
                    synchronized (akyx.class) {
                        if (akyx.d == null) {
                            akyx.d = (ahev)new ahcs((ahcz)akyx.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return akyx.a;
            }
            case 4: {
                return new ahcr((ahcz)akyx.a);
            }
            case 3: {
                return new akyx();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)akyx.a, "\u0001\u0001\u0001\u0000\ufd9e\u3443\ufd9e\u3443\u0001\u0000\u0000\u0000\ufd9e\u3443\u103c\u0000", new Object[] { "c", "b", anel.class });
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
