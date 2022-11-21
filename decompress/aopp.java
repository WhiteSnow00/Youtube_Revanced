import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aopp extends ahcz implements aheo
{
    public static final aopp a;
    private static volatile ahev g;
    public int b;
    public ahbt c;
    public ajws d;
    public long e;
    public String f;
    private ahjl h;
    private aiet i;
    private byte j;
    
    static {
        ahcz.registerDefaultInstance(aopp.class, a = new aopp());
    }
    
    private aopp() {
        this.j = 2;
        this.c = ahbt.b;
        this.f = "";
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
                final ahev g;
                if ((g = aopp.g) == null) {
                    synchronized (aopp.class) {
                        if (aopp.g == null) {
                            aopp.g = (ahev)new ahcs((ahcz)aopp.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return aopp.a;
            }
            case 4: {
                return new ahcr((ahcz)aopp.a);
            }
            case 3: {
                return new aopp();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aopp.a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0003\u0001\u1409\u0000\u0002\u100a\u0001\u0003\u1409\u0002\u0004\u1409\u0003\u0005\u1002\u0004\u0006\u1008\u0005", new Object[] { "b", "h", "c", "d", "i", "e", "f" });
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
