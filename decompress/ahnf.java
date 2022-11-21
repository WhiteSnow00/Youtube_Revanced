import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahnf extends ahcz implements aheo
{
    public static final ahnf a;
    private static volatile ahev j;
    public int b;
    public aowb c;
    public aowb d;
    public ajws e;
    public ajws f;
    public ajws g;
    public aisc h;
    public ahbt i;
    private ahjl k;
    private byte l;
    
    static {
        ahcz.registerDefaultInstance(ahnf.class, a = new ahnf());
    }
    
    private ahnf() {
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
                if ((j = ahnf.j) == null) {
                    synchronized (ahnf.class) {
                        if (ahnf.j == null) {
                            ahnf.j = (ahev)new ahcs((ahcz)ahnf.a);
                        }
                    }
                }
                return j;
            }
            case 5: {
                return ahnf.a;
            }
            case 4: {
                return new ahcr((ahcz)ahnf.a);
            }
            case 3: {
                return new ahnf();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)ahnf.a, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0007\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0002\u0004\u1409\u0003\u0005\u1409\u0004\u0006\u1409\u0005\u0007\u1409\u0006\b\u100a\u0007", new Object[] { "b", "c", "d", "e", "f", "g", "h", "k", "i" });
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
