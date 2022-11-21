import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akqj extends ahcz implements aheo
{
    public static final akqj a;
    private static volatile ahev f;
    public aknj b;
    public ahdp c;
    public ahdp d;
    public ahbt e;
    private int g;
    private ajxn h;
    private ahjl i;
    private byte j;
    
    static {
        ahcz.registerDefaultInstance(akqj.class, a = new akqj());
    }
    
    private akqj() {
        this.j = 2;
        this.c = ahcz.emptyProtobufList();
        this.d = ahcz.emptyProtobufList();
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
                if ((f = akqj.f) == null) {
                    synchronized (akqj.class) {
                        if (akqj.f == null) {
                            akqj.f = (ahev)new ahcs((ahcz)akqj.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return akqj.a;
            }
            case 4: {
                return new ahcr((ahcz)akqj.a);
            }
            case 3: {
                return new akqj();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)akqj.a, "\u0001\u0006\u0000\u0001\u0001\u0309\u0006\u0000\u0002\u0005\u0001\u1409\u0000\u0004\u041b\u0005\u041b\u000b\u1409\u0002\f\u100a\u0003\u0309\u1409\u0001", new Object[] { "g", "b", "c", akqg.class, "d", aisc.class, "i", "e", "h" });
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
