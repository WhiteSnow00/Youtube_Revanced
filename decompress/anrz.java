import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class anrz extends ahcz implements aheo
{
    public static final anrz a;
    private static volatile ahev j;
    public int b;
    public anrt c;
    public anrg d;
    public ahdp e;
    public anxb f;
    public ahof g;
    public String h;
    public ahbt i;
    private ahjl k;
    private anxb l;
    private byte m;
    
    static {
        ahcz.registerDefaultInstance(anrz.class, a = new anrz());
    }
    
    private anrz() {
        this.m = 2;
        this.e = ahcz.emptyProtobufList();
        this.h = "";
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
                if ((j = anrz.j) == null) {
                    synchronized (anrz.class) {
                        if (anrz.j == null) {
                            anrz.j = (ahev)new ahcs((ahcz)anrz.a);
                        }
                    }
                }
                return j;
            }
            case 5: {
                return anrz.a;
            }
            case 4: {
                return new ahcr((ahcz)anrz.a);
            }
            case 3: {
                return new anrz();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)anrz.a, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0001\u0006\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u001b\u0004\u1409\u0002\u0005\u1409\u0005\u0006\u100a\u0006\u0007\u1409\u0003\b\u1409\u0007\t\u1008\u0004", new Object[] { "b", "c", "d", "e", anrn.class, "f", "k", "i", "g", "l", "h" });
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
