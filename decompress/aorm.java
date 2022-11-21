import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aorm extends ahcz implements aheo
{
    public static final aorm a;
    private static volatile ahev j;
    public int b;
    public ajws c;
    public ajws d;
    public ajws e;
    public aisc f;
    public aiet g;
    public aisc h;
    public ahbt i;
    private ahjl k;
    private byte l;
    
    static {
        ahcz.registerDefaultInstance(aorm.class, a = new aorm());
    }
    
    private aorm() {
        this.l = 2;
        this.i = ahbt.b;
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
                if ((j = aorm.j) == null) {
                    synchronized (aorm.class) {
                        if (aorm.j == null) {
                            aorm.j = (ahev)new ahcs((ahcz)aorm.a);
                        }
                    }
                }
                return j;
            }
            case 5: {
                return aorm.a;
            }
            case 4: {
                return new ahcr((ahcz)aorm.a);
            }
            case 3: {
                return new aorm();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aorm.a, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0007\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0002\u0004\u1409\u0003\u0005\u1409\u0004\u0006\u1409\u0005\u0007\u1409\u0006\b\u100a\u0007", new Object[] { "b", "c", "d", "e", "f", "g", "h", "k", "i" });
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
