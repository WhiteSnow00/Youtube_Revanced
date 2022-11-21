import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amil extends ahcz implements aheo
{
    public static final amil a;
    public static final ahcx b;
    private static volatile ahev d;
    public String c;
    private int e;
    
    static {
        final amil a2 = new amil();
        ahcz.registerDefaultInstance(amil.class, a = a2);
        b = ahcz.newSingularGeneratedExtension((MessageLite)ajoo.a, a2, (MessageLite)a2, null, 396644439, ahgc.k, amil.class);
    }
    
    private amil() {
        this.c = "";
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
                if ((d = amil.d) == null) {
                    synchronized (amil.class) {
                        if (amil.d == null) {
                            amil.d = (ahev)new ahcs((ahcz)amil.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return amil.a;
            }
            case 4: {
                return new ahcr((ahcz)amil.a);
            }
            case 3: {
                return new amil();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)amil.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1008\u0000", new Object[] { "e", "c" });
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
