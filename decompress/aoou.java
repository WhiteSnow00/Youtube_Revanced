import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aoou extends ahcz implements aheo
{
    public static final aoou a;
    private static volatile ahev d;
    public int b;
    public anam c;
    private ajhc e;
    private byte f;
    
    static {
        ahcz.registerDefaultInstance(aoou.class, a = new aoou());
    }
    
    private aoou() {
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
                if ((d = aoou.d) == null) {
                    synchronized (aoou.class) {
                        if (aoou.d == null) {
                            aoou.d = (ahev)new ahcs((ahcz)aoou.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aoou.a;
            }
            case 4: {
                return new ahcr((ahcz)aoou.a);
            }
            case 3: {
                return new aoou();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aoou.a, "\u0001\u0002\u0000\u0001\ufc43\u196f\ue81b\u1df7\u0002\u0000\u0000\u0002\ufc43\u196f\u1409\u0001\ue81b\u1df7\u1409\u0000", new Object[] { "b", "e", "c" });
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
