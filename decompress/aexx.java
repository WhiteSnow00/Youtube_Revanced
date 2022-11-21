import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aexx extends ahcz implements aheo
{
    public static final aexx a;
    private static volatile ahev e;
    public int b;
    public int c;
    public int d;
    
    static {
        ahcz.registerDefaultInstance(aexx.class, a = new aexx());
    }
    
    private aexx() {
        this.c = 5;
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
                if ((e = aexx.e) == null) {
                    synchronized (aexx.class) {
                        if (aexx.e == null) {
                            aexx.e = (ahev)new ahcs((ahcz)aexx.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return aexx.a;
            }
            case 4: {
                return new ahcr((ahcz)aexx.a);
            }
            case 3: {
                return new aexx();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aexx.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u100c\u0000\u0002\u100c\u0001", new Object[] { "b", "c", aemb.f, "d", aemb.g });
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
