import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apoz extends ahcz implements aheo
{
    public static final apoz a;
    private static volatile ahev d;
    public int b;
    public String c;
    
    static {
        ahcz.registerDefaultInstance(apoz.class, a = new apoz());
    }
    
    private apoz() {
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
                if ((d = apoz.d) == null) {
                    synchronized (apoz.class) {
                        if (apoz.d == null) {
                            apoz.d = (ahev)new ahcs((ahcz)apoz.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return apoz.a;
            }
            case 4: {
                return new ahcr((ahcz)apoz.a);
            }
            case 3: {
                return new apoz();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)apoz.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1008\u0000", new Object[] { "b", "c" });
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
