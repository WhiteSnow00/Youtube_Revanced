import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akxc extends ahcz implements aheo
{
    public static final akxc a;
    private static volatile ahev j;
    public int b;
    public aknj c;
    public ahdp d;
    public aiet e;
    public akww f;
    public String g;
    public long h;
    public ahbt i;
    private ahjl k;
    private ajxn l;
    private byte m;
    
    static {
        ahcz.registerDefaultInstance(akxc.class, a = new akxc());
    }
    
    private akxc() {
        this.m = 2;
        this.d = ahcz.emptyProtobufList();
        this.g = "";
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
                if ((j = akxc.j) == null) {
                    synchronized (akxc.class) {
                        if (akxc.j == null) {
                            akxc.j = (ahev)new ahcs((ahcz)akxc.a);
                        }
                    }
                }
                return j;
            }
            case 5: {
                return akxc.a;
            }
            case 4: {
                return new ahcr((ahcz)akxc.a);
            }
            case 3: {
                return new akxc();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)akxc.a, "\u0001\t\u0000\u0001\u0001\u0309\t\u0000\u0001\u0006\u0001\u1409\u0000\u0003\u041b\u0004\u1409\u0001\u0006\u1008\u0004\u0007\u1409\u0002\t\u1002\u0005\n\u1409\u0006\u000b\u100a\u0007\u0309\u1409\b", new Object[] { "b", "c", "d", aisc.class, "e", "g", "f", "h", "k", "i", "l" });
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
