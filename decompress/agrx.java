import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agrx extends ahcz implements aheo
{
    public static final agrx a;
    private static volatile ahev d;
    public int b;
    public String c;
    
    static {
        ahcz.registerDefaultInstance(agrx.class, a = new agrx());
    }
    
    private agrx() {
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
                if ((d = agrx.d) == null) {
                    synchronized (agrx.class) {
                        if (agrx.d == null) {
                            agrx.d = (ahev)new ahcs((ahcz)agrx.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return agrx.a;
            }
            case 4: {
                return new ahcr((ahcz)agrx.a);
            }
            case 3: {
                return new agrx();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)agrx.a, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\u0208", new Object[] { "b", "c" });
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
