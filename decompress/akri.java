import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akri extends ahcz implements aheo
{
    public static final akri a;
    private static volatile ahev k;
    public int b;
    public int c;
    public Object d;
    public aknj e;
    public akrf f;
    public ahdp g;
    public int h;
    public ahbt i;
    public anxb j;
    private ahjl l;
    private anxb m;
    private aisc n;
    private anxb o;
    private ajxn p;
    private byte q;
    
    static {
        ahcz.registerDefaultInstance(akri.class, a = new akri());
    }
    
    private akri() {
        this.c = 0;
        this.q = 2;
        this.g = ahcz.emptyProtobufList();
        this.i = ahbt.b;
        emptyProtobufList();
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte q = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev k;
                if ((k = akri.k) == null) {
                    synchronized (akri.class) {
                        if (akri.k == null) {
                            akri.k = (ahev)new ahcs((ahcz)akri.a);
                        }
                    }
                }
                return k;
            }
            case 5: {
                return akri.a;
            }
            case 4: {
                return new ahcr((ahcz)akri.a);
            }
            case 3: {
                return new akri();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)akri.a, "\u0001\u000f\u0001\u0001\u0001\u0309\u000f\u0000\u0001\r\u0001\u1409\u0000\u0003\u1409\u0001\u0004\u041b\u0005\u143c\u0000\u0006\u143c\u0000\u0007\u1409\u0007\b\u100a\b\n\u143c\u0000\u000b\u100c\u0006\f\u1409\t\u000e\u1409\u000b\u000f\u1409\f\u0010\u143c\u0000\u0011\u1409\r\u0309\u1409\u000e", new Object[] { "d", "c", "b", "e", "f", "g", akre.class, akrg.class, akrd.class, "l", "i", anxb.class, "h", aidb.g, "m", "n", "o", anxb.class, "j", "p" });
            }
            case 1: {
                if (o == null) {
                    q = 0;
                }
                this.q = q;
                return null;
            }
            case 0: {
                return this.q;
            }
        }
    }
}
