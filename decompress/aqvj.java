import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqvj extends ahcz implements aheo
{
    public static final aqvj a;
    private static volatile ahev e;
    public int b;
    public aqvl c;
    public aqvl d;
    private byte f;
    
    static {
        ahcz.registerDefaultInstance(aqvj.class, a = new aqvj());
    }
    
    private aqvj() {
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
                if ((e = aqvj.e) == null) {
                    synchronized (aqvj.class) {
                        if (aqvj.e == null) {
                            aqvj.e = (ahev)new ahcs((ahcz)aqvj.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return aqvj.a;
            }
            case 4: {
                return new ahcr((ahcz)aqvj.a);
            }
            case 3: {
                return new aqvj();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aqvj.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001\u1409\u0000\u0002\u1409\u0001", new Object[] { "b", "c", "d" });
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
