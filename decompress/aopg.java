import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aopg extends ahcz implements aheo
{
    public static final aopg a;
    private static volatile ahev j;
    public int b;
    public ahdp c;
    public int d;
    public int e;
    public ahdp f;
    public akdr g;
    public int h;
    public ahbt i;
    private aisc k;
    private ahjl l;
    private ajws m;
    private byte n;
    
    static {
        ahcz.registerDefaultInstance(aopg.class, a = new aopg());
    }
    
    private aopg() {
        this.n = 2;
        this.c = ahcz.emptyProtobufList();
        this.f = ahcz.emptyProtobufList();
        this.i = ahbt.b;
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte n = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev j;
                if ((j = aopg.j) == null) {
                    synchronized (aopg.class) {
                        if (aopg.j == null) {
                            aopg.j = (ahev)new ahcs((ahcz)aopg.a);
                        }
                    }
                }
                return j;
            }
            case 5: {
                return aopg.a;
            }
            case 4: {
                return new ahcr((ahcz)aopg.a);
            }
            case 3: {
                return new aopg();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aopg.a, "\u0001\n\u0000\u0001\u0001\u000e\n\u0000\u0002\u0005\u0001\u041b\u0002\u1004\u0000\u0004\u1409\u0004\u0005\u1409\u0006\u0006\u100a\u0007\u0007\u1004\u0001\b\u100c\u0005\t\u001a\n\u1409\u0003\u000e\u1409\u000b", new Object[] { "b", "c", aoph.class, "d", "g", "l", "i", "e", "h", amsb.p, "f", "k", "m" });
            }
            case 1: {
                if (o == null) {
                    n = 0;
                }
                this.n = n;
                return null;
            }
            case 0: {
                return this.n;
            }
        }
    }
}
