import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ammp extends ahcz implements aheo
{
    public static final ammp a;
    private static volatile ahev g;
    public int b;
    public ahbt c;
    public ahdp d;
    public boolean e;
    public ajfu f;
    private ajws h;
    private ahjl i;
    private aisc j;
    private anxb k;
    private byte l;
    
    static {
        ahcz.registerDefaultInstance(ammp.class, a = new ammp());
    }
    
    private ammp() {
        this.l = 2;
        this.c = ahbt.b;
        this.d = ahcz.emptyProtobufList();
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
                final ahev g;
                if ((g = ammp.g) == null) {
                    synchronized (ammp.class) {
                        if (ammp.g == null) {
                            ammp.g = (ahev)new ahcs((ahcz)ammp.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return ammp.a;
            }
            case 4: {
                return new ahcr((ahcz)ammp.a);
            }
            case 3: {
                return new ammp();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)ammp.a, "\u0001\b\u0000\u0001\u0001\t\b\u0000\u0001\u0006\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u100a\u0002\u0004\u041b\u0006\u1007\u0005\u0007\u1409\u0003\b\u1409\u0007\t\u1409\u0006", new Object[] { "b", "h", "i", "c", "d", ammo.class, "e", "j", "k", "f" });
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
