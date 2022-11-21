import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aemu extends ahcz implements aheo
{
    public static final aemu a;
    private static volatile ahev e;
    public int b;
    public int c;
    public ahej d;
    private byte f;
    
    static {
        ahcz.registerDefaultInstance(aemu.class, a = new aemu());
    }
    
    private aemu() {
        this.d = ahej.a;
        this.f = 2;
        this.c = 1;
    }
    
    public final ahej a() {
        final ahej d = this.d;
        if (!d.b) {
            this.d = d.a();
        }
        return this.d;
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
                if ((e = aemu.e) == null) {
                    synchronized (aemu.class) {
                        if (aemu.e == null) {
                            aemu.e = (ahev)new ahcs((ahcz)aemu.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return aemu.a;
            }
            case 4: {
                return new ahcr((ahcz)aemu.a);
            }
            case 3: {
                return new aemu();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aemu.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0001\u0000\u0001\u0001\u1004\u0000\u0002\u0432", new Object[] { "b", "c", "d", aemt.a });
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
