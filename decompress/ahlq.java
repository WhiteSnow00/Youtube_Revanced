import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahlq extends ahcz implements aheo
{
    public static final ahlq a;
    private static volatile ahev p;
    public int b;
    public ajws c;
    public ajws d;
    public ajws e;
    public aowb f;
    public ajws g;
    public anxb h;
    public aisc i;
    public ahdp j;
    public anxb k;
    public anxb l;
    public anxb m;
    public anxb n;
    public ahbt o;
    private aisc q;
    private aisc r;
    private aisc s;
    private ahlp t;
    private ahjl u;
    private byte v;
    
    static {
        ahcz.registerDefaultInstance(ahlq.class, a = new ahlq());
    }
    
    private ahlq() {
        this.v = 2;
        this.j = ahcz.emptyProtobufList();
        this.o = ahbt.b;
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte v = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev p3;
                if ((p3 = ahlq.p) == null) {
                    synchronized (ahlq.class) {
                        if (ahlq.p == null) {
                            ahlq.p = (ahev)new ahcs((ahcz)ahlq.a);
                        }
                    }
                }
                return p3;
            }
            case 5: {
                return ahlq.a;
            }
            case 4: {
                return new ahcr((ahcz)ahlq.a);
            }
            case 3: {
                return new ahlq();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)ahlq.a, "\u0001\u0012\u0000\u0001\u0001\u0014\u0012\u0000\u0001\u0011\u0001\u1409\u0000\u0002\u1409\u0003\u0004\u1409\u0007\u0005\u1409\b\u0006\u1409\u000b\u0007\u041b\b\u1409\t\t\u1409\u0001\n\u1409\n\u000b\u1409\u0005\r\u1409\f\u000e\u1409\r\u000f\u1409\u000f\u0010\u1409\u0010\u0011\u100a\u0011\u0012\u1409\u0006\u0013\u1409\u000e\u0014\u1409\u0002", new Object[] { "b", "c", "f", "q", "r", "t", "j", ajws.class, "i", "d", "s", "g", "k", "l", "n", "u", "o", "h", "m", "e" });
            }
            case 1: {
                if (o == null) {
                    v = 0;
                }
                this.v = v;
                return null;
            }
            case 0: {
                return this.v;
            }
        }
    }
}
