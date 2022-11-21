import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alhx extends ahcz implements aheo
{
    public static final alhx a;
    private static volatile ahev f;
    public int b;
    public String c;
    public apry d;
    public String e;
    
    static {
        ahcz.registerDefaultInstance(alhx.class, a = new alhx());
    }
    
    private alhx() {
        this.c = "";
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
                if ((f = alhx.f) == null) {
                    synchronized (alhx.class) {
                        if (alhx.f == null) {
                            alhx.f = (ahev)new ahcs((ahcz)alhx.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return alhx.a;
            }
            case 4: {
                return new ahcr((ahcz)alhx.a);
            }
            case 3: {
                return new alhx();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)alhx.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1009\u0001\u0003\u1008\u0002", new Object[] { "b", "c", "d", "e" });
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
