import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akqe extends ahcz implements aheo
{
    public static final akqe a;
    private static volatile ahev j;
    public int b;
    public int c;
    public Object d;
    public ahbt e;
    public ajws f;
    public aowb g;
    public ajws h;
    public ajws i;
    private ahjl k;
    private ajws l;
    private byte m;
    
    static {
        ahcz.registerDefaultInstance(akqe.class, a = new akqe());
    }
    
    private akqe() {
        this.c = 0;
        this.m = 2;
        this.e = ahbt.b;
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
                if ((j = akqe.j) == null) {
                    synchronized (akqe.class) {
                        if (akqe.j == null) {
                            akqe.j = (ahev)new ahcs((ahcz)akqe.a);
                        }
                    }
                }
                return j;
            }
            case 5: {
                return akqe.a;
            }
            case 4: {
                return new ahcr((ahcz)akqe.a);
            }
            case 3: {
                return new akqe();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)akqe.a, "\u0001\t\u0001\u0001\u0001\t\t\u0000\u0000\u0007\u0001\u1409\u0000\u0002\u100a\u0001\u0003\u1409\u0002\u0004\u1409\u0003\u0005\u1409\u0004\u0006\u1409\u0005\u0007\u1409\u0006\b\u143c\u0000\t\u103b\u0000", new Object[] { "d", "c", "b", "k", "e", "f", "g", "h", "i", "l", aisc.class });
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
