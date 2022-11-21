import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

@Deprecated
public final class aptq extends ahcz implements aheo
{
    public static final aptq a;
    private static volatile ahev h;
    public int b;
    public aowb c;
    public aowb d;
    public aowb e;
    public aisc f;
    public ajws g;
    private ahjl i;
    private byte j;
    
    static {
        ahcz.registerDefaultInstance(aptq.class, a = new aptq());
    }
    
    private aptq() {
        this.j = 2;
        final ahbt b = ahbt.b;
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
                if ((h = aptq.h) == null) {
                    synchronized (aptq.class) {
                        if (aptq.h == null) {
                            aptq.h = (ahev)new ahcs((ahcz)aptq.a);
                        }
                    }
                }
                return h;
            }
            case 5: {
                return aptq.a;
            }
            case 4: {
                return new ahcr((ahcz)aptq.a);
            }
            case 3: {
                return new aptq();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aptq.a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0006\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0002\u0004\u1409\u0003\u0005\u1409\u0004\u0006\u1409\u0005", new Object[] { "b", "c", "d", "e", "f", "g", "i" });
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
