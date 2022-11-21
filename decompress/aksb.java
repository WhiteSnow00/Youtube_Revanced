import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aksb extends ahcz implements aheo
{
    public static final aksb a;
    private static volatile ahev e;
    public int b;
    public aknh c;
    public ahbt d;
    private byte f;
    
    static {
        ahcz.registerDefaultInstance(aksb.class, a = new aksb());
    }
    
    private aksb() {
        this.f = 2;
        this.d = ahbt.b;
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
                if ((e = aksb.e) == null) {
                    synchronized (aksb.class) {
                        if (aksb.e == null) {
                            aksb.e = (ahev)new ahcs((ahcz)aksb.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return aksb.a;
            }
            case 4: {
                return new ahcr((ahcz)aksb.a);
            }
            case 3: {
                return new aksb();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aksb.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001\u1409\u0000\u0002\u100a\u0001", new Object[] { "b", "c", "d" });
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
