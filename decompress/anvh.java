import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class anvh extends ahcz implements aheo
{
    public static final anvh a;
    private static volatile ahev e;
    public int b;
    public ajws c;
    public boolean d;
    private ahjl f;
    private byte g;
    
    static {
        ahcz.registerDefaultInstance(anvh.class, a = new anvh());
    }
    
    private anvh() {
        this.g = 2;
        final ahbt b = ahbt.b;
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte g = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev e;
                if ((e = anvh.e) == null) {
                    synchronized (anvh.class) {
                        if (anvh.e == null) {
                            anvh.e = (ahev)new ahcs((ahcz)anvh.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return anvh.a;
            }
            case 4: {
                return new ahcr((ahcz)anvh.a);
            }
            case 3: {
                return new anvh();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)anvh.a, "\u0001\u0003\u0000\u0001\u0002\u0005\u0003\u0000\u0000\u0002\u0002\u1007\u0001\u0004\u1409\u0003\u0005\u1409\u0000", new Object[] { "b", "d", "f", "c" });
            }
            case 1: {
                if (o == null) {
                    g = 0;
                }
                this.g = g;
                return null;
            }
            case 0: {
                return this.g;
            }
        }
    }
}
