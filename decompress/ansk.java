import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ansk extends ahcz implements aheo
{
    public static final ansk a;
    private static volatile ahev i;
    public int b;
    public ansj c;
    public ahdp d;
    public anxb e;
    public ahof f;
    public ahbt g;
    public String h;
    private ahjl j;
    private byte k;
    
    static {
        ahcz.registerDefaultInstance(ansk.class, a = new ansk());
    }
    
    private ansk() {
        this.k = 2;
        this.d = ahcz.emptyProtobufList();
        this.g = ahbt.b;
        this.h = "";
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte k = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev i;
                if ((i = ansk.i) == null) {
                    synchronized (ansk.class) {
                        if (ansk.i == null) {
                            ansk.i = (ahev)new ahcs((ahcz)ansk.a);
                        }
                    }
                }
                return i;
            }
            case 5: {
                return ansk.a;
            }
            case 4: {
                return new ahcr((ahcz)ansk.a);
            }
            case 3: {
                return new ansk();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)ansk.a, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0001\u0004\u0001\u1409\u0000\u0002\u001b\u0003\u1409\u0001\u0004\u1409\u0003\u0005\u100a\u0004\u0006\u1409\u0002\u0007\u1008\u0005", new Object[] { "b", "c", "d", anro.class, "e", "j", "g", "f", "h" });
            }
            case 1: {
                if (o == null) {
                    k = 0;
                }
                this.k = k;
                return null;
            }
            case 0: {
                return this.k;
            }
        }
    }
}
