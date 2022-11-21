import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akbq extends ahcz implements aheo
{
    public static final akbq a;
    private static volatile ahev h;
    public int b;
    public ahdp c;
    public ajws d;
    public int e;
    public akbr f;
    public akbp g;
    private anxb i;
    private aisc j;
    private ajws k;
    private ajws l;
    private ahjl m;
    private byte n;
    
    static {
        ahcz.registerDefaultInstance(akbq.class, a = new akbq());
    }
    
    private akbq() {
        this.n = 2;
        this.c = ahcz.emptyProtobufList();
        emptyProtobufList();
        final ahbt b = ahbt.b;
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte n = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev h;
                if ((h = akbq.h) == null) {
                    synchronized (akbq.class) {
                        if (akbq.h == null) {
                            akbq.h = (ahev)new ahcs((ahcz)akbq.a);
                        }
                    }
                }
                return h;
            }
            case 5: {
                return akbq.a;
            }
            case 4: {
                return new ahcr((ahcz)akbq.a);
            }
            case 3: {
                return new akbq();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)akbq.a, "\u0001\n\u0000\u0001\u0001\u0011\n\u0000\u0001\u0007\u0001\u041b\u0003\u1409\u0001\u0005\u1409\u0003\u0006\u1409\u0004\u0007\u1409\u0005\b\u1004\u0006\t\u1009\u0007\u000b\u1409\t\f\u1009\n\u0011\u1409\u0000", new Object[] { "b", "c", akbs.class, "d", "j", "k", "l", "e", "f", "m", "g", "i" });
            }
            case 1: {
                if (o == null) {
                    n = 0;
                }
                this.n = n;
                return null;
            }
            case 0: {
                return this.n;
            }
        }
    }
}
