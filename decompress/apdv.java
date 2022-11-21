import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apdv extends ahcz implements aheo
{
    public static final apdv a;
    private static volatile ahev b;
    private int c;
    private ajws d;
    private ajws e;
    private ajws f;
    private aisc g;
    private aisc h;
    private apdu i;
    private ahjl j;
    private byte k;
    
    static {
        ahcz.registerDefaultInstance(apdv.class, a = new apdv());
    }
    
    private apdv() {
        this.k = 2;
        final ahbt b = ahbt.b;
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte k = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev b;
                if ((b = apdv.b) == null) {
                    synchronized (apdv.class) {
                        if (apdv.b == null) {
                            apdv.b = (ahev)new ahcs((ahcz)apdv.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return apdv.a;
            }
            case 4: {
                return new ahcr((ahcz)apdv.a);
            }
            case 3: {
                return new apdv();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)apdv.a, "\u0001\u0007\u0000\u0001\u0001\b\u0007\u0000\u0000\u0007\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0002\u0004\u1409\u0003\u0005\u1409\u0004\u0006\u1409\u0006\b\u1409\u0005", new Object[] { "c", "d", "e", "f", "g", "h", "j", "i" });
            }
            case 1: {
                if (o == null) {
                    k = 0;
                }
                this.k = k;
                return null;
            }
            case 0: {
                return this.k;
            }
        }
    }
}
