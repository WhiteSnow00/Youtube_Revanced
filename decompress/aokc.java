import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aokc extends ahcz implements aheo
{
    public static final aokc a;
    private static volatile ahev g;
    public int b;
    public aokd c;
    public ahpb d;
    public ahbt e;
    public aozs f;
    private ahjl h;
    private ahoi i;
    private byte j;
    
    static {
        ahcz.registerDefaultInstance(aokc.class, a = new aokc());
    }
    
    private aokc() {
        this.j = 2;
        this.e = ahbt.b;
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte j = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev g;
                if ((g = aokc.g) == null) {
                    synchronized (aokc.class) {
                        if (aokc.g == null) {
                            aokc.g = (ahev)new ahcs((ahcz)aokc.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return aokc.a;
            }
            case 4: {
                return new ahcr((ahcz)aokc.a);
            }
            case 3: {
                return new aokc();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aokc.a, "\u0001\u0006\u0000\u0001\u0001\t\u0006\u0000\u0000\u0003\u0001\u1009\u0000\u0002\u1409\u0001\u0005\u1409\u0002\u0006\u100a\u0003\b\u1009\u0004\t\u1409\u0005", new Object[] { "b", "c", "d", "h", "e", "f", "i" });
            }
            case 1: {
                if (o == null) {
                    j = 0;
                }
                this.j = j;
                return null;
            }
            case 0: {
                return this.j;
            }
        }
    }
}
