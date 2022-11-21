import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akfk extends ahcz implements aheo
{
    public static final akfk a;
    private static volatile ahev f;
    public int b;
    public akfj c;
    public ajws d;
    public int e;
    private ahjl g;
    private byte h;
    
    static {
        ahcz.registerDefaultInstance(akfk.class, a = new akfk());
    }
    
    private akfk() {
        this.h = 2;
        final ahbt b = ahbt.b;
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte h = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev f;
                if ((f = akfk.f) == null) {
                    synchronized (akfk.class) {
                        if (akfk.f == null) {
                            akfk.f = (ahev)new ahcs((ahcz)akfk.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return akfk.a;
            }
            case 4: {
                return new ahcr((ahcz)akfk.a);
            }
            case 3: {
                return new akfk();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)akfk.a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0003\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u100b\u0002\u0004\u1409\u0003", new Object[] { "b", "c", "d", "e", "g" });
            }
            case 1: {
                if (o == null) {
                    h = 0;
                }
                this.h = h;
                return null;
            }
            case 0: {
                return this.h;
            }
        }
    }
}
