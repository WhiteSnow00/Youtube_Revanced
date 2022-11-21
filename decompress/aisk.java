import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aisk extends ahcz implements aheo
{
    public static final aisk a;
    private static volatile ahev f;
    public int b;
    public akfj c;
    public aisl d;
    public ajws e;
    private aisc g;
    private boolean h;
    private byte i;
    
    static {
        ahcz.registerDefaultInstance(aisk.class, a = new aisk());
    }
    
    private aisk() {
        this.i = 2;
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte i = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev f;
                if ((f = aisk.f) == null) {
                    synchronized (aisk.class) {
                        if (aisk.f == null) {
                            aisk.f = (ahev)new ahcs((ahcz)aisk.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return aisk.a;
            }
            case 4: {
                return new ahcr((ahcz)aisk.a);
            }
            case 3: {
                return new aisk();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aisk.a, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0003\u0001\u1409\u0000\u0002\u1009\u0002\u0003\u1409\u0003\u0004\u1409\u0004\u0006\u1007\u0005", new Object[] { "b", "c", "d", "e", "g", "h" });
            }
            case 1: {
                if (o == null) {
                    i = 0;
                }
                this.i = i;
                return null;
            }
            case 0: {
                return this.i;
            }
        }
    }
}
