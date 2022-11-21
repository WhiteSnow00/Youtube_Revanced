import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alfh extends ahcz implements aheo
{
    public static final alfh a;
    private static volatile ahev f;
    public aknj b;
    public ahdp c;
    public String d;
    public ahbt e;
    private int g;
    private anxb h;
    private ahjl i;
    private byte j;
    
    static {
        ahcz.registerDefaultInstance(alfh.class, a = new alfh());
    }
    
    private alfh() {
        this.j = 2;
        this.c = ahcz.emptyProtobufList();
        this.d = "";
        this.e = ahbt.b;
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
                if ((f = alfh.f) == null) {
                    synchronized (alfh.class) {
                        if (alfh.f == null) {
                            alfh.f = (ahev)new ahcs((ahcz)alfh.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return alfh.a;
            }
            case 4: {
                return new ahcr((ahcz)alfh.a);
            }
            case 3: {
                return new alfh();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)alfh.a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0004\u0001\u1409\u0000\u0002\u041b\u0003\u1409\u0004\u0004\u100a\u0005\u0005\u1008\u0001\u0006\u1409\u0002", new Object[] { "g", "b", "c", anxb.class, "i", "e", "d", "h" });
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
