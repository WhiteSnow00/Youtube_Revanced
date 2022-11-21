import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aksm extends ahcz implements aheo
{
    public static final aksm a;
    private static volatile ahev e;
    public int b;
    public aknj c;
    public anxb d;
    private byte f;
    
    static {
        ahcz.registerDefaultInstance(aksm.class, a = new aksm());
    }
    
    private aksm() {
        this.f = 2;
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte f = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev e;
                if ((e = aksm.e) == null) {
                    synchronized (aksm.class) {
                        if (aksm.e == null) {
                            aksm.e = (ahev)new ahcs((ahcz)aksm.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return aksm.a;
            }
            case 4: {
                return new ahcr((ahcz)aksm.a);
            }
            case 3: {
                return new aksm();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aksm.a, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0002\u0001\u1409\u0000\u0003\u1409\u0001", new Object[] { "b", "c", "d" });
            }
            case 1: {
                if (o == null) {
                    f = 0;
                }
                this.f = f;
                return null;
            }
            case 0: {
                return this.f;
            }
        }
    }
}
