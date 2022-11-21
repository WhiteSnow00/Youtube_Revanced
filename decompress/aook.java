import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aook extends ahcz implements aheo
{
    public static final aook a;
    private static volatile ahev d;
    public int b;
    public ajws c;
    private ahjl e;
    private byte f;
    
    static {
        ahcz.registerDefaultInstance(aook.class, a = new aook());
    }
    
    private aook() {
        this.f = 2;
        emptyProtobufList();
        final ahbt b = ahbt.b;
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
                if ((d = aook.d) == null) {
                    synchronized (aook.class) {
                        if (aook.d == null) {
                            aook.d = (ahev)new ahcs((ahcz)aook.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aook.a;
            }
            case 4: {
                return new ahcr((ahcz)aook.a);
            }
            case 3: {
                return new aook();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aook.a, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0002\u0001\u1409\u0000\u0003\u1409\u0001", new Object[] { "b", "c", "e" });
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
