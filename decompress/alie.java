import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alie extends ahcz implements aheo
{
    public static final alie a;
    private static volatile ahev f;
    public int b;
    public String c;
    public apry d;
    public alji e;
    
    static {
        ahcz.registerDefaultInstance(alie.class, a = new alie());
    }
    
    private alie() {
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
                final ahev f;
                if ((f = alie.f) == null) {
                    synchronized (alie.class) {
                        if (alie.f == null) {
                            alie.f = (ahev)new ahcs((ahcz)alie.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return alie.a;
            }
            case 4: {
                return new ahcr((ahcz)alie.a);
            }
            case 3: {
                return new alie();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)alie.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1009\u0001\u0003\u1009\u0002", new Object[] { "b", "c", "d", "e" });
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
