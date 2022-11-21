import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

@Deprecated
public final class apty extends ahcz implements aheo
{
    public static final apty a;
    private static volatile ahev h;
    public int b;
    public aowb c;
    public ajws d;
    public ajws e;
    public ajws f;
    public aisc g;
    private ahjl i;
    private byte j;
    
    static {
        ahcz.registerDefaultInstance(apty.class, a = new apty());
    }
    
    private apty() {
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
                if ((h = apty.h) == null) {
                    synchronized (apty.class) {
                        if (apty.h == null) {
                            apty.h = (ahev)new ahcs((ahcz)apty.a);
                        }
                    }
                }
                return h;
            }
            case 5: {
                return apty.a;
            }
            case 4: {
                return new ahcr((ahcz)apty.a);
            }
            case 3: {
                return new apty();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)apty.a, "\u0001\u0006\u0000\u0001\u0002\b\u0006\u0000\u0000\u0006\u0002\u1409\u0001\u0003\u1409\u0002\u0004\u1409\u0003\u0005\u1409\u0005\u0006\u1409\u0006\b\u1409\u0004", new Object[] { "b", "c", "d", "e", "g", "i", "f" });
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
