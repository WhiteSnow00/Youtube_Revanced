import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apof extends ahcz implements aheo
{
    public static final apof a;
    private static volatile ahev d;
    public int b;
    public String c;
    
    static {
        ahcz.registerDefaultInstance(apof.class, a = new apof());
    }
    
    private apof() {
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
                if ((d = apof.d) == null) {
                    synchronized (apof.class) {
                        if (apof.d == null) {
                            apof.d = (ahev)new ahcs((ahcz)apof.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return apof.a;
            }
            case 4: {
                return new ahcr((ahcz)apof.a);
            }
            case 3: {
                return new apof();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)apof.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1008\u0000", new Object[] { "b", "c" });
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
