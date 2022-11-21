import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akds extends ahcz implements aheo
{
    public static final akds a;
    private static volatile ahev j;
    public int b;
    public int c;
    public Object d;
    public akfj e;
    public ajws f;
    public albi g;
    public aoad h;
    public ahbt i;
    private aisc k;
    private ahjl l;
    private byte m;
    
    static {
        ahcz.registerDefaultInstance(akds.class, a = new akds());
    }
    
    private akds() {
        this.c = 0;
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
                if ((j = akds.j) == null) {
                    synchronized (akds.class) {
                        if (akds.j == null) {
                            akds.j = (ahev)new ahcs((ahcz)akds.a);
                        }
                    }
                }
                return j;
            }
            case 5: {
                return akds.a;
            }
            case 4: {
                return new ahcr((ahcz)akds.a);
            }
            case 3: {
                return new akds();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)akds.a, "\u0001\t\u0001\u0001\u0001\t\t\u0000\u0000\u0007\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0002\u0004\u1409\u0005\u0005\u100a\b\u0006\u143c\u0000\u0007\u143c\u0000\b\u1009\u0006\t\u1409\u0007", new Object[] { "d", "c", "b", "e", "f", "k", "l", "i", aiet.class, aisc.class, "g", "h" });
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
