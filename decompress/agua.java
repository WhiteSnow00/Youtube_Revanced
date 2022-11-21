import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agua extends ahcz implements aheo
{
    public static final agua a;
    private static volatile ahev d;
    public int b;
    public Object c;
    
    static {
        ahcz.registerDefaultInstance(agua.class, a = new agua());
    }
    
    private agua() {
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
                if ((d = agua.d) == null) {
                    synchronized (agua.class) {
                        if (agua.d == null) {
                            agua.d = (ahev)new ahcs((ahcz)agua.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return agua.a;
            }
            case 4: {
                return new ahcr((ahcz)agua.a);
            }
            case 3: {
                return new agua();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)agua.a, "\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u103c\u0000", new Object[] { "c", "b", aguc.class });
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
