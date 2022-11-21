import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqan extends ahcz implements aheo
{
    public static final aqan a;
    private static volatile ahev b;
    private int c;
    private ajws d;
    private ajws e;
    private aiet f;
    private aiet g;
    private aisc h;
    private ahjl i;
    private byte j;
    
    static {
        ahcz.registerDefaultInstance(aqan.class, a = new aqan());
    }
    
    private aqan() {
        this.j = 2;
        final ahbt b = ahbt.b;
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte j = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev b;
                if ((b = aqan.b) == null) {
                    synchronized (aqan.class) {
                        if (aqan.b == null) {
                            aqan.b = (ahev)new ahcs((ahcz)aqan.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aqan.a;
            }
            case 4: {
                return new ahcr((ahcz)aqan.a);
            }
            case 3: {
                return new aqan();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aqan.a, "\u0001\u0006\u0000\u0001\u0001\b\u0006\u0000\u0000\u0006\u0001\u1409\u0000\u0002\u1409\u0001\u0004\u1409\u0003\u0005\u1409\u0004\u0006\u1409\u0006\b\u1409\u0005", new Object[] { "c", "d", "e", "f", "g", "i", "h" });
            }
            case 1: {
                if (o == null) {
                    j = 0;
                }
                this.j = j;
                return null;
            }
            case 0: {
                return this.j;
            }
        }
    }
}
