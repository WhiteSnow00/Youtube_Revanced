import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alyx extends ahcz implements aheo
{
    private static final alyx a;
    private static volatile ahev b;
    private ahbt c;
    
    static {
        ahcz.registerDefaultInstance(alyx.class, a = new alyx());
    }
    
    private alyx() {
        this.c = ahbt.b;
    }
    
    public static alyx a() {
        return alyx.a;
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
                if ((b = alyx.b) == null) {
                    synchronized (alyx.class) {
                        if (alyx.b == null) {
                            alyx.b = (ahev)new ahcs((ahcz)alyx.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return alyx.a;
            }
            case 4: {
                return new ahcr((ahcz)a());
            }
            case 3: {
                return new alyx();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)alyx.a, "\u0001\u0000", null);
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
