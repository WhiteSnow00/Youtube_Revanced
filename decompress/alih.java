import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alih extends ahcz implements aheo
{
    public static final alih a;
    private static volatile ahev f;
    public int b;
    public boolean c;
    public boolean d;
    public String e;
    
    static {
        ahcz.registerDefaultInstance(alih.class, a = new alih());
    }
    
    private alih() {
        this.e = "";
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
                if ((f = alih.f) == null) {
                    synchronized (alih.class) {
                        if (alih.f == null) {
                            alih.f = (ahev)new ahcs((ahcz)alih.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return alih.a;
            }
            case 4: {
                return new ahcr((ahcz)alih.a);
            }
            case 3: {
                return new alih();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)alih.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u1007\u0000\u0002\u1007\u0001\u0003\u1008\u0002", new Object[] { "b", "c", "d", "e" });
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
