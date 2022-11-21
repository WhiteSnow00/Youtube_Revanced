import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akqb extends ahcz implements aheo
{
    public static final akqb a;
    private static volatile ahev g;
    public int b;
    public ahbt c;
    public ajws d;
    public ahdp e;
    public int f;
    private ahjl h;
    private aiet i;
    private aiet j;
    private aisc k;
    private aiet l;
    private byte m;
    
    static {
        ahcz.registerDefaultInstance(akqb.class, a = new akqb());
    }
    
    private akqb() {
        this.m = 2;
        this.c = ahbt.b;
        this.e = ahcz.emptyProtobufList();
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
                final ahev g;
                if ((g = akqb.g) == null) {
                    synchronized (akqb.class) {
                        if (akqb.g == null) {
                            akqb.g = (ahev)new ahcs((ahcz)akqb.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return akqb.a;
            }
            case 4: {
                return new ahcr((ahcz)akqb.a);
            }
            case 3: {
                return new akqb();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)akqb.a, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0001\u0007\u0001\u1409\u0000\u0002\u100a\u0001\u0003\u1409\u0002\u0004\u041b\u0005\u1409\u0003\u0006\u1409\u0004\u0007\u1409\u0005\b\u1409\u0006\t\u100c\u0007", new Object[] { "b", "h", "c", "d", "e", akqc.class, "i", "j", "k", "l", "f", ajgj.d });
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
