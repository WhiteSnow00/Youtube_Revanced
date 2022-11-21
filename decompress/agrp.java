import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agrp extends ahcz implements aheo
{
    public static final agrp a;
    private static volatile ahev d;
    public int b;
    public String c;
    
    static {
        ahcz.registerDefaultInstance(agrp.class, a = new agrp());
    }
    
    private agrp() {
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
                if ((d = agrp.d) == null) {
                    synchronized (agrp.class) {
                        if (agrp.d == null) {
                            agrp.d = (ahev)new ahcs((ahcz)agrp.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return agrp.a;
            }
            case 4: {
                return new ahcr((ahcz)agrp.a);
            }
            case 3: {
                return new agrp();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)agrp.a, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\u0208", new Object[] { "b", "c" });
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
