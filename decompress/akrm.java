import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akrm extends ahcz implements aheo
{
    public static final akrm a;
    private static volatile ahev j;
    public int b;
    public aknh c;
    public ahdp d;
    public boolean e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;
    private byte k;
    
    static {
        ahcz.registerDefaultInstance(akrm.class, a = new akrm());
    }
    
    private akrm() {
        this.k = 2;
        this.d = ahcz.emptyProtobufList();
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte k = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev j;
                if ((j = akrm.j) == null) {
                    synchronized (akrm.class) {
                        if (akrm.j == null) {
                            akrm.j = (ahev)new ahcs((ahcz)akrm.a);
                        }
                    }
                }
                return j;
            }
            case 5: {
                return akrm.a;
            }
            case 4: {
                return new ahcr((boolean[][][])null, (int[][])null);
            }
            case 3: {
                return new akrm();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)akrm.a, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0001\u0001\u0001\u1409\u0000\u0002\u1007\n\u0003\u1007\u000b\u0004\u001a\u0005\u1007\u0002\u0006\u1007\u0003\u0007\u1007\u0004", new Object[] { "b", "c", "h", "i", "d", "e", "f", "g" });
            }
            case 1: {
                if (o == null) {
                    k = 0;
                }
                this.k = k;
                return null;
            }
            case 0: {
                return this.k;
            }
        }
    }
}
