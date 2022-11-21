import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apup extends ahcz implements aheo
{
    public static final apup a;
    private static volatile ahev d;
    public int b;
    public String c;
    
    static {
        ahcz.registerDefaultInstance(apup.class, a = new apup());
    }
    
    private apup() {
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
                if ((d = apup.d) == null) {
                    synchronized (apup.class) {
                        if (apup.d == null) {
                            apup.d = (ahev)new ahcs((ahcz)apup.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return apup.a;
            }
            case 4: {
                return new ahcr((ahcz)apup.a);
            }
            case 3: {
                return new apup();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)apup.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1008\u0000", new Object[] { "b", "c" });
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
