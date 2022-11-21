import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apoj extends ahcz implements aheo
{
    public static final apoj a;
    private static volatile ahev d;
    public int b;
    public String c;
    
    static {
        ahcz.registerDefaultInstance(apoj.class, a = new apoj());
    }
    
    private apoj() {
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
                if ((d = apoj.d) == null) {
                    synchronized (apoj.class) {
                        if (apoj.d == null) {
                            apoj.d = (ahev)new ahcs((ahcz)apoj.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return apoj.a;
            }
            case 4: {
                return new ahcr((ahcz)apoj.a);
            }
            case 3: {
                return new apoj();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)apoj.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1008\u0000", new Object[] { "b", "c" });
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
