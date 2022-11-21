import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apyq extends ahcz implements aheo
{
    public static final apyq a;
    private static volatile ahev g;
    public int b;
    public ahbt c;
    public int d;
    public String e;
    public String f;
    
    static {
        ahcz.registerDefaultInstance(apyq.class, a = new apyq());
    }
    
    private apyq() {
        this.c = ahbt.b;
        this.e = "";
        this.f = "";
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
                if ((g = apyq.g) == null) {
                    synchronized (apyq.class) {
                        if (apyq.g == null) {
                            apyq.g = (ahev)new ahcs((ahcz)apyq.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return apyq.a;
            }
            case 4: {
                return new ahcr((ahcz)apyq.a);
            }
            case 3: {
                return new apyq();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)apyq.a, "\u0001\u0004\u0000\u0001\u0001\b\u0004\u0000\u0000\u0000\u0001\u100a\u0000\u0002\u100c\u0001\u0007\u1008\u0006\b\u1008\u0007", new Object[] { "b", "c", "d", apvm.k, "e", "f" });
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
