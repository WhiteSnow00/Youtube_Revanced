import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apys extends ahcz implements aheo
{
    public static final apys a;
    private static volatile ahev d;
    public int b;
    public ahbt c;
    
    static {
        ahcz.registerDefaultInstance(apys.class, a = new apys());
    }
    
    private apys() {
        this.c = ahbt.b;
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
                if ((d = apys.d) == null) {
                    synchronized (apys.class) {
                        if (apys.d == null) {
                            apys.d = (ahev)new ahcs((ahcz)apys.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return apys.a;
            }
            case 4: {
                return new ahcr((ahcz)apys.a);
            }
            case 3: {
                return new apys();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)apys.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u100a\u0000", new Object[] { "b", "c" });
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
