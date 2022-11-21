import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ansd extends ahcz implements aheo
{
    public static final ansd a;
    private static volatile ahev i;
    public int b;
    public anrs c;
    public ahdp d;
    public anxb e;
    public ahof f;
    public ahbt g;
    public String h;
    private ahjl j;
    private anxb k;
    private byte l;
    
    static {
        ahcz.registerDefaultInstance(ansd.class, a = new ansd());
    }
    
    private ansd() {
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
                if ((i = ansd.i) == null) {
                    synchronized (ansd.class) {
                        if (ansd.i == null) {
                            ansd.i = (ahev)new ahcs((ahcz)ansd.a);
                        }
                    }
                }
                return i;
            }
            case 5: {
                return ansd.a;
            }
            case 4: {
                return new ahcr((ahcz)ansd.a);
            }
            case 3: {
                return new ansd();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)ansd.a, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0001\u0005\u0001\u1409\u0000\u0002\u001b\u0003\u1409\u0001\u0004\u1409\u0003\u0005\u100a\u0004\u0006\u1409\u0002\u0007\u1409\u0005\b\u1008\u0006", new Object[] { "b", "c", "d", anro.class, "e", "j", "g", "f", "k", "h" });
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
