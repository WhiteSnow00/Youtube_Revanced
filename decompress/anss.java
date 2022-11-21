import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class anss extends ahcz implements aheo
{
    public static final anss a;
    private static volatile ahev h;
    public int b;
    public anxb c;
    public ahdp d;
    public ahof e;
    public ahbt f;
    public String g;
    private ahjl i;
    private byte j;
    
    static {
        ahcz.registerDefaultInstance(anss.class, a = new anss());
    }
    
    private anss() {
        this.j = 2;
        this.d = ahcz.emptyProtobufList();
        this.f = ahbt.b;
        this.g = "";
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
                if ((h = anss.h) == null) {
                    synchronized (anss.class) {
                        if (anss.h == null) {
                            anss.h = (ahev)new ahcs((ahcz)anss.a);
                        }
                    }
                }
                return h;
            }
            case 5: {
                return anss.a;
            }
            case 4: {
                return new ahcr((ahcz)anss.a);
            }
            case 3: {
                return new anss();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)anss.a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0004\u0001\u1409\u0000\u0002\u041b\u0003\u1409\u0002\u0004\u100a\u0003\u0005\u1409\u0001\u0006\u1008\u0004", new Object[] { "b", "c", "d", aisc.class, "i", "f", "e", "g" });
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
