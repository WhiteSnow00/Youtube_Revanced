import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aojp extends ahcz implements aheo
{
    public static final aojp a;
    private static volatile ahev e;
    public int b;
    public aojo c;
    public aisc d;
    private byte f;
    
    static {
        ahcz.registerDefaultInstance(aojp.class, a = new aojp());
    }
    
    private aojp() {
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
                if ((e = aojp.e) == null) {
                    synchronized (aojp.class) {
                        if (aojp.e == null) {
                            aojp.e = (ahev)new ahcs((ahcz)aojp.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return aojp.a;
            }
            case 4: {
                return new ahcr((ahcz)aojp.a);
            }
            case 3: {
                return new aojp();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aojp.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001\u1009\u0001\u0002\u1409\u0002", new Object[] { "b", "c", "d" });
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
