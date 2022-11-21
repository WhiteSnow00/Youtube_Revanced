import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akzs extends ahcz implements aheo
{
    public static final akzs a;
    private static volatile ahev j;
    public int b;
    public aknj c;
    public akzt d;
    public akzv e;
    public ahdp f;
    public String g;
    public aisc h;
    public String i;
    private aisc k;
    private anxb l;
    private ahjl m;
    private ajxn n;
    private byte o;
    
    static {
        ahcz.registerDefaultInstance(akzs.class, a = new akzs());
    }
    
    private akzs() {
        this.o = 2;
        this.f = ahcz.emptyProtobufList();
        this.g = "";
        emptyProtobufList();
        emptyProtobufList();
        final ahbt b = ahbt.b;
        this.i = "";
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte o3 = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev j;
                if ((j = akzs.j) == null) {
                    synchronized (akzs.class) {
                        if (akzs.j == null) {
                            akzs.j = (ahev)new ahcs((ahcz)akzs.a);
                        }
                    }
                }
                return j;
            }
            case 5: {
                return akzs.a;
            }
            case 4: {
                return new ahcr((ahcz)akzs.a);
            }
            case 3: {
                return new akzs();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)akzs.a, "\u0001\u000b\u0000\u0001\u0001\u0309\u000b\u0000\u0001\t\u0001\u1409\u0000\u0003\u1409\u0002\u0007\u041b\b\u1008\u0007\t\u1409\b\n\u1409\t\r\u1409\u0004\u000e\u1409\n\u0010\u1409\u000b\u0014\u1008\u000e\u0309\u1409\r", new Object[] { "b", "c", "d", "f", aisc.class, "g", "h", "k", "e", "l", "m", "i", "n" });
            }
            case 1: {
                if (o == null) {
                    o3 = 0;
                }
                this.o = o3;
                return null;
            }
            case 0: {
                return this.o;
            }
        }
    }
}
