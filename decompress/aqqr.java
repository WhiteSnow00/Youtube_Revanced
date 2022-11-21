import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqqr extends ahcz implements aheo
{
    public static final aqqr a;
    private static volatile ahev d;
    public String b;
    public aqgy c;
    private int e;
    private byte f;
    
    static {
        ahcz.registerDefaultInstance(aqqr.class, a = new aqqr());
    }
    
    private aqqr() {
        this.f = 2;
        this.b = "";
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
                if ((d = aqqr.d) == null) {
                    synchronized (aqqr.class) {
                        if (aqqr.d == null) {
                            aqqr.d = (ahev)new ahcs((ahcz)aqqr.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aqqr.a;
            }
            case 4: {
                return new ahcr((ahcz)aqqr.a);
            }
            case 3: {
                return new aqqr();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aqqr.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001\u1008\u0000\u0002\u1409\u0001", new Object[] { "e", "b", "c" });
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
