import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aksk extends ahcz implements aheo
{
    public static final aksk a;
    private static volatile ahev i;
    public aknj b;
    public anxb c;
    public anxb d;
    public anxb e;
    public ahbt f;
    public boolean g;
    public aisc h;
    private int j;
    private ahjl k;
    private ajxn l;
    private byte m;
    
    static {
        ahcz.registerDefaultInstance(aksk.class, a = new aksk());
    }
    
    private aksk() {
        this.m = 2;
        this.f = ahbt.b;
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
                final ahev i;
                if ((i = aksk.i) == null) {
                    synchronized (aksk.class) {
                        if (aksk.i == null) {
                            aksk.i = (ahev)new ahcs((ahcz)aksk.a);
                        }
                    }
                }
                return i;
            }
            case 5: {
                return aksk.a;
            }
            case 4: {
                return new ahcr((ahcz)aksk.a);
            }
            case 3: {
                return new aksk();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aksk.a, "\u0001\t\u0000\u0001\u0001\u0309\t\u0000\u0000\u0007\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0002\u0004\u1409\u0003\u0005\u1409\u0004\u0006\u100a\u0005\u0007\u1007\u0006\b\u1409\u0007\u0309\u1409\b", new Object[] { "j", "b", "c", "d", "e", "k", "f", "g", "h", "l" });
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
