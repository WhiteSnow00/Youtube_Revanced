import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqcl extends ahcz implements aheo
{
    public static final aqcl a;
    private static volatile ahev f;
    public ajws b;
    public ajws c;
    public ahbt d;
    public aqcm e;
    private int g;
    private ahjl h;
    private anxb i;
    private byte j;
    
    static {
        ahcz.registerDefaultInstance(aqcl.class, a = new aqcl());
    }
    
    private aqcl() {
        this.j = 2;
        this.d = ahbt.b;
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
                final ahev f;
                if ((f = aqcl.f) == null) {
                    synchronized (aqcl.class) {
                        if (aqcl.f == null) {
                            aqcl.f = (ahev)new ahcs((ahcz)aqcl.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return aqcl.a;
            }
            case 4: {
                return new ahcr((ahcz)aqcl.a);
            }
            case 3: {
                return new aqcl();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aqcl.a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0005\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0002\u0004\u100a\u0003\u0005\u1409\u0004\u0006\u1409\u0005", new Object[] { "g", "b", "c", "h", "d", "e", "i" });
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
