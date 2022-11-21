import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aiuz extends ahcz implements aheo
{
    public static final aiuz a;
    private static volatile ahev m;
    public int b;
    public aitz c;
    public anxb d;
    public anxb e;
    public aiur f;
    public aiuk g;
    public ahbt h;
    public aiuy i;
    public boolean j;
    public int k;
    public boolean l;
    private anxb n;
    private anxb o;
    private anxb p;
    private ajws q;
    private ajws r;
    private ahjl s;
    private ajws t;
    private aivb u;
    private aiuo v;
    private ajws w;
    private byte x;
    
    static {
        ahcz.registerDefaultInstance(aiuz.class, a = new aiuz());
    }
    
    private aiuz() {
        this.x = 2;
        this.h = ahbt.b;
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte x = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev m;
                if ((m = aiuz.m) == null) {
                    synchronized (aiuz.class) {
                        if (aiuz.m == null) {
                            aiuz.m = (ahev)new ahcs((ahcz)aiuz.a);
                        }
                    }
                }
                return m;
            }
            case 5: {
                return aiuz.a;
            }
            case 4: {
                return new ahcr((ahcz)aiuz.a);
            }
            case 3: {
                return new aiuz();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aiuz.a, "\u0001\u0014\u0000\u0001\u0001\u0019\u0014\u0000\u0000\u000f\u0001\u1409\u0000\u0002\u1409\u0006\u0003\u1409\b\u0004\u1409\t\u0006\u100a\n\u0007\u1409\u000b\b\u1409\r\t\u1009\u000e\n\u1007\u000f\u000b\u1409\u0010\f\u1409\u0007\r\u100c\u0011\u000f\u1409\u0013\u0010\u1409\u0003\u0011\u1409\u0002\u0013\u1409\u0005\u0014\u1409\u0015\u0015\u1409\u0004\u0017\u1007\u0017\u0019\u1409\u0001", new Object[] { "b", "c", "f", "q", "r", "h", "s", "t", "i", "j", "u", "g", "k", aine.t, "v", "e", "d", "p", "w", "o", "l", "n" });
            }
            case 1: {
                if (o == null) {
                    x = 0;
                }
                this.x = x;
                return null;
            }
            case 0: {
                return this.x;
            }
        }
    }
}
