import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apuo extends ahcz implements aheo
{
    public static final apuo a;
    private static volatile ahev d;
    public int b;
    public String c;
    
    static {
        ahcz.registerDefaultInstance(apuo.class, a = new apuo());
    }
    
    private apuo() {
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
                if ((d = apuo.d) == null) {
                    synchronized (apuo.class) {
                        if (apuo.d == null) {
                            apuo.d = (ahev)new ahcs((ahcz)apuo.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return apuo.a;
            }
            case 4: {
                return new ahcr((ahcz)apuo.a);
            }
            case 3: {
                return new apuo();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)apuo.a, "\u0001\u0001\u0000\u0001\u0003\u0003\u0001\u0000\u0000\u0000\u0003\u1008\u0000", new Object[] { "b", "c" });
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
