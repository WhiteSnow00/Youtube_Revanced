import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akpi extends ahcz implements aheo
{
    public static final akpi a;
    private static volatile ahev e;
    public int b;
    public aknh c;
    public akpk d;
    private byte f;
    
    static {
        ahcz.registerDefaultInstance(akpi.class, a = new akpi());
    }
    
    private akpi() {
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
                final ahev e;
                if ((e = akpi.e) == null) {
                    synchronized (akpi.class) {
                        if (akpi.e == null) {
                            akpi.e = (ahev)new ahcs((ahcz)akpi.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return akpi.a;
            }
            case 4: {
                return new ahcr((ahcz)akpi.a);
            }
            case 3: {
                return new akpi();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)akpi.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001\u1409\u0000\u0002\u1009\u0001", new Object[] { "b", "c", "d" });
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
