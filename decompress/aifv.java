import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aifv extends ahcz implements aheo
{
    private static final aifv a;
    private static volatile ahev b;
    
    static {
        ahcz.registerDefaultInstance(aifv.class, a = new aifv());
    }
    
    private aifv() {
    }
    
    public static aifv a() {
        return aifv.a;
    }
    
    public static aifv b() {
        return aifv.a;
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        switch (ahcy.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev b;
                if ((b = aifv.b) == null) {
                    synchronized (aifv.class) {
                        if (aifv.b == null) {
                            aifv.b = (ahev)new ahcs((ahcz)aifv.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aifv.a;
            }
            case 4: {
                return new ahcr((ahcz)a());
            }
            case 3: {
                return new aifv();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aifv.a, "\u0001\u0000", null);
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
