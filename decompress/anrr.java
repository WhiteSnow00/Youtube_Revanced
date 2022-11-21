import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class anrr extends ahcz implements aheo
{
    public static final anrr a;
    private static volatile ahev e;
    public int b;
    public int c;
    public float d;
    
    static {
        ahcz.registerDefaultInstance(anrr.class, a = new anrr());
    }
    
    private anrr() {
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
                if ((e = anrr.e) == null) {
                    synchronized (anrr.class) {
                        if (anrr.e == null) {
                            anrr.e = (ahev)new ahcs((ahcz)anrr.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return anrr.a;
            }
            case 4: {
                return new ahcr((ahcz)anrr.a);
            }
            case 3: {
                return new anrr();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)anrr.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u100c\u0000\u0002\u1001\u0001", new Object[] { "b", "c", ansp.b, "d" });
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
