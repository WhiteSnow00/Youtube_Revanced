import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apig extends ahcz implements aheo
{
    public static final apig a;
    private static volatile ahev d;
    public int b;
    public String c;
    
    static {
        ahcz.registerDefaultInstance(apig.class, a = new apig());
    }
    
    private apig() {
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
                if ((d = apig.d) == null) {
                    synchronized (apig.class) {
                        if (apig.d == null) {
                            apig.d = (ahev)new ahcs((ahcz)apig.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return apig.a;
            }
            case 4: {
                return new ahcr((ahcz)apig.a);
            }
            case 3: {
                return new apig();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)apig.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1008\u0000", new Object[] { "b", "c" });
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
