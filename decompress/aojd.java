import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aojd extends ahcz implements aheo
{
    public static final aojd a;
    private static volatile ahev c;
    public anxb b;
    private int d;
    private anxb e;
    private byte f;
    
    static {
        ahcz.registerDefaultInstance(aojd.class, a = new aojd());
    }
    
    private aojd() {
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
                final ahev c;
                if ((c = aojd.c) == null) {
                    synchronized (aojd.class) {
                        if (aojd.c == null) {
                            aojd.c = (ahev)new ahcs((ahcz)aojd.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return aojd.a;
            }
            case 4: {
                return new ahcr((ahcz)aojd.a);
            }
            case 3: {
                return new aojd();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aojd.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001\u1409\u0000\u0002\u1409\u0001", new Object[] { "d", "e", "b" });
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
