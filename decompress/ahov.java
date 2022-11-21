import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahov extends ahcz implements aheo
{
    public static final ahov a;
    private static volatile ahev e;
    public int b;
    public ahbt c;
    public ahsc d;
    
    static {
        ahcz.registerDefaultInstance(ahov.class, a = new ahov());
    }
    
    private ahov() {
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
                final ahev e;
                if ((e = ahov.e) == null) {
                    synchronized (ahov.class) {
                        if (ahov.e == null) {
                            ahov.e = (ahev)new ahcs((ahcz)ahov.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return ahov.a;
            }
            case 4: {
                return new ahcr((ahcz)ahov.a);
            }
            case 3: {
                return new ahov();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)ahov.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u100a\u0000\u0002\u1009\u0001", new Object[] { "b", "c", "d" });
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
