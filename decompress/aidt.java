import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aidt extends ahcz implements aheo
{
    public static final aidt a;
    private static volatile ahev i;
    public int b;
    public ajws c;
    public boolean d;
    public aisc e;
    public aisc f;
    public aisc g;
    public aisc h;
    private ajws j;
    private byte k;
    
    static {
        ahcz.registerDefaultInstance(aidt.class, a = new aidt());
    }
    
    private aidt() {
        this.k = 2;
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
                final ahev i;
                if ((i = aidt.i) == null) {
                    synchronized (aidt.class) {
                        if (aidt.i == null) {
                            aidt.i = (ahev)new ahcs((ahcz)aidt.a);
                        }
                    }
                }
                return i;
            }
            case 5: {
                return aidt.a;
            }
            case 4: {
                return new ahcr((ahcz)aidt.a);
            }
            case 3: {
                return new aidt();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aidt.a, "\u0001\u0007\u0000\u0001\u0001\t\u0007\u0000\u0000\u0006\u0001\u1409\u0000\u0003\u1007\u0002\u0005\u1409\u0004\u0006\u1409\u0005\u0007\u1409\u0006\b\u1409\u0007\t\u1409\b", new Object[] { "b", "c", "d", "j", "e", "f", "g", "h" });
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
