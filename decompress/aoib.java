import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aoib extends ahcz implements aheo
{
    public static final aoib a;
    private static volatile ahev d;
    public int b;
    public String c;
    
    static {
        ahcz.registerDefaultInstance(aoib.class, a = new aoib());
    }
    
    private aoib() {
        this.c = "";
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
                if ((d = aoib.d) == null) {
                    synchronized (aoib.class) {
                        if (aoib.d == null) {
                            aoib.d = (ahev)new ahcs((ahcz)aoib.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aoib.a;
            }
            case 4: {
                return new ahcr((ahcz)aoib.a);
            }
            case 3: {
                return new aoib();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aoib.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1008\u0000", new Object[] { "b", "c" });
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
