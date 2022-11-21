import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aiup extends ahcz implements aheo
{
    public static final aiup a;
    public static final ahcx b;
    private static volatile ahev j;
    public int c;
    public ahdp d;
    public ahdp e;
    public ahbt f;
    public aiet g;
    public boolean h;
    public String i;
    private ajws k;
    private ahjl l;
    private aisc m;
    private aiuq n;
    private ajws o;
    private anxb p;
    private aisc q;
    private anxb r;
    private anxb s;
    private ajws t;
    private anxb u;
    private aiuw v;
    private byte w;
    
    static {
        final aiup a2 = new aiup();
        ahcz.registerDefaultInstance(aiup.class, a = a2);
        b = ahcz.newSingularGeneratedExtension((MessageLite)anxa.a, a2, (MessageLite)a2, null, 65060753, ahgc.k, aiup.class);
    }
    
    private aiup() {
        this.w = 2;
        emptyProtobufList();
        this.d = ahcz.emptyProtobufList();
        this.e = ahcz.emptyProtobufList();
        this.f = ahbt.b;
        this.i = "";
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte w = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev j;
                if ((j = aiup.j) == null) {
                    synchronized (aiup.class) {
                        if (aiup.j == null) {
                            aiup.j = (ahev)new ahcs((ahcz)aiup.a);
                        }
                    }
                }
                return j;
            }
            case 5: {
                return aiup.a;
            }
            case 4: {
                return new ahcr((ahcz)aiup.a);
            }
            case 3: {
                return new aiup();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aiup.a, "\u0001\u0012\u0000\u0001\u0001\u0019\u0012\u0000\u0002\u000f\u0001\u041b\u0002\u041b\u0003\u1409\b\u0004\u100a\u0001\u0005\u1409\u0002\u0006\u1409\u0003\u0007\u1409\u000e\b\u1409\u0004\n\u1409\u0000\f\u1409\u0005\u000f\u1007\u0007\u0010\u1409\t\u0011\u1409\u000f\u0012\u1008\u0010\u0013\u1409\u0011\u0017\u1409\u000b\u0018\u1409\f\u0019\u1409\r", new Object[] { "c", "d", aitz.class, "e", aiuw.class, "o", "f", "l", "m", "t", "g", "k", "n", "h", "p", "u", "i", "v", "q", "r", "s" });
            }
            case 1: {
                if (o == null) {
                    w = 0;
                }
                this.w = w;
                return null;
            }
            case 0: {
                return this.w;
            }
        }
    }
}
