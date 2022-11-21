import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class anvg extends ahcz implements aheo
{
    public static final anvg a;
    private static volatile ahev h;
    public int b;
    public akfj c;
    public ajws d;
    public anxb e;
    public anxb f;
    public ahbt g;
    private ahjl i;
    private byte j;
    
    static {
        ahcz.registerDefaultInstance(anvg.class, a = new anvg());
    }
    
    private anvg() {
        this.j = 2;
        this.g = ahbt.b;
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
                final ahev h;
                if ((h = anvg.h) == null) {
                    synchronized (anvg.class) {
                        if (anvg.h == null) {
                            anvg.h = (ahev)new ahcs((ahcz)anvg.a);
                        }
                    }
                }
                return h;
            }
            case 5: {
                return anvg.a;
            }
            case 4: {
                return new ahcr((ahcz)anvg.a);
            }
            case 3: {
                return new anvg();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)anvg.a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0005\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0002\u0004\u1409\u0003\u0005\u100a\u0004\u0006\u1409\u0005", new Object[] { "b", "c", "d", "e", "f", "g", "i" });
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
