import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahod extends ahcz implements aheo
{
    public static final ahod a;
    private static volatile ahev h;
    public int b;
    public ahoe c;
    public ahoc d;
    public ahna e;
    public ahpb f;
    public ahbt g;
    private ahpb i;
    private ahjl j;
    private ahoi k;
    private byte l;
    
    static {
        ahcz.registerDefaultInstance(ahod.class, a = new ahod());
    }
    
    private ahod() {
        this.l = 2;
        this.g = ahbt.b;
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte l = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev h;
                if ((h = ahod.h) == null) {
                    synchronized (ahod.class) {
                        if (ahod.h == null) {
                            ahod.h = (ahev)new ahcs((ahcz)ahod.a);
                        }
                    }
                }
                return h;
            }
            case 5: {
                return ahod.a;
            }
            case 4: {
                return new ahcr((ahcz)ahod.a);
            }
            case 3: {
                return new ahod();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)ahod.a, "\u0001\b\u0000\u0001\u0001\n\b\u0000\u0000\u0006\u0001\u1009\u0000\u0002\u1409\u0001\u0003\u1409\u0003\u0005\u1409\u0007\u0006\u100a\b\u0007\u1409\u0002\b\u1409\u0004\n\u1409\t", new Object[] { "b", "c", "i", "e", "j", "g", "d", "f", "k" });
            }
            case 1: {
                if (o == null) {
                    l = 0;
                }
                this.l = l;
                return null;
            }
            case 0: {
                return this.l;
            }
        }
    }
}
