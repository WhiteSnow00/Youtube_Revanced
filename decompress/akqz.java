import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akqz extends ahcz implements aheo
{
    public static final akqz a;
    private static volatile ahev j;
    public int b;
    public aknj c;
    public ahdp d;
    public anxb e;
    public int f;
    public anxb g;
    public anxb h;
    public double i;
    private apop k;
    private ajxn l;
    private byte m;
    
    static {
        ahcz.registerDefaultInstance(akqz.class, a = new akqz());
    }
    
    private akqz() {
        this.m = 2;
        this.d = ahcz.emptyProtobufList();
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
                final ahev j;
                if ((j = akqz.j) == null) {
                    synchronized (akqz.class) {
                        if (akqz.j == null) {
                            akqz.j = (ahev)new ahcs((ahcz)akqz.a);
                        }
                    }
                }
                return j;
            }
            case 5: {
                return akqz.a;
            }
            case 4: {
                return new ahcr((ahcz)akqz.a);
            }
            case 3: {
                return new akqz();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)akqz.a, "\u0001\t\u0000\u0001\u0001\u0309\t\u0000\u0001\u0007\u0001\u1409\u0000\u0003\u041b\u0004\u1409\u0001\u0006\u100c\u0002\u0007\u1409\u0003\b\u1409\u0004\n\u1000\u0006\u000b\u1409\u0007\u0309\u1409\b", new Object[] { "b", "c", "d", anxb.class, "e", "f", anbh.a(), "g", "h", "i", "k", "l" });
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
