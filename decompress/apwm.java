import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apwm extends ahcz implements aheo
{
    public static final apwm a;
    private static volatile ahev f;
    public boolean b;
    public boolean c;
    public int d;
    public int e;
    
    static {
        ahcz.registerDefaultInstance(apwm.class, a = new apwm());
    }
    
    private apwm() {
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
                if ((f = apwm.f) == null) {
                    synchronized (apwm.class) {
                        if (apwm.f == null) {
                            apwm.f = (ahev)new ahcs((ahcz)apwm.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return apwm.a;
            }
            case 4: {
                return new ahcr((ahcz)apwm.a);
            }
            case 3: {
                return new apwm();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)apwm.a, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0007\u0002\u0007\u0003\u0004\u0004\f", new Object[] { "b", "c", "d", "e" });
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
