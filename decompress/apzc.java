import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apzc extends ahcz implements aheo
{
    public static final apzc a;
    private static volatile ahev d;
    public int b;
    public ahbt c;
    
    static {
        ahcz.registerDefaultInstance(apzc.class, a = new apzc());
    }
    
    private apzc() {
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
                if ((d = apzc.d) == null) {
                    synchronized (apzc.class) {
                        if (apzc.d == null) {
                            apzc.d = (ahev)new ahcs((ahcz)apzc.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return apzc.a;
            }
            case 4: {
                return new ahcr((ahcz)apzc.a);
            }
            case 3: {
                return new apzc();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)apzc.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u100a\u0000", new Object[] { "b", "c" });
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
