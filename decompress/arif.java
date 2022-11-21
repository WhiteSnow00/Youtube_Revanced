import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class arif extends ahcz implements aheo
{
    public static final arif a;
    private static volatile ahev d;
    public int b;
    public ahbt c;
    
    static {
        ahcz.registerDefaultInstance(arif.class, a = new arif());
    }
    
    private arif() {
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
                if ((d = arif.d) == null) {
                    synchronized (arif.class) {
                        if (arif.d == null) {
                            arif.d = (ahev)new ahcs((ahcz)arif.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return arif.a;
            }
            case 4: {
                return new ahcr((ahcz)arif.a);
            }
            case 3: {
                return new arif();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)arif.a, "\u0001\u0001\u0000\u0001\u0004\u0004\u0001\u0000\u0000\u0000\u0004\u100a\u0003", new Object[] { "b", "c" });
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
