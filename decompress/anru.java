import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class anru extends ahcz implements aheo
{
    public static final anru a;
    private static volatile ahev i;
    public int b;
    public anrt c;
    public ahdp d;
    public anxb e;
    public ahof f;
    public ahbt g;
    public String h;
    private ahjl j;
    private anxb k;
    private byte l;
    
    static {
        ahcz.registerDefaultInstance(anru.class, a = new anru());
    }
    
    private anru() {
        this.l = 2;
        this.d = ahcz.emptyProtobufList();
        this.g = ahbt.b;
        this.h = "";
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
                final ahev i;
                if ((i = anru.i) == null) {
                    synchronized (anru.class) {
                        if (anru.i == null) {
                            anru.i = (ahev)new ahcs((ahcz)anru.a);
                        }
                    }
                }
                return i;
            }
            case 5: {
                return anru.a;
            }
            case 4: {
                return new ahcr((ahcz)anru.a);
            }
            case 3: {
                return new anru();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)anru.a, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0001\u0005\u0001\u1409\u0000\u0002\u001b\u0003\u1409\u0001\u0004\u1409\u0002\u0005\u1409\u0003\u0006\u100a\u0004\u0007\u1409\u0005\b\u1008\u0006", new Object[] { "b", "c", "d", anro.class, "e", "f", "j", "g", "k", "h" });
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
