import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apob extends ahcz implements aheo
{
    public static final apob a;
    private static volatile ahev d;
    public int b;
    public String c;
    
    static {
        ahcz.registerDefaultInstance(apob.class, a = new apob());
    }
    
    private apob() {
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
                if ((d = apob.d) == null) {
                    synchronized (apob.class) {
                        if (apob.d == null) {
                            apob.d = (ahev)new ahcs((ahcz)apob.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return apob.a;
            }
            case 4: {
                return new ahcr((ahcz)apob.a);
            }
            case 3: {
                return new apob();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)apob.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1008\u0000", new Object[] { "b", "c" });
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
