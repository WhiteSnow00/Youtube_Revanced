import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amlq extends ahcz implements aheo
{
    public static final amlq a;
    private static volatile ahev d;
    public int b;
    public aisc c;
    private aiez e;
    private byte f;
    
    static {
        ahcz.registerDefaultInstance(amlq.class, a = new amlq());
    }
    
    private amlq() {
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
                final ahev d;
                if ((d = amlq.d) == null) {
                    synchronized (amlq.class) {
                        if (amlq.d == null) {
                            amlq.d = (ahev)new ahcs((ahcz)amlq.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return amlq.a;
            }
            case 4: {
                return new ahcr((ahcz)amlq.a);
            }
            case 3: {
                return new amlq();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)amlq.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001\u1409\u0000\u0002\u1409\u0001", new Object[] { "b", "e", "c" });
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
