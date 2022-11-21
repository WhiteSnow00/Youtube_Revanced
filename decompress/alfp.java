import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alfp extends ahcz implements aheo
{
    public static final alfp a;
    private static volatile ahev f;
    public int b;
    public aknj c;
    public aisc d;
    public ahdp e;
    private byte g;
    
    static {
        ahcz.registerDefaultInstance(alfp.class, a = new alfp());
    }
    
    private alfp() {
        this.g = 2;
        this.e = ahcz.emptyProtobufList();
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte g = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev f;
                if ((f = alfp.f) == null) {
                    synchronized (alfp.class) {
                        if (alfp.f == null) {
                            alfp.f = (ahev)new ahcs((ahcz)alfp.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return alfp.a;
            }
            case 4: {
                return new ahcr((ahcz)alfp.a);
            }
            case 3: {
                return new alfp();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)alfp.a, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0001\u0002\u0001\u1409\u0000\u0003\u1409\u0001\u0004\u001b", new Object[] { "b", "c", "d", "e", alfn.class });
            }
            case 1: {
                if (o == null) {
                    g = 0;
                }
                this.g = g;
                return null;
            }
            case 0: {
                return this.g;
            }
        }
    }
}
