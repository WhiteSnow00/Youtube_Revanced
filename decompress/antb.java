import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class antb extends ahcz implements aheo
{
    public static final antb a;
    private static volatile ahev j;
    public int b;
    public aowb c;
    public ajws d;
    public ajws e;
    public aisc f;
    public ajws g;
    public amiy h;
    public ahbt i;
    private ajws k;
    private ahjl l;
    private byte m;
    
    static {
        ahcz.registerDefaultInstance(antb.class, a = new antb());
    }
    
    private antb() {
        this.m = 2;
        this.i = ahbt.b;
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte m = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev j;
                if ((j = antb.j) == null) {
                    synchronized (antb.class) {
                        if (antb.j == null) {
                            antb.j = (ahev)new ahcs((ahcz)antb.a);
                        }
                    }
                }
                return j;
            }
            case 5: {
                return antb.a;
            }
            case 4: {
                return new ahcr((ahcz)antb.a);
            }
            case 3: {
                return new antb();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)antb.a, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0000\b\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0002\u0004\u1409\u0007\u0005\u100a\b\u0006\u1409\u0003\u0007\u1409\u0004\b\u1409\u0005\t\u1409\u0006", new Object[] { "b", "c", "d", "e", "l", "i", "f", "k", "g", "h" });
            }
            case 1: {
                if (o == null) {
                    m = 0;
                }
                this.m = m;
                return null;
            }
            case 0: {
                return this.m;
            }
        }
    }
}
