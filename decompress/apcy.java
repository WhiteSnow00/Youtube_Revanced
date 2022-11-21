import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apcy extends ahcz implements aheo
{
    public static final apcy a;
    private static volatile ahev d;
    public ajws b;
    public ajws c;
    private int e;
    private ahjl f;
    private byte g;
    
    static {
        ahcz.registerDefaultInstance(apcy.class, a = new apcy());
    }
    
    private apcy() {
        this.g = 2;
        final ahbt b = ahbt.b;
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte g = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev d;
                if ((d = apcy.d) == null) {
                    synchronized (apcy.class) {
                        if (apcy.d == null) {
                            apcy.d = (ahev)new ahcs((ahcz)apcy.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return apcy.a;
            }
            case 4: {
                return new ahcr((ahcz)apcy.a);
            }
            case 3: {
                return new apcy();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)apcy.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0003\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0002", new Object[] { "e", "b", "c", "f" });
            }
            case 1: {
                if (o == null) {
                    g = 0;
                }
                this.g = g;
                return null;
            }
            case 0: {
                return this.g;
            }
        }
    }
}
