import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alag extends ahcz implements aheo
{
    public static final alag a;
    private static volatile ahev e;
    public int b;
    public aknh c;
    public String d;
    private byte f;
    
    static {
        ahcz.registerDefaultInstance(alag.class, a = new alag());
    }
    
    private alag() {
        this.f = 2;
        this.d = "";
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
                if ((e = alag.e) == null) {
                    synchronized (alag.class) {
                        if (alag.e == null) {
                            alag.e = (ahev)new ahcs((ahcz)alag.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return alag.a;
            }
            case 4: {
                return new ahcr((ahcz)alag.a);
            }
            case 3: {
                return new alag();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)alag.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001\u1409\u0000\u0002\u1008\u0001", new Object[] { "b", "c", "d" });
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
