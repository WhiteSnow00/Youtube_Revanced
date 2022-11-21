import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class anti extends ahcz implements aheo
{
    public static final anti a;
    private static volatile ahev f;
    public int b;
    public ajws c;
    public ahdp d;
    public ahbt e;
    private ahjl g;
    private byte h;
    
    static {
        ahcz.registerDefaultInstance(anti.class, a = new anti());
    }
    
    private anti() {
        this.h = 2;
        this.d = ahcz.emptyProtobufList();
        this.e = ahbt.b;
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte h = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev f;
                if ((f = anti.f) == null) {
                    synchronized (anti.class) {
                        if (anti.f == null) {
                            anti.f = (ahev)new ahcs((ahcz)anti.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return anti.a;
            }
            case 4: {
                return new ahcr((ahcz)anti.a);
            }
            case 3: {
                return new anti();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)anti.a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0003\u0001\u1409\u0000\u0002\u041b\u0003\u1409\u0001\u0004\u100a\u0002", new Object[] { "b", "c", "d", antj.class, "g", "e" });
            }
            case 1: {
                if (o == null) {
                    h = 0;
                }
                this.h = h;
                return null;
            }
            case 0: {
                return this.h;
            }
        }
    }
}
