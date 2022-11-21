import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akyd extends ahcz implements aheo
{
    public static final akyd a;
    private static volatile ahev j;
    public int b;
    public aknj c;
    public akyz d;
    public aisc e;
    public long f;
    public akyr g;
    public ahbt h;
    public ahdp i;
    private byte k;
    
    static {
        ahcz.registerDefaultInstance(akyd.class, a = new akyd());
    }
    
    private akyd() {
        this.k = 2;
        this.h = ahbt.b;
        this.i = ahcz.emptyProtobufList();
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte k = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev j;
                if ((j = akyd.j) == null) {
                    synchronized (akyd.class) {
                        if (akyd.j == null) {
                            akyd.j = (ahev)new ahcs((ahcz)akyd.a);
                        }
                    }
                }
                return j;
            }
            case 5: {
                return akyd.a;
            }
            case 4: {
                return new ahcr((ahcz)akyd.a);
            }
            case 3: {
                return new akyd();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)akyd.a, "\u0001\u0007\u0000\u0001\u0001\u000b\u0007\u0000\u0001\u0004\u0001\u1409\u0000\u0002\u1409\u0001\u0006\u1409\u0004\u0007\u1002\u0005\b\u1009\u0006\n\u100a\b\u000b\u041b", new Object[] { "b", "c", "d", "e", "f", "g", "h", "i", ajdo.class });
            }
            case 1: {
                if (o == null) {
                    k = 0;
                }
                this.k = k;
                return null;
            }
            case 0: {
                return this.k;
            }
        }
    }
}
