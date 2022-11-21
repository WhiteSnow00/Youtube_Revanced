import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akpv extends ahcz implements aheo
{
    public static final akpv a;
    private static volatile ahev e;
    public int b;
    public long c;
    public akpz d;
    
    static {
        ahcz.registerDefaultInstance(akpv.class, a = new akpv());
    }
    
    private akpv() {
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
                if ((e = akpv.e) == null) {
                    synchronized (akpv.class) {
                        if (akpv.e == null) {
                            akpv.e = (ahev)new ahcs((ahcz)akpv.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return akpv.a;
            }
            case 4: {
                return new ahcr((ahcz)akpv.a);
            }
            case 3: {
                return new akpv();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)akpv.a, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u1002\u0000\u0003\u1009\u0002", new Object[] { "b", "c", "d" });
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
