import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akfc extends ahcz implements aheo
{
    public static final akfc a;
    private static volatile ahev f;
    public int b;
    public String c;
    public String d;
    public boolean e;
    
    static {
        ahcz.registerDefaultInstance(akfc.class, a = new akfc());
    }
    
    private akfc() {
        this.c = "";
        this.d = "";
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
                if ((f = akfc.f) == null) {
                    synchronized (akfc.class) {
                        if (akfc.f == null) {
                            akfc.f = (ahev)new ahcs((ahcz)akfc.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return akfc.a;
            }
            case 4: {
                return new ahcr((ahcz)akfc.a);
            }
            case 3: {
                return new akfc();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)akfc.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1008\u0001\u0003\u1007\u0002", new Object[] { "b", "c", "d", "e" });
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
