import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adpj extends ahcz implements aheo
{
    public static final adpj a;
    private static volatile ahev g;
    public int b;
    public ahej c;
    public String d;
    public ahbt e;
    public ahbt f;
    
    static {
        ahcz.registerDefaultInstance(adpj.class, a = new adpj());
    }
    
    private adpj() {
        this.c = ahej.a;
        this.d = "";
        this.e = ahbt.b;
        this.f = ahbt.b;
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        switch (ahcy.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev g;
                if ((g = adpj.g) == null) {
                    synchronized (adpj.class) {
                        if (adpj.g == null) {
                            adpj.g = (ahev)new ahcs((ahcz)adpj.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return adpj.a;
            }
            case 4: {
                return new ahcr((ahcz)adpj.a);
            }
            case 3: {
                return new adpj();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)adpj.a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0001\u0000\u0000\u00012\u0002\u1008\u0000\u0003\u100a\u0001\u0004\u100a\u0002", new Object[] { "b", "c", adpi.a, "d", "e", "f" });
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
