import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apdp extends ahcz implements aheo
{
    public static final apdp a;
    private static volatile ahev b;
    private int c;
    private ajws d;
    private ajws e;
    private ajws f;
    private aphj g;
    private aisc h;
    private amiy i;
    private ahjl j;
    private ajws k;
    private ajws l;
    private byte m;
    
    static {
        ahcz.registerDefaultInstance(apdp.class, a = new apdp());
    }
    
    private apdp() {
        this.m = 2;
        final ahbt b = ahbt.b;
        emptyProtobufList();
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte m = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev b;
                if ((b = apdp.b) == null) {
                    synchronized (apdp.class) {
                        if (apdp.b == null) {
                            apdp.b = (ahev)new ahcs((ahcz)apdp.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return apdp.a;
            }
            case 4: {
                return new ahcr((ahcz)apdp.a);
            }
            case 3: {
                return new apdp();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)apdp.a, "\u0001\t\u0000\u0001\u0002\u000f\t\u0000\u0000\t\u0002\u1409\r\u0003\u1409\u000e\u0006\u1409\f\u0007\u1409\u0001\b\u1409\u0002\t\u1409\u0003\f\u1409\t\r\u1409\u0006\u000f\u1409\n", new Object[] { "c", "k", "l", "j", "d", "e", "f", "h", "g", "i" });
            }
            case 1: {
                if (o == null) {
                    m = 0;
                }
                this.m = m;
                return null;
            }
            case 0: {
                return this.m;
            }
        }
    }
}
