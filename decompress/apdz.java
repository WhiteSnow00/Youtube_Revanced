import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apdz extends ahcz implements aheo
{
    public static final apdz a;
    private static volatile ahev b;
    private int c;
    private ajws d;
    private ajws e;
    private ajws f;
    private ajws g;
    private ajws h;
    private ajws i;
    private ajws j;
    private ajws k;
    private ajws l;
    private amiy m;
    private aisc n;
    private aibx o;
    private aibx p;
    private aibx q;
    private aibx r;
    private ahjl s;
    private byte t;
    
    static {
        ahcz.registerDefaultInstance(apdz.class, a = new apdz());
    }
    
    private apdz() {
        this.t = 2;
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        final ahbt b = ahbt.b;
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte t = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev b;
                if ((b = apdz.b) == null) {
                    synchronized (apdz.class) {
                        if (apdz.b == null) {
                            apdz.b = (ahev)new ahcs((ahcz)apdz.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return apdz.a;
            }
            case 4: {
                return new ahcr((ahcz)apdz.a);
            }
            case 3: {
                return new apdz();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)apdz.a, "\u0001\u0010\u0000\u0001\u0003\u001b\u0010\u0000\u0000\u0010\u0003\u1409\t\u0004\u1409\n\u0005\u1409\u000b\u0006\u1409\f\u0007\u1409\r\b\u1409\u000e\t\u1409\u000f\u000b\u1409\u0019\r\u1409\u0011\u000e\u1409\u0005\u000f\u1409\u0006\u0012\u1409\u0007\u0017\u1409\u0012\u0018\u1409\u0014\u0019\u1409\b\u001b\u1409\u0015", new Object[] { "c", "h", "i", "j", "k", "l", "m", "n", "s", "o", "d", "e", "f", "p", "q", "g", "r" });
            }
            case 1: {
                if (o == null) {
                    t = 0;
                }
                this.t = t;
                return null;
            }
            case 0: {
                return this.t;
            }
        }
    }
}
