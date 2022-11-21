import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class anso extends ahcz implements aheo
{
    public static final anso a;
    private static volatile ahev b;
    private int c;
    private ajws d;
    private ajws e;
    private ajws f;
    private anxb g;
    private aisc h;
    private aisc i;
    private aisc j;
    private amiy k;
    private ahof l;
    private ahjl m;
    private anxb n;
    private anxb o;
    private byte p;
    
    static {
        ahcz.registerDefaultInstance(anso.class, a = new anso());
    }
    
    private anso() {
        this.p = 2;
        emptyProtobufList();
        emptyProtobufList();
        final ahbt b = ahbt.b;
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
                final ahev b;
                if ((b = anso.b) == null) {
                    synchronized (anso.class) {
                        if (anso.b == null) {
                            anso.b = (ahev)new ahcs((ahcz)anso.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return anso.a;
            }
            case 4: {
                return new ahcr((ahcz)anso.a);
            }
            case 3: {
                return new anso();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)anso.a, "\u0001\f\u0000\u0001\u0003\u0016\f\u0000\u0000\f\u0003\u1409\u0002\u0004\u1409\u0003\u0005\u1409\u0004\u0006\u1409\u0005\u0007\u1409\u0006\n\u1409\t\u000b\u1409\n\f\u1409\u000b\u0011\u1409\b\u0012\u1409\u000f\u0013\u1409\u0010\u0016\u1409\u0007", new Object[] { "c", "d", "e", "f", "g", "h", "k", "l", "m", "j", "n", "o", "i" });
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
