import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alxo extends ahcz implements aheo
{
    public static final alxo a;
    public static final ahcx b;
    private static volatile ahev d;
    public akpu c;
    private int e;
    private byte f;
    
    static {
        final alxo a2 = new alxo();
        ahcz.registerDefaultInstance(alxo.class, a = a2);
        b = ahcz.newSingularGeneratedExtension((MessageLite)aqiv.a, a2, (MessageLite)a2, null, 356511053, ahgc.k, alxo.class);
    }
    
    private alxo() {
        this.f = 2;
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte f = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev d;
                if ((d = alxo.d) == null) {
                    synchronized (alxo.class) {
                        if (alxo.d == null) {
                            alxo.d = (ahev)new ahcs((ahcz)alxo.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return alxo.a;
            }
            case 4: {
                return new ahcr((ahcz)alxo.a);
            }
            case 3: {
                return new alxo();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)alxo.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u1409\u0000", new Object[] { "e", "c" });
            }
            case 1: {
                if (o == null) {
                    f = 0;
                }
                this.f = f;
                return null;
            }
            case 0: {
                return this.f;
            }
        }
    }
}
