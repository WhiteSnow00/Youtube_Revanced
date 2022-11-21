import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ansl extends ahcz implements aheo
{
    public static final ansl a;
    private static volatile ahev j;
    public int b;
    public anrs c;
    public anrg d;
    public ahdp e;
    public anxb f;
    public ahof g;
    public ahbt h;
    public String i;
    private ahjl k;
    private anxb l;
    private byte m;
    
    static {
        ahcz.registerDefaultInstance(ansl.class, a = new ansl());
    }
    
    private ansl() {
        this.m = 2;
        this.e = ahcz.emptyProtobufList();
        this.h = ahbt.b;
        this.i = "";
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
                if ((j = ansl.j) == null) {
                    synchronized (ansl.class) {
                        if (ansl.j == null) {
                            ansl.j = (ahev)new ahcs((ahcz)ansl.a);
                        }
                    }
                }
                return j;
            }
            case 5: {
                return ansl.a;
            }
            case 4: {
                return new ahcr((ahcz)ansl.a);
            }
            case 3: {
                return new ansl();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)ansl.a, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0001\u0006\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u001b\u0004\u1409\u0002\u0005\u1409\u0004\u0006\u100a\u0005\u0007\u1409\u0003\b\u1409\u0006\t\u1008\u0007", new Object[] { "b", "c", "d", "e", anrn.class, "f", "k", "h", "g", "l", "i" });
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
