import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahlh extends ahcz implements aheo
{
    public static final ahlh a;
    private static volatile ahev n;
    public int b;
    public ahbt c;
    public ajws d;
    public ajws e;
    public ajws f;
    public aowb g;
    public anxb h;
    public boolean i;
    public boolean j;
    public aisc k;
    public int l;
    public aowb m;
    private ahjl o;
    private ajws p;
    private ajws q;
    private ahlr r;
    private ajws s;
    private ahlf t;
    private byte u;
    
    static {
        ahcz.registerDefaultInstance(ahlh.class, a = new ahlh());
    }
    
    private ahlh() {
        this.u = 2;
        this.c = ahbt.b;
        emptyProtobufList();
        emptyIntList();
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte u = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev n;
                if ((n = ahlh.n) == null) {
                    synchronized (ahlh.class) {
                        if (ahlh.n == null) {
                            ahlh.n = (ahev)new ahcs((ahcz)ahlh.a);
                        }
                    }
                }
                return n;
            }
            case 5: {
                return ahlh.a;
            }
            case 4: {
                return new ahcr((ahcz)ahlh.a);
            }
            case 3: {
                return new ahlh();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)ahlh.a, "\u0001\u0011\u0000\u0001\u0001\u001a\u0011\u0000\u0000\r\u0001\u1409\u0000\u0002\u100a\u0001\u0004\u1409\u0002\u0005\u1409\u0015\u0006\u1409\u0006\u0007\u1007\b\b\u1007\t\t\u1409\u0016\f\u1409\n\r\u1409\u0005\u000f\u1409\f\u0010\u100c\r\u0011\u1409\u000e\u0013\u1409\u0007\u0015\u1409\u0011\u0019\u1409\u0003\u001a\u1409\u0004", new Object[] { "b", "o", "c", "d", "t", "g", "i", "j", "m", "k", "f", "q", "l", akfi.a(), "r", "h", "s", "p", "e" });
            }
            case 1: {
                if (o == null) {
                    u = 0;
                }
                this.u = u;
                return null;
            }
            case 0: {
                return this.u;
            }
        }
    }
}
