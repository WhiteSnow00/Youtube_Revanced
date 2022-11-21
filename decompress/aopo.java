import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aopo extends ahcz implements aheo
{
    public static final aopo a;
    private static volatile ahev j;
    public int b;
    public ajws c;
    public akfj d;
    public aisc e;
    public boolean f;
    public boolean g;
    public ahbt h;
    public ahkc i;
    private ahjl k;
    private byte l;
    
    static {
        ahcz.registerDefaultInstance(aopo.class, a = new aopo());
    }
    
    private aopo() {
        this.l = 2;
        this.h = ahbt.b;
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
                final ahev j;
                if ((j = aopo.j) == null) {
                    synchronized (aopo.class) {
                        if (aopo.j == null) {
                            aopo.j = (ahev)new ahcs((ahcz)aopo.a);
                        }
                    }
                }
                return j;
            }
            case 5: {
                return aopo.a;
            }
            case 4: {
                return new ahcr((ahcz)aopo.a);
            }
            case 3: {
                return new aopo();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aopo.a, "\u0001\b\u0000\u0001\u0001\t\b\u0000\u0000\u0004\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0002\u0005\u1409\u0005\u0006\u100a\u0006\u0007\u1007\u0003\b\u1007\u0004\t\u1009\u0007", new Object[] { "b", "c", "d", "e", "k", "h", "f", "g", "i" });
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
