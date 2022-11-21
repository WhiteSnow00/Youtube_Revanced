import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aork extends ahcz implements aheo
{
    public static final aork a;
    private static volatile ahev k;
    public int b;
    public ahdp c;
    public ahdp d;
    public ajws e;
    public aisc f;
    public ahdp g;
    public int h;
    public aiet i;
    public ahbt j;
    private ajws l;
    private aisc m;
    private aisc n;
    private ahjl o;
    private byte p;
    
    static {
        ahcz.registerDefaultInstance(aork.class, a = new aork());
    }
    
    private aork() {
        this.p = 2;
        this.c = ahcz.emptyProtobufList();
        this.d = ahcz.emptyProtobufList();
        this.g = ahcz.emptyProtobufList();
        emptyProtobufList();
        this.j = ahbt.b;
        emptyProtobufList();
        emptyProtobufList();
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte p3 = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev k;
                if ((k = aork.k) == null) {
                    synchronized (aork.class) {
                        if (aork.k == null) {
                            aork.k = (ahev)new ahcs((ahcz)aork.a);
                        }
                    }
                }
                return k;
            }
            case 5: {
                return aork.a;
            }
            case 4: {
                return new ahcr((ahcz)aork.a);
            }
            case 3: {
                return new aork();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aork.a, "\u0001\f\u0000\u0001\u0001\u0010\f\u0000\u0003\n\u0001\u041b\u0002\u1409\u0000\u0003\u1409\u0001\u0004\u1409\u0002\u0005\u041b\u0006\u1409\u0004\b\u100c\u0007\t\u1409\n\n\u100a\u000b\u000b\u1409\t\r\u1409\u0003\u0010\u041b", new Object[] { "b", "c", aori.class, "e", "l", "f", "g", aorl.class, "n", "h", aort.a, "o", "j", "i", "m", "d", aisc.class });
            }
            case 1: {
                if (o == null) {
                    p3 = 0;
                }
                this.p = p3;
                return null;
            }
            case 0: {
                return this.p;
            }
        }
    }
}
