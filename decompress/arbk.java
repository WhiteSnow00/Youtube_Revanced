import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class arbk extends ahcz implements aheo
{
    public static final arbk a;
    private static volatile ahev d;
    public int b;
    public long c;
    
    static {
        ahcz.registerDefaultInstance(arbk.class, a = new arbk());
    }
    
    private arbk() {
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
                if ((d = arbk.d) == null) {
                    synchronized (arbk.class) {
                        if (arbk.d == null) {
                            arbk.d = (ahev)new ahcs((ahcz)arbk.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return arbk.a;
            }
            case 4: {
                return new ahcr((ahcz)arbk.a);
            }
            case 3: {
                return new arbk();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)arbk.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1002\u0000", new Object[] { "b", "c" });
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
