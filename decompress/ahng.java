import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahng extends ahcz implements aheo
{
    public static final ahng a;
    private static volatile ahev e;
    public int b;
    public ahbt c;
    public ahrs d;
    
    static {
        ahcz.registerDefaultInstance(ahng.class, a = new ahng());
    }
    
    private ahng() {
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
                if ((e = ahng.e) == null) {
                    synchronized (ahng.class) {
                        if (ahng.e == null) {
                            ahng.e = (ahev)new ahcs((ahcz)ahng.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return ahng.a;
            }
            case 4: {
                return new ahcr((ahcz)ahng.a);
            }
            case 3: {
                return new ahng();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)ahng.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u100a\u0000\u0002\u1009\u0001", new Object[] { "b", "c", "d" });
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
