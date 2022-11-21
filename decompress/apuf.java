import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

@Deprecated
public final class apuf extends ahcz implements aheo
{
    public static final apuf a;
    private static volatile ahev d;
    public int b;
    public aptw c;
    private ahjl e;
    private byte f;
    
    static {
        ahcz.registerDefaultInstance(apuf.class, a = new apuf());
    }
    
    private apuf() {
        this.f = 2;
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
                if ((d = apuf.d) == null) {
                    synchronized (apuf.class) {
                        if (apuf.d == null) {
                            apuf.d = (ahev)new ahcs((ahcz)apuf.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return apuf.a;
            }
            case 4: {
                return new ahcr((ahcz)apuf.a);
            }
            case 3: {
                return new apuf();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)apuf.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001\u1409\u0000\u0002\u1409\u0001", new Object[] { "b", "c", "e" });
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
