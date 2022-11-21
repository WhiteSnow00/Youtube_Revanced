import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akej extends ahcz implements aheo
{
    public static final akej a;
    private static volatile ahev h;
    public int b;
    public ajws c;
    public aisc d;
    public anyg e;
    public akek f;
    public ahbt g;
    private ahjl i;
    private byte j;
    
    static {
        ahcz.registerDefaultInstance(akej.class, a = new akej());
    }
    
    private akej() {
        this.j = 2;
        this.g = ahbt.b;
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte j = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev h;
                if ((h = akej.h) == null) {
                    synchronized (akej.class) {
                        if (akej.h == null) {
                            akej.h = (ahev)new ahcs((ahcz)akej.a);
                        }
                    }
                }
                return h;
            }
            case 5: {
                return akej.a;
            }
            case 4: {
                return new ahcr((ahcz)akej.a);
            }
            case 3: {
                return new akej();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)akej.a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0004\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0002\u0004\u1409\u0004\u0005\u100a\u0005\u0006\u1009\u0003", new Object[] { "b", "c", "d", "e", "i", "g", "f" });
            }
            case 1: {
                if (o == null) {
                    j = 0;
                }
                this.j = j;
                return null;
            }
            case 0: {
                return this.j;
            }
        }
    }
}
