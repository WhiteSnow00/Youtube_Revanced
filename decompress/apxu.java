import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apxu extends ahcz implements aheo
{
    public static final apxu a;
    private static volatile ahev e;
    public String b;
    public apxv c;
    public apxx d;
    private int f;
    
    static {
        ahcz.registerDefaultInstance(apxu.class, a = new apxu());
    }
    
    private apxu() {
        this.b = "";
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        switch (ahcy.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev e;
                if ((e = apxu.e) == null) {
                    synchronized (apxu.class) {
                        if (apxu.e == null) {
                            apxu.e = (ahev)new ahcs((ahcz)apxu.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return apxu.a;
            }
            case 4: {
                return new ahcr((ahcz)apxu.a);
            }
            case 3: {
                return new apxu();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)apxu.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1009\u0001\u0003\u1009\u0002", new Object[] { "f", "b", "c", "d" });
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
